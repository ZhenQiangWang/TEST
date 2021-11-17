package example;

import java.util.List;

public class outputList {
    private String output;
    private String type;
    private List<reasonList> reasonList;
    private List<materialInfo> materialInfo;

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<reasonList> getReasonList() {
        return reasonList;
    }

    public void setReasonList(List<reasonList> reasonList) {
        this.reasonList = reasonList;
    }

    public List<materialInfo> getMaterialInfo() {
        return materialInfo;
    }

    public void setMaterialInfo(List<materialInfo> materialInfo) {
        this.materialInfo = materialInfo;
    }
}
