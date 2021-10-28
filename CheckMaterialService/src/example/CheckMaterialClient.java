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
//      materialCheckDTO.setLotId("D2130001");

      //第一个物料
      materialCheckInfo materialCheckInfo = new materialCheckInfo();
      materialCheckInfo.setMaterialNo("03.06.04.00004A");
      List<materialList> materialLists = new ArrayList<>();

      materialList materialList = new materialList();
      materialList.setMaterialLotNo("03.06.04.00004A2010002");
      materialList.setMaterialQty("12");
      materialLists.add(materialList);

     /* materialLotInfo materialLotInfo1 = new materialLotInfo();
      materialLotInfo1.setMaterialLotNo("03.06.04.00004A1911001");
      materialLotInfo1.setMaterialQty("3");
      materialLotInfos.add(materialLotInfo1);*/

      materialCheckInfo.setMaterialList(materialLists);
      materialCheckInfos.add(materialCheckInfo);

      //第二个物料
      materialCheckInfo materialCheckInfo1 = new materialCheckInfo();
      materialCheckInfo1.setMaterialNo("03.06.03.0001A");
      List<materialList> materialLotInfos1 = new ArrayList<>();

      materialList materialList2 = new materialList();
      materialList2.setMaterialLotNo("03.06.03.00019A2004001");
      materialList2.setMaterialQty("12");
      materialLotInfos1.add(materialList2);

      materialList materialList3 = new materialList();
      materialList3.setMaterialLotNo("03.06.03.00019A200400");
      materialList3.setMaterialQty("30000");
      materialLotInfos1.add(materialList3);

      materialCheckInfo1.setMaterialList(materialLotInfos1);
      materialCheckInfos.add(materialCheckInfo1);

      materialCheckDTO.setMaterialCheckInfos(materialCheckInfos);
      System.out.println(JSON.toJSONString(materialCheckDTO));
      String summer = checkMaterialService.checkMaterialService(JSON.toJSONString(materialCheckDTO));
      System.out.println(summer);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
