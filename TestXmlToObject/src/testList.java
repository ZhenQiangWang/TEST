import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class testList {
    public static void main(String[] args) {
        List<List<String>> list1 = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            List<String> list1s = new ArrayList<>();
            list1s.add(String.valueOf(i));
            list1.add(list1s);
        }
        List<List<String>> list2 = new ArrayList<>();
        for (int i = 0; i <3 ; i++) {
            List<String> list2s = new ArrayList<>();
            list2s.add(String.valueOf(i));
            list2.add(list2s);
        }
        System.out.println(list1.equals(list2));
        System.out.println(list2.toString());
    }
}
