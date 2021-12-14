package example;

import mypackage.TipTopSetMaterialServiceServiceLocator;
import mypackage.TipTopSetMaterialService_PortType;

public class SetMaterialClient {
  public static void main(String[] argv) {
    try {

      TipTopSetMaterialServiceServiceLocator tipTopSetMaterialServiceServiceLocator = new TipTopSetMaterialServiceServiceLocator();
      TipTopSetMaterialService_PortType tipTopSetMaterialService = tipTopSetMaterialServiceServiceLocator.getTipTopSetMaterialService();
      String str = "<request>\n" +
              "  <identity>     \n" +
              "     <transactionid>2008080508255010</transactionid>\n" +
              "     <moduleid>TP</moduleid>\n" +
              "     <functionid>SI</functionid>\n" +
              "     <computername>MES01</computername>\n" +
              "     <curuserno>TP</curuserno>\n" +
              "     <sendtime>2008/08/05 08:25:50</sendtime>\n" +
              "  </identity>\n" +
              "  <parameter>\n" +
              "     <materialno>  --料號（物料編號）\n" +
              "        <name>materialno</name>\n" +
              "        <type>String</type>\n" +
              "        <value>MATERIALNO5</value>\n" +
              "        <desc></desc>\n" +
              "     </materialno >\n" +
              "     <materialtype>  --料號類別\n" +
              "        <name>MaterialType</name>\n" +
              "        <type>String</type>\n" +
              "        <value>MATERIAL</value>\n" +
              "        <desc></desc>\n" +
              "     </materialtype >\n" +
              "     <materialname>  --料號名稱\n" +
              "        <name>MaterialName</name>\n" +
              "        <type>String</type>\n" +
              "        <value>测试1</value>\n" +
              "        <desc></desc>\n" +
              "     </materialname >\n" +
              "     <materialspec>  --料號規格\n" +
              "        <name>MaterialSpec</name>\n" +
              "        <type>String</type>\n" +
              "        <value>测试物料规格</value>\n" +
              "        <desc></desc>\n" +
              "     </materialspec >\n" +
              "     <unitno>  --單位\n" +
              "        <name>UnitNo</name>\n" +
              "        <type>String</type>\n" +
              "        <value>pcs</value>\n" +
              "        <desc></desc>\n" +
              "     </unitno >\n" +
              "   </parameter>\n" +
              "</request>\n";
      String s = tipTopSetMaterialService.tipTopSetMaterialService(str);
      System.out.println(s);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
