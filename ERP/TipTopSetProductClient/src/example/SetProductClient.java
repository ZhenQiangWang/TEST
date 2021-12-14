package example;

import mypackage.TipTopSetProductServiceServiceLocator;
import mypackage.TipTopSetProductService_PortType;

public class SetProductClient {
  public static void main(String[] argv) {
    try {

      TipTopSetProductServiceServiceLocator tipTopSetProductServiceServiceLocator = new TipTopSetProductServiceServiceLocator();
      TipTopSetProductService_PortType tipTopSetProductService = tipTopSetProductServiceServiceLocator.getTipTopSetProductService();
      String request ="<request>\n" +
              "  <identity>     \n" +
              "     <transactionid>2008080508255010</transactionid>\n" +
              "     <moduleid>TP</moduleid>  \n" +
              "     <functionid>SI</functionid> \n" +
              "     <computername>ERP</computername>\n" +
              "     <curuserno>TP</curuserno>\n" +
              "     <sendtime>2008/08/05 23:06:00</sendtime>\n" +
              "  </identity>\n" +
              "  <parameter>\n" +
              "     <productno>\n" +
              "        <name>ProductNo</name>\n" +
              "        <type>String</type>\n" +
              "        <value>TIPTOP3</value>\n" +
              "        <desc></desc>\n" +
              "     </productno >\n" +
              "     <productversion>\n" +
              "        <name>ProductVersion</name>\n" +
              "        <type>String</type>\n" +
              "        <value>DWX19G73-37HC-008123产品版本</value>\n" +
              "        <desc></desc>\n" +
              "     </ productversion >\n" +
              "     <productname>\n" +
              "        <name>ProductName</name>\n" +
              "        <type>String</type>\n" +
              "        <value>测试建立产品名称1234</value>\n" +
              "        <desc></desc>\n" +
              "     </productname >\n" +
              "     <producttype>\n" +
              "        <name>ProductType</name>\n" +
              "        <type>String</type>\n" +
              "        <value>PRODUCT</value>\n" +
              "        <desc></desc>\n" +
              "     </producttype >\n" +
              "\t<unitno>\n" +
              "        <name>UnitNo</name>\n" +
              "        <type>String</type>\n" +
              "        <value>pcs</value>\n" +
              "        <desc></desc>\n" +
              "     </unitno >\n" +
              "\t<specno>\n" +
              "        <name>SpecNo</name>\n" +
              "        <type>String</type>\n" +
              "        <value>规格编号</value>\n" +
              "        <desc></desc>\n" +
              "    </specno >\n" +
              "   </parameter>\n" +
              "</request>\n";
      String s = tipTopSetProductService.tipTopSetProductService(request);
      System.out.println(s);
    }catch (Exception e){
      e.printStackTrace();
    }
  }
}
