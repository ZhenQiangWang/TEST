package example;

import mypackage.GetLotInfoServiceServiceLocator;
import mypackage.GetLotInfoService_PortType;

public class GetLotInfoClient {
  public static void main(String[] argv) {
      try {
          GetLotInfoServiceServiceLocator getLotInfoServiceServiceLocator = new GetLotInfoServiceServiceLocator();
          GetLotInfoService_PortType getLotInfoService = getLotInfoServiceServiceLocator.getGetLotInfoService();
          String summer = getLotInfoService.getLotInfoService("D2111003.01");
          System.out.println(summer);
      } catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}