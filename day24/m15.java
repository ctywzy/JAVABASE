package day24;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
自定义模拟tomcat服务器
 */
public class m15 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9090);
        Socket s = ss.accept();
        InputStream in  = s.getInputStream();

        byte[] buf = new byte[1024];
        int len = in.read(buf);

        String text =new String(buf,0,len);

        System.out.println(text);

        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("你好");
        s.close();
        ss.close();

    }
}
