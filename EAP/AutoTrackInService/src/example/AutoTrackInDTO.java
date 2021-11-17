package example;


import java.io.Serializable;

public class AutoTrackInDTO implements Serializable {
    //LotId
    private String LotId;

    //原因
    private String EqpId;

    //操作人员
    private String OperId;

    //零头批
    private String oddLotId;

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
}
