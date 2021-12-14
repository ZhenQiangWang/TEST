package example;

import com.alibaba.fastjson.JSON;
import mypackage.ChangeEqpStatusServiceServiceLocator;
import mypackage.ChangeEqpStatusService_PortType;

public class ChangeEqpStatusService {
    public static void main(String[] argv) {
        try {
            String s = "";
            String s1 = s.replaceAll("@", "','");
            /*ChangeEqpStatusServiceServiceLocator changeEqpStatusServiceServiceLocator = new ChangeEqpStatusServiceServiceLocator();
            ChangeEqpStatusService_PortType changeEqpStatusService = changeEqpStatusServiceServiceLocator.getChangeEqpStatusService();
            ChangeEqpStatusInfoDTO changeEqpStatusInfoDTO = new ChangeEqpStatusInfoDTO();
            changeEqpStatusInfoDTO.setEqpId("PWWB04");
            changeEqpStatusInfoDTO.setOperId("");
            changeEqpStatusInfoDTO.setStatus("EQP.IDLE_TO_DOWN");
            changeEqpStatusInfoDTO.setRemark("EAP Auto Change");
            String summer = changeEqpStatusService.changeEqpStatusService(JSON.toJSONString(changeEqpStatusInfoDTO));
            System.out.println(JSON.toJSONString(changeEqpStatusInfoDTO));
            System.out.println(summer);*/
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
