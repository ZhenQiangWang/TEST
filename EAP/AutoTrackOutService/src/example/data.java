package example;


import java.io.Serializable;
import java.util.List;

public class data implements Serializable {
    //参数号
    private String parameter;
    //管壳号及值
    private List<tubeNumValue> tubeNumValue;

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public List<example.tubeNumValue> getTubeNumValue() {
        return tubeNumValue;
    }

    public void setTubeNumValue(List<example.tubeNumValue> tubeNumValue) {
        this.tubeNumValue = tubeNumValue;
    }
}
