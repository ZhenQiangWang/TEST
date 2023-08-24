package client;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xslf.usermodel.XMLSlideShow;
import org.apache.poi.xslf.usermodel.XSLFSlide;
import org.apache.poi.xslf.usermodel.XSLFTextShape;
import org.apache.poi.xwpf.usermodel.XWPFDocument;

import java.io.*;
import java.util.Scanner;

public class FileDecryption {
    public static final String outPutPath = "D://解密";
    public static void main(String[] args) throws Exception {
        File dir = new File("D://bfyy"); // 替换成实际的目录路径
        listFiles(dir);
//        decFile("D://项目管理//EAP//NI//备件寿命计算逻辑.xlsx","备件寿命计算逻辑.xlsx");
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
//            writeExcel(inputStream,fileName);
//            writeWord(inputStream,fileName);
            writeToPpt(inputStream,fileName);
            inputStream.close();
        }
    }

    private static void writeToPpt(InputStream inputStream, String fileName) throws IOException {
        OutputStream outputStream = new FileOutputStream(outPutPath + "//" + fileName);
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }
        inputStream.close();
        outputStream.close();
        outputStream.close();
    }


    private static void writeWord(InputStream inputStream, String fileName) {
        try {
            OutputStream outputStream = new FileOutputStream(outPutPath+"//"+fileName); // Output Word document path
            XWPFDocument document = new XWPFDocument();
            document.createParagraph().createRun().setText(readInputStreamAsString(inputStream));
            document.write(outputStream);
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String readInputStreamAsString(InputStream inputStream) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line).append("\n");
        }
        reader.close();
        return stringBuilder.toString();
    }

    private static void writeExcel(InputStream inputStream, String fileName){
        //            InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "UTF-8");
        // 创建工作簿对象
//            Workbook workbook = new HSSFWorkbook(inputStream);
        Workbook workbook = null;
        try {
            workbook = WorkbookFactory.create(inputStream);
            // 创建文件输出流
            FileOutputStream outputStream = new FileOutputStream(outPutPath+"//"+fileName);
            // 将工作簿写入到文件输出流中
            workbook.write(outputStream);
            // 关闭输出流和输入流
            outputStream.close();
//            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InvalidFormatException e) {
            e.printStackTrace();
        }
    }
}
