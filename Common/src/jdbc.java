

import javax.sql.DataSource;
import java.sql.*;

import static java.sql.DriverManager.getConnection;


public class jdbc {
    private static String USERNAMR = "nx_mes";
    private static String PASSWORD = "nx_mes";
    private static String DRVIER = "oracle.jdbc.OracleDriver";
//    private static String URL = "jdbc:oracle:thin:@192.168.68.60:1521:orcl";
    private static String URL = "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS_LIST=(ADDRESS=(PROTOCOL=TCP)(HOST=192.168.68.111)(PORT=1521)))(CONNECT_DATA=(SERVICE_NAME=mycim)))";
    private Connection connection;

   /* public jdbc() {
        this.connection = getconn();;
    }*/

    public static void main(String[] args) {
        try {
//            Connection connection = getconn();
//            Statement statement = connection.createStatement();
            /*String sql = "select * from lot_inventory where lot_number = '190500102'";
            ResultSet rs = statement.executeQuery(sql);
            while(rs.next()) {  //循环遍历结果集
                String LOT_NUMBER = rs.getString("LOT_NUMBER");
                System.out.println("LOT_NUMBER=" + LOT_NUMBER);
            }*/

            /*for (int i = 5; i > -1 ; i--) {
                double v = 5/i;
                String insert = "insert into TEST VALUES('12','34')";
                statement.executeUpdate(insert);
            }*/
           /* Statement statement =connection.createStatement();
            String sql = "insert into MO_RECORD (MO_RRN, MO_FIND_USER, MO_FIND_PROCESS, MO_PRODUCT, MO_LOTID, MO_AFFECT_QTY, MO_EQUID, MO_OCCUR_TIME, MO_SCOPE, " +
                    "MO_HAND_RESULT, MO_RANK, MO_ACCIDENT_FLAG, MO_PROCESS_USER, MO_STEPS, MO_PICTURE, MO_WHY1, MO_WHY2, MO_WHY3, MO_WHY4, MO_WHY5, " +
                    "MO_MONITORING_REASON, MO_MANAGEMENT_RESAON, MO_OCCUR_CORRECT, MO_MONITORING_CORRECT, MO_MANAGEMENT_CORRECT, MO_OCCUR_PREVENT, " +
                    "MO_MONITORING_PREVENT, MO_MANAGEMENT_PREVENT, MO_OCCUR_RESULT, MO_MONITORING_RESULT, MO_MANAGEMENT_RESULT, MO_DEAL_RESULT, MO_AUDIT, " +
                    "MO_APPROVAL, MO_QC_OPINION, MO_STATUS, MO_DESC, MO_COMMIT, MO_FINDE_USER_RRN, MO_DUTY_PERSION, MO_DUTY_PERSION_RRN)\n" +
                    "values (?, '00903', 'DB', 'D1H40175D2', 'D2103002', '1400', 'PDDB01', to_date('24-01-2022', 'dd-mm-yyyy'), 'cs', 'cs', '一般MO', null, null, null, '<BLOB>', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '0', null, 'cs', 5327382, '00903', 5327382);";

//            ResultSet resultSet = statement.executeQuery("select * from lot_inventory where lot_number = 'M0507A00010'");
//            System.out.println();
            for (int i = 0; i <3 ; i++) {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                long l = System.currentTimeMillis();
                preparedStatement.setLong(1,l);
                preparedStatement.executeUpdate();
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void testInsert(Connection connection,String var1,String var2){
        try {
            Statement statement = connection.createStatement();
            StringBuilder sb = new StringBuilder();
            sb.append("insert into TEST VALUES('");
            sb.append(var1);
            sb.append("','");
            sb.append(var2);
            sb.append("')");
//            String insert = "insert into TEST VALUES('var1','var2')";
            statement.executeUpdate(sb.toString());
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }
    public Connection  getconn() {  //为了方便下面的讲解，这里专门建立了一个用于数据库连接的一个方法
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
