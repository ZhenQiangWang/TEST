import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class testCollection {
    public static void main(String[] args) {
        Collection collection1 = new ArrayList();
        Collection collection = new ArrayList();
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("4");
        collection.add("5");
        collection1 = collection;
        Iterator iterator1 = collection1.iterator();
        Iterator iterator = collection.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        System.out.println("--------------------------");
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
