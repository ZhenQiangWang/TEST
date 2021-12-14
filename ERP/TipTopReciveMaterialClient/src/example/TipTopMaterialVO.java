package example;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TipTopMaterialVO implements Serializable {

    private String materialId;   // 物料号

    private String billId;  //单据号

    private List<lotNumber> lotNumbers;

    private String trnflinwarehouse;  //拨出仓库

    private String userId; //用户Id


    @Data
    public static class lotNumber{

        private Double qty; //接收总数量

        private String lotNumber;  //物料接收批次号

        private String expirationDate;  //失效日期

        private String comments; //备注

        private List<waferInfo> waferInfos;

        @Data
        public static class waferInfo {

            private String waferLotId;//前道MES该晶圆对应的LotId

            private String waferId; //erp-晶圆号

            private List<trayInfos> trayInfos;

            @Data
            public static class trayInfos {
                private String trayId;    // erp-trayid
                private Double trayQty; // 每个tray的数量

            }
        }
    }


}
