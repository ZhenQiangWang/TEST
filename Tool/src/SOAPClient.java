import javax.xml.soap.*;

public class SOAPClient {
    public static void main(String[] args) throws Exception {
        // 创建SOAP连接工厂
        SOAPConnectionFactory soapConnectionFactory = SOAPConnectionFactory.newInstance();
        SOAPConnection soapConnection = soapConnectionFactory.createConnection();

        // 创建SOAP消息对象
        MessageFactory messageFactory = MessageFactory.newInstance();
        SOAPMessage soapMessage = messageFactory.createMessage();

        // 创建SOAP消息的部分
        SOAPPart soapPart = soapMessage.getSOAPPart();
        SOAPEnvelope envelope = soapPart.getEnvelope();
        envelope.addNamespaceDeclaration("ns", "http://webservice.namespace.com");
        SOAPBody soapBody = envelope.getBody();

        // 创建SOAP消息的请求参数
        SOAPElement soapElement = soapBody.addChildElement("eqpId", "ns");
        soapElement.setValue("123");

        // 创建SOAP消息的消息头
        MimeHeaders headers = soapMessage.getMimeHeaders();
        headers.addHeader("SOAPAction", "http://webservice.namespace.com/getEqpStatus");

        // 发送SOAP请求并获取响应
        String endpointUrl = "http://localhost:7001/mycim2/services/GetEqpStatusService";
        SOAPMessage soapResponse = soapConnection.call(soapMessage, endpointUrl);

        // 打印SOAP响应消息
        System.out.println("SOAP Response:");
        soapResponse.writeTo(System.out);
        System.out.println();

        // 关闭SOAP连接
        soapConnection.close();
    }
}
