package example;

import mypackage.HrmServiceLocator;
import mypackage.HrmServicePortType;
import mypackage.UserBean;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          HrmServiceLocator hrmServiceLocator = new HrmServiceLocator();
          HrmServicePortType hrmServiceHttpPort = hrmServiceLocator.getHrmServiceHttpPort();
          UserBean[] hrmUserInfo = hrmServiceHttpPort.getHrmUserInfo("192.168.68.172", "00903", null, null, null, null);
          System.out.println(hrmUserInfo);
      } catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}
