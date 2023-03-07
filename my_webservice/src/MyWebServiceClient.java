/*
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class MyWebServiceClient {
    public static void main(String[] args) throws Exception {
        // WebService WSDL 地址
        URL url = new URL("http://192.168.68.57:7003/mycim2/services/GetProductListService?wsdl");
        // 命名空间
        QName qname = new QName("http://xml.fa-software.com/mycim/wsdd/", "GetProductListService");
        // 创建服务对象
        Service service = Service.create(url, qname);
        // 获取接口对象

        MyWebService myWebService = service.getPort(MyWebService.class);
        // 调用接口方法
        String userName = myWebService.getUserNameById(123);
        System.out.println(userName);
    }
}
*/
