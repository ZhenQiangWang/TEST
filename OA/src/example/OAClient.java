package example;

import com.alibaba.fastjson.JSON;
import mypackage.WorkflowRequestInfo;
import mypackage.WorkflowServiceLocator;
import mypackage.WorkflowServicePortType;

public class OAClient {
    public static void main(String[] argv) {
        try {
            String rquest = "";
            WorkflowServiceLocator workflowServiceLocator = new WorkflowServiceLocator();
            WorkflowServicePortType workflowServiceHttpPort = workflowServiceLocator.getWorkflowServiceHttpPort();
//            WorkflowRequestInfo workflowRequestInfo = JSON.parseObject(rquest, WorkflowRequestInfo.class);
            WorkflowRequestInfo workflowRequestInfo = new WorkflowRequestInfo();

            String result = workflowServiceHttpPort.doCreateWorkflowRequest(workflowRequestInfo, 31523);
            System.out.println(result);
        }  catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
