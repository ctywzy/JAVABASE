package day21;

import java.io.File;

public class j3 {
    public static void main(String[] args) {
        File f = new File("C:\\Program Files");
        String[] name = f.list();
        for(String n:name){
            System.out.println(n);
        }
    }
}
