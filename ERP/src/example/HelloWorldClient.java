package example;

import com.alibaba.fastjson.JSON;
import mypackage.*;
import org.json.JSONObject;
import org.json.XML;

public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      String comsumeStr = "<Request>\n" +
              "\t<Access>\n" +
              "\t\t<Authentication password=\"tiptop\" user=\"tiptop\"/>\n" +
              "\t\t<Organization name=\"KS1\"/>\n" +
              "\t\t<Locale language=\"zh_CN\"/>\n" +
              "\t\t<Connection source=\"1234\" application=\"asfi514\"/>\n" +
              "\t\t<Appdevice timestamp=\"2022-01-21 10:14:49\" appmodule=\"\" appid=\"DJ-IMES-LLD\"/>\n" +
              "\t</Access>\n" +
              "\t<RequestContent>\n" +
              "\t\t<Parameter>\n" +
              "\t\t\t<Record>\n" +
              "\t\t\t\t<Document>\n" +
              "\t\t\t\t\t<RecordSet id=\"1\">\n" +
              "\t\t\t\t\t\t<Master name=\"Master\">\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"status\" value=\"1\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfpud06\" value=\"\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfp02\" value=\"2022/01/21\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfp16\" value=\"00810\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"fmes\" value=\"1\"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t</Master>\n" +
              "\t\t\t\t\t\t<Detail name=\"Detail-A\">\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs03\" value=\"PA05-KS1022010001\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs04\" value=\"PANNRA00402\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs07\" value=\"W31\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs08\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs09\" value=\"20220120\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs10\" value=\"PKG\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs30\" value=\"PCS\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs05\" value=\"1\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs21\" value=\"1\"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs03\" value=\"PA05-KS1022010003\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs04\" value=\"PANNRA00402\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs07\" value=\"W31\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs08\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs09\" value=\"20220120\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs10\" value=\"PKG\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs30\" value=\"PCS\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs05\" value=\"1\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs21\" value=\"2\"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t</Detail>\n" +
              "\t\t\t\t\t</RecordSet>\n" +
              "\t\t\t\t</Document>\n" +
              "\t\t\t</Record>\n" +
              "\t\t</Parameter>\n" +
              "\t</RequestContent>\n" +
              "</Request>";
      TIPTOPServiceGateWayBindingStub tiptopServiceGateWayBindingStub = new TIPTOPServiceGateWayBindingStub();
      tiptopServiceGateWayBindingStub.setTimeout(300);
      TIPTOPServiceGateWayLocator tiptopServiceGateWayLocator = new TIPTOPServiceGateWayLocator();
      TIPTOPServiceGateWayPortType_PortType tiptopServiceGateWayPortType = tiptopServiceGateWayLocator.getTIPTOPServiceGateWayPortType();


      Createasfi5IcdRequest_createasfi5IcdRequest createasfi5IcdRequest_createasfi5IcdRequest = new Createasfi5IcdRequest_createasfi5IcdRequest();
      createasfi5IcdRequest_createasfi5IcdRequest.setRequest(comsumeStr);
      Createasfi5IcdResponse_createasfi5IcdResponse createasfi5IcdResponse_createasfi5IcdResponse = tiptopServiceGateWayPortType.createasfi5Icd(createasfi5IcdRequest_createasfi5IcdRequest);
      String response = createasfi5IcdResponse_createasfi5IcdResponse.getResponse();
      System.out.println(response);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
