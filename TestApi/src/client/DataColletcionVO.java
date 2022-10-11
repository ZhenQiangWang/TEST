package client;

import lombok.Data;

import java.io.Serializable;

@Data
public class DataColletcionVO implements Serializable {
//    private String userName;
    private String lotId;
    private String stepId;
    private String trackInTime;
    private String trackOutTime;
    private String eqpId;
}
