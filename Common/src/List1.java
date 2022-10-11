import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

public class List1 {
    public static void main(String[] args) throws SQLException {
        try {
            ArrayList<Object> list1 = new ArrayList<>();
            list1.add("1");
            list1.add("2");
            list1.add("3");
            System.out.println(list1.toString());
            ArrayList<Object> list2 = new ArrayList<>();
            list2.add("1");
            list2.add("2");
            list2.add("3");
            System.out.println(list1.equals(list2));
        }catch (Exception ex){
            ex.printStackTrace();
            //connection.rollback();
        }
    }


}
