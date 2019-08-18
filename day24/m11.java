package day24;

import java.io.*;
import java.net.Socket;

/*
文本文件操作
传输一个文件到服务器
 */
public class m11 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",8888);
        BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        String line = null;
        while((line = br.readLine())!=null){
            System.out.println(line);
            out.println(line);
        }
        s.shutdownOutput();
        //out.println("over");/*去掉这句话可以看到堵塞效果*/
        BufferedReader brin = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str  = brin.readLine();/*阻塞式的，结束，在s之前，会导致两边等待数据的堵塞，*/
        System.out.println(str);
        s.close();
        br.close();
    }
}
