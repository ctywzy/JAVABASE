package day19;

import java.io.*;

public class h2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        FileWriter fw = new FileWriter("copy1.txt");
        BufferedReader br = new BufferedReader(fr);
        BufferedWriter bw = new BufferedWriter(fw);
        String line = null;
        bw.write('c');
        while((line = br.readLine())!=null){
            bw.write(line);
            bw.write(System.getProperty("line.separator"));
            System.out.println(System.getProperty("line.separator"));
            System.out.println(line);
        }
        br.close();
        bw.close();
    }
}
