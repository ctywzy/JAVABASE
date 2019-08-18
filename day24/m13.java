package day24;

import java.io.*;
import java.net.Socket;

public class m13 {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",9999);
        OutputStream os = s.getOutputStream();

        FileInputStream fis = new FileInputStream("E:\\picture.jpg");
        byte[] buf = new byte[1024];
        int len = 0;
        while((len = fis.read(buf))!=-1){
            os.write(buf,0,len);

        }
        s.shutdownOutput();
        //利用转换流把字节转换成字符，可以输出中文
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));

        String str = br.readLine();
        System.out.println(str);
        s.close();
        fis.close();
    }
}
