package example;

import IMES.WsERPLocator;
import IMES.WsERPSoap_PortType;

public class HelloWorldClient {
  public static void main(String[] argv) {
      try {
          WsERPLocator wsERPLocator = new WsERPLocator();
          WsERPSoap_PortType wsERPSoap_portType = wsERPLocator.getwsERPSoap12();
          String str = " <request>\n" +
                  "  <identity>\n" +
                  "    <transactionid>2008080508255010</transactionid>\n" +
                  "    <moduleid>OA</moduleid>\n" +
                  "    <functionid>SI</functionid>\n" +
                  "    <computername>MES01</computername>\n" +
                  "    <curuserno>TP</curuserno>\n" +
                  "    <sendtime>2008/08/05 08:25:50</sendtime>\n" +
                  "  </identity>\n" +
                  "  <parameter>\n" +
                  "      <value>\n" +
                  "        <USERNO>01115</USERNO> \n" +
                  "        <USERNAME>王永飞</USERNAME>\n" +
                  "        <USERLEVEL>5</USERLEVEL> \n" +
                  "        <PASSWORD>123</PASSWORD> \n" +
                  "        <ISSUESTATE>2</ISSUESTATE> \n" +
                  "        <USERTYPE>0</USERTYPE> \n" +
                  "        <EMAILADDRESS>123@qq.com</EMAILADDRESS> \n" +
                  "        <DEPARTMENTNO>A00500067</DEPARTMENTNO> \n" +
                  "        <CHANGEDATE>2008/08/05 08:25:50</CHANGEDATE>\n" +
                  "        <RESETPASSWORD>A00500067</RESETPASSWORD> \n" +
                  "      </value>\n" +
                  "  </parameter>\n" +
                  "</request>";
          String user = wsERPSoap_portType.createUser(str);
          System.out.println(user);
      }  catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}
