package example;

import mypackage.GetHoldCodeServiceServiceLocator;
import mypackage.GetHoldCodeService_PortType;

public class GetHoldCodeService {
  public static void main(String[] argv) {
      try {
          GetHoldCodeServiceServiceLocator getHoldCodeServiceServiceLocator = new GetHoldCodeServiceServiceLocator();
          GetHoldCodeService_PortType getHoldCodeService = getHoldCodeServiceServiceLocator.getGetHoldCodeService();
          String summer = getHoldCodeService.getHoldCodeService();
          System.out.println(summer);
      } catch (Exception ex) {

          ex.printStackTrace();

      }
  }
}
