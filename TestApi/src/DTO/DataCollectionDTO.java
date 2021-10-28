package DTO;

import java.io.Serializable;
import java.util.List;

public class DataCollectionDTO implements Serializable {
    //lotID
    private String lotId;

    //工步号
    private String stepId;

    //数据
    private List<data> data;

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }

    public String getStepId() {
        return stepId;
    }

    public void setStepId(String stepId) {
        this.stepId = stepId;
    }

    public List<DTO.data> getData() {
        return data;
    }

    public void setData(List<DTO.data> data) {
        this.data = data;
    }
}
