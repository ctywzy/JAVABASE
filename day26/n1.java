package day26;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class nn1{
    public nn1(int k){

    }
    public nn1(){

    }
    public nn1(String s1,int k){

    }
    public void run(){
        System.out.println("run");
    }
}

public class n1 {
    public static void main(String[] args) throws Exception{
        Class clazs = Class.forName("day26.nn1");
        System.out.println(clazs.getName());
        int k = 1;
        day26.nn1 kk = new day26.nn1();
        Constructor constructor = clazs.getConstructor(int.class);
        nn1 obj = (nn1)constructor.newInstance(k);
        obj.run();
    }
}
