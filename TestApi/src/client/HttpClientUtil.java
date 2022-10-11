package client;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

import com.alibaba.fastjson.JSON;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;


public class HttpClientUtil {

    private final static String CONTENT_TYPE_TEXT_JSON = "text/json";
    private final static String EAPURL = "http://192.168.68:8080";
//    private final static String TEST = "http://192.168.68.60:7001/mycim2/roleAction.do?reqCode=qryRoleGrantTree&_dc=1654052095499&sys=OA&roleid=85013";
    private final static String TEST = "http://192.168.68.95/mycim2/roleAction.do?reqCode=qryRoleGrantTree&_dc=1654052095499&sys=OA&roleid=85013";
    private final static String LOGIN = "http://192.168.90.160:7001/mycim2/securitylogin.do?Content-Type";


    public static void main(String[] args) throws IOException {
        HttpClientUtil httpClientUtil = new HttpClientUtil();
        String save = "{\"params\":{\"labelDesc\":\"批次号1\",\"labelFieldName\":\"LOTID\",\"labelFieldValue\":\"record.data.lotId.split('_')[0]\"}}";
        String json = "{\"username\":\"admin\",\"password\":\"dynax\",\"facility\":\"1\",\"language\",\"CN\",\"reqCode\":\"login\"}";
//       httpClientUtil.postRequest(LOGIN,json);
        String s = httpClientUtil.postRequest(TEST, json);


        System.out.println("");
    }

    public static String postRequest(String url, Map<String, Object> param) throws ClientProtocolException, IOException{

        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");


        String parameter = JSON.toJSONString(param);

        StringEntity se = new StringEntity(parameter);
        se.setContentType(CONTENT_TYPE_TEXT_JSON);
        httpPost.setEntity(se);

        CloseableHttpResponse response = client.execute(httpPost);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity, "UTF-8");

        return result;
    }

    public static String postRequest(String url, String param) throws ClientProtocolException, IOException{

        CloseableHttpClient client = HttpClients.createDefault();

        HttpPost httpPost = new HttpPost(url);
        httpPost.setHeader("Content-Type", "application/json;charset=UTF-8");


        String parameter = JSON.toJSONString(param);

        StringEntity se = new StringEntity(parameter);
        se.setContentType(CONTENT_TYPE_TEXT_JSON);
        httpPost.setEntity(se);

        CloseableHttpResponse response = client.execute(httpPost);
        HttpEntity entity = response.getEntity();
        String result = EntityUtils.toString(entity, "UTF-8");
        return result;
    }

}