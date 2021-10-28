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
        String xml = "<student name=\"zhangsan\">\n" +
                "   <sex>man</sex>\n" +
                "    <age>18</age>\n" +
                "</student>";
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
