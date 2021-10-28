
import com.alibaba.fastjson.JSON;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;

import javax.xml.namespace.QName;

import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.encoding.XMLType;

public class testCallWebService {

    public static void main(String[] args) {
        try {
            String endpoint = "http://192.168.90.160:7001/mycim2/services/TestWZQService";
            Service service = new Service();
            Call call = (Call) service.createCall();
            call.setTargetEndpointAddress(endpoint);
            String parametersName = "testJson"; 		// 参数名//对应的是 public String printWord(@WebParam(name = "settle_num") String settle_num);
//	            call.setOperationName("printWord");  		// 调用的方法名//当这种调用不到的时候,可以使用下面的,加入命名空间名
            call.setOperationName(new QName("http://WebXml.com.cn/", "testWZQWebService"));// 调用的方法名
            call.addParameter(parametersName, XMLType.XSD_STRING, ParameterMode.IN);//参数名//XSD_STRING:String类型//.IN入参
            call.setReturnType(XMLType.XSD_STRING); 	// 返回值类型：String
            ParamObject paramObject = new ParamObject();
            paramObject.setLotId("123");
            paramObject.setWorkOrderId("456");
            String message = JSON.toJSONString(paramObject);
            String result = (String) call.invoke(new Object[] { message });// 远程调用
            System.out.println("result is " + result);
        } catch (Exception e) {
            System.err.println(e.toString());
        }
    }
}
