import lombok.Data;

import java.util.Map;

//统一返回结果
@Data
public class ErrorInfo {
//    private Boolean success;
    private Integer ErrorCode;
    private String ErrorMsg;
    private Object data;

    //构造方法私有
    private ErrorInfo(){}

    //成功静态方法
    public static ErrorInfo ok(){
        ErrorInfo r = new  ErrorInfo();
//        r.setSuccess(true);
        r.setErrorCode(ResultCode.SUCCESS);
        r.setErrorMsg("成功");
        return r;
    }

    public static ErrorInfo error(String errorMsg){
        ErrorInfo r = new ErrorInfo();
//        r.setSuccess(false);
        r.setErrorCode(ResultCode.ERROR);
        r.setErrorMsg(errorMsg);
        return r;
    }

    public ErrorInfo success(Boolean success){
//        this.setSuccess(success);
        return this;
    }

    public ErrorInfo message(String message){
        this.setErrorMsg(message);
        return this;
    }

    public ErrorInfo code(Integer code){
        this.setErrorCode(code);
        return this;
    }

    public ErrorInfo data(Object value){
        this.data = value;
        return this;
    }

    public ErrorInfo data(Map<String, Object> map){
        this.setData(map);
        return this;
    }
}
