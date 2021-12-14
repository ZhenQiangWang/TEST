package client;

import DTO.TestEAPDTO;
import DTO.resultVO;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

/**
 * @author wxweven
 */
public class HttpRequestClient {
    /**
     * 1:success
     * 0:fail
     */
    // 默认 连接/读取数据 超时时间都是 10s
    private static final int DEFAULT_CONNECT_TIMEOUT = 1000;
    private static final int DEFAULT_READ_TIMEOUT = 1000;
    private final String EAPURL = "http://localhost:8080";
    private final static String TEST = "http://192.168.90.160:7001/mycim2/labelField.do?action=saveOrUpdate";
    private final static String LOGIN = "http://192.168.90.160:7001/mycim2/securitylogin.do?Content-Type";
    private final static String testEAP = "http://192.168.68.219:8100/tms/DynaxInterface/GetMeasureData";

    private HttpClient httpClient = HttpClientBuilder.create()
            .setDefaultRequestConfig(getRequestConfig(DEFAULT_CONNECT_TIMEOUT, DEFAULT_READ_TIMEOUT))
            .build();


    private RequestConfig getRequestConfig(int connectTimeout, int readTimeout) {
        return RequestConfig.custom()
                .setConnectTimeout(connectTimeout)
                .setConnectionRequestTimeout(connectTimeout)
                .setSocketTimeout(readTimeout)
                .build();
    }

    public static void main(String[] args) throws Exception {
        HttpRequestClient httpRequestClient = new HttpRequestClient();
//        String json = "{\"data\":{\"lotQty\":\"78.0\",\"materialBoxBarcode\":[\"wzq\",\"mconwo\"],\"materialCode\":\"01.01.01.30096T\",\"materialConsumeFlag\":\"Y\",\"materialNo\":[\"03.06.04.00004A\",\"03.06.03.00019A\"],\"priority\":\"\",\"processId\":\"D1H27110C1_TRAY\",\"product\":\"D1H27110C1\",\"productType\":\"Production\",\"recipeName\":\"UI-780P\",\"routeDesc\":\"贴片\",\"routeId\":\"D2130001\",\"stepDesc\":\"领料核对\",\"stepId\":\"TM\",\"testProgram\":\"UI-780P\",\"workOrder\":\"KSWOE-19100002\"},\"errorCode\":0,\"errorMsg\":\"成功\"}";
//        String json = "{\"username\":\"admin\",\"password\":\"dynax\",\"facility\":\"1\",\"language\",\"CN\",\"reqCode\":\"login\"}";
        TestEAPDTO testEAPDTO = new TestEAPDTO();
        testEAPDTO.setEqpId("11");
        testEAPDTO.setLotId("333");
        testEAPDTO.setPortId("jiojoi");
        String json = JSON.toJSONString(testEAPDTO);
//        String json = "{\"eqpId\": \"11\",\"lotId\": \"123\",\"portId\": \"1\"}";
        HttpResponse httpResponse = httpRequestClient.doPostResp(testEAP, json);
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            String result = EntityUtils.toString(entity, "UTF-8");
            resultVO resultVO = JSON.parseObject(result, resultVO.class);
            System.out.println(result);
        }
    }

    /**
     * 发送 GET 请求，不带参数
     *
     * @param url
     * @return
     */
    public String doGet(String url) {
        return null;
//        return doGet(url, new HashMap<>());
    }

    /**
     * 发送 GET 请求，不带参数
     *
     * @param uri
     * @return
     */
    public String doGet(URI uri) {
        return null;
//        return doGet(uri, new HashMap<>());
    }

    /**
     * 发送 GET 请求，K-V 形式参数
     *
     * @param url
     * @param params
     * @return
     */
    public String doGet(String url, Map<String, String> params) {
        RequestBuilder reqBuilder = RequestBuilder.get(url);
        return doGet(reqBuilder, params);
    }

    /**
     * 发送 GET 请求，K-V 形式参数
     *
     * @param uri
     * @param params
     * @return
     */
    public String doGet(URI uri, Map<String, String> params) {
        RequestBuilder reqBuilder = RequestBuilder.get(uri);
        return doGet(reqBuilder, params);
    }

    public String doGet(RequestBuilder reqBuilder, Map<String, String> params) {
//        reqBuilder.addHeader(HttpHeaders.AUTHORIZATION, auth.getAuth());

        for (Map.Entry<String, String> entry : params.entrySet()) {
            reqBuilder.addParameter(entry.getKey(), entry.getValue());
        }

        try {
            HttpResponse resp = httpClient.execute(reqBuilder.build());
            return EntityUtils.toString(resp.getEntity(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.out.println("doGet 异常: reqBuilder={}, params={}");
            return null;
        }
    }

    /***
     * 发送 GET 请求，不带参数，返回指定类型的 class
     * @param url 请求的 url
     * @param responseType 返回类型
     * @param <T>
     * @return
     */
    public <T> T getForObject(String url, Class<T> responseType) {
        RequestBuilder reqBuilder = RequestBuilder.get(url);
        return getForObject(reqBuilder, responseType);
    }

    /***
     * 发送 GET 请求，不带参数，返回指定类型的 class
     * @param uri 请求的 uri
     * @param responseType 返回类型
     * @param <T>
     * @return
     */
    public <T> T getForObject(URI uri, Class<T> responseType) {
        RequestBuilder reqBuilder = RequestBuilder.get(uri);
        return getForObject(reqBuilder, responseType);
    }

    public <T> T getForObject(RequestBuilder reqBuilder, Class<T> responseType) {
//        reqBuilder.addHeader(HttpHeaders.AUTHORIZATION, auth.getAuth());

        try {
            HttpResponse resp = httpClient.execute(reqBuilder.build());
            String result = EntityUtils.toString(resp.getEntity(), StandardCharsets.UTF_8);

            return JSON.parseObject(result, responseType);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * 发送 POST 请求，JSON 形式
     *
     * @param url
     * @param json json字符串
     * @return
     */
    public String doPost(String url, String json) throws Exception {
        try {
            HttpResponse resp = this.exchange("POST", url, json);
            return EntityUtils.toString(resp.getEntity(), StandardCharsets.UTF_8);
        } catch (IOException e) {
            return null;
        }
    }

    /**
     * 发送 POST 请求，JSON 形式，返回 HttpResponse
     *
     * @param url
     * @param json json字符串
     * @return
     */
    public HttpResponse doPostResp(String url, String json) throws Exception {
        try {
            return this.exchange("POST", url, json);
        } catch (Exception e) {
            System.out.println("doGet 异常: reqBuilder={}, params={}");
            throw new Exception(e);
        }
    }

    /**
     * 发送 PUT 请求，JSON 形式
     *
     * @param url
     * @param json json字符串
     * @return
     */
    public HttpResponse doPut(String url, String json) throws Exception {
        return this.exchange("PUT", url, json);
    }

    /**
     * 发送 PUT 请求，JSON 形式
     *
     * @param url
     * @param json json字符串
     * @return
     */
    public HttpResponse doDelete(String url, String json) throws Exception {
        return this.exchange("DELETE", url, json);
    }

    public HttpResponse exchange(String method, String url, String json) throws Exception {
        RequestBuilder reqBuilder = RequestBuilder.create(method)
                .setUri(url)
//                .addHeader(HttpHeaders.AUTHORIZATION, auth.getAuth())
                .addHeader("Accept", ContentType.APPLICATION_JSON.toString())
                .addHeader("Content-type", ContentType.APPLICATION_JSON.toString());

        if (json != null) {
            reqBuilder.setEntity(new StringEntity(json, ContentType.APPLICATION_JSON));
        }

        try {
            return httpClient.execute(reqBuilder.build());
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new Exception(e);
        }
    }
}