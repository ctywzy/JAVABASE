package day24;

import java.io.*;
import java.net.Socket;

/*
客户端，键盘读入，英文字母，
并收到大写的返回。
并显示再控制台
 */
public class m9 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",8888);
        PrintWriter out = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader brin = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String line =null;
        while((line = br.readLine())!=null){
            out.println(line);
            String str = brin.readLine();
            if("over".equals(line)){
                break;
            }
            System.out.println(str);
        }
        out.close();
        brin.close();
        socket.close();
    }
}
