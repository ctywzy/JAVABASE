package day18;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class g10 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        BufferedReader bufr = new BufferedReader(fr);
        String Line = null;
        while((Line = bufr.readLine())!=null){
            System.out.println(Line);
        }
    }
}
