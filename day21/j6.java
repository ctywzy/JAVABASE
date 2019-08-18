package day21;

import java.io.File;

public class j6 {
    public static void main(String[] args) {
        File f = new File("C:\\");
        String[] names = f.list(new j4filter());
        for(String name : names){
            System.out.println(name);
        }
    }
}
