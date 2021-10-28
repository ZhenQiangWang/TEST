package example;

import com.alibaba.fastjson.JSON;
import mypackage.AutoTrackInServiceServiceLocator;
import mypackage.AutoTrackInService_PortType;

public class AutoTrackInServiceClient {
    public static void main(String[] argv) {
        try {
            AutoTrackInServiceServiceLocator autoTrackInServiceServiceLocator = new AutoTrackInServiceServiceLocator();
            AutoTrackInService_PortType autoTrackInService = autoTrackInServiceServiceLocator.getAutoTrackInService();
            AutoTrackInDTO autoTrackInDTO = new AutoTrackInDTO();
//            autoTrackInDTO.setLotId("D1751039_1");
            autoTrackInDTO.setLotId("D2130001");
            autoTrackInDTO.setOperId("595");
            autoTrackInDTO.setEqpId("PWWB02");
//            autoTrackInDTO.setOddLotId("D2048007_1.01");
            System.out.println(JSON.toJSONString(autoTrackInDTO));
            String summer = autoTrackInService.autoTrackInService(JSON.toJSONString(autoTrackInDTO));
            System.out.println(summer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
