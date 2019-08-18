package day18;

import java.util.Properties;
import java.util.Set;

public class g1 {
    public static void main(String[] args) {
//        Properties prop = System.getProperties();
//        Set<String> propname = prop.stringPropertyNames();
//        for (String key:propname)
//        {
//           String value =  prop.getProperty(key);
//            System.out.println(key+" : "+value);
//        }
        String value = System.getProperty("line.separator");
        System.out.println("hello "+ value +" world");

    }
}
