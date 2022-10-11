import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.*;

public class List {
    public static void main(String[] args) throws SQLException {
        Connection connection = null;
        try {
            Long rrn = 123489l;
            String msg = "ceshi"+rrn;
            System.out.println(msg);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date parse = simpleDateFormat.parse("2022-06-08 17:29:38");
            long time = parse.getTime();
            java.util.List<Long> eapMaterialRrns = new ArrayList<>();
            eapMaterialRrns.add(12L);
            eapMaterialRrns.add(13L);
            eapMaterialRrns.add(14L);
            boolean contains = eapMaterialRrns.contains(15L);
            System.out.println(contains);
            jdbc jdbc = new jdbc();
            connection = jdbc.getconn();
            connection.setAutoCommit(false);
            for (int i = 5; i > 0 ; i--) {
                String v = String.valueOf(5/i);
                jdbc.testInsert(connection,v,v);
            }
            System.out.println(1/0);
        }catch (Exception ex){
            ex.printStackTrace();
            //connection.rollback();
        }
    }
}
