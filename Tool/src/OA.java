import com.alibaba.fastjson.JSON;
import net.sf.json.JSONObject;

/**
 * 在线自定义action接口
 */
public class OA{
    public static void main(String[] args) {
        String s = JSON.toJSONString(ErrorInfo.ok());
        JSONObject jsonObject = JSONObject.fromObject(s);
        Integer errorCode = (Integer)jsonObject.get("errorCode");
        if(errorCode == 0){
            System.out.println("123");
        }
        String msg = String.valueOf(jsonObject.get("errorMsg"));
        System.out.println("123");
    }
}
