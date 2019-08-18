package day20;

import java.io.*;
/*
通过缓冲区操作字节流
 */
public class i8 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("E:\\picture.jpg");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fio = new FileOutputStream("E:\\ppp.jpg");
        BufferedOutputStream bfo = new BufferedOutputStream(fio);

        byte[] buf = new byte[1024];
        int len = 0;
        while((len = bis.read(buf)) != -1){
            bfo.write(buf);
            bfo.flush();
        }
        bis.close();
        bfo.close();
    }
}
