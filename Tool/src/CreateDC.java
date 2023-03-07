/*
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import com.mycim.core.util.StringUtils;
import com.mycim.util.exception.ExceptionHandler;

public class CreateDC {
    public static void main(String[] args) {
        try {
            Calendar calendar = Calendar.getInstance();
            Date date = new Date("2022/1/5 13:47:32"); // 今天
            calendar.setTime(date);
            calendar.setFirstDayOfWeek(Calendar.MONDAY);
            int weekNum = calendar.get(Calendar.WEEK_OF_YEAR);
            String yearLast = new SimpleDateFormat("yy").format(date);
            String mouthLast = new SimpleDateFormat("MM").format(date);
            // 如果当前月份是12月，并且计算出来的结果是第一周，年份加一；比如2019-12-31得到的是第一周；
            if ("12".equals(mouthLast) && weekNum == 1) {
                yearLast = String.valueOf(Integer.valueOf(yearLast) + 1);
            }
            String sequenceName = "D" + yearLast + StringUtils.leftPad(String.valueOf(weekNum), 2, "0");
            System.out.println(sequenceName);

            System.out.println("D2130391".split("\\.")[0]);

            String workOrder = "PA03-KS0022010003";
            System.out.println(workOrder.replace("-F",""));

            String lotId = "D2050123";
            System.out.println(lotId.substring(1,5));
            System.out.println(lotId.substring(1,3));

            Lot lot = new Lot();
            lot.setQty("1");
            ArrayList<Lot> strs = new ArrayList<>();
            strs.add(lot);
            change(strs);
            System.out.println(strs.get(0));
        } catch (Exception e) {
            throw ExceptionHandler.handlerException(e);
        }
    }

    private static void change(ArrayList<Lot> strs){
        for(Lot lot : strs){
            lot.setLotId("123");;
        }
    }
}
*/
