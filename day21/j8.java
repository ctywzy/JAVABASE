package day21;

import java.util.Properties;
import java.util.Set;

public class j8 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        prop.setProperty("zhangsan","30");
        prop.setProperty("lisi","40");
        Set<String> names = prop.stringPropertyNames();
        for(String name:names){
            System.out.println(name);
        }
    }
}
