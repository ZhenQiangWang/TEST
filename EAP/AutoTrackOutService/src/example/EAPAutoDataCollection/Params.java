package example.EAPAutoDataCollection;


import java.util.ArrayList;

public class Params {
    //参数号，保存除数据外其他信息
    private String param;
    private ArrayList<String> value;

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public ArrayList<String> getValue() {
        return value;
    }

    public void setValue(ArrayList<String> value) {
        this.value = value;
    }
}
