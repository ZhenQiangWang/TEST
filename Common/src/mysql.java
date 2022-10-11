import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class mysql {

    private static String USERNAMR = "root";
    private static String PASSWORD = "ibixin@123";
    private static String DRVIER = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://192.168.68.159:3306/KS";


    public static void main(String[] args) {

        try {
            Driver driver = new com.mysql.jdbc.Driver();
            Connection con = getconn();
//            String insertSql = "INSERT INTO bibb_file_remark VALUES (?,?,?,?) ON DUPLICATE KEY UPDATE 'bibb011' = ?";
            /*String insertSql = "REPLACE INTO bibb_file_remark VALUES (?,?,?,?)";
            PreparedStatement ptmt = con.prepareStatement(insertSql);
            for (int i = 0; i <5 ; i++) {
                ptmt.setString(1,"bibb0111"+i);
                ptmt.setString(2,i+"");
                ptmt.setString(3,"");
                ptmt.setString(4,"");
                ptmt.addBatch();
            }
//            ptmt.execute();
            ptmt.executeBatch();*/
            System.out.println(con.isClosed());
            con.close();
            System.out.println(con.isClosed());
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


    public static Connection getconn() {  //为了方便下面的讲解，这里专门建立了一个用于数据库连接的一个方法
        Connection conn=null;
        try {
            //首先建立驱动
            Class.forName(DRVIER);

            //驱动成功后进行连接
            conn= DriverManager.getConnection(URL, USERNAMR, PASSWORD);
//            conn.setAutoCommit(false);
            System.out.println("连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn; //返回一个连接
    }
}
