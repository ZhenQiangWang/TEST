import java.sql.Timestamp;

public class TransactionLog implements java.io.Serializable {

    private long      transRrn;
	
    private String    transId;
	
    private Timestamp transStartTimestamp;
	
    private Timestamp transEndTimestamp;
	
    private String    transPerformedBy;
	
    private String    comments;

    public TransactionLog(){
    }

    public long getTransRrn() {
        return transRrn;
    }

    public void setTransRrn(long transRrn) {
        this.transRrn = transRrn;
    }

    public String getTransId() {
        return transId;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public Timestamp getTransStartTimestamp() {
        return transStartTimestamp;
    }

    public void setTransStartTimestamp(Timestamp transStartTimestamp) {
        this.transStartTimestamp = transStartTimestamp;
    }

    public Timestamp getTransEndTimestamp() {
        return transEndTimestamp;
    }

    public void setTransEndTimestamp(Timestamp transEndTimestamp) {
        this.transEndTimestamp = transEndTimestamp;
    }

    public String getTransPerformedBy() {
        return transPerformedBy;
    }

    public void setTransPerformedBy(String transPerformedBy) {
        this.transPerformedBy = transPerformedBy;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getComments() {
        return this.comments;
    }
}

/*
 * Modification Log Log No : Name : Modified Date: Description :
 */
