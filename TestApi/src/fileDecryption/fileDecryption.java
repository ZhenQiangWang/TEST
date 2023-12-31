package fileDecryption;

import client.HttpRequestClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.InputStreamEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.xml.ws.Response;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class fileDecryption {
    private final static String fileDecryptionURL = "http://192.168.68.175:8081/sec-server/s/rs/uni/";


    public static void main(String[] args) {

        try {
            HttpRequestClient httpRequestClient = new HttpRequestClient();
            CloseableHttpClient httpclient = HttpClients.createDefault();
            HttpPost post = new HttpPost(fileDecryptionURL);
            File file = new File("D:\\课程培训-王振强.pptx");
            FileInputStream fileInputStream = new FileInputStream(file);

            /*InputStreamReader inputStreamReader1 = new InputStreamReader(fileInputStream,"GBK");
            BufferedReader bufferedReader1 = new BufferedReader(inputStreamReader1);
            String str = "";
            while((str = bufferedReader1.readLine()) != null){
                System.out.println(str);
            }*/

            post.addHeader("method~name", "fileDecryptionRest"); //文件解密
            post.addHeader("data~fileOffset", "0");
            post.addHeader("data~counSize", file.length() + "");
            InputStream in = new FileInputStream(file);
            AbstractHttpEntity entity = new InputStreamEntity(in);
            post.setEntity(entity);

            CloseableHttpResponse response = httpclient.execute(post);


            String result = response.getFirstHeader("data~returnFlag").getValue();
            if ("0".equals(result)) {//0 表示成功
                System.out.println("解密成功");
            }
            /*if ("0".equals(result)) {//0 表示成功
                System.out.println("解密成功");
//            OutputStream out = new FileOutputStream(new File("D:\\jiemi.txt"));

                InputStream ins = response.getEntity().getContent();


                XSSFWorkbook xwb = new XSSFWorkbook(ins);

                XSSFSheet sheetAt = xwb.getSheetAt(0);
                int rowNum = sheetAt.getPhysicalNumberOfRows();
                System.out.println("一共" + rowNum + "行");
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
                for (int i = 1; i < rowNum; i++) {
                    XSSFRow row = sheetAt.getRow(i);
                    XSSFCell cell = row.getCell(1);
                    cell.setCellType(CellType.STRING);
                    String lotRrn = cell.getStringCellValue();
                    String lotId = row.getCell(2).getStringCellValue();
                    String dueDate = simpleDateFormat.format(row.getCell(3).getDateCellValue());
                    System.out.println("第"+i+"行,批号" + lotId + ",计划入库时间:" + dueDate);
                }
                XSSFRow row = sheetAt.getRow(0);
                XSSFCell cell = row.getCell(0);
                String rawValue = cell.getStringCellValue();
                System.out.println(rawValue);
                *//* InputStreamReader inputStreamReader = new InputStreamReader(ins, "UTF-8");

                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    {
                        System.out.println(line);
                    }
                    in = new FileInputStream(file);
                }*//*
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
