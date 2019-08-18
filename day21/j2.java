package day21;

import java.io.File;
import java.io.IOException;

public class j2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("D:\\");
        File f2 = new File("E:\\b.txt");
        System.out.println(f1.getFreeSpace());
        System.out.println(f1.getTotalSpace());
        System.out.println(f1.getFreeSpace());
    }
}
