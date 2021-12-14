package example;

import mypackage.TipTopReciveWorkOrderServiceServiceLocator;
import mypackage.TipTopReciveWorkOrderService_PortType;

public class ReciveWorkOrder {
  public static void main(String[] argv) {
      try {
          TipTopReciveWorkOrderServiceServiceLocator tipTopReciveWorkOrderServiceServiceLocator = new TipTopReciveWorkOrderServiceServiceLocator();
          TipTopReciveWorkOrderService_PortType tipTopReciveWorkOrderService = tipTopReciveWorkOrderServiceServiceLocator.getTipTopReciveWorkOrderService();
          String workOrderStr = "<request>\n" +
                  "  <identity>     \n" +
                  "     <transactionid>2008080508255010</transactionid>\n" +
                  "     <moduleid>TP</moduleid>\n" +
                  "     <functionid>SI</functionid>\n" +
                  "     <computername>MES01</computername>\n" +
                  "     <curuserno>TP</curuserno>\n" +
                  "     <sendtime>2008/08/05 08:25:50</sendtime>\n" +
                  "  </identity>\n" +
                  "  <parameter>\n" +
                  "     <mono>\n" +
                  "        <name>MONo</name>\n" +
                  "        <type>String</type>\n" +
                  "        <value>TIPTOPWORKORDER</value>\n" +
                  "        <desc></desc>\n" +
                  "     </mono>\n" +
                  "     <rono>\n" +
                  "        <name>RONo</name>\n" +
                  "        <type>String</type>\n" +
                  "        <value>rono</value>\n" +
                  "        <desc></desc>\n" +
                  "     </rono>\n" +
                  "     <itemno>\n" +
                  "        <name>ItemNo</name>\n" +
                  "        <type>String</type>\n" +
                  "        <value>1</value>\n" +
                  "        <desc></desc>\n" +
                  "     </itemno>\n" +
                  "     <customerno>\n" +
                  "        <name>CustomerNo</name>\n" +
                  "        <type>String</type>\n" +
                  "        <value>Z</value>\n" +
                  "        <desc></desc>\n" +
                  "     </customerno>\n" +
                  "     <factoryno>\n" +
                  "        <name>FactoryNo</name>\n" +
                  "        <type>String</type>\n" +
                  "        <value>XX</value>\n" +
                  "        <desc></desc>\n" +
                  "    </factoryno>\n" +
                  "    <moqty>\n" +
                  "        <name>MOQty</name>\n" +
                  "        <type>Numeric</type>\n" +
                  "        <value>123</value>\n" +
                  "        <desc></desc>\n" +
                  "     </moqty>\n" +
                  "     <productno>\n" +
                  "        <name>ProductNo</name>\n" +
                  "        <type>String</type>\n" +
                  "        <value>TIPTOP2</value>\n" +
                  "        <desc></desc>\n" +
                  "     </productno>\n" +
                  "     <motypeno>\n" +
                  "        <name>MOTypeNo</name>\n" +
                  "        <type>Numeric</type>\n" +
                  "        <value>P</value>\n" +
                  "        <desc></desc>\n" +
                  "     </motypeno>\n" +
                  "     <priority>\n" +
                  "        <name>Priority</name>\n" +
                  "        <type>Numeric</type>\n" +
                  "        <value>1</value>\n" +
                  "        <desc></desc>\n" +
                  "     </priority>\n" +
                  "     <planfinishdate>\n" +
                  "        <name>PlanFinishDate</name>\n" +
                  "        <type>Date</type>\n" +
                  "        <value>31/07/2021</value>\n" +
                  "        <desc></desc>\n" +
                  "     </planfinishdate>\n" +
                  "     <mounitno>\n" +
                  "        <name>MOUnitNo</name>\n" +
                  "        <type>String</type>\n" +
                  "        <value>pcs</value>\n" +
                  "        <desc></desc>\n" +
                  "     </mounitno>\n" +
                  "     <property>\n" +
                  "      <value>\n" +
                  "        <name>XXX </name>\n" +
                  "        <type>XX</type>\n" +
                  "        <value>XX</value>\n" +
                  "        <desc>XX</desc>\n" +
                  "      </value>\n" +
                  "      <value>\n" +
                  "        <name>XXX </name>\n" +
                  "        <type>XX</type>\n" +
                  "        <value>XX</value>\n" +
                  "        <desc>XX</desc>\n" +
                  "      </value>\n" +
                  "     </property>\n" +
                  "     <momateriallist>\n" +
                  "        <name>MOMaterialList</name>\n" +
                  "        <type>String</type>\n" +
                  "        <value>\n" +
                  "           <materialno>MATERIALNO1</materialno>\n" +
                  "           <materialtype>XXX</materialtype>\n" +
                  "           <materiallevel>0</materiallevel>\n" +
                  "           <stdqty>1223</stdqty>\n" +
                  "           <unitno>123</unitno>\n" +
                  "           <opno>CDB</opno>\n" +
                  "           <putinplacetype>3</putinplacetype >\n" +
                  "           <substitutematerialno>MATERIALNO1</substitutematerialno>\n" +
                  "           <substitutemateriallevel>0</substitutemateriallevel>\n" +
                  "           <substitutestdqty>1223</substitutestdqty>\n" +
                  "           <requireqty>123</requireqty>\n" +
                  "           <property>\n" +
                  "                 <value>\n" +
                  "                   <name>XXX</name>\n" +
                  "                   <type>XX</type>\n" +
                  "                   <value>XX</value>\n" +
                  "                   <desc>XX</desc>\n" +
                  "                 </value>\n" +
                  "                 <value>\n" +
                  "                   <name>XXX</name>\n" +
                  "                   <type>XX</type>\n" +
                  "                   <value>XX</value>\n" +
                  "                   <desc>XX</desc>\n" +
                  "                 </value>\n" +
                  "           </property>\n" +
                  "        </value>\n" +
                  "        <value>\n" +
                  "           <materialno>MATERIALNO2</materialno>\n" +
                  "           <materialtype>XXX</materialtype> \n" +
                  "           <materiallevel>0</materiallevel>\n" +
                  "           <stdqty>123</stdqty>\n" +
                  "           <unitno>XXX</unitno>\n" +
                  "           <opno>CDB</opno>\n" +
                  "           <putinplacetype>3</putinplacetype >\n" +
                  "           <substitutematerialno>MATERIALNO3</substitutematerialno>\n" +
                  "           <substitutemateriallevel>0</substitutemateriallevel>\n" +
                  "           <substitutestdqty>123</substitutestdqty>  \n" +
                  "           <requireqty>321</requireqty>\n" +
                  "           <property>\n" +
                  "                 <value>\n" +
                  "                   <name>XXX</name>\n" +
                  "                   <type>XX</type>\n" +
                  "                   <value>XX</value>\n" +
                  "                   <desc>XX</desc>\n" +
                  "                 </value>\n" +
                  "                 <value>\n" +
                  "                   <name>XXX</name>\n" +
                  "                   <type>XX</type>\n" +
                  "                   <value>XX</value>\n" +
                  "                   <desc>XX</desc>\n" +
                  "                 </value>\n" +
                  "           </property >\n" +
                  "        </value>\n" +
                  "\t\t<value>\n" +
                  "           <materialno>MATERIALNO3</materialno>\n" +
                  "           <materialtype>XXX</materialtype> \n" +
                  "           <materiallevel>0</materiallevel>\n" +
                  "           <stdqty>123</stdqty>\n" +
                  "           <unitno>XXX</unitno>\n" +
                  "           <opno>DDB</opno>\n" +
                  "           <putinplacetype>3</putinplacetype >\n" +
                  "           <substitutematerialno>MATERIALNO4</substitutematerialno>\n" +
                  "           <substitutemateriallevel>0</substitutemateriallevel>\n" +
                  "             <substitutestdqty>123</substitutestdqty>  \n" +
                  "           <requireqty>321</requireqty>\n" +
                  "           <property>\n" +
                  "                 <value>\n" +
                  "                   <name>XXX</name>\n" +
                  "                   <type>XX</type>\n" +
                  "                   <value>XX</value>\n" +
                  "                   <desc>XX</desc>\n" +
                  "                 </value>\n" +
                  "                 <value>\n" +
                  "                   <name>XXX</name>\n" +
                  "                   <type>XX</type>\n" +
                  "                   <value>XX</value>\n" +
                  "                   <desc>XX</desc>\n" +
                  "                 </value>\n" +
                  "           </property >\n" +
                  "        </value>\n" +
                  "     </momateriallist>\n" +
                  "   </parameter>\n" +
                  "</request>";
          String s = tipTopReciveWorkOrderService.tipTopReciveWorkOrderService(workOrderStr);
          System.out.println(s);
      } catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}
