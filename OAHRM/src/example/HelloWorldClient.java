package example;

import mypackage.HrmServiceLocator;
import mypackage.HrmServicePortType;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          HrmServiceLocator hrmServiceLocator = new HrmServiceLocator();
          HrmServicePortType hrmServiceHttpPort = hrmServiceLocator.getHrmServiceHttpPort();
//          hrmServiceHttpPort.getHrmUserInfo();
      } catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}
