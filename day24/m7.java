package day24;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
TCP客户端
 */
public class m7 {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1",8888);

        OutputStream out = socket.getOutputStream();
        InputStream in = socket.getInputStream();
        byte[] buf = new byte[1024];
        int len =0;

        out.write("你好".getBytes("utf-8"));

        len = in.read(buf);

        String str = new String(buf,0,len);
        System.out.println("收到回信息"+str);
        socket.close();

    }
}
