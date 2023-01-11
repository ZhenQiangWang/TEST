package example;

import com.alibaba.fastjson.JSON;
import mypackage.CancelTrackInServiceServiceLocator;
import mypackage.CancelTrackInServiceSoapBindingStub;
import mypackage.CancelTrackInService_PortType;

public class AutoCancelTrackIn {
  public static void main(String[] argv) {
      try {

          CancelTrackInServiceServiceLocator cancelTrackInServiceServiceLocator = new CancelTrackInServiceServiceLocator();
          CancelTrackInService_PortType cancelTrackInService = cancelTrackInServiceServiceLocator.getCancelTrackInService();

          CancelTrackInDTO cancelTrackInDTO = new CancelTrackInDTO();
          cancelTrackInDTO.setLotId("D2224003");
          cancelTrackInDTO.setStepID("123");
//          cancelTrackInDTO.setLotId("aaa");
          cancelTrackInDTO.setOperId("ADMIN");
          cancelTrackInDTO.setReason("TEST EAP AutoCancel TrackIn");
          System.out.println(JSON.toJSONString(cancelTrackInDTO));
          String summer = cancelTrackInService.cancelTrackInService(JSON.toJSONString(cancelTrackInDTO));
          System.out.println(summer);
      } catch (Exception ex) {
          ex.printStackTrace();
      }
  }
}
