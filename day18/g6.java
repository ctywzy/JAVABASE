package day18;

import java.io.FileWriter;
import java.io.IOException;

public class g6 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\demo.txt",true);
            fw.write("\nabcd");

            fw.flush();
            fw.write("sdfsdfabc");


        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
