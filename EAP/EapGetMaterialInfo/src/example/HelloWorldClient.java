package example;

import mypackage.GetMaterialServiceServiceLocator;
import mypackage.GetMaterialService_PortType;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          GetMaterialServiceServiceLocator getMaterialServiceServiceLocator = new GetMaterialServiceServiceLocator();
          getMaterialServiceServiceLocator.setGetMaterialServiceEndpointAddress("http://192.168.68.95/mycim2/services/GetMaterialService?wsdl");
          GetMaterialService_PortType getMaterialService = getMaterialServiceServiceLocator.getGetMaterialService();
          String materialService = getMaterialService.getMaterialService("03.06.01.20004A2005001");
          System.out.println(materialService);
      }  catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}
