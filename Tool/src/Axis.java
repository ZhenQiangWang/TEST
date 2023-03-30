import org.apache.axis2.AxisFault;
import org.apache.axis2.Constants;
import org.apache.axis2.client.Options;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.namespace.QName;

public class Axis {
    public static void main(String[] args) throws Exception {
        // 创建ServiceClient对象
        ServiceClient serviceClient = new ServiceClient();
        Options options = new Options();

        // 设置服务地址和超时时间
        options.setTo(new org.apache.axis2.addressing.EndpointReference("http://192.168.68.57:7003/mycim2/services/GetLotInfoService"));
        options.setTimeOutInMilliSeconds(60000);

        // 设置SOAPAction头信息
        options.setAction("http://xml.fa-software.com/mycim/wsdd/");

        // 设置HTTP连接相关的参数
        options.setProperty(HTTPConstants.REUSE_HTTP_CLIENT, true);
        options.setProperty(HTTPConstants.CHUNKED, false);
        options.setProperty(HTTPConstants.CONNECTION_TIMEOUT, 10000);
        options.setProperty(HTTPConstants.SO_TIMEOUT, 10000);
        options.setProperty(HTTPConstants.HTTP_PROTOCOL_VERSION, HTTPConstants.HEADER_PROTOCOL_10);

        // 设置序列化格式
        options.setProperty(Constants.Configuration.MESSAGE_TYPE, HTTPConstants.MEDIA_TYPE_APPLICATION_JSON);

        // 设置请求参数
        OMElement request = AXIOMUtil.stringToOM("<GetLotInfoService xmlns=\"http://tempuri.org/\"><lotId>your_lot_id</lotId></GetLotInfoService>");

        // 发送请求
        OMElement response = serviceClient.sendReceive(request);

        // 获取返回结果
        String json = response.getFirstElement().getText();

        System.out.println("JSON Response: " + json);
    }
}
