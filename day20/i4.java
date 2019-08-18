package day20;
/*
反射获取方法
 */
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class i4 {
    public static void f1(int a,int b){
        System.out.println(a + ":" + b);
    };
    public void f2(){
        System.out.println("2");
    };

    public static void main(String[] args) throws Exception{
        Class clasz = Class.forName("day20.i4");
        Method method = clasz.getMethod("f1",int.class,int.class);
        System.out.println(method.getName());
        i4 ii = (i4) clasz.newInstance();
        method.invoke(null,10,99);

        Method[] methods = clasz.getDeclaredMethods();
        /*for(Method m:methods){
            System.out.println(m.toString());
            System.out.println(m.getName());
            System.out.println(m.isVarArgs());
            m.invoke(clasz.newInstance());

        }*/
    }
}
