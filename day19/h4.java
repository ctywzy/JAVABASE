package day19;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//字节流输出对象操作文件
public class h4 {
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        /*FileOutputStream fos = new FileOutputStream("fosdemo.txt");
        fos.write("小可爱 ".getBytes());
        fos.close();

         */
        FileInputStream fio = new FileInputStream("fosdemo.txt");
        int ch = 0;
        /*StringBuilder sb = new StringBuilder();
        while((ch = fio.read())!= -1){
            sb.append((char)ch);

        }
        System.out.println(sb.toString());
        fio.close();
        */
        System.out.println(fio.available());
        byte[] buf = new byte[BUFFER_SIZE];
        int len = 0;
        while((len = fio.read(buf))!=-1){
            System.out.println(new String(buf,0,len));
        }

    }
}
