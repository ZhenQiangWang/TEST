package example.DTO;

import java.io.Serializable;
import java.util.List;

public class materialCheckInfo implements Serializable {
    //物料号
    private String materialNo;

    private List<materialList> materialList;


    public String getMaterialNo() {
        return materialNo;
    }

    public void setMaterialNo(String materialNo) {
        this.materialNo = materialNo;
    }

    public List<materialList> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<materialList> materialList) {
        this.materialList = materialList;
    }
}
