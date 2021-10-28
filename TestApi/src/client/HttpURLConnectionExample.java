package client;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class HttpURLConnectionExample {

    private final String USER_AGENT = "Mozilla/5.0";
    private final String EAPURL = "http://localhost:8080";

    public static void main(String[] args) throws Exception {

        HttpURLConnectionExample http = new HttpURLConnectionExample();

//        System.out.println("Testing 1 - Send Http GET request");
//        http.sendGet();

//        System.out.println("\nTesting 2 - Send Http POST request");
        http.sendPost();
//        http.sendEAPPost();
    }

    // HTTP GET请求
    private void sendGet() throws Exception {

        String url = "http://www.google.com/search?q=mkyong";

        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //默认值我GET
        con.setRequestMethod("GET");

        //添加请求头
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'GET' request to URL : " + url);
        System.out.println("Response Code : " + responseCode);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //打印结果
        System.out.println(response.toString());

    }

    // HTTP POST请求
    private void sendPost() throws Exception {

        String url = EAPURL;
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();

        //添加请求头
        con.setRequestMethod("POST");
//        con.setRequestProperty("User-Agent", USER_AGENT);
        con.setRequestProperty("Accept-Language", "en-US,en;q=0.5");

        String urlParameters = "{\n" +
                "\t\"data\": {\n" +
                "\t\t\"lotQty\": \"78.0\",\n" +
                "\t\t\"materialBoxBarcode\": [\"wzq\", \"mconwo\"],\n" +
                "\t\t\"materialCode\": \"01.01.01.30096T\",\n" +
                "\t\t\"materialConsumeFlag\": \"Y\",\n" +
                "\t\t\"materialNo\": [\"03.06.04.00004A\", \"03.06.03.00019A\"],\n" +
                "\t\t\"priority\": \"\",\n" +
                "\t\t\"processId\": \"D1H27110C1_TRAY\",\n" +
                "\t\t\"product\": \"D1H27110C1\",\n" +
                "\t\t\"productType\": \"Production\",\n" +
                "\t\t\"recipeName\": \"UI-780P\",\n" +
                "\t\t\"routeDesc\": \"贴片\",\n" +
                "\t\t\"routeId\": \"D2130001\",\n" +
                "\t\t\"stepDesc\": \"领料核对\",\n" +
                "\t\t\"stepId\": \"TM\",\n" +
                "\t\t\"testProgram\": \"UI-780P\",\n" +
                "\t\t\"workOrder\": \"KSWOE-19100002\"\n" +
                "\t},\n" +
                "\t\"errorCode\": 0,\n" +
                "\t\"errorMsg\": \"成功\"\n" +
                "}";

        //发送Post请求
        con.setDoOutput(true);
        DataOutputStream wr = new DataOutputStream(con.getOutputStream());
        wr.writeBytes(urlParameters);
        wr.flush();
        wr.close();

/*        int responseCode = con.getResponseCode();
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + urlParameters);
        System.out.println("Response Code : " + responseCode);*/

        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        StringBuffer response = new StringBuffer();

        while ((inputLine = in.readLine()) != null) {
            response.append(inputLine);
        }
        in.close();

        //打印结果
        System.out.println(response.toString());

    }

    private void sendEAPPost() throws Exception {
        String methodUrl = EAPURL;
        HttpURLConnection connection = null;
        OutputStream dataout = null;
        BufferedReader reader = null;
        String line = null;
        try {
            URL url = new URL(methodUrl);
            connection = (HttpURLConnection) url.openConnection();// 根据URL生成HttpURLConnection
            connection.setDoOutput(true);// 设置是否向connection输出，因为这个是post请求，参数要放在http正文内，因此需要设为true,默认情况下是false
            connection.setDoInput(true); // 设置是否从connection读入，默认情况下是true;
            connection.setRequestMethod("POST");// 设置请求方式为post,默认GET请求
            connection.setUseCaches(false);// post请求不能使用缓存设为false
            connection.setConnectTimeout(3000);// 连接主机的超时时间
            connection.setReadTimeout(3000);// 从主机读取数据的超时时间
            connection.setInstanceFollowRedirects(true);// 设置该HttpURLConnection实例是否自动执行重定向
            connection.setRequestProperty("connection", "Keep-Alive");// 连接复用
            connection.setRequestProperty("charset", "utf-8");

            connection.setRequestProperty("Content-Type", "application/json");
            connection.connect();// 建立TCP连接,getOutputStream会隐含的进行connect,所以此处可以不要

            dataout = new DataOutputStream(connection.getOutputStream());// 创建输入输出流,用于往连接里面输出携带的参数
            String body = "{\n" +
                    "\t\"data\": {\n" +
                    "\t\t\"lotQty\": \"78.0\",\n" +
                    "\t\t\"materialBoxBarcode\": [\"wzq\", \"mconwo\"],\n" +
                    "\t\t\"materialCode\": \"01.01.01.30096T\",\n" +
                    "\t\t\"materialConsumeFlag\": \"Y\",\n" +
                    "\t\t\"materialNo\": [\"03.06.04.00004A\", \"03.06.03.00019A\"],\n" +
                    "\t\t\"priority\": \"\",\n" +
                    "\t\t\"processId\": \"D1H27110C1_TRAY\",\n" +
                    "\t\t\"product\": \"D1H27110C1\",\n" +
                    "\t\t\"productType\": \"Production\",\n" +
                    "\t\t\"recipeName\": \"UI-780P\",\n" +
                    "\t\t\"routeDesc\": \"贴片\",\n" +
                    "\t\t\"routeId\": \"D2130001\",\n" +
                    "\t\t\"stepDesc\": \"领料核对\",\n" +
                    "\t\t\"stepId\": \"TM\",\n" +
                    "\t\t\"testProgram\": \"UI-780P\",\n" +
                    "\t\t\"workOrder\": \"KSWOE-19100002\"\n" +
                    "\t},\n" +
                    "\t\"errorCode\": 0,\n" +
                    "\t\"errorMsg\": \"成功\"\n" +
                    "}";

            dataout.write(body.getBytes());
            dataout.flush();
            dataout.close();

            if (connection.getResponseCode() == HttpURLConnection.HTTP_OK) {
                reader = new BufferedReader(new InputStreamReader(connection.getInputStream(), "UTF-8"));// 发送http请求
                StringBuilder result = new StringBuilder();
                // 循环读取流
                while ((line = reader.readLine()) != null) {
                    result.append(line).append(System.getProperty("line.separator"));//
                }
                System.out.println(result.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            connection.disconnect();
        }
    }



}