package day18;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class g7 {
    public static void main(String[] args) {
        FileReader fr = null;
        try{
            fr = new FileReader("demo.txt");
            int c;
            while((c = fr.read())!=-1){
                System.out.println((char)c);
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
