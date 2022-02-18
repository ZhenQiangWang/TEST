public class fanx {
    public static void main(String[] args) {
        fanx fanx = new fanx();
        Object[] arg = new Object[] {fanx.isNull(null,"String"),fanx.isNull("wr","String"),fanx.isNull(12,"int")};
        System.out.println(arg);
    }

    public <E> String isNull(E t,String type){
        if(t == null){
            return type;
        }else {
            System.out.println(t.getClass().toString());
            return t.getClass().toString();
        }
    }
}
