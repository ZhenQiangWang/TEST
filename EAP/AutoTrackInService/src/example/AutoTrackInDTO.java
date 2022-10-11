package example;


import java.io.Serializable;
import java.util.List;

public class AutoTrackInDTO implements Serializable {
    //LotId
    private String LotId;

    //原因
    private String EqpId;

    //操作人员
    private String OperId;

    //零头批
    private String oddLotId;

    //数量
    private int oddLotQty;

    //载具号
    private List<String> materialBoxBarCode;

    public String getLotId() {
        return LotId;
    }

    public void setLotId(String lotId) {
        LotId = lotId;
    }

    public String getEqpId() {
        return EqpId;
    }

    public void setEqpId(String eqpId) {
        EqpId = eqpId;
    }

    public String getOperId() {
        return OperId;
    }

    public void setOperId(String operId) {
        OperId = operId;
    }

    public String getOddLotId() {
        return oddLotId;
    }

    public void setOddLotId(String oddLotId) {
        this.oddLotId = oddLotId;
    }

    public int getOddLotQty() {
        return oddLotQty;
    }

    public void setOddLotQty(int oddLotQty) {
        this.oddLotQty = oddLotQty;
    }

    public List<String> getMaterialBoxBarCode() {
        return materialBoxBarCode;
    }

    public void setMaterialBoxBarCode(List<String> materialBoxBarCode) {
        this.materialBoxBarCode = materialBoxBarCode;
    }
}
