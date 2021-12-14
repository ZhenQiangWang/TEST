import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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


    }
}
