package workFlow;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.sql.*;
import java.util.List;
import java.util.Map;

public class readWorkFlow {
    public static void main(String[] args) {
        try {
            DiagramModel model = null;
            ObjectInputStream os = null;
            JDBC jdbc = new JDBC();
            Connection connection = jdbc.getconn();
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("select * from workflow_editor_model where wfl_rrn = 6818163");
            while(rs.next()) {  //循环遍历结果集
                int id=rs.getInt("WFL_RRN");
                System.out.println(id);
                java.sql.Blob blob = rs.getBlob("XMLFILE");
                System.out.println("hh");
            }
        } catch (Exception throwables) {
            throwables.printStackTrace();
        }
    }

}
