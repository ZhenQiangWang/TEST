package example;

import lombok.Data;

import java.io.Serializable;

@Data
public class TipTopReciveMaterialVO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String materialId;        // 	物料号

    private String qty;                // 	接收数量

    private String lotNumber;            // 物料接收批次号

    private String billId;            // 单据号

    private String expirationDate;    // 失效日期

    private String waferId;            // 	erp-晶圆号

    private String trayId;            // 	erp-trayid

    private String trnflinwarehouse;  //拨出仓库

    private String comments;            // 	备注
}
