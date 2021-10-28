package example;

import example.Tool.XmlJsonTransform;
import mypackage.GetItemDataRequest_GetItemDataRequest;
import mypackage.GetItemDataResponse_GetItemDataResponse;
import mypackage.TIPTOPServiceGateWayLocator;
import mypackage.TIPTOPServiceGateWayPortType_PortType;

public class ERPClient {
  public static void main(String[] argv) {
    try {
      TIPTOPServiceGateWayLocator tiptopServiceGateWayLocator = new TIPTOPServiceGateWayLocator();
      TIPTOPServiceGateWayPortType_PortType tiptopServiceGateWayPortType = tiptopServiceGateWayLocator.getTIPTOPServiceGateWayPortType();
      GetItemDataRequest_GetItemDataRequest getItemDataRequest_getItemDataRequest = new GetItemDataRequest_GetItemDataRequest();
      getItemDataRequest_getItemDataRequest.setRequest("hhh");

      XmlJsonTransform xmlJsonTransform = new XmlJsonTransform();
      String jsontoxml = xmlJsonTransform.JSONTOXML(getItemDataRequest_getItemDataRequest);
      GetItemDataResponse_GetItemDataResponse itemData = tiptopServiceGateWayPortType.getItemData(getItemDataRequest_getItemDataRequest);

      System.out.println("hhh");
    }catch (Exception ex) {
      ex.printStackTrace();
    }  
  }
}
