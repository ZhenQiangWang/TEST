package example;


import java.io.Serializable;

public class CancelTrackInDTO implements Serializable {
    //LotId
    private String LotId;

    //原因
    private String Reason;

    //操作人员
    private String OperId;

    //工步
    private String stepID;

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

    public String getStepID() {
        return stepID;
    }

    public void setStepID(String stepID) {
        this.stepID = stepID;
    }
}
