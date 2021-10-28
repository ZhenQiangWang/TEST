package example.tool;

import com.alibaba.fastjson.JSON;
import org.json.JSONObject;
import org.json.XML;

public class XmlJsonTransform {

    public JSONObject XMLTOJSON(String xml){
        return XML.toJSONObject(xml);
//        this.testGsonFormat = JSON.parseObject(xmlJSONObj.toString(), TestGsonFormat.class);
    }

    public String JSONTOXML(String jsonString){
//        String jsonString = JSON.toJSONString(testGsonFormat);
        JSONObject jsonObject = new JSONObject(jsonString);
        String xml = XML.toString(jsonObject);
        return xml;
//        System.out.println("ObjectToXML"+xml);
    }
}
