package day24;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class m14 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(9999);
        Socket s = ss.accept();

        String ip = s.getInetAddress().getHostAddress();
        System.out.println(ip);

        InputStream in = s.getInputStream();

        FileOutputStream fos = new FileOutputStream("E:\\ppx.jpg");

        byte[] buf = new byte[1024];
        int len = 0;
        while((len = in.read(buf)) != -1){
            fos.write(buf,0,len);
            fos.flush();
        }
        PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()),true);
        out.println("图片上传成功");

        s.close();
        ss.close();
        fos.close();


    }
}
