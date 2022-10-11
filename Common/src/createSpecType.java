import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.sql.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class createSpecType {
    public static void main(String[] args) {
        jdbc jdbc = new jdbc();
        Connection connection = jdbc.getconn();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String sql = "select distinct SPEC_TYPE from item ";
            ResultSet rs = statement.executeQuery(sql);
            StringBuilder insert = new StringBuilder();
            String filePath = "D:\\insert.sql";
            File file = new File(filePath);
            BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));

            while (rs.next()) {
                String SpecType = rs.getString("SPEC_TYPE");
                if (SpecType != null) {
                    boolean containChinese = isContainChinese(SpecType);
//                    System.out.println("SpecType=" + SpecType + ",containChinese=" + containChinese);
//                    System.out.println("SpecType=" + SpecType + ",isEn=" + containChinese);
//                    String insertSql = "insert into named_object (INSTANCE_RRN, INSTANCE_ID, NAMED_SPACE, INSTANCE_DESC, INSTANCE_LONG_DESC, OBJECT, OBJECT_TYPE, OBJECT_SUBTYPE, CURRENT_VERSION, ACTIVE_VERSION, ROLE_RRN, INSTANCE_STATUS, CREATED_TIMESTAMP, CREATED_USER_RRN, LAST_UPDATE_TIMESTAMP, LAST_UPDATE_USER_RRN, SYSTEM_USED)" +
//                            "values (object_seq.nextval, '" + SpecType + "', 'MYCIM2', '" + SpecType + "', null, 'SPECTYPE', null, null, null, null, null, null, null, null, null, null, null);\n";
//                    insert.append(insertSql);
                    /*boolean isEn = checkString(SpecType);
                    System.out.println("SpecType=" + SpecType + ",isEn=" + isEn);*/
                    if (!containChinese) {
                        String insertSql = "insert into named_object (INSTANCE_RRN, INSTANCE_ID, NAMED_SPACE, INSTANCE_DESC, INSTANCE_LONG_DESC, OBJECT, OBJECT_TYPE, OBJECT_SUBTYPE, CURRENT_VERSION, ACTIVE_VERSION, ROLE_RRN, INSTANCE_STATUS, CREATED_TIMESTAMP, CREATED_USER_RRN, LAST_UPDATE_TIMESTAMP, LAST_UPDATE_USER_RRN, SYSTEM_USED)" +
                                "values (object_seq.nextval, '" + SpecType + "', 'MYCIM2', '" + SpecType + "', null, 'SPECTYPE', null, null, null, null, null, null, null, null, null, null, null);\n";
                        insert.append(insertSql);
                        out.write(insertSql);
                    }
                }
            }
            out.close();
            System.out.println(insert);
//            statement.executeUpdate(String.valueOf(insert));
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

    private static boolean checkString(String specType) {
        return specType.matches("^[a-z0-9A-Z]+$");
    }

    public static boolean isContainChinese(String str) {

        Pattern p = Pattern.compile("[\u4E00-\u9FA5|\\！|\\，|\\。|\\（|\\）|\\《|\\》|\\“|\\”|\\？|\\：|\\；|\\【|\\】]");
        Matcher m = p.matcher(str);
        if (m.find()) {
            return true;
        }
        return false;
    }


}
