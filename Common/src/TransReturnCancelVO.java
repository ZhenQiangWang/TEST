
public class TransReturnCancelVO {
    //单据
    private String orderNo;

    //料号
    private String itemId;

    //退料信息
    private String returnInfo;

    //退料时间
    private String transDate;

    //退料人员
    private String transUser;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getReturnInfo() {
        return returnInfo;
    }

    public void setReturnInfo(String returnInfo) {
        this.returnInfo = returnInfo;
    }

    public String getTransDate() {
        return transDate;
    }

    public void setTransDate(String transDate) {
        this.transDate = transDate;
    }

    public String getTransUser() {
        return transUser;
    }

    public void setTransUser(String transUser) {
        this.transUser = transUser;
    }
}
