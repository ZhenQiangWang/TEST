package client;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.*;

public class Decryption {
    public CloseableHttpResponse fileDecryption(String filePath) throws Exception {

        HttpRequestClient httpRequestClient = new HttpRequestClient();
        CloseableHttpClient httpclient = HttpClients.createDefault();
        HttpPost post = new HttpPost("http://192.168.68.175:8081/sec-server/s/rs/uni");
        File file = new File(filePath);
        post.addHeader("method~name", "fileDecryptionRest"); //文件解密
        post.addHeader("data~fileOffset", "0");
        post.addHeader("data~counSize", file.length()+"");
        InputStream in = new FileInputStream(file);

        AbstractHttpEntity entity = new InputStreamEntity(in);
        post.setEntity(entity);

        CloseableHttpResponse response = httpclient.execute(post);
        return response;
    }
}
