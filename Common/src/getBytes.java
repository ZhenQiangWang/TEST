public class getBytes {
    public static void main(String[] args) {
        String str = "PANNRA00546,D50M057/D50M025.05,,,,,,,,,86/414,,,,,,GaN RF 功放管,,2150,DNXD50M057/D50M025.05-01";
        byte[]  buff = str.getBytes();

        int i = buff.length;

        System.out.println(i);

    }
}
