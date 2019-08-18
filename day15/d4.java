package day15;

import java.lang.reflect.Array;
import java.util.*;
class person{
    String name;
    String age;
    person(String name,String age){
        this.name = name;
        this.age = age;
    }
}
public class d4 {
    public static void main(String[] args) {
        List c1 = new ArrayList();
        c1.add("a1");
        c1.add("b2");
        c1.add("c3");
        c1.add("d4");
        /*System.out.println(c1.indexOf("c3"));
        String s1  = c1.get(2);
        System.out.println(s1);
        */

        ListIterator it = c1.listIterator();
        System.out.println(c1);
        while(it.hasPrevious()){
            System.out.println("000");
            Object obj = it.previous();
            System.out.println(obj);

        }

        ArrayList<person> c2 = new ArrayList();
        c2.add(new person("1","2"));
        c2.add(new person("2","3"));
        Iterator it1 = c2.iterator();
        while(it1.hasNext()){
            //person p = (person) it.next();
            System.out.println(it.next());
        }
        //System.out.println(c1);
        /*for(ListIterator<String> it = c1.listIterator(); it.hasNext();){
            Object obj = it.next();
            if(obj.equals("b2"))
                System.out.println("truetruetrue");
            c1.add(1,"aaa");
            System.out.println(obj);
        }*/
        /*
        System.out.println(c1);
        Iterator it = c1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
         */
    }
}
