package example;

import java.io.Serializable;
import java.util.List;

public class reasonList implements Serializable {
    //代码类型 异常loss，返工 rework
    private String codeType;
    //异常代码
    private String reasonCode;
    //异常描述
    private String reasonDesc;
    //数量
    private String reasonQty;

    public List<String> getReasonSN() {
        return reasonSN;
    }

    public void setReasonSN(List<String> reasonSN) {
        this.reasonSN = reasonSN;
    }

    //序列号
    private List<String> reasonSN;

    public String getCodeType() {
        return codeType;
    }

    public void setCodeType(String codeType) {
        this.codeType = codeType;
    }

    public String getReasonCode() {
        return reasonCode;
    }

    public void setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
    }

    public String getReasonDesc() {
        return reasonDesc;
    }

    public void setReasonDesc(String reasonDesc) {
        this.reasonDesc = reasonDesc;
    }

    public String getReasonQty() {
        return reasonQty;
    }

    public void setReasonQty(String reasonQty) {
        this.reasonQty = reasonQty;
    }

}
