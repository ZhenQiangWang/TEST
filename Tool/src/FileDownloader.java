import java.awt.Desktop;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileDownloader {
    public static void main(String[] args) throws IOException {
        String fileUrl = "http://localhost:7001/mycim2/npw/123.html"; // 指定要下载的文件URL
        Path downloadDir = Paths.get("C:/Downloads"); // 指定下载目录

        // 从URL创建连接
        URL url = new URL(fileUrl);
        URLConnection conn = url.openConnection();

        // 获取文件名和文件大小
        String fileName = conn.getHeaderField("Content-Disposition").split("=")[1];
        int fileSize = conn.getContentLength();

        // 创建缓冲输入流并下载文件
        try (BufferedInputStream in = new BufferedInputStream(conn.getInputStream());
             FileOutputStream out = new FileOutputStream(downloadDir.resolve(fileName).toString())) {
            byte[] dataBuffer = new byte[1024];
            int bytesRead;
            int totalBytesRead = 0;
            while ((bytesRead = in.read(dataBuffer, 0, 1024)) != -1) {
                out.write(dataBuffer, 0, bytesRead);
                totalBytesRead += bytesRead;
            }
        }

        // 打开下载的文件
        Desktop.getDesktop().open(downloadDir.resolve(fileName).toFile());
    }
}
