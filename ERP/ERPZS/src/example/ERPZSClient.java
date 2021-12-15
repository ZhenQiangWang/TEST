package example;

import com.alibaba.fastjson.JSON;
import mypackage.*;
import org.json.JSONObject;
import org.json.XML;


public class ERPZSClient {
  public static void main(String[] argv) {
    try {
      TIPTOPServiceGateWayLocator tiptopServiceGateWayLocator = new TIPTOPServiceGateWayLocator();
      TIPTOPServiceGateWayPortType_PortType tiptopServiceGateWayPortType = tiptopServiceGateWayLocator.getTIPTOPServiceGateWayPortType();
      QueryDataRequest_QueryDataRequest queryDataRequest_queryDataRequest = new QueryDataRequest_QueryDataRequest();
     /* queryDataRequest_queryDataRequest.setRequest("<Request>\n" +
              "  <Access>\n" +
              "    <!--接口登陆用户【必要】与密码【必要】-->\n" +
              "    <Authentication user=\"tiptop\" password=\"tiptop\" />\n" +
              "    <!--登陆的营运中心【必要】大写-->\n" +
              "    <Organization name=\"DX\" />\n" +
              "    <!--接口语言别【必要】-->\n" +
              "    <Locale language=\"zh_CN\"/>\n" +
              "    <!--接入ERP的程序信息：程序号(对应ERP中p_qry建立的查询方案名)【必要】以及表名【非必要】-->\n" +
              "    <Connection application=\"q_ima\" source = \"1234\" />\n" +
              "    <!--调用接口的外部产品信息：  外部产品信息，格式为公司英文简写+产品简写+产品作业，建议均使用字母【必要】；模块别【非必要】调用时间【非必要】 -->\n" +
              "    <Appdevice appid=\"XXXX-XXXX-XXX\" appmodule=\"\" timestamp=\"2021-01-01 00:00:00\" />\n" +
              "  </Access>\n" +
              "  <RequestContent>\n" +
              "    <Parameter>\n" +
              "      <Record>\n" +
              "        <Document>\n" +
              "          <RecordSet id=\"1\">\n" +
              "            <!-- name值固定 -->\n" +
              "            <Master name=\"Master\">\n" +
              "              <!-- 只能是一行记录 -->\n" +
              "              <Record>\n" +
              "                <!-- 必要栏位，name值固定 此为查询数据的过虑条件1 -->\n" +
              "                <Field name=\"arg1\" value=\"qwfnakdnfsa\" />\n" +
              "                <!-- 可选栏位，name值固定 此为查询数据的过虑条件2 -->\n" +
              "                <Field name=\"arg2\" value=\"1\" />\n" +
              "                <!-- 可选栏位，name值固定 此为查询数据的过虑条件3 -->\n" +
              "                <Field name=\"arg3\" value=\"1\" />\n" +
              "                <!-- 可选栏位，name值固定 此为查询数据的过虑条件4 -->\n" +
              "                <Field name=\"arg4\" value=\"1\" />\n" +
              "                <!-- 可选栏位，name值固定 此为查询数据的过虑条件5 -->\n" +
              "                <Field name=\"arg5\" value=\"1\" />\n" +
              "              </Record>\n" +
              "            </Master>\n" +
              "          </RecordSet>\n" +
              "        </Document>\n" +
              "      </Record>\n" +
              "    </Parameter>\n" +
              "  </RequestContent>\n" +
              "</Request>\n");


      QueryDataResponse_QueryDataResponse queryDataResponse_queryDataResponse = tiptopServiceGateWayPortType.queryData(queryDataRequest_queryDataRequest);
      String response = queryDataResponse_queryDataResponse.getResponse();
      JSONObject xmlJSONObj = XML.toJSONObject(response);
      QueryDataVo queryDataVo = JSON.parseObject(xmlJSONObj.toString(), QueryDataVo.class);*/
//      System.out.println(response);

      /*String completionStr = "<Request>\n" +
              "\t<Access>\n" +
              "\t\t<Authentication password=\"tiptop\" user=\"tiptop\"/>\n" +
              "\t\t<Organization name=\"营运中心\"/>\n" +
              "\t\t<Locale language=\"zh_CN\"/>\n" +
              "\t\t<Connection source=\"1234\" application=\"asfi300\"/>\n" +
              "\t\t<Appdevice timestamp=\"2021-01-01 00:00:00\" appmodule=\"\" appid=\"DJ-IMES-BGD\"/>\n" +
              "\t</Access>\n" +
              "\t<RequestContent>\n" +
              "\t\t<Parameter>\n" +
              "\t\t\t<Record>\n" +
              "\t\t\t\t<Document>\n" +
              "\t\t\t\t\t<RecordSet id=\"1\">\n" +
              "\t\t\t\t\t\t<Master name=\"Master\">\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"BGD_01\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"status\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srf01\" value=\"\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srf02\" value=\"2021/08/30\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srforiu\" value=\"20761\"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t</Master>\n" +
              "\t\t\t\t\t\t<Detail name=\"Detail-A\">\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg16\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg03\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srgud02\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg04\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg05\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs10\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg06\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg07\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg10\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg19\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t\t<Record>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"formid\" value=\"qwfnakdnfsa\"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg16\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg03\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srgud02\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg04\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg05\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"sfs10\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg06\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg07\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg10\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t\t<Field name=\"srg19\" value=\" \"/>\n" +
              "\t\t\t\t\t\t\t</Record>\n" +
              "\t\t\t\t\t\t</Detail>\n" +
              "\t\t\t\t\t</RecordSet>\n" +
              "\t\t\t\t</Document>\n" +
              "\t\t\t</Record>\n" +
              "\t\t</Parameter>\n" +
              "\t</RequestContent>\n" +
              "</Request>\n";

      CreateWOWorkReportDataRequest_CreateWOWorkReportDataRequest createWOWorkReportDataRequest_createWOWorkReportDataRequest = new CreateWOWorkReportDataRequest_CreateWOWorkReportDataRequest();
      createWOWorkReportDataRequest_createWOWorkReportDataRequest.setRequest(completionStr);
      CreateWOWorkReportDataResponse_CreateWOWorkReportDataResponse woWorkReportData = tiptopServiceGateWayPortType.createWOWorkReportData(createWOWorkReportDataRequest_createWOWorkReportDataRequest);
      System.out.println(woWorkReportData.getResponse());*/

      String strxml = "<Request><Access><Authentication user='' password=\"tiptop\" /><Organization name='' /><Locale language=\"zh_CN\"/><Connection application=\"axmi221\" source = \"1234\"/><Appdevice appid=\"Dynax-FWOA-axmi221\" appmodule=\"Dynax-FWOA\" timestamp=\"2021-01-01 00:00:00\"/></Access><RequestContent><Parameter><Record><Document><RecordSet id=\"1\"><Master name=\"Master\"><Record><Field name=\"occ01\" value=\"\" /><Field name=\"l_status\" value=\"2\" /></Record></Master></RecordSet></Document></Record></Parameter></RequestContent></Request>";
      MergeDataRequest_MergeDataRequest Request = new MergeDataRequest_MergeDataRequest();
      Request.setRequest(strxml);
      MergeDataResponse_MergeDataResponse mergeDataResponse_mergeDataResponse = tiptopServiceGateWayPortType.mergeData(Request);
      System.out.println(mergeDataResponse_mergeDataResponse);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
