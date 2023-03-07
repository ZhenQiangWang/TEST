package example;

import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import java.sql.Timestamp;
import java.util.Date;
import java.util.HashMap;

public class test {
    public static void main(String[] args) {
        HashMap<String, Timestamp> map = new HashMap<>();
        Timestamp timeStamp = new Timestamp(new Date().getTime());
        map.put("data", timeStamp);
        JSONObject jsonObject = JSONObject.fromObject(map, new JsonConfig());
        System.out.println(jsonObject.toString());
    }
}
