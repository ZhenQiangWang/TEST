//package weaver.interfaces.workflow.action.javacode;
//
//import java.net.URL;
//import java.util.HashMap;
//import java.util.Map;
//
//import com.api.formmode.page.util.Util;
//import mypackage.MergeDataRequest_MergeDataRequest;
//import mypackage.MergeDataResponse_MergeDataResponse;
//import mypackage.TIPTOPServiceGateWayLocator;
//import mypackage.TIPTOPServiceGateWayPortType_PortType;
//import weaver.conn.RecordSet;
//import weaver.general.BaseBean;
//import weaver.interfaces.workflow.action.Action;
//import weaver.soa.workflow.request.Cell;
//import weaver.soa.workflow.request.DetailTable;
//import weaver.soa.workflow.request.Property;
//import weaver.soa.workflow.request.RequestInfo;
//import weaver.soa.workflow.request.Row;
//import weaver.interfaces.dynax.action.GetReturn;
//
///**
// * 在线自定义action接口
// */
//public class Action20230707083733 extends BaseBean implements Action {
//    /**
//     * 流程路径节点后选择aciton后,会在节点提交后执行此方法。
//     */
//    public String execute(RequestInfo request) {
//        String actionResult = Action.SUCCESS;
//        try {
//            // 获取表单主字段信息
//            Property[] properties = request.getMainTableInfo().getProperty();
//            // 存储流程主表字段的数据mainTableMap
//            Map<String, String> mainTableMap = new HashMap<String, String>();
//            for (int i = 0; i < properties.length; i++) {
//                // 主字段名称
//                String mainName = properties[i].getName();
//                // 主字段对应的值
//                String mainValue = Util.null2String(properties[i].getValue());
//                // 主字段存储到mainTableMap中
//                mainTableMap.put(mainName, mainValue);
//                writeLog(mainName + "： " + mainValue);
//            }
//            //TECN编号
//            String lcbh = mainTableMap.get("lcbh");
//            //TECN执行工序
//            String tecnzxgx = mainTableMap.get("tecnzxgx");
//            //TECN涉及批次
//            String tecnsjpc = mainTableMap.get("tecnsjpc");
//            String endpoint = "http://192.168.82.85:7001/mycim2/services/TECNService?wsdl";
//            Service service = new Service();
//            Call call = null;
//            call = (Call) service.createCall();
//            call.setTargetEndpointAddress(endpoint);
//            call.setOperationName("TECNService");//WSDL里面描述的接口名称
//            call.addParameter("TecnInfo", org.apache.axis.encoding.XMLType.XSD_DATE, javax.xml.rpc.ParameterMode.IN);//接口的参数
//            call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);//设置返回类型
//            String eqpId = "PDDB01";
//            String result = (String) call.invoke(new Object[]{eqpId});//给方法传递参数，并且调用方法
//
//        } catch (Exception e) {
//            request.getRequestManager().setMessageid("90001");
//            request.getRequestManager().setMessagecontent("系统异常终止流程提交！");
//            actionResult = Action.FAILURE_AND_CONTINUE;
//        }
//        return actionResult;
//    }
//}
