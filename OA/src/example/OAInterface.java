/*
package weaver.interfaces.workflow.action.javacode;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import com.api.formmode.page.util.Util;
import mypackage.MergeDataRequest_MergeDataRequest;
import mypackage.MergeDataResponse_MergeDataResponse;
import mypackage.TIPTOPServiceGateWayLocator;
import mypackage.TIPTOPServiceGateWayPortType_PortType;
import weaver.conn.RecordSet;
import weaver.general.BaseBean;
import weaver.interfaces.workflow.action.Action;
import weaver.soa.workflow.request.Property;
import weaver.soa.workflow.request.RequestInfo;
import weaver.interfaces.dynax.action.GetReturn;
*/
/**
 * 在线自定义action接口
 *//*

public class Action20211218095807 extends BaseBean implements Action {

    @Override
    public String execute(RequestInfo requestinfo) {
        String actionResult = Action.SUCCESS;
        RecordSet rs = new RecordSet();
        // 表单名称
        String tablename = requestinfo.getRequestManager().getBillTableName();
        // 请求ID
        String requestid = requestinfo.getRequestid();
        // 存储流程主表字段的数据mainTableMap
        Map<String, String> mainTableMap = new HashMap<String, String>();
        // 返回值
        HashMap<String, String> dataMap = new HashMap<String, String>();
        // 获取表单主字段信息
        Property[] properties = requestinfo.getMainTableInfo().getProperty();
        for (int i = 0; i < properties.length; i++) {
            // 主字段名称
            String mainName = properties[i].getName();
            // 主字段对应的值
            String mainValue = Util.null2String(properties[i].getValue());
            // 主字段存储到mainTableMap中
            mainTableMap.put(mainName, mainValue);
            writeLog(mainName + "： " + mainValue);
        }
        // 获取需要传输的流程数据
        // 申请人
        String pmcoriu = mainTableMap.get("sqr");
        //工号
        String sqr = mainTableMap.get("sqr");
        String gh = GetReturn.getSqrName(sqr);
        // 申请部门
        String pmcorig = mainTableMap.get("sqbm");
        // 申请时间
        String pmccrat = mainTableMap.get("sqrq");
        // 厂商分类
        String pmcud04 = mainTableMap.get("csfl");
        // 税号
        String pmc24 = mainTableMap.get("sh");
        // 供应厂商编号
        String pmc01 = mainTableMap.get("gycsbh");
        // 厂商分类
        //String pmc02 = mainTableMap.get("csfl");
        // 资料性质
        String pmc14 = mainTableMap.get("zlxz");
        // 厂商性质
        String pmc30 = mainTableMap.get("csxz");
        // 供应商名称
        String pmc081 = mainTableMap.get("gysmc");
        // 供应商简称
        String pmc03 = mainTableMap.get("jc");
        // 付款厂商编号
        String pmc04 = mainTableMap.get("fkcsbh");
        // 银行代号
        String q_nnt = mainTableMap.get("yxmc");
        // 出货厂商编号
        String pmc901 = mainTableMap.get("chcsbh");
        // 供应商地址
        String pmc091 = mainTableMap.get("gysdz");
        //承认日期
        String pmcud13 = mainTableMap.get("crrq");
        // 营运中心
        String pmc930 = mainTableMap.get("yyzx");
        // 付款方式
        String pmc17 = mainTableMap.get("fkfs");
        // 惯用价格条件
        String pmc49 = mainTableMap.get("gyjgtj");
        // 惯用币种
        String pmc22 = mainTableMap.get("gybz");
        // 惯用税种
        String pmc47 = mainTableMap.get("gysz");
        // 银行名称
        String pmc55 = mainTableMap.get("yxmc");
        // 银行账号
        String pmc56 = mainTableMap.get("yxzh");
        //swiftcode
        String pmc11 = mainTableMap.get("swiftcode");
        //送货地址
        String pmc15 = mainTableMap.get("shdz");
        //收款地址
        String pmc16 = mainTableMap.get("skdz");
        //status
        String l_status = "a";
        //"+ pmc930 +"
        try {
            TIPTOPServiceGateWayPortType_PortType service = new TIPTOPServiceGateWayLocator()
                    .getTIPTOPServiceGateWayPortType(new URL("http://192.168.68.157/web/ws/r/aws_ttsrv2"));
            String strxml = "<Request>";
            strxml += "<Access>";
            strxml += "<Authentication user='"+gh+"' password=\"tiptop\" />";
            strxml += "<Organization name='"+pmc930+"'/>";
            strxml += "<Locale language=\"zh_CN\"/>";
            strxml += "<Connection application=\"apmi600\" source = \"1234\"/>";
            strxml += "<Appdevice appid=\"Dynax-FWOA-apmi600\" appmodule=\"Dynax-FWOA\" timestamp=\"2021-01-01 00:00:00\"/>";
            strxml += "</Access>";
            strxml += "<RequestContent>";
            strxml += "<Parameter>";
            strxml += "<Record>";
            strxml += "<Document>";
            strxml += "<RecordSet id=\"1\">";
            strxml += "<Master name=\"Master\">";
            strxml += "<Record>";
            // 申请人
            strxml += "<Field name=\"pmcoriu\" value=\"" + pmcoriu + "\" />";
            // 申请部门
            strxml += "<Field name=\"pmcorig\" value=\"" + pmcorig + "\" />";
            // 申请时间
            strxml += "<Field name=\"pmccrat\" value=\"" + pmccrat + "\" />";
            // 厂商分类
            strxml += "<Field name=\"pmcud04\" value=\"" + pmcud04 + "\" />";
            // 税号
            strxml += "<Field name=\"pmc24\" value=\"" + pmc24 + "\" />";
            // 供应厂商编号
            strxml += "<Field name=\"pmc01\" value=\"" + pmc01 + "\" />";
            // 厂商分类-作废
            //strxml += "<Field name=\"pmc02\" value=\"" + pmc02 + "\" />";
            // 资料性质
            strxml += "<Field name=\"pmc14\" value=\"" + pmc14 + "\" />";
            // 厂商性质
            strxml += "<Field name=\"pmc30\" value=\"" + pmc30 + "\" />";
            // 供应商名称
            strxml += "<Field name=\"pmc081\" value=\"" + pmc081 + "\" />";
            // 供应商简称
            strxml += "<Field name=\"pmc03\" value=\"" + pmc03 + "\" />";
            // 付款厂商编号
            strxml += "<Field name=\"pmc04\" value=\"" + pmc04 + "\" />";
            // 银行代号
            strxml += "<Field name=\"q_nnt\" value=\"" + q_nnt + "\" />";
            // 出货厂商编号
            strxml += "<Field name=\"pmc901\" value=\"" + pmc901 + "\" />";
            // 供应商地址
            strxml += "<Field name=\"pmc091\" value=\"" + pmc091 + "\" />";
            //承认日期
            strxml += "<Field name=\"pmcud13\" value=\"" + pmcud13 + "\" />";
            // 资料来源（营运中心）
            strxml += "<Field name=\"pmc930\" value=\"" + pmc930 + "\" />";
            // 付款方式
            strxml += "<Field name=\"pmc17\" value=\"" + pmc17 + "\" />";
            // 惯用价格条件
            strxml += "<Field name=\"pmc49\" value=\"" + pmc49 + "\" />";
            // 惯用币种
            strxml += "<Field name=\"pmc22\" value=\"" + pmc22 + "\" />";
            // 惯用税种
            strxml += "<Field name=\"pmc47\" value=\"" + pmc47 + "\" />";
            // 银行账号
            strxml += "<Field name=\"pmc56\" value=\"" + pmc56 + "\" />";
            // 银行名称
            strxml += "<Field name=\"pmc55\" value=\"" + pmc55 + "\" />";
            //SWIFTCODE
            strxml += "<Field name=\"pmc11\" value=\"" + pmc11 + "\" />";
            //送货地址
            strxml += "<Field name=\"pmc15\" value=\"" + pmc15 + "\" />";
            //收款地址
            strxml += "<Field name=\"pmc16\" value=\"" + pmc16 + "\" />";
            //status
            strxml += "<Field name=\"l_status\" value=\"" + l_status + "\" />";
            // OA流程id
            strxml += "<Field name=\"pmcud05\" value=\"" + requestid + "\" />";
            strxml += "</Record>";
            strxml += "</Master>";
            strxml += "</RecordSet>";
            strxml += "</Document>";
            strxml += "</Record>";
            strxml += "</Parameter>";
            strxml += "</RequestContent>";
            strxml += "</Request>";
            writeLog("供应商申请与建立流程-" + requestid + "-TIPTOP传输值：" + strxml);
            MergeDataRequest_MergeDataRequest Request = new MergeDataRequest_MergeDataRequest();
            Request.setRequest(strxml);
            MergeDataResponse_MergeDataResponse returnString = service.mergeData(Request);
            writeLog("供应商申请与建立流程-" + requestid + "-TIPTOP传输返回值：" + returnString.getResponse());
            dataMap = GetReturn.getReturn(returnString.getResponse());
            String code = dataMap.get("code");
            if ("0".equals(code)) {
                String description = dataMap.get("description");
                // 抛转成功
                rs.execute("update " + tablename + " set sfcsderp = '1',gycsbh='"+description+"'  where requestId='" + requestid + "'");

            } else {
                // 抛转失败
                String description = dataMap.get("description");
                String str = "数据传输失败：" + description + "，请联系系统管理员！";
                requestinfo.getRequestManager().setMessageid(System.currentTimeMillis() + "");
                requestinfo.getRequestManager().setMessagecontent(str);
                actionResult = Action.FAILURE_AND_CONTINUE;
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return actionResult;
    }

}*/
