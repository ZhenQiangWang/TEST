package example;

import mypackage.*;

public class test {
    public static void main(String[] args) throws Exception {
        createRequest();
    }
    public static void createRequest() throws Exception {
        //主字段
        WorkflowRequestTableField[] wrti = new WorkflowRequestTableField[16]; //字段信息
        wrti[0] = new WorkflowRequestTableField();
        wrti[0].setFieldName("sqr");//申请人
        wrti[0].setFieldValue("110");//字段值
        wrti[0].setView(true);
        wrti[0].setEdit(true);


        wrti[1] = new WorkflowRequestTableField();
        wrti[1].setFieldName("sqbm");//申请部门
        wrti[1].setFieldValue("");
        wrti[1].setView(true);
        wrti[1].setEdit(true);

        wrti[2] = new WorkflowRequestTableField();
        wrti[2].setFieldName("sqsj");//申请时间
        wrti[2].setFieldValue("2022-5-18");
        wrti[2].setView(true);
        wrti[2].setEdit(true);

        wrti[3] = new WorkflowRequestTableField();
        wrti[3].setFieldName("fxgx");//发现工序
        wrti[3].setFieldValue("发现工序");
        wrti[3].setView(true);
        wrti[3].setEdit(true);

        wrti[4] = new WorkflowRequestTableField();
        wrti[4].setFieldName("cpxh");//产品型号
        wrti[4].setFieldValue("产品型号");
        wrti[4].setView(true);
        wrti[4].setEdit(true);

        wrti[5] = new WorkflowRequestTableField();
        wrti[5].setFieldName("scph");//生产批号
        wrti[5].setFieldValue("生产批号");
        wrti[5].setView(true);
        wrti[5].setEdit(true);

        wrti[6] = new WorkflowRequestTableField();
        wrti[6].setFieldName("rq");//发生时间
        wrti[6].setFieldValue("2022-5-18 14:31:00");
        wrti[6].setView(true);
        wrti[6].setEdit(true);

        wrti[7] = new WorkflowRequestTableField();
        wrti[7].setFieldName("fxsj");//发送时间
        wrti[7].setFieldValue("发现时机");
        wrti[7].setView(true);
        wrti[7].setEdit(true);

        wrti[8] = new WorkflowRequestTableField();
        wrti[8].setFieldName("scjt");//生产机台
        wrti[8].setFieldValue("生产机台");
        wrti[8].setView(true);
        wrti[8].setEdit(true);

        wrti[9] = new WorkflowRequestTableField();
        wrti[9].setFieldName("fxryuan");//发现人员
        wrti[9].setFieldValue("21");
        wrti[9].setView(true);
        wrti[9].setEdit(true);

        wrti[10] = new WorkflowRequestTableField();
        wrti[10].setFieldName("pcsl");//批次数量
        wrti[10].setFieldValue("100");
        wrti[10].setView(true);
        wrti[10].setEdit(true);

        wrti[11] = new WorkflowRequestTableField();
        wrti[11].setFieldName("ycsl");//异常数量
        wrti[11].setFieldValue("200");
        wrti[11].setView(true);
        wrti[11].setEdit(true);

        wrti[12] = new WorkflowRequestTableField();
        wrti[12].setFieldName("ycdm");//异常代码
        wrti[12].setFieldValue("001-H:其他");
        wrti[12].setView(true);
        wrti[12].setEdit(true);

        wrti[13] = new WorkflowRequestTableField();
        wrti[13].setFieldName("qtwdyyc");//批次属性
        wrti[13].setFieldValue("批次属性");
        wrti[13].setView(true);
        wrti[13].setEdit(true);

        wrti[14] = new WorkflowRequestTableField();
        wrti[14].setFieldName("zrr1");//责任人1
        wrti[14].setFieldValue("110");
        wrti[14].setView(true);
        wrti[14].setEdit(true);


        wrti[15] = new WorkflowRequestTableField();
        wrti[15].setFieldName("wtms");//问题描述
        wrti[15].setFieldValue("问题描述");
        wrti[15].setView(true);
        wrti[15].setEdit(true);

       /* wrti[3] = new WorkflowRequestTableField();
        wrti[3].setFieldName("fxgx");//附件
        wrti[3].setFieldType("http:baidu_sylogo1.gif");//http:开头代表该字段为附件字段
        wrti[3].setFieldValue("http://www.baidu.com/img/baidu_sylogo1.gif");//附件地址
        wrti[3].setView(true);
        wrti[3].setEdit(true);*/

        WorkflowRequestTableRecord[] wrtri = new WorkflowRequestTableRecord[1];//主字段只有一行数据
        wrtri[0] = new WorkflowRequestTableRecord();
        wrtri[0].setWorkflowRequestTableFields(wrti);

        WorkflowMainTableInfo wmi = new WorkflowMainTableInfo();
//        wmi.setTableDBName("formtable_main_39");
        wmi.setRequestRecords(wrtri);


        //明细字段
        /*WorkflowDetailTableInfo wdti[] = new WorkflowDetailTableInfo[2];//两个明细表0明细表1,1明细表2

        //明细表1 start
        wrtri = new WorkflowRequestTableRecord[2];//数据 行数，假设添加2行明细数据
        //第一行
        wrti = new WorkflowRequestTableField[3]; //每行3个字段
        wrti[0] = new WorkflowRequestTableField();
        wrti[0].setFieldName("sl");//数量
        wrti[0].setFieldValue("11");
        wrti[0].setView(true);
        wrti[0].setEdit(true);

        wrti[1] = new WorkflowRequestTableField();
        wrti[1].setFieldName("dj");//单价
        wrti[1].setFieldValue("2");
        wrti[1].setView(true);
        wrti[1].setEdit(true);

        wrti[2] = new WorkflowRequestTableField();
        wrti[2].setFieldName("xj");//小记
        wrti[2].setFieldValue("22");
        wrti[2].setView(true);
        wrti[2].setEdit(true);

        wrtri[0] = new WorkflowRequestTableRecord();
        wrtri[0].setWorkflowRequestTableFields(wrti);

        //第二行
        wrti = new WorkflowRequestTableField[3]; //每行3个字段
        wrti[0] = new WorkflowRequestTableField();
        wrti[0].setFieldName("sl");//数量
        wrti[0].setFieldValue("110");
        wrti[0].setView(true);
        wrti[0].setEdit(true);

        wrti[1] = new WorkflowRequestTableField();
        wrti[1].setFieldName("dj");//单价
        wrti[1].setFieldValue("2");
        wrti[1].setView(true);
        wrti[1].setEdit(true);

        wrti[2] = new WorkflowRequestTableField();
        wrti[2].setFieldName("xj");//小记
        wrti[2].setFieldValue("220");
        wrti[2].setView(true);
        wrti[2].setEdit(true);

        wrtri[1] = new WorkflowRequestTableRecord();
        wrtri[1].setWorkflowRequestTableFields(wrti);

        wdti[0] = new WorkflowDetailTableInfo();
        wdti[0].setWorkflowRequestTableRecords(wrtri);//加入明细表1的数据
        //明细表1 end


        //明细表2 start
        wrtri = new WorkflowRequestTableRecord[1];//数据行数，假设添加1行明细数据

        //第一行
        wrti = new WorkflowRequestTableField[3]; //每行3个字段
        wrti[0] = new WorkflowRequestTableField();
        wrti[0].setFieldName("cl3");//
        wrti[0].setFieldValue("11");
        wrti[0].setView(true);
        wrti[0].setEdit(true);

        wrti[1] = new WorkflowRequestTableField();
        wrti[1].setFieldName("cl1111");//
        wrti[1].setFieldValue("2");
        wrti[1].setView(true);
        wrti[1].setEdit(true);

        wrtri[0] = new WorkflowRequestTableRecord();
        wrtri[0].setWorkflowRequestTableFields(wrti);

        wdti[1] = new WorkflowDetailTableInfo();
        wdti[1].setWorkflowRequestTableRecords(wrtri);//加入明细表2的数据
        //明细表2 end
*/
        WorkflowBaseInfo wbi = new WorkflowBaseInfo();
        wbi.setWorkflowId("54027");//workflowid 5 代表内部留言

        WorkflowRequestInfo wri = new WorkflowRequestInfo();//流程基本信息
        wri.setCreatorId("110");//创建人id
//        wri.setRequestLevel("2");//0 正常，1重要，2紧急
        wri.setRequestName("测试QDN");//流程标题
        wri.setWorkflowMainTableInfo(wmi);//添加主字段数据
        wri.setWorkflowBaseInfo(wbi);
//        wri.setWorkflowDetailTableInfos(wdti);

        //执行创建流程接口

        WorkflowServiceLocator workflowServiceLocator = new WorkflowServiceLocator();
//        workflowServiceLocator.setWorkflowServiceHttpPortEndpointAddress("http://192.168.68.172:8008/services/WorkflowService");
        WorkflowServicePortType workflowServiceHttpPort = workflowServiceLocator.getWorkflowServiceHttpPort();
        String requestid = workflowServiceHttpPort.doCreateWorkflowRequest(wri, 110);
        System.out.println("requestid:"+requestid);
    }

}
