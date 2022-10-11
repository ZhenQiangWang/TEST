import java.util.ArrayList;

public class layUIResultVO {
    private int code;
    private int count;
    private ArrayList data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public ArrayList getData() {
        return data;
    }

    public void setData(ArrayList data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static layUIResultVO ok(int count, ArrayList data) {
        layUIResultVO r = new layUIResultVO();
        r.setCode(0);
        r.setCount(count);
        r.setData(data);
        return r;
    }

    public static layUIResultVO error(int count, ArrayList data) {
        layUIResultVO r = new layUIResultVO();
        r.setCode(0);
        r.setCount(count);
        r.setData(data);
        return r;
    }
}
