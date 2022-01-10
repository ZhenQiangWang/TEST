package example;

import com.alibaba.fastjson.JSON;
import mypackage.WorkflowRequestInfo;
import mypackage.WorkflowServiceLocator;
import mypackage.WorkflowServicePortType;

public class OAClient {
    public static void main(String[] argv) {
        try {
            String rquest = "{\n" +
                    "\t\"canEdit\": \"\",\n" +
                    "\t\"canView\": \"\",\n" +
                    "\t\"createTime\": \"\",\n" +
                    "\t\"creatorId\": \"91\",\n" +
                    "\t\"creatorName\": \"\",\n" +
                    "\t\"currentNodeId\": \"\",\n" +
                    "\t\"currentNodeName\": \"\",\n" +
                    "\t\"forwardButtonName\": \"\",\n" +
                    "\t\"isnextflow\": \"\",\n" +
                    "\t\"lastOperateTime\": \"\",\n" +
                    "\t\"lastOperatorName\": \"\",\n" +
                    "\t\"messageType\": \"\",\n" +
                    "\t\"mustInputRemark\": \"\",\n" +
                    "\t\"needAffirmance\": \"\",\n" +
                    "\t\"receiveTime\": \"\",\n" +
                    "\t\"rejectButtonName\": \"\",\n" +
                    "\t\"remark\": \"\",\n" +
                    "\t\"requestId\": \"\",\n" +
                    "\t\"requestLevel\": \"\",\n" +
                    "\t\"requestName\": \"销售订单变更审批流程\",\n" +
                    "\t\"secLevel\": \"\",\n" +
                    "\t\"status\": \"\",\n" +
                    "\t\"subbackButtonName\": \"\",\n" +
                    "\t\"submitButtonName\": \"\",\n" +
                    "\t\"subnobackButtonName\": \"\",\n" +
                    "\t\"workflowBaseInfo\": {\n" +
                    "\t\t\"workflowId\": \"31523\",\n" +
                    "\t\t\"workflowName\": \"axmt800\"\n" +
                    "\t},\n" +
                    "\t\"workflowMainTableInfo\": {\n" +
                    "\t\t\"tableDBName\": \"formtable_main_181\",\n" +
                    "\t\t\"requestRecords\": [{\n" +
                    "\t\t\t\"WorkflowRequestTableRecord\": {\n" +
                    "\t\t\t\t\"recordOrder\": \"1\",\n" +
                    "\t\t\t\t\"workflowRequestTableFields\": [{\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"dddhhydh\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"S201-KS0021120030\",\n" +
                    "\t\t\t\t\t\t\"view\": \"true\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"bbh\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"1\",\n" +
                    "\t\t\t\t\t\t\"view\": \"true\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"2022-01-05\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"sqrq\",\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"KS\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"ssyyzx\",\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"91\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"sqr\",\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"中兴\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"khmc\",\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"4\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"bglx\",\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"sqbm\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"1553\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"ywy\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"575\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"oep262\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"241590.000000\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\"fieldName\": \"oep262b\",\n" +
                    "\t\t\t\t\t\t\"fieldValue\": \"222270.000000\"\n" +
                    "\t\t\t\t\t}\n" +
                    "\t\t\t\t}]\n" +
                    "\t\t\t}\n" +
                    "\t\t}]\n" +
                    "\t},\n" +
                    "\t\"workflowDetailTableInfos\": [{\n" +
                    "\t\t\"workflowDetailTableInfo\": {\n" +
                    "\t\t\t\"tableDBName\": \"formtable_main_181_dt1\",\n" +
                    "\t\t\t\"workflowRequestTableRecords\": [{\n" +
                    "\t\t\t\t\"WorkflowRequestTableRecord\": {\n" +
                    "\t\t\t\t\t\"recordOrder\": \"1\",\n" +
                    "\t\t\t\t\t\"workflowRequestTableFields\": [{\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"ddxc\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"1\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bgqlh\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"PANNRA00546\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bgqpmgg\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"GaN RF 功放管\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bgqdddw\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"PCS\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bgqsl\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"3000.000\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bgqdj\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"80.530000\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bgqsqje\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"213796.460000\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"241590.000000\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bgqhsje\",\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"2022-01-03\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bgqysjhrq\",\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bghlh\",\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bghpmgg\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bghdddw\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bghysjhrq\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bghdj\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"74.090000\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bghsl\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bghsqje\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"196699.120000\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"bghhsje\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"222270.000000\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}, {\n" +
                    "\t\t\t\t\t\t\"workflowRequestTableField\": {\n" +
                    "\t\t\t\t\t\t\t\"edit\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"view\": \"true\",\n" +
                    "\t\t\t\t\t\t\t\"fieldName\": \"oeb16\",\n" +
                    "\t\t\t\t\t\t\t\"fieldValue\": \"2022-01-03\"\n" +
                    "\t\t\t\t\t\t}\n" +
                    "\t\t\t\t\t}]\n" +
                    "\t\t\t\t}\n" +
                    "\t\t\t}]\n" +
                    "\t\t}\n" +
                    "\t}]\n" +
                    "}";
            WorkflowServiceLocator workflowServiceLocator = new WorkflowServiceLocator();
            WorkflowServicePortType workflowServiceHttpPort = workflowServiceLocator.getWorkflowServiceHttpPort();
            WorkflowRequestInfo workflowRequestInfo = JSON.parseObject(rquest, WorkflowRequestInfo.class);
            String result = workflowServiceHttpPort.doCreateWorkflowRequest(workflowRequestInfo, 31523);
            System.out.println(result);
        }  catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
