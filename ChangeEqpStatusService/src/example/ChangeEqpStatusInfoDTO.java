package example;

public class ChangeEqpStatusInfoDTO {
    private String EqpId;

    private String OperId;

    private String Status;

    private String Remark;

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

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
