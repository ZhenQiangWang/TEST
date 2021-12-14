import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        java.util.List<Long> eapMaterialRrns = new ArrayList<>();
        eapMaterialRrns.add(12L);
        eapMaterialRrns.add(13L);
        eapMaterialRrns.add(14L);
        boolean contains = eapMaterialRrns.contains(15L);
        System.out.println(contains);

    }
}
