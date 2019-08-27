package day26;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

class BeInvoke{
    BeInvoke(){

    }
    BeInvoke(int a,int b){

    }
}

public class IIInvoke {
    public static void main(String[] args) throws Exception {
        Class clazs = Class.forName("day26.BeInvoke");
        Object obj1 = clazs.getNestHost();
        Constructor con1 = clazs.getConstructor();
        Object obj2 = con1.newInstance();
        Constructor con2 = clazs.getConstructor(int.class,int.class);
        Object obj3 = con2.newInstance(1,2);
    }
}
