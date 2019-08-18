package day22;
/*
文件切割
 */
import java.io.*;

public class k6 {
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        byte[] buf = new byte[BUFFER_SIZE];//单个文件大小;
        int len = 0;
        int count = 1;
        FileOutputStream fos = null;
        File dir = new File("");//目录
        if(dir.exists()){
            dir.createNewFile();
        }
        while((fis.read(buf)) != -1){
            fos = new FileOutputStream(new File(dir,count++ + ".path"));
            fos.write(buf,0,len);
        }

        fis.close();
        fos.close();
    }
}
