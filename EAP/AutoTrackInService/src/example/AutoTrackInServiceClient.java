package example;

import com.alibaba.fastjson.JSON;
import mypackage.AutoTrackInServiceServiceLocator;
import mypackage.AutoTrackInService_PortType;

import java.util.ArrayList;
import java.util.List;

public class AutoTrackInServiceClient {
    public static void main(String[] argv) {
        try {
            AutoTrackInServiceServiceLocator autoTrackInServiceServiceLocator = new AutoTrackInServiceServiceLocator();
            AutoTrackInService_PortType autoTrackInService = autoTrackInServiceServiceLocator.getAutoTrackInService();
            AutoTrackInDTO autoTrackInDTO = new AutoTrackInDTO();
//            autoTrackInDTO.setLotId("D1751039_1");
            autoTrackInDTO.setLotId("D2224006");
            autoTrackInDTO.setOperId("ADMIN");
            autoTrackInDTO.setEqpId("PMLM01");
//            autoTrackInDTO.setEqpId("PPPS02");
//            autoTrackInDTO.setOddLotId("D2222017.01");
//            autoTrackInDTO.setOddLotQty(5);
            /*List<String> materialBoxBarCode = new ArrayList<>();
            materialBoxBarCode.add("2");
            autoTrackInDTO.setMaterialBoxBarCode(materialBoxBarCode);*/
            String trackInStr = "{\"eqpId\":\"PTDT01\",\"lotId\":\"D2224003\",\"materialBoxBarcode\":[],\"oddLotId\":null,\"oddLotQty\":0,\"operId\":\"nxadmin\"}";
            System.out.println(JSON.toJSONString(autoTrackInDTO));
            String summer = autoTrackInService.autoTrackInService(trackInStr);
            System.out.println(summer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
