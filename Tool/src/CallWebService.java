import java.util.Date;
import java.text.DateFormat;
import org.apache.axis.client.Call;
import org.apache.axis.client.Service;
import javax.xml.namespace.QName;
import java.lang.Integer;
import java.util.HashMap;
import java.util.Map;
import javax.xml.rpc.ParameterMode;
import javax.xml.rpc.ServiceException;
import net.sf.json.JSONObject;

public class CallWebService {
    public static void main(String[] args) throws Exception {
//        String endpoint = "http://localhost:7001/mycim2/services/GetEqpStatusService?wsdl";
//        String endpoint = "http://localhost:7001/mycim2/services/TipTopMycimService?wsdl";
        String endpoint = "http://192.168.82.85:7001/mycim2/services/TECNService?wsdl";
        //直接引用远程的wsdl文件
        //以下都是套路
        Service service = new Service();
        Call call = (Call) service.createCall();
        call.setTargetEndpointAddress(endpoint);
//        call.setOperationName("GetEqpStatusService");//WSDL里面描述的接口名称
//        call.addParameter("GetEqpStatusService", org.apache.axis.encoding.XMLType.XSD_DATE, javax.xml.rpc.ParameterMode.IN);//接口的参数
        call.setOperationName("delTecn");//WSDL里面描述的接口名称
//        addTecn,completeTecn
        call.addParameter("TecnInfo", org.apache.axis.encoding.XMLType.XSD_DATE,
                javax.xml.rpc.ParameterMode.IN);//接口的参数
       /* call.setOperationName("GetProductListService");//WSDL里面描述的接口名称
        call.addParameter("GetProductListService", org.apache.axis.encoding.XMLType.XSD_DATE,
                ParameterMode.OUT);//不传参*/
        call.setReturnType(org.apache.axis.encoding.XMLType.XSD_STRING);//设置返回类型
//        String result = (String) call.invoke(new Object[]{});
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("lcbh","lcbh3");
        stringStringHashMap.put("tecnzxgx","DIE BONDING,WIREBONDING");
        stringStringHashMap.put("sqr","sqr");
        stringStringHashMap.put("tecnsjpc","D1928007,D1931005");
        JSONObject jsonObject = new JSONObject();
        for (Map.Entry<String, String> entry : stringStringHashMap.entrySet()) {
            jsonObject.put(entry.getKey(), entry.getValue());
        }


        String result = (String) call.invoke(new Object[]{jsonObject.toString()});//给方法传递参数，并且调用方法
        System.out.println("result is " + result);
    }
}
