package example.DTO;

import java.io.Serializable;
import java.util.List;

public class MaterialCheckDTO implements Serializable {
    private String lotId;
    private List<materialCheckInfo> materialCheckInfos;

    public List<materialCheckInfo> getMaterialCheckInfos() {
        return materialCheckInfos;
    }

    public void setMaterialCheckInfos(List<materialCheckInfo> materialCheckInfos) {
        this.materialCheckInfos = materialCheckInfos;
    }

    public String getLotId() {
        return lotId;
    }

    public void setLotId(String lotId) {
        this.lotId = lotId;
    }
}
