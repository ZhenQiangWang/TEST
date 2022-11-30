package example;

import mypackage.DataCollectionServiceServiceLocator;
import mypackage.DataCollectionService_PortType;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

public class DataCollectionService {
  public static void main(String[] argv) throws Exception {
    DataCollectionServiceServiceLocator dataCollectionServiceServiceLocator = new DataCollectionServiceServiceLocator();
    DataCollectionService_PortType dataCollectionService = dataCollectionServiceServiceLocator.getDataCollectionService();
    String request = "{\n" +
            "\t\"lotId\":\"D2224006\",\n" +
            "\t\"stepId\":\"FT\",\n" +
            "\t\"userId\":\"00903\",\n" +
            "    \"data\": [{\n" +
            "            \"parameter\": \"LBL_LIDS_POSITION_X2\",\n" +
            "            \"tubeNumValue\": [{\n" +
            "                    \"eqpID\": \"\",\n" +
            "                    \"operId\": \"\",\n" +
            "                    \"qualifiedVal\": \"\",\n" +
            "                    \"mean\": \"\",\n" +
            "                    \"std\": \"\",\n" +
            "                    \"cpk\": \"\",\n" +
            "                    \"dateTime\": \"\",\n" +
            "                    \"sampleCode\": \"\",\n" +
            "                    \"tubeNum\": \"C1\",\n" +
            "                    \"rawData\": [\"-305\"],\n" +
            "                    \"remark\": []\n" +
            "                },{\n" +
            "                    \"eqpID\": \"\",\n" +
            "                    \"operId\": \"\",\n" +
            "                    \"qualifiedVal\": \"\",\n" +
            "                    \"mean\": \"\",\n" +
            "                    \"std\": \"\",\n" +
            "                    \"cpk\": \"\",\n" +
            "                    \"dateTime\": \"\",\n" +
            "                    \"sampleCode\": \"\",\n" +
            "                    \"tubeNum\": \"C2\",\n" +
            "                    \"rawData\": [\"-306\"],\n" +
            "                    \"remark\": []\n" +
            "                }\n" +
            "            ]\n" +
            "        }, {\n" +
            "            \"parameter\": \"LBL_MARK _POSITION_X1\",\n" +
            "            \"tubeNumValue\": [{\n" +
            "                    \"eqpID\": \"\",\n" +
            "                    \"operId\": \"\",\n" +
            "                    \"qualifiedVal\": \"\",\n" +
            "                    \"mean\": \"\",\n" +
            "                    \"std\": \"\",\n" +
            "                    \"cpk\": \"\",\n" +
            "                    \"dateTime\": \"\",\n" +
            "                    \"sampleCode\": \"\",\n" +
            "                    \"tubeNum\": \"C1\",\n" +
            "                    \"rawData\": [\"-215\"],\n" +
            "                    \"remark\": []\n" +
            "                },{\n" +
            "                    \"eqpID\": \"\",\n" +
            "                    \"operId\": \"\",\n" +
            "                    \"qualifiedVal\": \"\",\n" +
            "                    \"mean\": \"\",\n" +
            "                    \"std\": \"\",\n" +
            "                    \"cpk\": \"\",\n" +
            "                    \"dateTime\": \"\",\n" +
            "                    \"sampleCode\": \"\",\n" +
            "                    \"tubeNum\": \"C2\",\n" +
            "                    \"rawData\": [\"-216\"],\n" +
            "                    \"remark\": []\n" +
            "                }\n" +
            "            ]\n" +
            "        }\n" +
            "    ]\n" +
            "}\n";
    String s = dataCollectionService.dataCollectionService(request);
    System.out.println(s);
  }
}
