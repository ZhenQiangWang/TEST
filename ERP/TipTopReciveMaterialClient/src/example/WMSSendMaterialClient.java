package example;

import com.alibaba.fastjson.JSON;
import com.sun.corba.se.spi.ior.TaggedProfileTemplate;
import mypackage.TipTopReciveMaterialServiceServiceLocator;
import mypackage.TipTopReciveMaterialService_PortType;
import org.json.JSONObject;
import org.json.XML;

import java.util.ArrayList;
import java.util.List;

public class WMSSendMaterialClient {
  public static void main(String[] argv) {
      try {
          TipTopReciveMaterialServiceServiceLocator tipTopReciveMaterialServiceServiceLocator = new TipTopReciveMaterialServiceServiceLocator();
          TipTopReciveMaterialService_PortType tipTopReciveMaterialService = tipTopReciveMaterialServiceServiceLocator.getTipTopReciveMaterialService();
          TipTopMaterialVO tipTopMaterialVO = new TipTopMaterialVO();
          tipTopMaterialVO.setBillId("billId");
          tipTopMaterialVO.setMaterialId("MATERIALNO5");
          tipTopMaterialVO.setTrnflinwarehouse("TipTopWMS");
          tipTopMaterialVO.setUserId("ERP");

          List<TipTopMaterialVO.lotNumber> lotNumbers = new ArrayList<>();

          TipTopMaterialVO.lotNumber lotNumber = new TipTopMaterialVO.lotNumber();
          lotNumber.setLotNumber("TIPTOPMATERIALLOTNUM2");
          lotNumber.setComments("物料批次号");
          lotNumber.setQty(1.00);
          lotNumber.setExpirationDate("2021/11/19");


          List<TipTopMaterialVO.lotNumber.waferInfo> waferInfos = new ArrayList<>();
          TipTopMaterialVO.lotNumber.waferInfo waferInfo = new TipTopMaterialVO.lotNumber.waferInfo();
          waferInfo.setWaferId("WAFEID1");
          waferInfo.setWaferLotId("WAFERLOTID");

          TipTopMaterialVO.lotNumber.waferInfo waferInfo1 = new TipTopMaterialVO.lotNumber.waferInfo();
          waferInfo1.setWaferId("WAFEID2");
          waferInfo1.setWaferLotId("WAFERLOTID2");


          List<TipTopMaterialVO.lotNumber.waferInfo.trayInfos> trayInfos = new ArrayList<>();

          TipTopMaterialVO.lotNumber.waferInfo.trayInfos trayInfo = new TipTopMaterialVO.lotNumber.waferInfo.trayInfos();
          trayInfo.setTrayId("TRAYID1");
          trayInfo.setTrayQty(2.00);
          trayInfos.add(trayInfo);
          List<TipTopMaterialVO.lotNumber.waferInfo.trayInfos> trayInfos1 = new ArrayList<>();

          TipTopMaterialVO.lotNumber.waferInfo.trayInfos trayInfo1 = new TipTopMaterialVO.lotNumber.waferInfo.trayInfos();
          trayInfo1.setTrayId("TRAYID2");
          trayInfo1.setTrayQty(2.00);
          trayInfos1.add(trayInfo1);

          waferInfo.setTrayInfos(trayInfos);
          waferInfo1.setTrayInfos(trayInfos1);

          waferInfos.add(waferInfo);
          waferInfos.add(waferInfo1);
          lotNumber.setWaferInfos(waferInfos);

          lotNumbers.add(lotNumber);
          tipTopMaterialVO.setLotNumbers(lotNumbers);

          List<TipTopReciveMaterialVO> tipTopReciveMaterialVOS = new ArrayList<>();

          TipTopReciveMaterialVO tipTopReciveMaterialVO = new TipTopReciveMaterialVO();
          tipTopReciveMaterialVO.setMaterialId("料号1");
          tipTopReciveMaterialVO.setQty("2.26");
          tipTopReciveMaterialVO.setLotNumber("物料批次号1");
          tipTopReciveMaterialVO.setBillId("单据号1");
          tipTopReciveMaterialVO.setExpirationDate("过期时间 dd/MM/YYYY");
          tipTopReciveMaterialVO.setWaferId("waferId");
          tipTopReciveMaterialVO.setTrayId("trayId1");
          tipTopReciveMaterialVO.setTrnflinwarehouse("拨出仓库");
          tipTopReciveMaterialVO.setComments("备注");


          TipTopReciveMaterialVO tipTopReciveMaterialVO1 = new TipTopReciveMaterialVO();
          tipTopReciveMaterialVO1.setMaterialId("料号1");
          tipTopReciveMaterialVO1.setQty("2.26");
          tipTopReciveMaterialVO1.setLotNumber("物料批次号2");
          tipTopReciveMaterialVO1.setBillId("单据号1");
          tipTopReciveMaterialVO1.setExpirationDate("过期时间 dd/MM/YYYY");
          tipTopReciveMaterialVO1.setWaferId("");
          tipTopReciveMaterialVO1.setTrayId("");
          tipTopReciveMaterialVO1.setTrnflinwarehouse("拨出仓库");
          tipTopReciveMaterialVO1.setComments("备注");


          TipTopReciveMaterialVO tipTopReciveMaterialVO2 = new TipTopReciveMaterialVO();
          tipTopReciveMaterialVO2.setMaterialId("料号2");
          tipTopReciveMaterialVO2.setQty("2.26");
          tipTopReciveMaterialVO2.setLotNumber("物料批次号3");
          tipTopReciveMaterialVO2.setBillId("单据号2");
          tipTopReciveMaterialVO2.setExpirationDate("过期时间 dd/MM/YYYY");
          tipTopReciveMaterialVO2.setWaferId("waferId1");
          tipTopReciveMaterialVO2.setTrayId("trayId2");
          tipTopReciveMaterialVO2.setTrnflinwarehouse("拨出仓库");
          tipTopReciveMaterialVO2.setComments("备注");
          tipTopReciveMaterialVOS.add(tipTopReciveMaterialVO);
          tipTopReciveMaterialVOS.add(tipTopReciveMaterialVO1);
          tipTopReciveMaterialVOS.add(tipTopReciveMaterialVO2);




          String request =  XML.toString(new JSONObject(JSON.toJSONString(tipTopReciveMaterialVOS)));
          String response = tipTopReciveMaterialService.tipTopReciveMaterialService(request);
          System.out.println(response);
      } catch ( Exception ex) {
          ex.printStackTrace();
      }
  }
}
