package example;

import com.alibaba.fastjson.JSON;
import mypackage.*;
import org.json.JSONObject;
import org.json.XML;

public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      String comsumeStr = "";
      TIPTOPServiceGateWayBindingStub tiptopServiceGateWayBindingStub = new TIPTOPServiceGateWayBindingStub();
      tiptopServiceGateWayBindingStub.setTimeout(300);
      TIPTOPServiceGateWayLocator tiptopServiceGateWayLocator = new TIPTOPServiceGateWayLocator();
      tiptopServiceGateWayLocator.setTIPTOPServiceGateWayPortTypeEndpointAddress("http://192.168.68.157/web/ws/r/aws_ttsrv2?wsdl");
      TIPTOPServiceGateWayPortType_PortType tiptopServiceGateWayPortType = tiptopServiceGateWayLocator.getTIPTOPServiceGateWayPortType();

      String str = "<Request>\n" +
              "\t<Access>\n" +
              "\t\t<Authentication password=\"tiptop\" user=\"tiptop\"/>\n" +
              "\t\t<Organization name=\"KS\"/>\n" +
              "\t\t<Locale language=\"zh_CN\"/>\n" +
              "\t\t<Connection source=\"1234\" application=\"asfi300\"/>\n" +
              "\t\t<Appdevice timestamp=\"2022/08/08\" appmodule=\"\" appid=\"DJ-IMES-BGD\"/>\n" +
              "\t</Access>\n" +
              "\t<RequestContent>\n" +
              "\t\t<Parameter>\n" +
              "\t\t\t<Record>\n" +
              "\t\t\t\t<Document>\n" +
              "\t\t\t\t\t<RecordSet id=\"1\">\n" +
              "\t\t\t\t\t\t<Master name=\"Master\">\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"PANNRA00394,C39M036_1.01,,,,,,,,,770,,,,,,GaN RF 功放管,,2039,DNXC39M036-04\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"status\" value=\"1\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srf01\" value=\"\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srf02\" value=\"2022/08/08\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srforiu\" value=\"00851\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srf03\" value=\"PKG\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srf04\" value=\"A01\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srf04\" value=\"2022/08/08\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srfud03\" value=\"PANNRA00394,C39M036_1.01,,,,,,,,,770,,,,,,GaN RF 功放管,,2039,DNXC39M036-04\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"fmes\" value=\"1\"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t</Master>\n" +
              "\t\t\t\t\t\t<Detail name=\"Detail-A\">\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg16\" value=\"PA05-KS0022070008\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg03\" value=\"PANNRA00394\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srgud02\" value=\"PKG\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg04\" value=\"PCS\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg05\" value=\"770.0\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg06\" value=\"\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg07\" value=\"\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg10\" value=\"5300.12\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg19\" value=\"5300.12\"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t</Detail>\n" +
              "\t\t\t\t\t</RecordSet>\n" +
              "\t\t\t\t</Document>\n" +
              "\t\t\t</Record>\n" +
              "\t\t</Parameter>\n" +
              "\t</RequestContent>\n" +
              "</Request>";
      //报工
      Createasft300Request_createasft300Request createasft300Request_createasft300Request = new Createasft300Request_createasft300Request();
      createasft300Request_createasft300Request.setRequest(str);
      Createasft300Response_createasft300Response createasft300Response_createasft300Response = tiptopServiceGateWayPortType.createasft300(createasft300Request_createasft300Request);
      String response = createasft300Response_createasft300Response.getResponse();
      System.out.println("良品报工接口返回值" + response);

      /*Createasfi5IcdRequest_createasfi5IcdRequest createasfi5IcdRequest_createasfi5IcdRequest = new Createasfi5IcdRequest_createasfi5IcdRequest();
      createasfi5IcdRequest_createasfi5IcdRequest.setRequest(comsumeStr);
      Createasfi5IcdResponse_createasfi5IcdResponse createasfi5IcdResponse_createasfi5IcdResponse = tiptopServiceGateWayPortType.createasfi5Icd(createasfi5IcdRequest_createasfi5IcdRequest);
      String response = createasfi5IcdResponse_createasfi5IcdResponse.getResponse();
      System.out.println(response);*/
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
