package client;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class YMSRoleClient {
    public static void main(String[] args) throws Exception {
        String filePath = "D://ymsRole.csv";
        File file = new File(filePath);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), StandardCharsets.UTF_8));
        out.write('\ufeff');
        out.write("用户名,登录名,权限组,方法,权限描述\n");
        String getUserSql = "select UPPER(AD_ACCOUNT) adaccount,name from system_account where ENABLE = 'T'";
        String getAcSql = "SELECT T1.ID, T1.DEPARTMENT_ID, T2.NAME AS DEPARTMENT_NAME \n" +
                "FROM SYSTEM_ACCOUNT T1 \n" +
                "LEFT JOIN SYSTEM_DEPARTMENT T2 \n" +
                "ON (T1.DEPARTMENT_ID = T2.ID) \n" +
                "WHERE 1 = 1 \n" +
                "AND UPPER(T1.AD_ACCOUNT) = ";
       String sql1 = "SELECT T1.ID AS ACTION_ID, T1.CATE, T1.FUNCTION, T1.ACTION, T1.ACTION_LEVEL, T1.DESCRIPTION \n" +
               "FROM SYSTEM_ACTION T1 \n" +
               "LEFT JOIN (\n" +
               "    SELECT ACTION_ID, ID \n" +
               "    FROM SYSTEM_USERGROUP_ACTION_REL \n" +
               "    WHERE 1 = 1 \n" +
               "    AND GROUP_ID IN (\n" +
               "        SELECT GROUP_ID \n" +
               "        FROM SYSTEM_USERGROUP_USER_REL \n" +
               "        WHERE 1 = 1 \n" +
               "        AND ACCOUNT_ID = ";
        String sql2 = " ) \n" +
                ") T2 \n" +
                "ON (T1.ID = T2.ACTION_ID) \n" +
                "WHERE 1 = 1 \n" +
                "AND T2.ID IS NOT NULL\n" +
                "union \n" +
                "--部门权限\n" +
                "SELECT T1.ID AS ACTION_ID, T1.CATE, T1.FUNCTION, T1.ACTION, T1.ACTION_LEVEL, T1.DESCRIPTION \n" +
                "FROM SYSTEM_ACTION T1 \n" +
                "LEFT JOIN (\n" +
                "    SELECT ACTION_ID, ID \n" +
                "    FROM SYSTEM_USERGROUP_ACTION_REL \n" +
                "    WHERE 1 = 1 \n" +
                "    AND GROUP_ID IN (\n" +
                "        SELECT GROUP_ID \n" +
                "        FROM SYSTEM_USERGROUP_DEPT_REL \n" +
                "        WHERE 1 = 1 \n" +
                "        AND DEPARTMENT_ID =";
        String sql3 = "    ) \n" +
                ") T2 \n" +
                "ON (T1.ID = T2.ACTION_ID) \n" +
                "WHERE 1 = 1 \n" +
                "AND T2.ID IS NOT NULL";
        YMSJDBC ymsjdbc = new YMSJDBC();
        Connection connection = ymsjdbc.getconn();
        Statement statement = connection.createStatement();
        ResultSet rs  = statement.executeQuery(getUserSql);
        while (rs.next()){
            String name = rs.getString("name");//用户名
            String adaccount = rs.getString("adaccount");//登录名
            String getAcSql1 = getAcSql +"'"+adaccount+"'";
            Statement statement1 = connection.createStatement();
            ResultSet resultSet = statement1.executeQuery(getAcSql1);
            while (resultSet.next()){
                int id = resultSet.getInt("ID");
                int department_id = resultSet.getInt("DEPARTMENT_ID");
                String sql = sql1+id+sql2+department_id+sql3;
                Statement statement2 = connection.createStatement();
                ResultSet resultSet1 = statement2.executeQuery(sql);
                while (resultSet1.next()){
                    String function = resultSet1.getString("FUNCTION");//方法
                    String action = resultSet1.getString("ACTION");//操作
                    String description = resultSet1.getString("DESCRIPTION");//描述
                    System.out.println(name+"@"+adaccount+"@"+function+"@"+action+"@"+description);
                    write(name+","+adaccount+","+function+","+action+ "," + description+"\n",out);
                }
            }
        }
        out.close();
    }

    private static void write(String str, BufferedWriter out) {
        try {
            out.write(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
