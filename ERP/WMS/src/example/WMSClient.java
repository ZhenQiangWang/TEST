package example;

import example.tool.XmlJsonTransform;
import mypackage.DemoService_PortType;
import mypackage.DemoService_ServiceLocator;
import mypackage.Result;


public class WMSClient {

    public static void main(String[] argv) {
        try {

            String mesCompleteStr = "<MST>\n" +
                    "\t<center>KS</center>\n" +
                    "\t<source>SYMES</source>\n" +
                    "\t<DTL>\n" +
                    "\t\t<dc>2230</dc>\n" +
                    "\t\t<attkey/>\n" +
                    "\t\t<attvalue/>\n" +
                    "\t\t<bibb32>22/08/25</bibb32>\n" +
                    "\t\t<bibb181>D2230003</bibb181>\n" +
                    "\t\t<meslot>D2230003</meslot>\n" +
                    "\t\t<wfid/>\n" +
                    "\t\t<bin1/>\n" +
                    "\t\t<bsfv11>PA03-KS0022070013</bsfv11>\n" +
                    "\t\t<bibb27/>\n" +
                    "\t\t<attvalue1/>\n" +
                    "\t\t<bibb25/>\n" +
                    "\t\t<bibb24/>\n" +
                    "\t\t<sfv03>PANNRA00636</sfv03>\n" +
                    "\t\t<wflot/>\n" +
                    "\t\t<bin>P</bin>\n" +
                    "\t\t<sfv09>100.0</sfv09>\n" +
                    "\t\t<sfv08>PCS</sfv08>\n" +
                    "\t\t<sfv06>G01</sfv06>\n" +
                    "\t\t<bibb011>PANNRA00636,D2230001,2022-07-18,0,2022-07-18,P,,,,,100,,,,,,GaN RF 功放管,MESH,2230,DYNAXD2230001-04</bibb011>\n" +
                    "\t</DTL>\n" +
                    "\t<service>mes_Completion</service>\n" +
                    "\t<keyno>QAZWSXEDC</keyno>\n" +
                    "\t<user>00851</user>\n" +
                    "</MST>";
            DemoService_ServiceLocator demoService_serviceLocator = new DemoService_ServiceLocator();
            demoService_serviceLocator.setDemoServiceImplPortEndpointAddress("http://192.168.68.159:9091/services/api?wsdl");
            DemoService_PortType demoServiceImplPort = demoService_serviceLocator.getDemoServiceImplPort();
            Result result = demoServiceImplPort.webGen(mesCompleteStr);
            System.out.println(result.getMsg());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
