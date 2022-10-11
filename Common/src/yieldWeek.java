import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class yieldWeek {
    public static void main(String[] args) {
        String s1 = "I01";
        String s2 = "I01";
        System.out.println(s1 != s2);
//        System.out.println("2104".substring(0,2));
//        String lotId = generateLotId(new Date());
//        System.out.println(lotId);
//        compare("D2150","D2202");
    }

    public static void compare(String yearWeek1, String yearWeek12){
        String year1 = yearWeek1.substring(1, 3);
        String year2 = yearWeek12.substring(1, 3);
        int week1 = Integer.parseInt(yearWeek1.substring(3, 5));
        int week2 = Integer.parseInt(yearWeek12.substring(3, 5));
        year1 = "20"+year1;
//        System.out.println("年:"+year1+"；周"+week);
        if(!year1.equals(year2)){
            Date date = new Date(year1+"/12/31");
            int maxWeek = Integer.parseInt(getMAxWeekByYear(date));
            System.out.println(year1+"年最大周为:"+maxWeek);
            int compareWeek = (maxWeek - week1) + week2;
            System.out.println("相差"+compareWeek+"周");
        }

    }

    private static String getMAxWeekByYear(Date date) {
        //跨年，找出前一年最大周
        String lotId = generateLotId(date);
        String week = lotId.substring(3, 5);
        if(week.equals("01")){
            return getMAxWeekByYear(new Date(date.getTime()-86400000));
        }else {
            return week;
        }
    }

    public static String generateLotId(Date date){
        Calendar calendar = Calendar.getInstance();
//        Date date = new Date(); // 今天
        calendar.setTime(date);
        calendar.setFirstDayOfWeek(Calendar.MONDAY);
        int weekNum = calendar.get(Calendar.WEEK_OF_YEAR);
        String yearLast = new SimpleDateFormat("yy").format(date);
        String mouthLast = new SimpleDateFormat("MM").format(date);
        // 如果当前月份是12月，并且计算出来的结果是第一周，年份加一；比如2019-12-31得到的是第一周；
        if ("12".equals(mouthLast) && weekNum == 1) {
            yearLast = String.valueOf(Integer.valueOf(yearLast) + 1);
        }
        String sequenceName = "D" + yearLast + leftPad(String.valueOf(weekNum), 2, "0");
        return sequenceName;
    }

    public static String leftPad(String str, int size, String padStr) {
        if (str == null) {
            return null;
        } else {
            if (padStr == null || padStr.length() == 0) {
                padStr = " ";
            }

            int padLen = padStr.length();
            int strLen = str.length();
            int pads = size - strLen;
            if (pads <= 0) {
                return str;
            } else if (padLen == 1 && pads <= 8192) {
                return leftPad(str, size, padStr.charAt(0));
            } else if (pads == padLen) {
                return padStr.concat(str);
            } else if (pads < padLen) {
                return padStr.substring(0, pads).concat(str);
            } else {
                char[] padding = new char[pads];
                char[] padChars = padStr.toCharArray();

                for(int i = 0; i < pads; ++i) {
                    padding[i] = padChars[i % padLen];
                }

                return (new String(padding)).concat(str);
            }
        }
    }


    public static String leftPad(String str, int size, char padChar) {
        if (str == null) {
            return null;
        } else {
            int pads = size - str.length();
            if (pads <= 0) {
                return str;
            } else {
                return pads > 8192 ? leftPad(str, size, String.valueOf(padChar)) : padding(pads, padChar).concat(str);
            }
        }
    }


    private static String padding(int repeat, char padChar) {
        String[] PADDING = new String['\uffff'];
        String pad = PADDING[padChar];
        if (pad == null) {
            pad = String.valueOf(padChar);
        }

        while(pad.length() < repeat) {
            pad = pad.concat(pad);
        }

        PADDING[padChar] = pad;
        return pad.substring(0, repeat);
    }
}
