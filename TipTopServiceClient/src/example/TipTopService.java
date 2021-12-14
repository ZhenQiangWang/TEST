package example;

import mypackage.TipTopMycimServiceServiceLocator;
import mypackage.TipTopMycimService_PortType;

public class TipTopService {
    public static void main(String[] argv) {
        try {
            TipTopMycimServiceServiceLocator tipTopMycimServiceServiceLocator = new TipTopMycimServiceServiceLocator();
            TipTopMycimService_PortType tipTopMycimService = tipTopMycimServiceServiceLocator.getTipTopMycimService();
            reciveMaterial(tipTopMycimService);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static void reciveMaterial(TipTopMycimService_PortType tipTopMycimService) {
        try {
            String str = "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>单据号1</billId>\n" +
                    "\t<materialId>MATERIALNO4</materialId>\n" +
                    "\t<lotNumber>物料批次号1</lotNumber>\n" +
                    "\t<waferId>waferId</waferId>\n" +
                    "\t<trayId>trayId1</trayId>\n" +
                    "\t<waferLotId>waferLotId1</waferLotId>\n" +
                    "\t<expirationDate>17/12/2021</expirationDate>\n" +
                    "\t<trnflinwarehouse>拨出仓库</trnflinwarehouse>\n" +
                    "\t<qty>2.26</qty>\n" +
                    "\t<userId>2.26</userId>\n" +
                    "\t<comments>备注</comments>\n" +
                    "</tipTopMaterialInfoDTOS>\n" +
                    "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>单据号1</billId>\n" +
                    "\t<materialId>MATERIALNO4</materialId>\n" +
                    "\t<lotNumber>物料批次号2</lotNumber>\n" +
                    "\t<waferId></waferId>\n" +
                    "\t<trayId></trayId>\n" +
                    "\t<waferLotId></waferLotId>\n" +
                    "\t<expirationDate>18/12/2021</expirationDate>\n" +
                    "\t<trnflinwarehouse>拨出仓库</trnflinwarehouse>\n" +
                    "\t<qty>2.26</qty>\n" +
                    "\t<userId>2.26</userId>\n" +
                    "\t<comments>备注</comments>\n" +
                    "</tipTopMaterialInfoDTOS>\n" +
                    "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>单据号2</billId>\n" +
                    "\t<materialId>MATERIALNO3</materialId>\n" +
                    "\t<lotNumber>物料批次号3</lotNumber>\n" +
                    "\t<waferId>waferId</waferId>\n" +
                    "\t<trayId>trayId1</trayId>\n" +
                    "\t<waferLotId>waferLotId2</waferLotId>\n" +
                    "\t<expirationDate>19/12/2021</expirationDate>\n" +
                    "\t<trnflinwarehouse>拨出仓库</trnflinwarehouse>\n" +
                    "\t<qty>2.26</qty>\n" +
                    "\t<userId>2.26</userId>\n" +
                    "\t<comments>备注</comments>\n" +
                    "</tipTopMaterialInfoDTOS>\n" +
                    "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>单据号2</billId>\n" +
                    "\t<materialId>MATERIALNO3</materialId>\n" +
                    "\t<lotNumber>物料批次号4</lotNumber>\n" +
                    "\t<waferId>waferId</waferId>\n" +
                    "\t<trayId>trayId1</trayId>\n" +
                    "\t<waferLotId>waferLotId3</waferLotId>\n" +
                    "\t<expirationDate>20/12/2021</expirationDate>\n" +
                    "\t<trnflinwarehouse>拨出仓库</trnflinwarehouse>\n" +
                    "\t<qty>2.26</qty>\n" +
                    "\t<userId>2.26</userId>\n" +
                    "\t<comments>备注</comments>\n" +
                    "</tipTopMaterialInfoDTOS>\n";

            String strq = "<tipTopMaterialInfoDTOS>\n" +
                    "\t<billId>单据号1</billId>\n" +
                    "\t<materialId>MATERIALNO4</materialId>\n" +
                    "\t<lotNumber>物料批次号1</lotNumber>\n" +
                    "\t<waferId>waferId</waferId>\n" +
                    "\t<trayId>trayId1</trayId>\n" +
                    "\t<waferLotId>waferLotId1</waferLotId>\n" +
                    "\t<expirationDate>17/12/2021</expirationDate>\n" +
                    "\t<trnflinwarehouse>拨出仓库</trnflinwarehouse>\n" +
                    "\t<qty>1</qty>\n" +
                    "\t<userId>2.26</userId>\n" +
                    "\t<comments>备注</comments>\n" +
                    "</tipTopMaterialInfoDTOS>\n";
            String result = tipTopMycimService.tipTopReciveMaterial(strq);
            System.out.println(result);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
