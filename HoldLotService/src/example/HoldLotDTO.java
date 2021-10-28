package example;

public class HoldLotDTO {
    private String LotId;
    private String OperId;
    private String HoldCode;
    private String department;
    private String Remark;

    public String getLotId() {
        return LotId;
    }

    public void setLotId(String lotId) {
        LotId = lotId;
    }

    public String getOperId() {
        return OperId;
    }

    public void setOperId(String operId) {
        OperId = operId;
    }

    public String getHoldCode() {
        return HoldCode;
    }

    public void setHoldCode(String holdCode) {
        HoldCode = holdCode;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRemark() {
        return Remark;
    }

    public void setRemark(String remark) {
        Remark = remark;
    }
}
