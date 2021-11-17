package example;

import example.Tool.XmlJsonTransform;
import mypackage.*;

public class ERPClient {
  public static void main(String[] argv) {
    try {
      TIPTOPServiceGateWayLocator tiptopServiceGateWayLocator = new TIPTOPServiceGateWayLocator();
      TIPTOPServiceGateWayPortType_PortType tiptopServiceGateWayPortType = tiptopServiceGateWayLocator.getTIPTOPServiceGateWayPortType();
    }catch (Exception ex) {
      ex.printStackTrace();
    }  
  }
}
