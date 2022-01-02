import java.util.*;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        HashMap<String, String> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("1","2");
        objectObjectHashMap.put("1","3");
//        System.out.println(objectObjectHashMap.toString());

        HashMap<String, Set<String>> substitueMap = new HashMap<>();
        System.out.println(substitueMap.isEmpty());
        Set<String> substitue = new HashSet<String>();
        substitue.add("123");
        substitue.add("123");
        substitue.add("321");
        Set<String> substitue1 = new HashSet<String>();
        substitue1.add("a");
        substitue1.add("a");
        substitue1.add("b");

        substitueMap.put("key1",substitue);
        substitueMap.put("key2",substitue1);

        for(java.util.Map.Entry<String, Set<String>> infos : substitueMap.entrySet()){
            String key = infos.getKey();
            Set<String> value = infos.getValue();
            System.out.println("key:"+key+"value:"+value.toString());
        }

        List<HashMap<String, Object>> maps = new ArrayList<>();
        HashMap<String, Object> objectObjectHashMap1 = new HashMap<>();
        objectObjectHashMap1.put("123","456");
        maps.add(objectObjectHashMap1);
        for (java.util.Map<String, Object> map : maps) {
            String str = (String)map.get("123");
            map.put("234","456");
        }
        System.out.println("11");

        String lotId = "D2035017,D2035015.01";

        System.out.println(lotId);
    }
}
