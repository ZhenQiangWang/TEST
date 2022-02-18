import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;

public class object {
    public static void main(String[] args) {
        String str = "123";
        Timestamp template = new Timestamp(1236447848L);
        Object[] args1 = new Object[]{"1",1,1.00,template,123445L,true,1.2f,new Date(1234567L),new Time(123456987L),0D};
        for (int i = 0; i < args1.length; i++) {
            String s = args1[i].getClass().toString();
            System.out.println(args1[i]+"------"+s);
        }
    }
}
