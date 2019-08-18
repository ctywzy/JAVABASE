package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class g9 {
    private static final int BUFFER_SIZE = 1024;

    public static void main(String[] args) {
        FileReader fr = null;
        try {
             fr = new FileReader("demo.txt");
             char[] buf = new char[BUFFER_SIZE];
             int len = 0;
             while((len = fr.read(buf))!=-1){
                 System.out.println(new String(buf,0,len));
             }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(fr!=null){
                try {
                    fr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
