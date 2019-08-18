package day24;

import com.sun.source.tree.Scope;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;

/*
服务器接收一个文件，并写到特定的目的地
 */
public class m12 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8888);
        Socket s = ss.accept();
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        BufferedWriter bw = new BufferedWriter(new FileWriter("demo1.txt"));
        String line = null;
        /*
        等到客户端流关闭了，循环才退出
         */
        while((line = br.readLine())!=null){

            bw.write(line);
            bw.newLine();
            System.out.println(line);
            bw.flush();

        }

        PrintWriter out = new PrintWriter(s.getOutputStream(),true);
        System.out.println("文件接收成功");
        out.println("文件上传成功");
        s.close();
        ss.close();
        br.close();
        bw.close();
    }
}
