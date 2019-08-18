package day24;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
TCP服务端
 */
public class m8 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();

        InputStream in = socket.getInputStream();
        OutputStream out = socket.getOutputStream();
        byte[] buf = new byte[1024];

        int len = in.read(buf);

        String str = new String(buf,0,len);

        String ip = socket.getInetAddress().getHostAddress();

        System.out.println(ip + ":" +str);
        out.write("你也好".getBytes("utf-8"));
        socket.close();
        ss.close();

    }
}
