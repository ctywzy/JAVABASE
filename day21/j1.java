package day21;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class j1 {
    public static void main(String[] args) throws IOException {
        File f = new File("copy.txt");
        FileInputStream fis = new FileInputStream(f);
        byte[] buf = new byte[1024];
        int len;
        while((len = fis.read(buf)) != -1){
            System.out.println(new String(buf,0,len));
        }
        System.out.println(f.exists());
    }
}
