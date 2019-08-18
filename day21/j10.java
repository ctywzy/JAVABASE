package day21;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class j10 {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("name","mjn");
        prop.setProperty("age","18");
        prop.list(System.out);
        FileOutputStream fos = new FileOutputStream("day10:a.txt");
        prop.store(fos,"ceshi");
        fos.close();
    }
}
