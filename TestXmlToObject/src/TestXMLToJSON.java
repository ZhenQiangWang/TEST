import Bean.TestGsonFormat;
import com.alibaba.fastjson.*;
import org.json.JSONObject;
import org.json.XML;

public class TestXMLToJSON {
    TestGsonFormat testGsonFormat;
    public static void main(String[] args) {
        String string = null;
        TestXMLToJSON testXMLToJSON = new TestXMLToJSON();
        try {
            testXMLToJSON.XMLTOJSON();
            testXMLToJSON.JSONTOXML();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void XMLTOJSON(){
        String xml = "<response>\n" +
                "\t<identity>\n" +
                "\t\t<transactionid>2008080508255010</transactionid>\n" +
                "\t\t<moduleid>OA</moduleid>\n" +
                "\t\t<functionid>SI</functionid>\n" +
                "\t\t<computername>MES01</computername>\n" +
                "\t\t<curuserno>TP</curuserno>\n" +
                "\t\t<sendtime>2008/08/05 08:25:50</sendtime>\n" +
                "\t</identity>\n" +
                "\t<returnvalue></returnvalue>\n" +
                "\t<result>fail</result>\n" +
                "\t<exception>\n" +
                "\t\t<code>0000-999999</code>\n" +
                "\t\t<sysmsg></sysmsg>\n" +
                "\t\t<mesmsg>\n" +
                "\t\t\tDepartmentNo is not exist\n" +
                "\t\t</mesmsg>\n" +
                "\t\t<stack></stack>\n" +
                "\t</exception>\n" +
                "\t<message></message>\n" +
                "</response>";
        JSONObject xmlJSONObj = XML.toJSONObject(xml);
        System.out.println("XMLTOObject"+xmlJSONObj.toString());
        this.testGsonFormat = JSON.parseObject(xmlJSONObj.toString(), TestGsonFormat.class);
    }

    public void JSONTOXML(){
        String jsonString = JSON.toJSONString(testGsonFormat);
        JSONObject jsonObject = new JSONObject(jsonString);
        String xml = XML.toString(jsonObject);
        System.out.println("ObjectToXML"+xml);
    }

}
