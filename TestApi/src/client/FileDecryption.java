package client;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.*;

public class FileDecryption {
    public static final String outPutPath = "D://解密";
    public static void main(String[] args) throws Exception {
        File dir = new File("D://新建文件夹"); // 替换成实际的目录路径
        listFiles(dir);
    }


    private static void listFiles(File dir) throws Exception {
        File[] files = dir.listFiles();
        for (File file : files) {
            if (file.isFile()) {
                decFile(file.getPath(),file.getName());
                System.out.println("File: " + file.getPath());
            } else if (file.isDirectory()) {
                System.out.println("Directory: " + file.getName());
                listFiles(file); // 递归遍历子目录
            }
        }
    }

    private static void decFile(String filePath,String fileName) throws Exception {
        Decryption decryption = new Decryption();
        CloseableHttpResponse response = decryption.fileDecryption(filePath);
        String result = response.getFirstHeader("data~returnFlag").getValue();
        if ("0".equals(result)) {//0 表示成功
            System.out.println("解密成功");
            InputStream inputStream = response.getEntity().getContent();
//            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
            // 创建工作簿对象
//            Workbook workbook = new HSSFWorkbook(inputStream);
            Workbook workbook = WorkbookFactory.create(inputStream);
            // 创建文件输出流
            FileOutputStream outputStream = new FileOutputStream(outPutPath+"//"+fileName);
            // 将工作簿写入到文件输出流中
            workbook.write(outputStream);
            // 关闭输出流和输入流
            outputStream.close();
            inputStream.close();
        }
    }
}
