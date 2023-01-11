package example;

import com.alibaba.fastjson.JSON;
import mypackage.WorkflowRequestInfo;
import mypackage.WorkflowServiceLocator;
import mypackage.WorkflowServicePortType;

public class OAClient {
    public static void main(String[] argv) {
        try {
            String rquest = "[{\"edit\":true,\"fieldName\":\"sqr\",\"fieldValue\":\"110\",\"view\":true},{\"edit\":true,\"fieldName\":\"sqbm\",\"fieldValue\":\"1549\",\"view\":true},{\"edit\":true,\"fieldName\":\"sqsj\",\"fieldValue\":\"2023-01-05\",\"view\":true},{\"edit\":true,\"fieldName\":\"fxgx\",\"fieldValue\":\"AHTRB\",\"view\":true},{\"edit\":true,\"fieldName\":\"cpxh\",\"fieldValue\":\"D1H59030B1\",\"view\":true},{\"edit\":true,\"fieldName\":\"scph\",\"fieldValue\":\"D1931005\",\"view\":true},{\"edit\":true,\"fieldName\":\"rq\",\"fieldValue\":\"2023-01-31 12:12:00\",\"view\":true},{\"edit\":true,\"fieldName\":\"fxsj\",\"fieldValue\":\"发生时机\",\"view\":true},{\"edit\":true,\"fieldName\":\"scjt\",\"fieldValue\":\"C6430\",\"view\":true},{\"edit\":true,\"fieldName\":\"fxryuan\",\"fieldValue\":\"110\",\"view\":true},{\"edit\":true,\"fieldName\":\"pcsl\",\"fieldValue\":\"20.0\",\"view\":true},{\"edit\":true,\"fieldName\":\"ycsl\",\"fieldValue\":\"2\",\"view\":true},{\"edit\":true,\"fieldName\":\"ycdm\",\"fieldValue\":\"QCH:质量管理部其他情况预设Hold\",\"view\":true},{\"edit\":true,\"fieldName\":\"qtwdyyc\",\"view\":true},{\"edit\":true,\"fieldName\":\"zrr1\",\"fieldValue\":\"110\",\"view\":true},{\"edit\":true,\"fieldName\":\"wtms\",\"fieldValue\":\"cs\",\"view\":true}]";
            WorkflowServiceLocator workflowServiceLocator = new WorkflowServiceLocator();
            WorkflowServicePortType workflowServiceHttpPort = workflowServiceLocator.getWorkflowServiceHttpPort();
            WorkflowRequestInfo workflowRequestInfo = JSON.parseObject(rquest, WorkflowRequestInfo.class);
//            WorkflowRequestInfo workflowRequestInfo = new WorkflowRequestInfo();

            String result = workflowServiceHttpPort.doCreateWorkflowRequest(workflowRequestInfo, 31523);
            System.out.println(result);
        }  catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
