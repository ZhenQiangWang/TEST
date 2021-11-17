package example.DTO;

import java.io.Serializable;

public class materialList implements Serializable {
    //物料批次号
    private String materialLotNo;
    //数量
    private String materialQty;

    public String getMaterialLotNo() {
        return materialLotNo;
    }

    public void setMaterialLotNo(String materialLotNo) {
        this.materialLotNo = materialLotNo;
    }

    public String getMaterialQty() {
        return materialQty;
    }

    public void setMaterialQty(String materialQty) {
        this.materialQty = materialQty;
    }
}
