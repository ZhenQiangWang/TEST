package example;

import mypackage.GetReasonCodeServiceServiceLocator;
import mypackage.GetReasonCodeService_PortType;

public class GetReasonCodeService {
  public static void main(String[] argv) {
      try {
          GetReasonCodeServiceServiceLocator getReasonCodeServiceServiceLocator = new GetReasonCodeServiceServiceLocator();
          GetReasonCodeService_PortType getProductListService = getReasonCodeServiceServiceLocator.getGetReasonCodeService();
          String result = getProductListService.getReasonCodeService("FT","D2224009.01");
          System.out.println(result);
      } catch (Exception ex) {

          ex.printStackTrace();

      }
  }
}
