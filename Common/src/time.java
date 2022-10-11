import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class time {
    public static void main(String[] args) throws Exception {
        String dryTomeStr = "2022-08-04 09:10:47";
        long dryTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dryTomeStr).getTime();
        String endTimeStr = "2022-08-05 08:36:00";
        long endTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(endTimeStr).getTime();
        Long now = System.currentTimeMillis();
        long l = (endTime - now) / 3600000;//干燥持续时间

        System.out.println();
//        (endTime - dryTime)/1000/3600
    }
}
