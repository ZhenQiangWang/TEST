package DTO;

import java.io.Serializable;
import java.util.List;

public class tubeNumValue implements Serializable {
    //管壳号
    private String tubeNum;

    //时间
    private String DataTime;

    //rawData
    private List<String> rawData;

    //备注，跟rawData一一对应
    private List<String> remark;

    public String getTubeNum() {
        return tubeNum;
    }

    public void setTubeNum(String tubeNum) {
        this.tubeNum = tubeNum;
    }

    public String getDataTime() {
        return DataTime;
    }

    public void setDataTime(String dataTime) {
        DataTime = dataTime;
    }

    public List<String> getRawData() {
        return rawData;
    }

    public void setRawData(List<String> rawData) {
        this.rawData = rawData;
    }

    public List<String> getRemark() {
        return remark;
    }

    public void setRemark(List<String> remark) {
        this.remark = remark;
    }
}
