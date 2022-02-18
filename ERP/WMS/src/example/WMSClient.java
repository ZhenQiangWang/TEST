package example;

import example.tool.XmlJsonTransform;
import mypackage.DemoService_PortType;
import mypackage.DemoService_ServiceLocator;
import mypackage.Result;


public class WMSClient {

    public static void main(String[] argv) {
        try {

            String mesCompleteStr = "<MST>\n" +
                    "\t<mcludocdt>2022/01/26</mcludocdt>\n" +
                    "\t<DTL>\n" +
                    "\t\t<mclulunit>PCS</mclulunit>\n" +
                    "\t\t<cassteno>CKS1CX0100800</cassteno>\n" +
                    "\t\t<mcluldocno>1643164237301</mcluldocno>\n" +
                    "\t\t<mclulitem>PANNRA00390</mclulitem>\n" +
                    "\t\t<idbengravedno/>\n" +
                    "\t\t<idbqty>600.0</idbqty>\n" +
                    "\t\t<lasermark/>\n" +
                    "\t\t<mclulbatch>D2052009_1</mclulbatch>\n" +
                    "\t\t<mclulseq>1</mclulseq>\n" +
                    "\t\t<mclulqty>600.0</mclulqty>\n" +
                    "\t\t<idbbinlevel>P</idbbinlevel>\n" +
                    "\t\t<bresitivity/>\n" +
                    "\t\t<mclulplant>KS</mclulplant>\n" +
                    "\t\t<sresitivity/>\n" +
                    "\t\t<idbcnt>1</idbcnt>\n" +
                    "\t\t<mclulwarehouse>G01</mclulwarehouse>\n" +
                    "\t</DTL>\n" +
                    "\t<mcludocno>1643164237301</mcludocno>\n" +
                    "\t<mcludept>W31</mcludept>\n" +
                    "\t<keyno>QAZWSXEDC</keyno>\n" +
                    "\t<mcluplant>KS</mcluplant>\n" +
                    "\t<mclusource>transfer</mclusource>\n" +
                    "\t<mclucondate>2022/01/26</mclucondate>\n" +
                    "\t<center>KS</center>\n" +
                    "\t<mclucrtid>00228</mclucrtid>\n" +
                    "\t<mclutype>3</mclutype>\n" +
                    "\t<mclumemo>myCIM退回</mclumemo>\n" +
                    "\t<source>TOPGP</source>\n" +
                    "\t<service>otherinventory_sy</service>\n" +
                    "\t<mcluconflag>Y</mcluconflag>\n" +
                    "\t<mcluconuser>00228</mcluconuser>\n" +
                    "\t<user>00228</user>\n" +
                    "\t<mclucrtdept/>\n" +
                    "\t<mclustaff>00228</mclustaff>\n" +
                    "</MST>";
            DemoService_ServiceLocator demoService_serviceLocator = new DemoService_ServiceLocator();
            demoService_serviceLocator.setDemoServiceImplPortEndpointAddress("http://192.168.68.159:9091/services/api");
            DemoService_PortType demoServiceImplPort = demoService_serviceLocator.getDemoServiceImplPort();
            Result result = demoServiceImplPort.webGen(mesCompleteStr);
            System.out.println(result.getMsg());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
