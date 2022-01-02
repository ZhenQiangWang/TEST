package example;

import com.alibaba.fastjson.JSON;
import mypackage.*;
import org.json.JSONObject;
import org.json.XML;

public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      /*String comsumeStr = "<Request>\n" +
              "\t<Access>\n" +
              "\t\t<Authentication user=\"tiptop\" password=\"tiptop\"/>\n" +
              "\t\t<Organization name=\"KS1\"/>\n" +
              "\t\t<Locale language=\"zh_TW\"/>\n" +
              "\t\t<Connection source=\"\" application=\"asfi511\"/>\n" +
              "\t\t<Appdevice timestamp=\"2021-12-16 08:42:38\" appid=\"Digiwin-MES-asfi511\"/>\n" +
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
              "\t\t\t\t\t\t\t\t<Field name=\"sfp02\" value=\"2021/12/17\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfp16\" value=\"00000\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"fmes\" value=\"1\"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t</Master>\n" +
              "\t\t\t\t\t\t<Detail name=\"Detail-A\">\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs03\" value=\"PA03-KS1021120012\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs04\" value=\"A0201A00014\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs07\" value=\"W31\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs08\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs09\" value=\"20211217\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs10\" value=\"GFG\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs30\" value=\"PCS\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs05\" value=\"10.0\"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t</Detail>\n" +
              "\t\t\t\t\t</RecordSet>\n" +
              "\t\t\t\t</Document>\n" +
              "\t\t\t</Record>\n" +
              "\t\t</Parameter>\n" +
              "\t</RequestContent>\n" +
              "</Request>";*/
      TIPTOPServiceGateWayBindingStub tiptopServiceGateWayBindingStub = new TIPTOPServiceGateWayBindingStub();
      tiptopServiceGateWayBindingStub.setTimeout(300);
      TIPTOPServiceGateWayLocator tiptopServiceGateWayLocator = new TIPTOPServiceGateWayLocator();
      TIPTOPServiceGateWayPortType_PortType tiptopServiceGateWayPortType = tiptopServiceGateWayLocator.getTIPTOPServiceGateWayPortType();

     /* Createasfi5IcdRequest_createasfi5IcdRequest createasfi5IcdRequest_createasfi5IcdRequest = new Createasfi5IcdRequest_createasfi5IcdRequest(comsumeStr);
      Createasfi5IcdResponse_createasfi5IcdResponse createasfi5IcdResponse_createasfi5IcdResponse = tiptopServiceGateWayPortType.createasfi5Icd(createasfi5IcdRequest_createasfi5IcdRequest);
      String response = createasfi5IcdResponse_createasfi5IcdResponse.getResponse();
      JSONObject jsonObject = XML.toJSONObject(response);
      TipTopResultVO tipTopResultVO = JSON.parseObject(jsonObject.toString(), TipTopResultVO.class);
      System.out.println(response);*/

      String report = "<Request><Access><Authentication password=\"tiptop\" user=\"tiptop\"/><Organization name=\"KS1\"/><Locale language=\"zh_CN\"/><Connection source=\"1234\" application=\"asfi300\"/><Appdevice timestamp=\"2021-12-21 18:27:56\" appmodule=\"\" appid=\"DJ-IMES-BGD\"/></Access><RequestContent><Parameter><Record><Document><RecordSet id=\"1\"><Master name=\"Master\"><Record><Field name=\"formid\" value=\"[D2035035]2021/12/21\"/><Field name=\"status\" value=\"2\"/><Field name=\"srf01\" value=\"MC03-KS1021120001\"/><Field name=\"srf02\" value=\"2021/12/21\"/><Field name=\"srforiu\" value=\"00000\"/><Field name=\"srf03\" value=\"PKG\"/><Field name=\"srf04\" value=\"A01\"/><Field name=\"srf04\" value=\"2021/12/21\"/><Field name=\"srfud03\" value=\"[D2035035]2021/12/21\"/><Field name=\"fmes\" value=\"1\" /></Record></Master><Detail name=\"Detail-A\"><Record><Field name=\"formid\" value=\"qwfnakdnfsa\"/><Field name=\"srg16\" value=\"PA03-KS1021120012\"/><Field name=\"srg03\" value=\"PANNAA00001\"/><Field name=\"srgud02\" value=\"PKG\"/><Field name=\"srg04\" value=\"PCS\"/><Field name=\"srg05\" value=\"200.0\"/><Field name=\"srg06\" value=\"\"/><Field name=\"srg07\" value=\"\"/><Field name=\"srg10\" value=\"3848869000\"/><Field name=\"srg19\" value=\"3848869000\"/></Record></Detail></RecordSet></Document></Record></Parameter></RequestContent></Request>";
      Createasft300Request_createasft300Request createasft300Request_createasft300Request = new Createasft300Request_createasft300Request();
      createasft300Request_createasft300Request.setRequest(report);
      Createasft300Response_createasft300Response createasft300Response_createasft300Response = tiptopServiceGateWayPortType.createasft300(createasft300Request_createasft300Request);
      String response = createasft300Response_createasft300Response.getResponse();
      System.out.println(response);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
