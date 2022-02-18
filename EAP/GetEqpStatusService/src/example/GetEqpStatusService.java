package example;

import com.alibaba.fastjson.JSON;
import mypackage.GetEqpStatusServiceServiceLocator;
import mypackage.GetEqpStatusService_PortType;

public class GetEqpStatusService {
  public static void main(String[] argv) {
    try {
      GetEqpStatusServiceServiceLocator getEqpStatusServiceServiceLocator = new GetEqpStatusServiceServiceLocator();
      GetEqpStatusService_PortType getEqpStatusService = getEqpStatusServiceServiceLocator.getGetEqpStatusService();
      String summer = getEqpStatusService.getEqpStatusService("PWWB04");
      System.out.println(summer);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
