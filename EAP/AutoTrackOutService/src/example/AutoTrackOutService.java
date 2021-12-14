package example;

import com.alibaba.fastjson.JSON;
import mypackage.AutoTrackOutServiceServiceLocator;
import mypackage.AutoTrackOutService_PortType;

import java.util.ArrayList;
import java.util.List;

public class AutoTrackOutService {
  public static void main(String[] argv) {
    try {
      AutoTrackOutServiceServiceLocator autoTrackOutServiceServiceLocator = new AutoTrackOutServiceServiceLocator();
      AutoTrackOutService_PortType autoTrackOutService = autoTrackOutServiceServiceLocator.getAutoTrackOutService();
      AutoTrackOutDTO autoTrackOutDTO = new AutoTrackOutDTO();
      autoTrackOutDTO.setLotId("D2149002");
      autoTrackOutDTO.setOperId("595");
      autoTrackOutDTO.setEqpId("PDDB06");
      autoTrackOutDTO.setMaterialBoxBarCode("52,lc");
      List<outputList> outputLists = new ArrayList<>();
      List<materialInfo> materialInfos = new ArrayList<>();
      outputList outputList1 = new outputList();
      outputList1.setType("Normal");
      outputList1.setOutput("1");
      /*List<reasonList> reasonLists1 = new ArrayList<>();
      reasonList reasonList = new reasonList();
      reasonList.setReasonQty("4");
      reasonList.setCodeType("loss");
      reasonList.setReasonCode("BIN4");
      reasonList.setReasonDesc("AT20：管壳划伤");
      List<String> sns2 = new ArrayList<>();
      sns2.add("1");
      sns2.add("2");
      reasonList.setReasonSN(sns2);
      reasonLists1.add(reasonList);

      reasonList reasonList3 = new reasonList();
      List<String> sns1 = new ArrayList<>();
      sns1.add("3");
      sns1.add("4");
      reasonList3.setReasonSN(sns1);
      reasonList3.setReasonQty("2");
      reasonList3.setCodeType("loss");
      reasonList3.setReasonCode("BIN3");
      reasonList3.setReasonDesc("AT20：管壳划伤");
      reasonLists1.add(reasonList3);
      outputList1.setReasonList(reasonLists1);*/
      outputLists.add(outputList1);
      /*reasonList reasonList1 = new reasonList();
      reasonList1.setReasonQty("1");
      reasonList1.setCodeType("loss");
      reasonList1.setReasonCode("LOSS_CODE_FOR_0021");
      reasonList1.setReasonDesc("AT21：Lead变形");
      reasonLists1.add(reasonList1);
      outputList1.setReasonList(reasonLists1);*/

      materialInfo materialInfo = new materialInfo();
      materialInfo.setMaterialNo("sy211130wzq");
      List<materialList> materialLists = new ArrayList<>();
      materialList materialList = new materialList();
      materialList.setMaterialLotNo("1242452452");
      materialList.setMaterialQty("2");
      materialLists.add(materialList);
      materialInfo.setMaterialList(materialLists);
      materialInfos.add(materialInfo);



      materialInfo materialInfo2 = new materialInfo();
      materialInfo2.setMaterialNo("01.02.01.30121C");
      List<materialList> materialLotInfos2 = new ArrayList<>();

      materialList materialList2 = new materialList();
      materialList2.setMaterialLotNo("2005160241DS1");
      materialList2.setMaterialQty("2");
      materialLotInfos2.add(materialList2);


      materialInfo2.setMaterialList(materialLotInfos2);
      materialInfos.add(materialInfo2);
      outputList1.setMaterialInfo(materialInfos);


      /*outputList outputList2 = new outputList();
      outputList2.setType("RT");
      outputList2.setOutput("2");
      List<reasonList> reasonLists = new ArrayList<>();


      reasonList reasonList1 = new reasonList();
      reasonList1.setReasonQty("2");
      reasonList1.setCodeType("loss");
      reasonList1.setReasonCode("BIN4");
      reasonList1.setReasonDesc("AT21：Lead变形");
      List<String> sns = new ArrayList<>();
      sns.add("1");
      sns.add("2");
      reasonList1.setReasonSN(sns);
      reasonLists.add(reasonList1);
      outputList2.setReasonList(reasonLists);

      outputLists.add(outputList2);*/


      autoTrackOutDTO.setOutputList(outputLists);
      System.out.println(JSON.toJSONString(autoTrackOutDTO));
      String summer = autoTrackOutService.autoTrackOutService(JSON.toJSONString(autoTrackOutDTO));
      System.out.println(summer);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
