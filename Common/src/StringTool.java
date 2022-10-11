import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.List;

public class StringTool {
    public static void main(String[] args) {
        /*System.out.println("D2021003".substring(3,5));
        String[] stepid = {"1","2"};
        List<String> strings = Arrays.asList(stepid);
        System.out.println(strings.contains("1"));*/
        NumberFormat numberFormat = NumberFormat.getNumberInstance();
        numberFormat.setMaximumFractionDigits(0);
        numberFormat.setRoundingMode(RoundingMode.DOWN);
        // 去掉逗号
        numberFormat.setGroupingUsed(false);
        System.out.println(numberFormat.format(300.692));

        String v1 = "1.2389238";
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        double v = Double.parseDouble(String.valueOf("1.2389238"));
        String s = "%."+2+"f";

        java.text.NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMaximumFractionDigits(2);//保留小数点后几位就传几
        nf.setRoundingMode(RoundingMode.DOWN);//需要四舍五入就用 RoundingMode.UP
        double lat = 1.128;
        System.err.println(nf.format(lat));//2
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
