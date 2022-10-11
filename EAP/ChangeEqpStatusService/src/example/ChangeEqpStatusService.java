package example;

import com.alibaba.fastjson.JSON;
import mypackage.ChangeEqpStatusServiceServiceLocator;
import mypackage.ChangeEqpStatusService_PortType;

public class ChangeEqpStatusService {
    public static void main(String[] argv) {
        try {
//            String s = "";
//            String s1 = s.replaceAll("@", "','");
            ChangeEqpStatusServiceServiceLocator changeEqpStatusServiceServiceLocator = new ChangeEqpStatusServiceServiceLocator();
            ChangeEqpStatusService_PortType changeEqpStatusService = changeEqpStatusServiceServiceLocator.getChangeEqpStatusService();
            ChangeEqpStatusInfoDTO changeEqpStatusInfoDTO = new ChangeEqpStatusInfoDTO();
            changeEqpStatusInfoDTO.setEqpId("PPTR01");
            changeEqpStatusInfoDTO.setOperId("");
            changeEqpStatusInfoDTO.setStatus("EQP.IDLE_TO_DOWN");
            changeEqpStatusInfoDTO.setRemark("EAP Auto Change");
//            String request = "{\"eqpId\":\"PPTR01\",\"operId\":null,\"remark\":\"AMS action，1037:1037\",\"status\":\"EQP.IDLE_TO_DOWN\"}";
            String summer = changeEqpStatusService.changeEqpStatusService(JSON.toJSONString(changeEqpStatusInfoDTO));
//            String summer = changeEqpStatusService.changeEqpStatusService(request);
            System.out.println(JSON.toJSONString(changeEqpStatusInfoDTO));
            System.out.println(summer);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
