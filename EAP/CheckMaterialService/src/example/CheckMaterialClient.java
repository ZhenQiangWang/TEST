package example;

import com.alibaba.fastjson.JSON;
import example.DTO.MaterialCheckDTO;
import example.DTO.materialCheckInfo;
import example.DTO.materialList;
import mypackage.CheckMaterialServiceServiceLocator;
import mypackage.CheckMaterialService_PortType;

import java.util.ArrayList;
import java.util.List;

public class CheckMaterialClient {
  public static void main(String[] argv) {
    try {
      CheckMaterialServiceServiceLocator checkMaterialServiceServiceLocator = new CheckMaterialServiceServiceLocator();
      CheckMaterialService_PortType checkMaterialService = checkMaterialServiceServiceLocator.getCheckMaterialService();
      MaterialCheckDTO materialCheckDTO = new MaterialCheckDTO();
      List<materialCheckInfo> materialCheckInfos = new ArrayList<>();
      materialCheckDTO.setLotId("D1930016");

      //第三个物料
      materialCheckInfo materialCheckInfo3 = new materialCheckInfo();
      materialCheckInfo3.setMaterialNo("03.06.03.00013A");
      List<materialList> materialLists3 = new ArrayList<>();

      materialList materialList4 = new materialList();
      materialList4.setMaterialLotNo("03.06.03.00013A1911001");
      materialList4.setMaterialQty("12");
      materialLists3.add(materialList4);
      materialCheckInfo3.setMaterialList(materialLists3);
      materialCheckInfos.add(materialCheckInfo3);

      //第一个物料
      materialCheckInfo materialCheckInfo = new materialCheckInfo();
      materialCheckInfo.setMaterialNo("03.06.01.36005A");
      List<materialList> materialLists = new ArrayList<>();

      materialList materialList = new materialList();
      materialList.setMaterialLotNo("03.06.01.36005A2005002");
      materialList.setMaterialQty("12");
      materialLists.add(materialList);
      materialCheckInfo.setMaterialList(materialLists);
      materialCheckInfos.add(materialCheckInfo);

      //第二个物料
      materialCheckInfo materialCheckInfo2 = new materialCheckInfo();
      materialCheckInfo2.setMaterialNo("03.06.05.00042A");
      List<materialList> materialLotInfos2 = new ArrayList<>();

      materialList materialList2 = new materialList();
      materialList2.setMaterialLotNo("03.06.05.00042A1912001");
      materialList2.setMaterialQty("12");
      materialLotInfos2.add(materialList2);

     /* materialList materialList3 = new materialList();
      materialList3.setMaterialLotNo("03.06.03.00019A200400");
      materialList3.setMaterialQty("30000");
      materialLotInfos2.add(materialList3);*/

      materialCheckInfo2.setMaterialList(materialLotInfos2);
      materialCheckInfos.add(materialCheckInfo2);



      materialCheckDTO.setMaterialCheckInfos(materialCheckInfos);
      System.out.println(JSON.toJSONString(materialCheckDTO));
      String summer = checkMaterialService.checkMaterialService(JSON.toJSONString(materialCheckDTO));
      System.out.println(summer);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
