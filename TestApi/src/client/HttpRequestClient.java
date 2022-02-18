package client;

import DTO.TestEAPDTO;
import DTO.resultVO;
import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.RequestBuilder;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.*;
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
    private final static String fileDecryptionURL = "http://192.168.68.175:8081/sec-server/s/rs/uni/";
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
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost post = new HttpPost(fileDecryptionURL);
        File file = new File("D:\\13.xlsx");
        post.addHeader("method~name", "fileDecryptionRest"); //文件解密
        post.addHeader("data~fileOffset", "0");
        post.addHeader("data~counSize", file.length()+"");
        InputStream in = new FileInputStream(file);

        AbstractHttpEntity entity = new InputStreamEntity(in);
        post.setEntity(entity);

        CloseableHttpResponse response = httpclient.execute(post);
        String result = response.getFirstHeader("data~returnFlag").getValue();
        if("0".equals(result)){//0 表示成功
            System.out.println("解密成功");
//            OutputStream out = new FileOutputStream(new File("D:\\jiemi.txt"));

            InputStream ins = response.getEntity().getContent();
            InputStreamReader inputStreamReader = new InputStreamReader(ins,"UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String line;
            while ((line = bufferedReader.readLine()) != null){{
                System.out.println(line);
            }

            }
            /*byte[] bs = new byte[1024];
            int len = 0;
            while((len=ins.read(bs))>-1){
                out.write(bs, 0, len);
            }*/
//            out.flush();
//            out.close();
        }
        /*HttpResponse httpResponse = httpRequestClient.doPostResp(testEAP, json);
        HttpEntity entity = httpResponse.getEntity();
        if (entity != null) {
            String result = EntityUtils.toString(entity, "UTF-8");
            resultVO resultVO = JSON.parseObject(result, resultVO.class);
            System.out.println(result);
        }*/
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