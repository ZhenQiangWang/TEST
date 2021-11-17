package example;

import com.alibaba.fastjson.JSON;
import mypackage.GetReasonCodeServiceServiceLocator;
import mypackage.GetReasonCodeService_PortType;

public class GetReasonCodeService {
  public static void main(String[] argv) {
    try {
      GetReasonCodeServiceServiceLocator getReasonCodeServiceServiceLocator = new GetReasonCodeServiceServiceLocator();
      GetReasonCodeService_PortType getReasonCodeService = getReasonCodeServiceServiceLocator.getGetReasonCodeService();
      String summer = getReasonCodeService.getReasonCodeService("FT");
      System.out.println(summer);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
