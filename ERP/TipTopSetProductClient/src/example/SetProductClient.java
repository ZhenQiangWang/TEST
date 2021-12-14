package example;

import mypackage.TipTopSetProductServiceServiceLocator;
import mypackage.TipTopSetProductService_PortType;

public class SetProductClient {
  public static void main(String[] argv) {
    try {

      TipTopSetProductServiceServiceLocator tipTopSetProductServiceServiceLocator = new TipTopSetProductServiceServiceLocator();
      TipTopSetProductService_PortType tipTopSetProductService = tipTopSetProductServiceServiceLocator.getTipTopSetProductService();
      String request ="<request>\n" +
              " <identity>\n" +
              "   <transactionid>2021112917110284</transactionid>\n" +
              "   <moduleid>TP</moduleid>\n" +
              "   <functionid>SI</functionid>\n" +
              "   <computername>MES01</computername>\n" +
              "   <curuserno>tiptop</curuserno>\n" +
              "   <sendtime>2021/11/29 17:11:02</sendtime>\n" +
              " </identity>\n" +
              " <parameter>\n" +
              "\n" +
              "  <productno>\n" +
              "    <name>ProductNo</name>\n" +
              "    <type>String</type>\n" +
              "    <value>sy211129_Product</value>\n" +
              "    <desc></desc>\n" +
              "  </productno>\n" +
              "  <productversion>\n" +
              "    <name>ProductVersion</name>\n" +
              "    <type>String</type>\n" +
              "    <value>1</value>\n" +
              "    <desc></desc>\n" +
              "  </productversion>\n" +
              "  <productname>\n" +
              "    <name>ProductName</name>\n" +
              "    <type>String</type>\n" +
              "    <value>sy211129_Product1</value>\n" +
              "    <desc></desc>\n" +
              "  </productname>\n" +
              "  <producttype>\n" +
              "    <name>ProductType</name>\n" +
              "    <type>String</type>\n" +
              "    <value></value>\n" +
              "    <desc></desc>\n" +
              "  </producttype>\n" +
              "  <unitno>\n" +
              "    <name>UnitNo</name>\n" +
              "    <type>String</type>\n" +
              "    <value>Pcs</value>\n" +
              "    <desc></desc>\n" +
              "  </unitno>\n" +
              "  <specno>\n" +
              "    <name>SpecNo</name>\n" +
              "    <type>String</type>\n" +
              "    <value>N/A</value>\n" +
              "    <desc></desc>\n" +
              "  </specno>\n" +
              "  <creator>\n" +
              "    <name>Creator</name>\n" +
              "    <type>String</type>\n" +
              "    <value>tiptop</value>\n" +
              "    <desc></desc>\n" +
              "  </creator>\n" +
              "\n" +
              " </parameter>\n" +
              "</request>\n";
      String s = tipTopSetProductService.tipTopSetProductService(request);
      System.out.println(s);
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
