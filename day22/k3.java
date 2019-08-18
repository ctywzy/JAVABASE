package day22;

import java.io.*;
import java.util.Properties;
import java.util.Scanner;

/*
利用流修改配置信息
 */
public class k3 {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        if(f.exists() == false){
            f.createNewFile();
        }
        FileReader fr = new FileReader(f);
        FileWriter fw = new FileWriter(f);//写在这输出流创建的时候会覆盖文件，加true才不会覆盖
        Scanner in = new Scanner(System.in);
        int k = in.nextByte();
        Properties prop = new Properties();
        prop.load(fr);
        prop.list(System.out);
        fr.close();

    }
}
