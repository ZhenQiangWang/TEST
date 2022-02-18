public class StringTool {
    public static void main(String[] args) {

        StringTool stringTool = new StringTool();
        System.out.println(stringTool.test());


    }

    private String test(){
        try {
            int i = 1 / 0;
            System.out.println("123");
            return "test";
        }catch (Exception e){
            System.out.println(e.getMessage());
            return e.getMessage();
        }finally {
            System.out.println("finally");
        }
    }
}
