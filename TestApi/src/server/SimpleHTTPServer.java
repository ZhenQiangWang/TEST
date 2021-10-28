package server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
/** * Java program to create a simple HTTP Server to demonstrate how to use * ServerSocket and Socket class. * *
 @author Javin Paul*/
public class SimpleHTTPServer
{
    public static void main(String args[]) throws IOException, InterruptedException {
        ServerSocket server = new ServerSocket(8080);
        System.out.println("Listening for connection on port 8080 ....");
        while (true)
        {
            try (Socket socket = server.accept())
            {
                //读取request
                StringBuilder sb = new StringBuilder();
                InputStreamReader isr = new InputStreamReader(socket.getInputStream(),"UTF-8");
                BufferedReader reader = new BufferedReader(isr);
                String line = reader.readLine();
                while (!line.isEmpty())
                {
                    sb.append(line);
                    System.out.println(line);
                    line = reader.readLine();
                }
                System.out.println("总数据="+sb);
                //写入response
                Date today = new Date();
                String httpResponse = "HTTP/1.1 200 OK\r\n\r\n" + today;
                socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
            }
            Thread.sleep(10L);
        }
    }
} 