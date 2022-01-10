package example;

import com.alibaba.fastjson.JSON;
import example.Bean.SubmitToTipTopVO;
import mypackage.TipTopMycimServiceServiceLocator;
import mypackage.TipTopMycimService_PortType;
import org.json.JSONObject;
import org.json.XML;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

public class TipTopService {
    private static final List<String> error = new ArrayList();
    public static void main(String[] argv) throws Exception {
//        File file = new File("TipTopServiceClient/src/example/setMaterial1.sql");
        File file = new File("TipTopServiceClient/src/example/wf.sql");
        BufferedReader reader = null;
        try {
            TipTopMycimServiceServiceLocator tipTopMycimServiceServiceLocator = new TipTopMycimServiceServiceLocator();
            TipTopMycimService_PortType tipTopMycimService = tipTopMycimServiceServiceLocator.getTipTopMycimService();
//            reciveMaterial(tipTopMycimService);
//            updateWorkOrder(tipTopMycimService);
//            workOrderClose(tipTopMycimService);
//            reciveWorkOrder(tipTopMycimService);
//            submitToERP(tipTopMycimService);
            setProduct(tipTopMycimService);
//            setMaterial(tipTopMycimService);
//            closeWorkorder(tipTopMycimService);
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 1;
            // 一次读入一行，直到读入null为文件结束
            System.out.println("开始导入。。。。");
           /* while ((tempString = reader.readLine()) != null) {
                // 显示行号
                System.out.println("--------------------------------------------------------------");
                System.out.println("line " + line + ": " + tempString);
                String[] split = tempString.split("@");

                *//*String lotNumber = split[0];//唯一值
                String materialId = split[1];//物料编码
                String billid = "DYNAX-KS002201000"+line;//单据号
                String lotId = split[2];//物料批次号
                String qty = split[4];//数量
                String waferId = split[1];//waferId
                String trayId = split[2];//trayId
                 System.out.println("导入料号："+materialId+";单据号："+billid+";lotNumber:"+lotNumber+";物料批次号:"+lotId+";数量"+qty);*//*
                String lotNumber = split[2];//唯一值
                String materialId = split[0];//物料编码
                String waferId = split[1];//waferId
                String trayId = split[2];//trayId
                String lotId = split[3];//物料批次号
                String billid = "DYNAXWFT-KS002201000"+line;//单据号
                String qty = split[4];//数量

                System.out.println("导入料号："+materialId+";单据号："+billid+";lotNumber:"+lotNumber+";物料批次号:"+lotId+";数量"+qty+",waferId:"+waferId+",tryaId:"+trayId);

                reciveMaterial(tipTopMycimService,billid,materialId,lotNumber,qty,lotId,waferId,trayId);
                line++;
                Thread.sleep(2000);
            }*/
            reader.close();
            System.out.println("导入完成");
            System.out.println("有问题："+error);
        } catch (Exception ex) {
            throw new Exception(ex);
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
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

    private static void setMaterial(TipTopMycimService_PortType tipTopMycimService,String materialno,String materialname,
                                    String materialspec,String unitno,String validDate) throws Exception {
        String str = "<request>\n" +
                " <identity>\n" +
                "   <transactionid>2022010114495884</transactionid>\n" +
                "   <moduleid>TP</moduleid>\n" +
                "   <functionid>SI</functionid>\n" +
                "   <computername>MES01</computername>\n" +
                "   <curuserno>01059</curuserno>\n" +
                "   <sendtime>2022/01/01 14:49:58</sendtime>\n" +
                " </identity>\n" +
                " <parameter>\n" +
                "\n" +
                "  <materialno>\n" +
                "    <name>MaterialNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>"+materialno+"</value>\n" +//料号
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
                "    <value>"+materialname+"</value>\n" +//名称
                "    <desc></desc>\n" +
                "  </materialname>\n" +
                "  <materialspec>\n" +
                "    <name>MaterialSpec</name>\n" +
                "    <type>String</type>\n" +
                "    <value>"+materialspec+"</value>\n" +//物料型号
                "    <desc></desc>\n" +
                "  </materialspec>\n" +
                "  <unitno>\n" +
                "    <name>UnitNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>"+unitno+"</value>\n" +//单位
                "    <desc></desc>\n" +
                "  </unitno>\n" +
                "  <creator>\n" +
                "    <name>Creator</name>\n" +
                "    <type>String</type>\n" +
                "    <value>01059</value>\n" +//创建人
                "    <desc></desc>\n" +
                "  </creator>\n" +
                "  <validDate>\n" +
                "    <name>validDate</name>\n" +
                "    <type>String</type>\n" +
                "    <value>"+validDate+"</value>\n" +//失效周期
                "    <desc></desc>\n" +
                "  </validDate>\n" +
                "\n" +
                " </parameter>\n" +
                "</request>\n";
        String result = tipTopMycimService.tipTopSetMaterial(str);
        System.out.println(result);
        if(result.contains("fail")){
            throw new Exception(result);
        }
    }

    public static void reciveMaterial(TipTopMycimService_PortType tipTopMycimService,String billId,String materialId,String lotNumber,String qty,
                                      String LotId,String waferId,String trayId) {
        try {
            String strq = "<tipTopMaterialInfoDTOS>\n" +
                    "<billId>"+billId+"</billId>\n" +//调拨单号
                    "<materialId>"+materialId+"</materialId>\n" +//物料编码
                    "<lotNumber>"+lotNumber+"</lotNumber>\n" +//唯一码
//                    "<waferId></waferId>\n" +//waferID
//                    "<trayId></trayId>\n" +//trayId
                    "<waferId>"+waferId+"</waferId>\n" +//waferID
                    "<trayId>"+trayId+"</trayId>\n" +//trayId
                    "<expirationDate>2071-12-29</expirationDate>\n" +
                    "<trnflinwarehouse>W31</trnflinwarehouse>\n" +
                    "<qty>"+qty+"</qty>\n" +//数量
                    "<comments>备注</comments>\n" +
                    "<LotId>"+LotId+"</LotId>\n" +//物料批次号
                    "<productionDate>2021-12-29 00:00:00.0</productionDate>\n" +
                    "<userId>01200</userId>\n" +
                    "<trnfloutwarehouse>W31</trnfloutwarehouse>\n" +
                    "</tipTopMaterialInfoDTOS>\n";
            String result = tipTopMycimService.tipTopReciveMaterial(strq);
            System.out.println(result);
            if(result.contains("fail")){
                error.add(strq);
                throw new Exception(result);
            }

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
                "        <value>PA03-KS0021120002123321951</value>\n" +
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
                "   <transactionid>2021122914310463</transactionid>\n" +
                "   <moduleid>TP</moduleid>\n" +
                "   <functionid>SI</functionid>\n" +
                "   <computername>MES01</computername>\n" +
                "   <curuserno>01059</curuserno>\n" +
                "   <sendtime>2021/12/29 14:31:04</sendtime>\n" +
                " </identity>\n" +
                " <parameter>\n" +
                "\n" +
                "  <mono>\n" +
                "    <name>MONo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>PA05</value>\n" +
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
                "    <value>KS</value>\n" +
                "    <desc></desc>\n" +
                "  </factoryno>\n" +
                "  <moqty>\n" +
                "    <name>MOQty</name>\n" +
                "    <type>Numeric</type>\n" +
                "    <value>          300.000</value>\n" +
                "    <desc></desc>\n" +
                "  </moqty>\n" +
                "  <productno>\n" +
                "    <name>ItemNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>WZQ1</value>\n" +
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
                "    <value>21/12/29</value>\n" +
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
                "    <value>21/12/29</value>\n" +
                "    <desc></desc>\n" +
                "  </planStartTime>\n" +
                "  <momateriallist>\n" +
                "    <name>MOMaterialList</name>\n" +
                "    <type>String</type>\n" +
                "    <value>\n" +
                "      <materialno>DECBCA00284</materialno>\n" +
                "      <materiallevel>     1</materiallevel>\n" +
                "      <stdqty>        1.00000000</stdqty>\n" +
                "      <unitno>PCS</unitno>\n" +
                "      <opno>GFG</opno>\n" +
                "      <putinplacetype>3</putinplacetype>\n" +
                "      <substitutematerialno>DECBCA00284</substitutematerialno>\n" +
                "      <substitutemateriallevel>     1</substitutemateriallevel>\n" +
                "      <substitutestdqty>        1.10000000</substitutestdqty>\n" +
                "      <requireqty>            330.000000</requireqty>\n" +
                "      <characteristics>N</characteristics>\n" +
                "      <wfid>           </wfid>\n" +
                "     </value>\n"+
                "    <value>\n" +
                "      <materialno>DECBCA00284</materialno>\n" +
                "      <materiallevel>     1</materiallevel>\n" +
                "      <stdqty>        1.00000000</stdqty>\n" +
                "      <unitno>PCS</unitno>\n" +
                "      <opno>LM</opno>\n" +
                "      <putinplacetype>3</putinplacetype>\n" +
                "      <substitutematerialno>DECBCA00284</substitutematerialno>\n" +
                "      <substitutemateriallevel>     1</substitutemateriallevel>\n" +
                "      <substitutestdqty>        1.10000000</substitutestdqty>\n" +
                "      <requireqty>            330.000000</requireqty>\n" +
                "      <characteristics>N</characteristics>\n" +
                "      <wfid>           </wfid>\n" +
                "     </value>\n"+
                "  </momateriallist>\n" +
                " </parameter>\n" +
                "</request>\n";
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
                "   <transactionid>2021122911242561</transactionid>\n" +
                "   <moduleid>TP</moduleid>\n" +
                "   <functionid>SI</functionid>\n" +
                "   <computername>MES01</computername>\n" +
                "   <curuserno>01200</curuserno>\n" +
                "   <sendtime>2021/12/29 11:24:25</sendtime>\n" +
                " </identity>\n" +
                " <parameter>\n" +
                "\n" +
                "  <productno>\n" +
                "    <name>ProductNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>WZQ2</value>\n" +
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
                "    <value>GaN RF 功放管</value>\n" +
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
                "    <value>01200</value>\n" +
                "    <desc></desc>\n" +
                "  </creator>\n" +
                "  <msl>\n" +
                "    <name>MSL</name>\n" +
                "    <type>String</type>\n" +
                "    <value>1</value>\n" +
                "    <desc></desc>\n" +
                "  </msl>\n" +
                "  <mark>\n" +
                "    <name>MARK</name>\n" +
                "    <type>String</type>\n" +
                "    <value>YP；40601625T-R1；XXXX代表年周）</value>\n" +
                "    <desc></desc>\n" +
                "  </mark>\n" +
                "  <productCategory>\n" +
                "    <name>productCategory</name>\n" +
                "    <type>String</type>\n" +
                "    <value>M Lot</value>\n" +
                "    <desc></desc>\n" +
                "  </productCategory>\n" +
                "  <packageType>>\n" +
                "    <name>packageType</name>\n" +
                "    <type>String</type>\n" +
                "    <value>托盘</value>\n" +
                "    <desc></desc>\n" +
                "  </packageType>\n" +
                "  <packOutQty>\n" +
                "    <name>packOutQty</name>\n" +
                "    <type>String</type>\n" +
                "    <value>20_玉洁</value>\n" +
                "    <desc></desc>\n" +
                "  </packOutQty>\n" +
                "\n" +
                " </parameter>\n" +
                "</request>\n";
        String s = tipTopMycimService.tipTopSetProduct(request);
        System.out.println(s);
    }
}
