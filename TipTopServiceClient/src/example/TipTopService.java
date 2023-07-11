package example;

import com.alibaba.fastjson.JSON;
//import example.Bean.SubmitToTipTopVO;
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
//             reportToTipTop(tipTopMycimService);
            reciveMaterial(tipTopMycimService);
//            updateWorkOrder(tipTopMycimService);
//            workOrderClose(tipTopMycimService);
//            reciveWorkOrder(tipTopMycimService);
//            submitToERP(tipTopMycimService);
//            setProduct(tipTopMycimService);
//            setMaterial(tipTopMycimService);
//            closeWorkorder(tipTopMycimService);
//            deleteWorkorder(tipTopMycimService);
//            reader = new BufferedReader(new FileReader(file));
//            String tempString = null;
//            int line = 1;
            // 一次读入一行，直到读入null为文件结束
//            System.out.println("开始导入。。。。");
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
//            reader.close();
//            System.out.println("导入完成");
//            System.out.println("有问题："+error);
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

    private static void reportToTipTop(TipTopMycimService_PortType tipTopMycimService) {
        try {
            String strq = "";
            String result = tipTopMycimService.tipTopReciveMaterial(strq);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void deleteWorkorder(TipTopMycimService_PortType tipTopMycimService) throws RemoteException {
        String delStr = "<request>\n" +
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
                "        <value>123321</value>\n" +
                "        <desc></desc>\n" +
                "     </mono>\n" +
                "   </parameter>\n" +
                "</request>\n";
        String result = tipTopMycimService.TipTopDeleteWorkOrder(delStr);
        System.out.println(result);
    }

    private static void reciveMaterial(TipTopMycimService_PortType tipTopMycimService) {
        try {
            String strq = "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>DB09-KS00230613940</billId>\n" +
                    "\t<materialId>M0501A00064</materialId>\n" +
                    "\t<lotNumber>23053001</lotNumber>\n" +
                    "\t<waferId/>\n" +
                    "\t<trayId/>\n" +
                    "\t<expirationDate>2033-06-02</expirationDate>\n" +
                    "\t<trnflinwarehouse>W31</trnflinwarehouse>\n" +
                    "\t<qty>321.000</qty>\n" +
                    "\t<comments>备注</comments>\n" +
                    "\t<LotId>23053001</LotId>\n" +
                    "\t<productionDate>2023-06-05 00:00:00.0</productionDate>\n" +
                    "\t<userId>01414</userId>\n" +
                    "\t<trnfloutwarehouse>A01</trnfloutwarehouse>\n" +
                    "</tipTopMaterialInfoDTOS>\n" +
                    "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>DB09-KS00230613940</billId>\n" +
                    "\t<materialId>M0501A00064</materialId>\n" +
                    "\t<lotNumber>23053002</lotNumber>\n" +
                    "\t<waferId/>\n" +
                    "\t<trayId/>\n" +
                    "\t<expirationDate>2033-06-02</expirationDate>\n" +
                    "\t<trnflinwarehouse>W31</trnflinwarehouse>\n" +
                    "\t<qty>32.000</qty>\n" +
                    "\t<comments>备注</comments>\n" +
                    "\t<LotId>23053002</LotId>\n" +
                    "\t<productionDate>2023-06-05 00:00:00.0</productionDate>\n" +
                    "\t<userId>01414</userId>\n" +
                    "\t<trnfloutwarehouse>A01</trnfloutwarehouse>\n" +
                    "</tipTopMaterialInfoDTOS>\n" +
                    "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>DB09-KS00230613940</billId>\n" +
                    "\t<materialId>M0501A00064</materialId>\n" +
                    "\t<lotNumber>23053003</lotNumber>\n" +
                    "\t<waferId/>\n" +
                    "\t<trayId/>\n" +
                    "\t<expirationDate>2025-05-25</expirationDate>\n" +
                    "\t<trnflinwarehouse>W31</trnflinwarehouse>\n" +
                    "\t<qty>67.000</qty>\n" +
                    "\t<comments>备注</comments>\n" +
                    "\t<LotId>23053003</LotId>\n" +
                    "\t<productionDate>2023-05-26 00:00:00.0</productionDate>\n" +
                    "\t<userId>01414</userId>\n" +
                    "\t<trnfloutwarehouse>A01</trnfloutwarehouse>\n" +
                    "</tipTopMaterialInfoDTOS>\n" +
                    "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>DB09-KS00230613940</billId>\n" +
                    "\t<materialId>M0501A00064</materialId>\n" +
                    "\t<lotNumber>23053004</lotNumber>\n" +
                    "\t<waferId/>\n" +
                    "\t<trayId/>\n" +
                    "\t<expirationDate>2025-05-21</expirationDate>\n" +
                    "\t<trnflinwarehouse>W31</trnflinwarehouse>\n" +
                    "\t<qty>30.000</qty>\n" +
                    "\t<comments>备注</comments>\n" +
                    "\t<LotId>23053004</LotId>\n" +
                    "\t<productionDate>2023-05-22 00:00:00.0</productionDate>\n" +
                    "\t<userId>01414</userId>\n" +
                    "\t<trnfloutwarehouse>A01</trnfloutwarehouse>\n" +
                    "</tipTopMaterialInfoDTOS>";
            String result = tipTopMycimService.tipTopReciveMaterial(strq);
            System.out.println(result);
//            for (int i = 0; i <200 ; i++) {
//                String result = tipTopMycimService.tipTopReciveMaterial(strq);
//                System.out.println(result);
//                Thread.sleep(1000L);
//            }
//            String result = tipTopMycimService.tipTopReciveMaterial(strq);
//            System.out.println(result);
//            if(result.contains("fail")){
//                error.add(strq);
//                throw new Exception(result);
//            }

        } catch (Exception e) {
            e.printStackTrace();
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
                "\t<identity>\n" +
                "\t\t<transactionid>2022070413215723</transactionid>\n" +
                "\t\t<moduleid>TP</moduleid>\n" +
                "\t\t<functionid>SI</functionid>\n" +
                "\t\t<computername>MES01</computername>\n" +
                "\t\t<curuserno>00234</curuserno>\n" +
                "\t\t<sendtime>2022/07/04 13:21:57</sendtime>\n" +
                "\t</identity>\n" +
                "\t<parameter>\n" +
                "\t\t<mono>\n" +
                "\t\t\t<name>MONo</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value>PA05-KS002207000112</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</mono>\n" +
                "\t\t<rono>\n" +
                "\t\t\t<name>RONo</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value/>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</rono>\n" +
                "\t\t<itemno>\n" +
                "\t\t\t<name>ItemNo</name>\n" +
                "\t\t\t<type>Numeric</type>\n" +
                "\t\t\t<value>         </value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</itemno>\n" +
                "\t\t<customerno>\n" +
                "\t\t\t<name>CustomerNo</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value/>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</customerno>\n" +
                "\t\t<factoryno>\n" +
                "\t\t\t<name>FactoryNo</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value>KS</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</factoryno>\n" +
                "\t\t<moqty>\n" +
                "\t\t\t<name>MOQty</name>\n" +
                "\t\t\t<type>Numeric</type>\n" +
                "\t\t\t<value>               5.000</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</moqty>\n" +
                "\t\t<productno>\n" +
                "\t\t\t<name>ItemNo</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value>01.01.01.30222\n</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</productno>\n" +
                "\t\t<motypeno>\n" +
                "\t\t\t<name>MOTypeNo</name>\n" +
                "\t\t\t<type>Numeric</type>\n" +
                "\t\t\t<value>        2</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</motypeno>\n" +
                "\t\t<planfinishdate>\n" +
                "\t\t\t<name>PlanFinishDate</name>\n" +
                "\t\t\t<type>Date</type>\n" +
                "\t\t\t<value>22/07/04</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</planfinishdate>\n" +
                "\t\t<mounitno>\n" +
                "\t\t\t<name>MOUnitNo</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value>PCS</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</mounitno>\n" +
                "\t\t<creator>\n" +
                "\t\t\t<name>Creator</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value>00234</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</creator>\n" +
                "\t\t<planStartTime>>\n" +
                "    <name>planStartTime</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value>22/07/04</value>\n" +
                "\t\t\t<desc/>\n" +
                "\t\t</planStartTime>\n" +
                "\t\t<momateriallist>\n" +
                "\t\t\t<name>MOMaterialList</name>\n" +
                "\t\t\t<type>String</type>\n" +
                "\t\t\t<value>\n" +
                "\t\t\t\t<materialno>M0501A00044</materialno>\n" +
                "\t\t\t\t<materiallevel>      1</materiallevel>\n" +
                "\t\t\t\t<stdqty>         2.00000000</stdqty>\n" +
                "\t\t\t\t<unitno>PCS</unitno>\n" +
                "\t\t\t\t<opno>LM</opno>\n" +
                "\t\t\t\t<putinplacetype>3</putinplacetype>\n" +
                "\t\t\t\t<substitutematerialno>M0501A00044</substitutematerialno>\n" +
                "\t\t\t\t<substitutemateriallevel>      1</substitutemateriallevel>\n" +
                "\t\t\t\t<substitutestdqty>         2.20000000</substitutestdqty>\n" +
                "\t\t\t\t<requireqty>            1320.00000000</requireqty>\n" +
                "\t\t\t\t<characteristics>N</characteristics>\n" +
                "\t\t\t\t<wfid>            </wfid>\n" +
                "\t\t\t</value>\n" +
                "\t\t\t<value>\n" +
                "\t\t\t\t<materialno>M0501A00036</materialno>\n" +
                "\t\t\t\t<materiallevel>      0</materiallevel>\n" +
                "\t\t\t\t<stdqty>         1.00000000</stdqty>\n" +
                "\t\t\t\t<unitno>PCS</unitno>\n" +
                "\t\t\t\t<opno>LM</opno>\n" +
                "\t\t\t\t<putinplacetype>3</putinplacetype>\n" +
                "\t\t\t\t<substitutematerialno>M0501A00036</substitutematerialno>\n" +
                "\t\t\t\t<substitutemateriallevel>      0</substitutemateriallevel>\n" +
                "\t\t\t\t<substitutestdqty>         1.10000000</substitutestdqty>\n" +
                "\t\t\t\t<requireqty>             660.00000000</requireqty>\n" +
                "\t\t\t\t<characteristics>N</characteristics>\n" +
                "\t\t\t\t<wfid>            </wfid>\n" +
                "\t\t\t</value>\n" +
                "\t\t\t<value>\n" +
                "\t\t\t\t<materialno>M0504A00001</materialno>\n" +
                "\t\t\t\t<materiallevel>      0</materiallevel>\n" +
                "\t\t\t\t<stdqty>         2.00000000</stdqty>\n" +
                "\t\t\t\t<unitno>PCS</unitno>\n" +
                "\t\t\t\t<opno>CCM</opno>\n" +
                "\t\t\t\t<putinplacetype>3</putinplacetype>\n" +
                "\t\t\t\t<substitutematerialno>M0504A00001</substitutematerialno>\n" +
                "\t\t\t\t<substitutemateriallevel>      0</substitutemateriallevel>\n" +
                "\t\t\t\t<substitutestdqty>         2.20000000</substitutestdqty>\n" +
                "\t\t\t\t<requireqty>            1320.00000000</requireqty>\n" +
                "\t\t\t\t<characteristics>N</characteristics>\n" +
                "\t\t\t\t<wfid>            </wfid>\n" +
                "\t\t\t</value>\n" +
                "\t\t\t<value>\n" +
                "\t\t\t\t<materialno>M0506A00009\t</materialno>\n" +
                "\t\t\t\t<materiallevel>      0</materiallevel>\n" +
                "\t\t\t\t<stdqty>         1.00000000</stdqty>\n" +
                "\t\t\t\t<unitno>PCS</unitno>\n" +
                "\t\t\t\t<opno>CCM</opno>\n" +
                "\t\t\t\t<putinplacetype>3</putinplacetype>\n" +
                "\t\t\t\t<substitutematerialno>M0506A00009\t</substitutematerialno>\n" +
                "\t\t\t\t<substitutemateriallevel>      0</substitutemateriallevel>\n" +
                "\t\t\t\t<substitutestdqty>         1.10000000</substitutestdqty>\n" +
                "\t\t\t\t<requireqty>             660.00000000</requireqty>\n" +
                "\t\t\t\t<characteristics>N</characteristics>\n" +
                "\t\t\t\t<wfid>            </wfid>\n" +
                "\t\t\t</value>\n" +
                "\t\t</momateriallist>\n" +
                "\t</parameter>\n" +
                "</request>";
        String result = tipTopMycimService.tipTopReciveWorkOrder(titopWorkOrder);
        System.out.println(result);
    }
//    public static void submitToERP(TipTopMycimService_PortType tipTopMycimService) {
//        String str = "<Request>\n" +
//                "<Access>\n" +
//                "\n" +
//                "\n" +
//                "<Authentication password=\"tiptop\" user=\"tiptop\"/>\n" +
//                "\n" +
//                "\n" +
//                "\n" +
//                "<Organization name=\"OBDEMO\"/>\n" +
//                "\n" +
//                "\n" +
//                "<Locale language=\"zh_CN\"/>\n" +
//                "\n" +
//                "\n" +
//                "<Connection source=\"1234\" application=\"asfi514\"/>\n" +
//                "\n" +
//                "<Appdevice timestamp=\"2021-01-01 00:00:00\" appmodule=\"\" appid=\"DJ-IMES-LLD\"/>\n" +
//                "\n" +
//                "</Access>\n" +
//                "\n" +
//                "\n" +
//                "<RequestContent>\n" +
//                "\n" +
//                "\n" +
//                "<Parameter>\n" +
//                "\n" +
//                "\n" +
//                "<Record>\n" +
//                "\n" +
//                "\n" +
//                "<Document>\n" +
//                "\n" +
//                "\n" +
//                "<RecordSet id=\"1\">\n" +
//                "\n" +
//                "\n" +
//                "<Master name=\"Master\">\n" +
//                "\n" +
//                "\n" +
//                "<Record>\n" +
//                "\n" +
//                "<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
//                "\n" +
//                "<Field name=\"status\" value=\"\"/>\n" +
//                "\n" +
//                "<Field name=\"sfpud06\" value=\"\"/>\n" +
//                "\n" +
//                "<Field name=\"sfp02\" value=\"2021/08/30\"/>\n" +
//                "\n" +
//                "<Field name=\"sfp16\" value=\"20761\"/>\n" +
//                "\n" +
//                "</Record>\n" +
//                "\n" +
//                "</Master>\n" +
//                "\n" +
//                "\n" +
//                "<Detail name=\"Detail-A\">\n" +
//                "\n" +
//                "\n" +
//                "<Record>\n" +
//                "\n" +
//                "<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
//                "\n" +
//                "<Field name=\"sfs03\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs04\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs07\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs08\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs10\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs09\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs30\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs05\" value=\" \"/>\n" +
//                "\n" +
//                "</Record>\n" +
//                "\n" +
//                "\n" +
//                "<Record>\n" +
//                "\n" +
//                "<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
//                "\n" +
//                "<Field name=\"sfs03\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs04\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs07\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs08\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs10\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs09\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs30\" value=\" \"/>\n" +
//                "\n" +
//                "<Field name=\"sfs05\" value=\" \"/>\n" +
//                "\n" +
//                "</Record>\n" +
//                "\n" +
//                "\n" +
//                "</Detail>\n" +
//                "\n" +
//                "</RecordSet>\n" +
//                "\n" +
//                "</Document>\n" +
//                "\n" +
//                "</Record>\n" +
//                "\n" +
//                "</Parameter>\n" +
//                "\n" +
//                "</RequestContent>\n" +
//                "\n" +
//                "</Request>\n";
//        JSONObject jsonObject = XML.toJSONObject(str);
//        SubmitToTipTopVO submitToTipTopVO = JSON.parseObject(jsonObject.toString(), SubmitToTipTopVO.class);
//        System.out.println(submitToTipTopVO);
//    }
    public static void setProduct(TipTopMycimService_PortType tipTopMycimService) throws RemoteException {
        String request = "<request>\n" +
                "<identity>\n" +
                "   <transactionid>2023011016571103</transactionid>\n" +
                "   <moduleid>TP</moduleid>\n" +
                "   <functionid>SI</functionid>\n" +
                "   <computername>MES01</computername>\n" +
                "   <curuserno>01200</curuserno>\n" +
                "   <sendtime>2023/01/10 16:57:11</sendtime>\n" +
                "</identity>\n" +
                "<parameter>\n" +
                "\n" +
                "  <productno>\n" +
                "    <name>ProductNo</name>\n" +
                "    <type>String</type>\n" +
                "    <value>PANNRA00643</value>\n" +
                "    <desc></desc>\n" +
                "  </productno>\n" +
                "  <productversion>\n" +
                "    <name>ProductVersion</name>\n" +
                "    <type>String</type>\n" +
                "     <value>DXG2PH36A-70N-002</value>\n" +
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
                "    <value>DXG2PH36A-70N</value>\n" +
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
                "    <value>3</value>\n" +
                "    <desc></desc>\n" +
                "  </msl>\n" +
                "  <mark>\n" +
                "    <name>MARK</name>\n" +
                "    <type>String</type>\n" +
                "    <value>DS7C</value>\n" +
                "    <desc></desc>\n" +
                "  </mark>\n" +
                "  <productCategory>\n" +
                "    <name>productCategory</name>\n" +
                "    <type>String</type>\n" +
                "    <value>E Lot</value>\n" +
                "    <desc></desc>\n" +
                "  </productCategory>\n" +
                "  <packageType>>\n" +
                "    <name>packageType</name>\n" +
                "    <type>String</type>\n" +
                "    <value>卷带式</value>\n" +
                "    <desc></desc>\n" +
                "  </packageType>\n" +
                "  <packOutQty>\n" +
                "    <name>packOutQty</name>\n" +
                "    <type>String</type>\n" +
                "    <value>1000</value>\n" +
                "    <desc></desc>\n" +
                "  </packOutQty>\n" +
                "\n" +
                "</parameter>\n" +
                "</request>";
        String s = tipTopMycimService.tipTopSetProduct(request);
        System.out.println(s);
//        PK_NAMED_OBJECT_H
    }
}
