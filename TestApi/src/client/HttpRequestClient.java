package client;

import DTO.TestEAPDTO;
import DTO.resultVO;
import com.alibaba.fastjson.JSON;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfImportedPage;
import com.itextpdf.text.pdf.PdfReader;
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
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.Map;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;

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
//        File file = new File("C://Users//zhenqiang.wang//Desktop//SOP//设备组定义.pdf");
        File file = new File("D://新建文件夹//PWWB03//RMS-Recipe-PWWB03-BB-60-10EC-001-V0-20230214-135945.xls");
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
            InputStream inputStream = response.getEntity().getContent();
            InputStreamReader inputStreamReader = new InputStreamReader(inputStream,"UTF-8");
            // 创建工作簿对象
//            Workbook workbook = new HSSFWorkbook(inputStream);
            Workbook workbook = WorkbookFactory.create(inputStream);

            // 创建文件输出流
            FileOutputStream outputStream = new FileOutputStream("D://新建文件夹//PWWB03//RMS-Recipe-PWWB03-BB-60-10EC-001-V0-20230214-135945_jiemi.xls");

            // 将工作簿写入到文件输出流中
            workbook.write(outputStream);

            // 关闭输出流和输入流
            outputStream.close();
            inputStream.close();

            /*// 创建 Document 对象
            Document document = new Document();

            // 创建 PdfWriter 并将 Document 对象写入文件
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("C://Users//zhenqiang.wang//Desktop//SOP//解密//设备组定义.pdf"));

            // 打开 Document 对象
            document.open();

            // 创建 PdfContentByte 对象
            PdfContentByte cb = writer.getDirectContent();

            // 使用 PdfWriter 将 InputStream 对象写入 PDF 文件
            PdfReader reader = new PdfReader(inputStream);
            for (int i = 1; i <= reader.getNumberOfPages(); i++) {
                document.newPage();
                PdfImportedPage page = writer.getImportedPage(reader, i);
                cb.addTemplate(page, 0, 0);
            }

            // 关闭 Document 对象和 InputStream 对象
            document.close();*/
            inputStream.close();
//            System.out.println("PDF 文件写入成功！");

        }
       /* DataColletcionVO dataColletcionVO = new DataColletcionVO();
        dataColletcionVO.setTrackInTime("2022-06-06 08:48:25");
        dataColletcionVO.setLotId("D2223013");
        dataColletcionVO.setEqpId("PVVI04");
        dataColletcionVO.setStepId("CDBPI");
//        String json = JSON.toJSONString(dataColletcionVO);
        String json = "{\"eqpId\":\"PVVI04\",\"lotId\":\"D2223013\",\"stepId\":\"CDBPI\",\"trackInTime\":\"2022-06-06 08:48:25\"}";
        HttpResponse httpResponse = httpRequestClient.doPostResp("http://192.168.68.219:8100/tms/DynaxInterface/GetMeasureData", json);
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