package example;

import com.alibaba.fastjson.JSON;
import mypackage.Createasfi5IcdRequest_createasfi5IcdRequest;
import mypackage.Createasfi5IcdResponse_createasfi5IcdResponse;
import mypackage.TIPTOPServiceGateWayLocator;
import mypackage.TIPTOPServiceGateWayPortType_PortType;
import org.json.JSONObject;
import org.json.XML;

public class HelloWorldClient {
  public static void main(String[] argv) {
    try {
      String str = "";
      TIPTOPServiceGateWayLocator tiptopServiceGateWayLocator = new TIPTOPServiceGateWayLocator();
      TIPTOPServiceGateWayPortType_PortType tiptopServiceGateWayPortType = tiptopServiceGateWayLocator.getTIPTOPServiceGateWayPortType();
      Createasfi5IcdRequest_createasfi5IcdRequest createasfi5IcdRequest_createasfi5IcdRequest = new Createasfi5IcdRequest_createasfi5IcdRequest(str.toString());
      Createasfi5IcdResponse_createasfi5IcdResponse createasfi5IcdResponse_createasfi5IcdResponse = tiptopServiceGateWayPortType.createasfi5Icd(createasfi5IcdRequest_createasfi5IcdRequest);
      String response = createasfi5IcdResponse_createasfi5IcdResponse.getResponse();
      JSONObject jsonObject = XML.toJSONObject(response);
      TipTopResultVO tipTopResultVO = JSON.parseObject(jsonObject.toString(), TipTopResultVO.class);
      System.out.println(response);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
