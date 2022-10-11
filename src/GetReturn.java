

import net.sf.json.JSONObject;

public class GetReturn {
    public static void main(String[] args) {
        String msg = "{\n" +
                "\t\"StatusCode\":0,\n" +
                "\t\"ReturnMessage\":\"success\"\n" +
                "}";
        getReturn(msg);
    }

    public static void getReturn(String result) {
        JSONObject result_jsonObjectMessage = JSONObject.fromObject(result);
        String StatusCode = result_jsonObjectMessage.getString("StatusCode");
        String ReturnMessage = result_jsonObjectMessage.getString("ReturnMessage");
    }

}
