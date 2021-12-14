package example;

import com.alibaba.fastjson.JSON;
import example.Bean.SubmitToTipTopVO;
import mypackage.TipTopMycimServiceServiceLocator;
import mypackage.TipTopMycimService_PortType;
import org.json.JSONObject;
import org.json.XML;

import java.rmi.RemoteException;

public class TipTopService {
    public static void main(String[] argv) {
        try {
            TipTopMycimServiceServiceLocator tipTopMycimServiceServiceLocator = new TipTopMycimServiceServiceLocator();
            TipTopMycimService_PortType tipTopMycimService = tipTopMycimServiceServiceLocator.getTipTopMycimService();
//            reciveMaterial(tipTopMycimService);
//            updateWorkOrder(tipTopMycimService);
//            workOrderClose(tipTopMycimService);
            reciveWorkOrder(tipTopMycimService);
//            submitToERP(tipTopMycimService);
//            setProduct(tipTopMycimService);//sy211129_wzq123
//            setMaterial(tipTopMycimService);//sy211130wzq
//            closeWorkorder(tipTopMycimService);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static void closeWorkorder(TipTopMycimService_PortType tipTopMycimService) throws RemoteException {
        String closeStr = "<request>\n" +
                "  <identity>     \n" +
                "     <transactionid>2008080508255010</transactionid>\n" +
                "     <moduleid>TP</moduleid>\n" +
                "     <functionid>SI</functionid>\n" +
                "     <computername>MES01</computername>\n" +
                "     <curuserno>TP</curuserno>\n" +
                "     <sendtime>2008/08/05 08:25:50</sendtime>\n" +
                "  </identity>\n" +
                "  <parameter>\n" +
                "     <mono>  --第二張工單編號\n" +
                "        <name>MONo</name>\n" +
                "        <type>String</type>\n" +
                "        <value>wzq05123-21110006</value>\n" +
                "        <desc></desc>\n" +
                "     </mono>\n" +
                "   </parameter>\n" +
                "</request>\n";
        String result = tipTopMycimService.TipTopCloseWorkOrder(closeStr);
        System.out.println(result);
    }

    private static void setMaterial(TipTopMycimService_PortType tipTopMycimService) throws RemoteException {
        String str = "<request>\n" +
                " <identity>\n" +
                "   <transactionid>2021120718002961</transactionid>\n" +
                "   <moduleid>TP</moduleid>\n" +
                "   <functionid>SI</functionid>\n" +
                "   <computername>MES01</computername>\n" +
                "   <curuserno>01200</curuserno>\n" +
                "   <sendtime>2021/12/07 18:00:29</sendtime>\n" +
                " </identity>\n" +
                " <parameter>\n" +
                "  <materialno>\n" +
                "    <name>MaterialNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>WZQZM0506A00003</value>\n" +
                "    <desc></desc>\n" +
                "  </materialno>\n" +
                "  <materialtype>\n" +
                "    <name>MaterialType</name>\n" +
                "    <type>String</type>\n" +
                "    <value></value>\n" +
                "    <desc></desc>\n" +
                "  </materialtype>\n" +
                "  <materialname>\n" +
                "    <name>MaterialName</name>\n" +
                "    <type>String</type>\n" +
                "    <value>MOS电容</value>\n" +
                "    <desc></desc>\n" +
                "  </materialname>\n" +
                "  <materialspec>\n" +
                "    <name>MaterialSpec</name>\n" +
                "    <type>String</type>\n" +
                "    <value>2.8x0.23/15pF/M28023B6A</value>\n" +
                "    <desc></desc>\n" +
                "  </materialspec>\n" +
                "  <unitno>\n" +
                "    <name>UnitNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>PCS</value>\n" +
                "    <desc></desc>\n" +
                "  </unitno>\n" +
                "  <creator>\n" +
                "    <name>Creator</name>\n" +
                "    <type>String</type>\n" +
                "    <value>01200</value>\n" +
                "    <desc></desc>\n" +
                "  </creator>\n" +
                "   <validDate>\n" +
                "    <name>validDate</name>\n" +
                "    <type>Double</type>\n" +
                "    <value>12</value>\n" +
                "    <desc></desc>\n" +
                "  </validDate>\n" +
                " </parameter>\n" +
                "</request>\n";
        String result = tipTopMycimService.tipTopSetMaterial(str);
        System.out.println(result);
    }

    public static void reciveMaterial(TipTopMycimService_PortType tipTopMycimService) {
        try {
            String strq = "<tipTopMaterialInfoDTOS>\n" +
                    "<billId>DB07-KS1021120002</billId>\n" +
                    "<materialId>M0101A00011</materialId>\n" +
                    "<lotNumber>CKS11C40800001-1-2</lotNumber>\n" +
                    "<waferId></waferId>\n" +
                    "<trayId></trayId>\n" +
                    "<expirationDate>2071-12-04</expirationDate>\n" +
                    "<trnflinwarehouse>W22</trnflinwarehouse>\n" +
                    "<qty>100.000000</qty>\n" +
                    "<comments>备注</comments>\n" +
                    "<LotId>21120401</LotId>\n" +
                    "<productionDate>2021-12-04 00:00:00.0</productionDate>\n" +
                    "<userId>tiptop</userId>\n" +
                    "<trnfloutwarehouse>A01</trnfloutwarehouse>\n" +
                    "</tipTopMaterialInfoDTOS>\n";
            String result = tipTopMycimService.tipTopReciveMaterial(strq);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void workOrderClose(TipTopMycimService_PortType tipTopMycimService) {
        String closeStr = "<request>\n" +
                "  <identity>     \n" +
                "     <transactionid>2008080508255010</transactionid>\n" +
                "     <moduleid>TP</moduleid>\n" +
                "     <functionid>SI</functionid>\n" +
                "     <computername>MES01</computername>\n" +
                "     <curuserno>TP</curuserno>\n" +
                "     <sendtime>2008/08/05 08:25:50</sendtime>\n" +
                "  </identity>\n" +
                "  <parameter>\n" +
                "     <mono>  --第一張工單編號\n" +
                "        <name>MONo</name>\n" +
                "        <type>String</type>\n" +
                "        <value>KSWOR-21040006</value>\n" +
                "        <desc></desc>\n" +
                "     </mono>\n" +
                "   </parameter>\n" +
                "</request>\n";
        try {
            String result = tipTopMycimService.TipTopCloseWorkOrder(closeStr);
            System.out.println(result);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void updateWorkOrder(TipTopMycimService_PortType tipTopMycimService) {
        String updateStr = "<request>\n" +
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
                "        <value>wzq05123-21110006</value>\n" +
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
                "        <value>9871</value>\n" +
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
        try {
            String result = tipTopMycimService.TipTopUpdateWorkOrder(updateStr);
            System.out.println(result);
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public static void reciveWorkOrder(TipTopMycimService_PortType tipTopMycimService) throws RemoteException {
        String titopWorkOrder = "<request>\n" +
                " <identity>\n" +
                "   <transactionid>2021120911002155</transactionid>\n" +
                "   <moduleid>TP</moduleid>\n" +
                "   <functionid>SI</functionid>\n" +
                "   <computername>MES01</computername>\n" +
                "   <curuserno>01059</curuserno>\n" +
                "   <sendtime>2021/12/09 11:00:21</sendtime>\n" +
                " </identity>\n" +
                " <parameter>\n" +
                "\n" +
                "  <mono>\n" +
                "    <name>MONo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>PA03-KS1021120009</value>\n" +
                "    <desc></desc>\n" +
                "  </mono>\n" +
                "  <rono>\n" +
                "    <name>RONo</name>\n" +
                "    <type>String</type>\n" +
                "    <value></value>\n" +
                "    <desc></desc>\n" +
                "  </rono>\n" +
                "  <itemno>\n" +
                "    <name>ItemNo</name>\n" +
                "    <type>Numeric</type>\n" +
                "    <value>      </value>\n" +
                "    <desc></desc>\n" +
                "  </itemno>\n" +
                "  <customerno>\n" +
                "    <name>CustomerNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value></value>\n" +
                "    <desc></desc>\n" +
                "  </customerno>\n" +
                "  <factoryno>\n" +
                "    <name>FactoryNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>KS1</value>\n" +
                "    <desc></desc>\n" +
                "  </factoryno>\n" +
                "  <moqty>\n" +
                "    <name>MOQty</name>\n" +
                "    <type>Numeric</type>\n" +
                "    <value>         1000.000</value>\n" +
                "    <desc></desc>\n" +
                "  </moqty>\n" +
                "  <productno>\n" +
                "    <name>ItemNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>PANNRA00402</value>\n" +
                "    <desc></desc>\n" +
                "  </productno>\n" +
                "  <motypeno>\n" +
                "    <name>MOTypeNo</name>\n" +
                "    <type>Numeric</type>\n" +
                "    <value>     1</value>\n" +
                "    <desc></desc>\n" +
                "  </motypeno>\n" +
                "  <planfinishdate>\n" +
                "    <name>PlanFinishDate</name>\n" +
                "    <type>Date</type>\n" +
                "    <value>21/12/09</value>\n" +
                "    <desc></desc>\n" +
                "  </planfinishdate>\n" +
                "  <mounitno>\n" +
                "    <name>MOUnitNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>PCS</value>\n" +
                "    <desc></desc>\n" +
                "  </mounitno>\n" +
                "  <creator>\n" +
                "    <name>Creator</name>\n" +
                "    <type>String</type>\n" +
                "    <value>01059</value>\n" +
                "    <desc></desc>\n" +
                "  </creator>\n" +
                "  <planStartTime>>\n" +
                "    <name>planStartTime</name>\n" +
                "    <type>String</type>\n" +
                "    <value>21/12/09</value>\n" +
                "    <desc></desc>\n" +
                "  </planStartTime>\n" +
                "  <momateriallist>\n" +
                "    <name>MOMaterialList</name>\n" +
                "    <type>String</type>\n" +
                "    <value>\n" +
                "      <materialno>DECBCA00126</materialno>\n" +
                "      <materiallevel>     1</materiallevel>\n" +
                "      <stdqty>        1.00000000</stdqty>\n" +
                "      <unitno>PCS</unitno>\n" +
                "      <opno>TM</opno>\n" +
                "      <putinplacetype>3</putinplacetype>\n" +
                "      <substitutematerialno>DECBCA00128</substitutematerialno>\n" +
                "      <substitutemateriallevel>     1</substitutemateriallevel>\n" +
                "      <substitutestdqty>        1.10000000</substitutestdqty>\n" +
                "      <requireqty>         1100.000</requireqty>\n" +
                "      <characteristics>N</characteristics>\n" +
                "      <wfid>           </wfid>\n" +
                "     </value>\n" +
                "    <value>\n" +
                "      <materialno>DECBCA00128</materialno>\n" +
                "      <materiallevel>     1</materiallevel>\n" +
                "      <stdqty>        1.00000000</stdqty>\n" +
                "      <unitno>PCS</unitno>\n" +
                "      <opno>FDB</opno>\n" +
                "      <putinplacetype>3</putinplacetype>\n" +
                "      <substitutematerialno>M0501A00038</substitutematerialno>\n" +
                "      <substitutemateriallevel>     1</substitutemateriallevel>\n" +
                "      <substitutestdqty>        1.10000000</substitutestdqty>\n" +
                "      <requireqty>         1100.000</requireqty>\n" +
                "      <characteristics>N</characteristics>\n" +
                "      <wfid>           </wfid>\n" +
                "     </value>\n" +
                "  </momateriallist>\n" +
                " </parameter>\n" +
                "</request>";
        String result = tipTopMycimService.tipTopReciveWorkOrder(titopWorkOrder);
        System.out.println(result);
    }

    public static void submitToERP(TipTopMycimService_PortType tipTopMycimService) {
        String str = "<Request>\n" +
                "<Access>\n" +
                "\n" +
                "\n" +
                "<Authentication password=\"tiptop\" user=\"tiptop\"/>\n" +
                "\n" +
                "\n" +
                "\n" +
                "<Organization name=\"OBDEMO\"/>\n" +
                "\n" +
                "\n" +
                "<Locale language=\"zh_CN\"/>\n" +
                "\n" +
                "\n" +
                "<Connection source=\"1234\" application=\"asfi514\"/>\n" +
                "\n" +
                "<Appdevice timestamp=\"2021-01-01 00:00:00\" appmodule=\"\" appid=\"DJ-IMES-LLD\"/>\n" +
                "\n" +
                "</Access>\n" +
                "\n" +
                "\n" +
                "<RequestContent>\n" +
                "\n" +
                "\n" +
                "<Parameter>\n" +
                "\n" +
                "\n" +
                "<Record>\n" +
                "\n" +
                "\n" +
                "<Document>\n" +
                "\n" +
                "\n" +
                "<RecordSet id=\"1\">\n" +
                "\n" +
                "\n" +
                "<Master name=\"Master\">\n" +
                "\n" +
                "\n" +
                "<Record>\n" +
                "\n" +
                "<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
                "\n" +
                "<Field name=\"status\" value=\"\"/>\n" +
                "\n" +
                "<Field name=\"sfpud06\" value=\"\"/>\n" +
                "\n" +
                "<Field name=\"sfp02\" value=\"2021/08/30\"/>\n" +
                "\n" +
                "<Field name=\"sfp16\" value=\"20761\"/>\n" +
                "\n" +
                "</Record>\n" +
                "\n" +
                "</Master>\n" +
                "\n" +
                "\n" +
                "<Detail name=\"Detail-A\">\n" +
                "\n" +
                "\n" +
                "<Record>\n" +
                "\n" +
                "<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
                "\n" +
                "<Field name=\"sfs03\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs04\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs07\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs08\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs10\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs09\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs30\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs05\" value=\" \"/>\n" +
                "\n" +
                "</Record>\n" +
                "\n" +
                "\n" +
                "<Record>\n" +
                "\n" +
                "<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
                "\n" +
                "<Field name=\"sfs03\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs04\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs07\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs08\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs10\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs09\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs30\" value=\" \"/>\n" +
                "\n" +
                "<Field name=\"sfs05\" value=\" \"/>\n" +
                "\n" +
                "</Record>\n" +
                "\n" +
                "\n" +
                "</Detail>\n" +
                "\n" +
                "</RecordSet>\n" +
                "\n" +
                "</Document>\n" +
                "\n" +
                "</Record>\n" +
                "\n" +
                "</Parameter>\n" +
                "\n" +
                "</RequestContent>\n" +
                "\n" +
                "</Request>\n";
        JSONObject jsonObject = XML.toJSONObject(str);
        SubmitToTipTopVO submitToTipTopVO = JSON.parseObject(jsonObject.toString(), SubmitToTipTopVO.class);
        System.out.println(submitToTipTopVO);
    }

    public static void setProduct(TipTopMycimService_PortType tipTopMycimService) throws RemoteException {
        String request = "<request>\n" +
                " <identity>\n" +
                "   <transactionid>2021120716243877</transactionid>\n" +
                "   <moduleid>TP</moduleid>\n" +
                "   <functionid>SI</functionid>\n" +
                "   <computername>MES01</computername>\n" +
                "   <curuserno>tiptop</curuserno>\n" +
                "   <sendtime>2021/12/07 16:24:38</sendtime>\n" +
                " </identity>\n" +
                " <parameter>\n" +
                "\n" +
                "  <productno>\n" +
                "    <name>ProductNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>wzqwzq</value>\n" +
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
                "    <value>test3</value>\n" +
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
                "    <value>PCS</value>\n" +
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
                "  <msl>\n" +
                "    <name>MSL</name>\n" +
                "    <type>2</type>\n" +
                "    <value>MSL</value>\n" +
                "    <desc></desc>\n" +
                "  </msl>\n" +
                "  <mark>\n" +
                "    <name>MARK</name>\n" +
                "    <type>String</type>\n" +
                "    <value>mark</value>\n" +
                "    <desc></desc>\n" +
                "  </mark>\n" +
                " <productCategory>\n" +
                "    <name>productCategory</name>\n" +
                "    <type>String</type>\n" +
                "    <value>P</value>\n" +
                "    <desc></desc>\n" +
                " </productCategory>\n" +
                " \n" +
                "  <packOutQty>\n" +
                "    <name>packOutQty</name>\n" +
                "    <type>123</type>\n" +
                "    <value>123</value>\n" +
                "    <desc></desc>\n" +
                " </packOutQty>\n" +
                " <packageType>\n" +
                "    <name>packageType</name>\n" +
                "    <type>String</type>\n" +
                "    <value>编带</value>\n" +
                "    <desc></desc>\n" +
                " </packageType>\n" +
                " \n" +
                " </parameter>\n" +
                "</request>\n";
        String s = tipTopMycimService.tipTopSetProduct(request);
        System.out.println(s);
    }
}
