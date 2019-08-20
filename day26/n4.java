package day26;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

class wangka{
    private void run(){
        System.out.println("网卡启动");
    }
}
class shengka{
    private void run(){
        System.out.println("声卡启动");
    }
}
public class n4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        File config = new File("config.properties");
        FileInputStream fis = new FileInputStream(config);
        Properties prop = new Properties();
        prop.load(fis);
        for (int i = 0 ; i<prop.size();i++){
            String classpath = prop.getProperty("c" + (i+1));
            Class clazs = Class.forName(classpath);
            Method method = clazs.getDeclaredMethod("run");
            method.setAccessible(true);
            Object obj = clazs.newInstance();
            method.invoke(obj);
            System.out.println(classpath);
        }
        fis.close();
    }
}
