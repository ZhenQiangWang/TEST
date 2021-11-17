package example;

import com.alibaba.fastjson.JSON;
import mypackage.HoldLotServiceServiceLocator;
import mypackage.HoldLotService_PortType;

public class HoldLotService {
  public static void main(String[] argv) {
      try {
          HoldLotServiceServiceLocator holdLotServiceServiceLocator = new HoldLotServiceServiceLocator();
          HoldLotService_PortType holdLotService = holdLotServiceServiceLocator.getHoldLotService();
          HoldLotDTO holdLotDTO = new HoldLotDTO();
          holdLotDTO.setLotId("D2046037_1");
//          holdLotDTO.setLotId("aa");
          holdLotDTO.setDepartment("MA");
          holdLotDTO.setHoldCode("001-A");
          holdLotDTO.setOperId("595");
          holdLotDTO.setRemark("EAP Auto Hold");
          System.out.println(JSON.toJSONString(holdLotDTO));
          String summer = holdLotService.holdLotService(JSON.toJSONString(holdLotDTO));
          System.out.println(summer);
      } catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}
