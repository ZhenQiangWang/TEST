package example;


import java.io.Serializable;

public class CancelTrackInDTO implements Serializable {
    //LotId
    private String LotId;

    //原因
    private String Reason;

    //操作人员
    private String OperId;

    public String getLotId() {
        return LotId;
    }

    public void setLotId(String lotId) {
        LotId = lotId;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public String getOperId() {
        return OperId;
    }

    public void setOperId(String operId) {
        OperId = operId;
    }
}
