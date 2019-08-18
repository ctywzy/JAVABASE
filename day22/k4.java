package day22;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class k4 {
    public static void main(String[] args) throws IOException {
        File f = new File("a.txt");
        if(f.exists()==false){
            f.createNewFile();
        }
        FileReader fr = new FileReader(f);
        Properties prop = new Properties();
        prop.load(fr);
        String value = prop.getProperty("time");
        if(value == null){
            prop.setProperty("time","1");
        }else{
            int count = Integer.parseInt(value);
            if("5".equals(value)){
                throw new RuntimeException("次数已到");
            }
            prop.setProperty("time", String.valueOf(count+1));
        }
        FileWriter fw = new FileWriter(f);
        prop.store(fw,"");
        fr.close();
        fw.close();
        prop.list(System.out);
    }
}
