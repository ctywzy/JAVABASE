package day26;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Test {
    private int a;
    public String b;
    public void f1(){
        System.out.println("f1");
    };
    private void f2(){
        System.out.println("f2");
    }
    public void f3(int k){
        System.out.println(k);
    }
    public static void main(String[] args) throws IOException {
        File file = new File("config.properties");
        FileOutputStream fos = new FileOutputStream(file);
        Properties prop = new Properties();
        prop.setProperty("c1","day26.wangka");
        prop.setProperty("c2","day26.shengka");
        prop.store(fos,null);
        fos.close();
    }
}
