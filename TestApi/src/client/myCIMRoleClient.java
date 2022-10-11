package client;

import net.sf.json.JSONArray;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class myCIMRoleClient {
    private final static String CONTENT_TYPE_TEXT_JSON = "text/json";
    private final static String EAPURL = "http://192.168.68:8080";
//    private final static String TEST = "http://192.168.68.60:7001/mycim2/roleAction.do?reqCode=qryRoleGrantTree&sys=OA&facility=1&roleid=";
    private final static String TEST = "http://localhost:7001/mycim2/roleAction.do?reqCode=qryRoleGrantTree&sys=OA&facility=1&roleid=";
    private final static String LOGIN = "http://192.168.90.160:7001/mycim2/securitylogin.do?Content-Type";


    public static void main(String[] args) throws Exception {
        String filePath = "D://role.txt";
        File file = new File(filePath);
        HttpClientUtil httpClientUtil = new HttpClientUtil();
        String sql = "select getinstanceid(from_rrn) gh,getinstancedesc(from_rrn) xm,to_rrn ,getinstancedesc(TO_RRN) roleName from relation ,user_profile yp where link_type = 'USER_TO_ROLE'\n" +
                "and  from_rrn = yp.user_rrn(+) and yp.SHIFT_ID is not null  order by from_rrn ";
        myCIMJDBC jdbc = new myCIMJDBC();
        Connection connection = jdbc.getconn();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery(sql);
        while(rs.next()) {
            String json = "";
            String gh = rs.getString("gh");//工号
            String xm = rs.getString("xm");//姓名
            String to_rrn = rs.getString("to_rrn");//roleRrn
            String roleName = rs.getString("roleName");//roleName
            String url = TEST + to_rrn;
            String s = httpClientUtil.postRequest(url, json);
            JSONArray jsonArray = JSONArray.fromObject(s);
            int size = jsonArray.size();
            for (int i = 0; i <size ; i++) {
                Map map = (Map) jsonArray.get(i);
                String text = (String)map.get("text");//主功能块
                JSONArray children = (JSONArray)map.get("children");
                if(map.get("children") == null){
                    continue;
                }
                for (int j = 0; j <children.size() ; j++) {
                    Map map1 = (Map) children.get(j);
                    String gnx = (String)map1.get("text");//功能块
                    JSONArray children1 = (JSONArray) map1.get("children");
                    Boolean leaf = (Boolean) map1.get("leaf");
                    if(children1 == null && leaf){
                        write(xm+"@"+gh+"@"+roleName+"@"+text+"@"+gnx+"\n",file);
                        System.out.println(xm+"@"+gh+"@"+roleName+"@"+text+"@"+gnx);
                        continue;
                    }
                    for (int k = 0; k <children1.size() ; k++) {
                        Map map2 = (Map) children1.get(k);
                        String text1 = (String) map2.get("text");//功能项
                        if(map2.get("children") == null && (Boolean) map2.get("leaf")){
                            write(xm+"@"+gh+"@"+roleName+"@"+text+"@"+gnx+"@"+text1+"\n",file);
                            System.out.println(xm+"@"+gh+"@"+roleName+"@"+text+"@"+gnx+"@"+text1);
                            continue;
                        }
                        JSONArray children2 = (JSONArray) map2.get("children");
                        for (int l = 0; l < children2.size(); l++) {
                            Map map3 = (Map) children2.get(l);
                            Boolean checked = (Boolean) map3.get("leaf");
                            if(checked){
                                String text2 = (String)map3.get("text");//按钮权限
                                write(xm+"@"+gh+"@"+roleName+"@"+text+"@"+gnx+"@"+text1+"@"+text2+"\n",file);
                                System.out.println(xm+"@"+gh+"@"+roleName+"@"+text+"@"+gnx+"@"+text1+"@"+text2);
                            }


                        }
                    }

                }
            }
            Thread.sleep(1000);
        }
    }

    private static void write(String str,File file) {
        BufferedWriter out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));
            out.write(str);
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
