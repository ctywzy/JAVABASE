package day24;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
服务端，收到后，显示在控制台，
转换后后再发送回去
 */
public class m10 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket socket = ss.accept();
        /*
        把socket装饰到缓冲区中
         */
        BufferedReader brin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        String str = null;
        while((str = brin.readLine())!=null){
            System.out.println(str);
            out.println(str.toUpperCase());
            if("OVER".equals(str.toUpperCase()))
                break;
        }

        ss.close();
        socket.close();
    }
}
