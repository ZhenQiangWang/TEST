import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) throws SQLException {
        try {
            jdbc1 jdbc = new jdbc1();
            List1 list1 = new List1();
            /*for (int i = 1; i > 0 ; i--) {
                String v = String.valueOf(5/i);
                jdbc.testInsert(list1.isNull(v,"String"),list1.isNull(v,"String"),list1.isNull(null,"TYPE@Long"));
            }*/
            jdbc.testInsert("1","2","TYPE@Long","123");
//            System.out.println(1/0);
        }catch (Exception ex){
            ex.printStackTrace();
            //connection.rollback();
        }
    }


}
