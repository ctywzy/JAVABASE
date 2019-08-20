package day25;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class mybrower {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",8080);
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        out.println("GET /examples/login.html HTTP/1.0");
        out.println("Host: localhost:8080");
        out.println("Connection: close");
        InputStream in = s.getInputStream();
        byte[] buf = new byte[1024];
        int len = 0;
        len = in.read(buf);
        String str = new String(buf,0,len);
        System.out.println(str);
        s.close();
    }
}
