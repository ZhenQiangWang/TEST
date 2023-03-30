import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Service.Mode;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPConstants;
import javax.xml.soap.SOAPFactory;
import javax.xml.soap.SOAPHeader;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPMessage;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;

import org.w3c.dom.Document;

/**
 * 在上面的代码中，我们使用Dispatch类来发送SOAP请求和接收SOAP响应。
 * 我们需要通过Service类创建一个Dispatch对象，并指定WebService的命名空间、服务名称、端口名称和消息类型。接着，
 * 我们可以使用createSOAPRequest()方法创建一个SOAP请求，该方法接受操作名称和参数值，并返回一个SOAPMessage对象。最后，
 * 我们使用invoke()方法发送请求，并将响应存储在SOAPMessage对象中。如果发生异常，我们将打印出堆栈跟踪信息。如果响应不为null，则我们可以使用extractContentAsDocument()方法提取响应正文并将其转换为Document对象，以便轻松地处理XML响应。我们可以使用getElementsByTagName()方法获取标签名称为return的元素，并使用getTextContent()方法获取元素的文本内容。最后，我们打印出Hold Code的值。
 *
 * 注意：这个代码示例中的命名空间、服务名称、端口名称和操作名称，需要根据具体的WebService接口而修改。
 *
 * 另外，该示例使用了Java原生的SOAP API来创建SOAP请求和解析响应。如果你不想使用Java原生的SOAP API，也可以使用第三方库来调用WebService接口，例如Apache CXF、Spring Web Services等。
 */

public class Main {
    public static final String endpoint = "http://localhost:7001/mycim2/services/GetEqpStatusService";
    public static final String namespace = "http://xml.fa-software.com/mycim/wsdd/";
    public static final String serviceName = "GetEqpStatusServiceService";
    public static final String portName = "GetEqpStatusService";
    public static final String operationName = "GetEqpStatusService";
    public static final String String = "D1935009";
    public static void main(String[] args) throws Exception {

        URL url = new URL(endpoint + "?wsdl");
        QName qname = new QName(namespace, serviceName);

        Service service = Service.create(url, qname);
        Dispatch<SOAPMessage> dispatch = service.createDispatch(new QName(namespace, portName), SOAPMessage.class, Mode.MESSAGE);

        SOAPMessage request = createSOAPRequest(operationName, String);
        SOAPMessage response = null;

        try {
            response = dispatch.invoke(request);
        } catch (WebServiceException e) {
            e.printStackTrace();
        }

        // 解析SOAP响应
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        response.writeTo(out);
        ByteArrayInputStream in = new ByteArrayInputStream(out.toByteArray());
       /* ObjectMapper mapper = new ObjectMapper();
        JsonNode jsonNode = mapper.readTree(in);

        // 获取JSON数据
        String json = jsonNode.get("GetHoldCodeResponse").get("return").asText();
        System.out.println("JSON Response: " + json);*/

        if (response != null) {
            Document doc = response.getSOAPPart().getEnvelope().getBody().extractContentAsDocument();
            String holdCode = doc.getElementsByTagName("return").item(0).getTextContent();
            System.out.println("Hold Code: " + holdCode);
        }
    }

    private static SOAPMessage createSOAPRequest(String operationName, String lotId) throws Exception {
        MessageFactory messageFactory = MessageFactory.newInstance(SOAPConstants.SOAP_1_1_PROTOCOL);
        SOAPMessage soapMessage = messageFactory.createMessage();

        SOAPFactory soapFactory = SOAPFactory.newInstance();
        SOAPHeader header = soapMessage.getSOAPHeader();
        if (header == null) {
            header = soapMessage.getSOAPPart().getEnvelope().addHeader();
        }

        SOAPBody body = soapMessage.getSOAPBody();
        QName bodyName = new QName(namespace, operationName, "ns1");
        SOAPBodyElement bodyElement = body.addBodyElement(bodyName);

        QName lotIdName = new QName("lotId");
        SOAPElement lotIdElement = soapFactory.createElement(lotIdName);
        lotIdElement.addTextNode(lotId);
        bodyElement.addChildElement(lotIdElement);

        soapMessage.saveChanges();

        return soapMessage;
    }
}
