package example;

import com.alibaba.fastjson.JSON;
import com.google.gson.Gson;
import example.Bean.materialVO;
import example.tool.XmlJsonTransform;
import mypackage.DemoService_PortType;
import mypackage.DemoService_ServiceLocator;
import mypackage.Result;
import org.json.JSONObject;
import org.json.XML;

import java.util.ArrayList;


public class WMSClient {

    public static void main(String[] argv) {
        try {
            ArrayList<String> trayId = new ArrayList<>();
            trayId.add("tray1");
            trayId.add("tray2");
            materialVO materialVO = new materialVO();
            materialVO.setMaterialId("料号");
            materialVO.setQTY(10.00);
            materialVO.setBillId("调拨单号");
            materialVO.setTrnflinwarehouse("拨出仓库");
            materialVO.setLotNumber("物料批次号");
            materialVO.setExpirationDate("失效日期dd/MM/yyyy");
            materialVO.setWaferId("waferId");
            materialVO.setTrayId(trayId);
            materialVO.setComments("");
            Gson gson = new Gson();
            String jsonStr = JSON.toJSONString(materialVO);
            String gsonStr = gson.toJson(materialVO);

            String jsonXml = XML.toString(new JSONObject(jsonStr));
            String gsonXml = XML.toString(new JSONObject(gsonStr));
            System.out.println(jsonXml);
            System.out.println(gsonXml);
            /*String transfer =
//                    "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>\n" +
                    "<MST>\n" +
                    "<source>SYMES</source>\n" +
                    "<user>tiptop</user>\n" +
                    "<service>transfer</service>\n" +
                    "<center>DX</center>\n" +
                    "<keyno>QAZWSXEDC</keyno>\n" +
                    "<trnfdocno>A101-2110060001</trnfdocno>\n" +
                    "<trnfdocdt>2021/10/06</trnfdocdt>\n" +
                    "<trnfstaff>60272</trnfstaff>\n" +
                    "<trnfdept>YX01</trnfdept>\n" +
                    "<trnfmemo> </trnfmemo>\n" +
                    "<trnfplant>NX</trnfplant>\n" +
                    "<trnfcrtid>60272</trnfcrtid>\n" +
                    "<trnfcrtdept>YX01</trnfcrtdept>\n" +
                    "<trnfconflag>Y</trnfconflag>\n" +
                    "<trnfcondate>2021/10/06</trnfcondate>\n" +
                    "<trnfconuser>60272</trnfconuser>\n" +
                    "<DTL>\n" +
                    "<trnfldocno>A101-2110060001</trnfldocno>\n" +
                    "<trnflseq>1</trnflseq>\n" +
                    "<trnflitem>CS17A64.AiP1302.SA8.TR</trnflitem>\n" +
                    "<trnfloutqty>25</trnfloutqty>\n" +
                    "<trnfloutunit>PCS</trnfloutunit>\n" +
                    "<trnfloutwarehouse>WX006</trnfloutwarehouse>\n" +
                    "<trnfloutbatch>30B</trnfloutbatch>\n" +
                    "<trnfloutplant>NX</trnfloutplant>\n" +
                    "<trnflinqty>25</trnflinqty>\n" +
                    "<trnflinunit>PCS</trnflinunit>\n" +
                    "<trnflinwarehouse>SZ001</trnflinwarehouse>\n" +
                    "<trnflinbatch>30B</trnflinbatch>\n" +
                    "<trnflinplant>NX</trnflinplant>\n" +
                    "<idbcnt>1</idbcnt>\n" +
                    "<idbengravedno>30AE024</idbengravedno>\n" +
                    "<idbbinlevel>BIN01</idbbinlevel>\n" +
                    "<idbqty>4980</idbqty>\n" +
                    "<cassteno>cassteno01</cassteno>\n" +
                    "<lasermark>U291312314</lasermark>\n" +
                    "<bresitivity>1.7E+11</bresitivity>\n" +
                    "<sresitivity>1.7E+11</sresitivity>\n" +
                    "</DTL>\n" +
                    "<DTL>\n" +
                    "<trnfldocno>A101-2110060001</trnfldocno>\n" +
                    "<trnflseq>1</trnflseq>\n" +
                    "<trnflitem>XG1002.ATMLH950.SA8.TR</trnflitem>\n" +
                    "<trnfloutqty>25</trnfloutqty>\n" +
                    "<trnfloutunit>PCS</trnfloutunit>\n" +
                    "<trnfloutwarehouse>WX006</trnfloutwarehouse>\n" +
                    "<trnfloutbatch>DMS329</trnfloutbatch>\n" +
                    "<trnfloutplant>AX</trnfloutplant>\n" +
                    "<trnflinqty>25</trnflinqty>\n" +
                    "<trnflinunit>PCS</trnflinunit>\n" +
                    "<trnflinwarehouse>SZ001</trnflinwarehouse>\n" +
                    "<trnflinbatch>DMS329</trnflinbatch>\n" +
                    "<trnflinplant>AX</trnflinplant>\n" +
                    "<idbcnt>2</idbcnt>\n" +
                    "<idbengravedno>Z9G2044</idbengravedno>\n" +
                    "<idbbinlevel>BIN01</idbbinlevel>\n" +
                    "<idbqty>5000</idbqty>\n" +
                    "<cassteno>cassteno01</cassteno>\n" +
                    "<lasermark>U291312315</lasermark>\n" +
                    "<bresitivity>1.7E+11</bresitivity>\n" +
                    "<sresitivity>1.7E+11</sresitivity>\n" +
                    "</DTL>\n" +
                    "</MST>\n";

            String Completion = "<MST> \n" +
                    "  <source>SYMES</source>\n" +
                    "  <user>tiptop</user>\n" +
                    "  <keyno>QAZWSXEDC</keyno>\n" +
                    "  <service>mes_Completion</service>\n" +
                    "  <center>DX</center>\n" +
                    "  <DTL> \n" +
                    "   <bsfv11>SC2012030001</bsfv11>\n" +
                    "  <bibb24>XS2012200001</bibb24>\n" +
                    "  <bibb25>1</bibb25>\n" +
                    "  <bibb27>K001</bibb27>\n" +
                    "  <bibb011>3.MC3400系列-CCD版-通富微-DFN-AS;Q2000;LMW19470018;20201015</bibb011>\n" +
                    "  <sfv03>1MC3711AACB-FT</sfv03>\n" +
                    "  <sfv06>MEMS01</sfv06>\n" +
                    "  <bibb181>LMW19470018</bibb181>\n" +
                    "  <meslot>12345678</meslot>\n" +
                    "  <sfv09>2000</sfv09>\n" +
                    "  <sfv08>EA</sfv08>\n" +
                    "  <wflot>WFLOT01</wflot>\n" +
                    "  <bibb32>20/12/20</bibb32>\n" +
                    "  <bin>BIN01</bin>\n" +
                    "  </DTL> \n" +
                    "</MST> ";*/

            String mesCompleteStr = "<MST>\n" +
                    " <center>DX</center>\n" +
                    " <source>SYMES</source>\n" +
                    " <service>mes_Completion</service>\n" +
                    " <keyno>QAZWSXEDC</keyno>\n" +
                    " <DTL>\n" +
//                    "  <attkey></attkey>\n" +
                    "  <attkey/>\n" +
                    "  <bibb32>21/11/30</bibb32>\n" +
                    "  <bibb181>D2010001</bibb181>\n" +
                    "  <meslot>D2010001</meslot>\n" +
//                    "  <bin1></bin1>\n" +
                    "  <bin1/>\n" +
                    "  <bibb27>Z</bibb27>\n" +
                    "  <bsfv11>NG05-21110006</bsfv11>\n" +
//                    "  <attvalue1></attvalue1>\n" +
                    "  <attvalue1/>\n" +
                    "  <bibb25>0</bibb25>\n" +
                    "  <sfv03>sy211129_Product</sfv03>\n" +
                    "  <sfv08>Pcs</sfv08>\n" +
                    "  <sfv06>C0002</sfv06>\n" +
                    "  <wflot>D2010001</wflot>\n" +
                    "  <sfv09>100.0</sfv09>\n" +
                    "  <bin>P</bin>\n" +
                    "  <bibb011>123321</bibb011>\n" +
                    " </DTL>\n" +
                    " <user>tiptop</user>\n" +
                    "</MST>";
            DemoService_ServiceLocator demoService_serviceLocator = new DemoService_ServiceLocator();
            demoService_serviceLocator.setDemoServiceImplPortEndpointAddress("http://192.168.68.159:9191/services/api");
            DemoService_PortType demoServiceImplPort = demoService_serviceLocator.getDemoServiceImplPort();
            XmlJsonTransform xmlJsonTransform = new XmlJsonTransform();
//            JSONObject xmltojson = xmlJsonTransform.XMLTOJSON(Completion);
            Result result = demoServiceImplPort.webGen(mesCompleteStr);
            System.out.println(result.getMsg());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
