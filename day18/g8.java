package day18;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class g8 {
    private static final int BUFFER_SIZE = 1024;
    public static void main(String[] args) {
        /*方案一 文件复制
        FileReader fr = new FileReader("demo.txt");
        FileWriter fw = new FileWriter("copy.txt");
        int ch = 0;
        while((ch = fr.read())!=-1){
            fw.write((char)ch);
        }
        fr.close();
        fw.close();

         */
        FileReader fr = null;
        FileWriter fw = null;
        try{
            fr = new FileReader("demo.txt");
            fw = new FileWriter("copy.txt");
            char[] buffer = new char[BUFFER_SIZE];
            int len = 0;
            while((len = fr.read(buffer)) != -1){
                fw.write(buffer,0,len);
            }
        }catch (Exception e){
            System.out.println(e.toString());
            throw new RuntimeException("读写失败");
        }finally{
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
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
