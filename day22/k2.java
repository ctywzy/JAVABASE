package day22;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/*
Properties集合读取硬盘中的键值对信息
 */
public class k2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        Properties prop = new Properties();
        prop.load(fis);
        prop.list(System.out);
    }
}
