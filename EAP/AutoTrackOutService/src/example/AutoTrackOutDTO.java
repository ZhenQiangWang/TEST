package example;

import java.io.Serializable;
import java.util.List;

public class AutoTrackOutDTO implements Serializable {
    //设备编号
    private String EqpId;
    //LotId
    private String LotId;
    //操作人员
    private String OperId;
    //不良数量
    private List<outputList> outputList;
    //载具号，以逗号隔开
    private String materialBoxBarCode;

    private String remark;
    private List<data> data;

    public String getEqpId() {
        return EqpId;
    }

    public void setEqpId(String eqpId) {
        EqpId = eqpId;
    }

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

    public List<example.outputList> getOutputList() {
        return outputList;
    }

    public void setOutputList(List<example.outputList> outputList) {
        this.outputList = outputList;
    }

    public String getMaterialBoxBarCode() {
        return materialBoxBarCode;
    }

    public void setMaterialBoxBarCode(String materialBoxBarCode) {
        this.materialBoxBarCode = materialBoxBarCode;
    }

    public List<example.data> getData() {
        return data;
    }

    public void setData(List<example.data> data) {
        this.data = data;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}
