package workFlow;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
    static String driverClass="oracle.jdbc.driver.OracleDriver"; //oracle的驱动
    static String url="jdbc:oracle:thin:@192.168.68.60:1521:orcl";  //连接oracle路径方式 “”gfs“”是要建立连接的数据库名 1521端口
    static String user="nx_mes";   //user是数据库的用户名
    static String password="nx_mes";  //用户登录密码

    public  Connection getconn() {  //为了方便下面的讲解，这里专门建立了一个用于数据库连接的一个方法
        Connection conn=null;
        try {
            //首先建立驱动
            Class.forName(driverClass);

            //驱动成功后进行连接
            conn= DriverManager.getConnection(url, user, password);

            System.out.println("连接成功");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn; //返回一个连接
    }
}

