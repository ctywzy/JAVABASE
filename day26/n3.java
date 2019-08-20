package day26;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class n3 {
    public static void main(String[] args) throws Exception {
        //getvariable();
        getMethod();
    }
    public static void getvariable() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InstantiationException {
        Class clazs = Class.forName("day26.Test");
        Field field = clazs.getDeclaredField("a");
        field.setAccessible(true);
        System.out.println(field);
        Object o1 = clazs.newInstance();
        Object obj = field.get(o1);
        System.out.println(o1);
    }
    public static void getMethod() throws Exception{
        Class claze = Class.forName("day26.Test");
        Method method = claze.getDeclaredMethod("f2");
        method.setAccessible(true);
        Object obj = claze.newInstance();
        method.invoke(obj);
    }
}
