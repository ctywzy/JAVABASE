package day17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

class person{
    String name;
    String age;

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    public person(String name, String age){
        this.name = name;
        this.age = age;

    }
}
public class f {
    public static void main(String[] args) {
        LinkedHashSet<String> hs = new LinkedHashSet();
        hs.add("321");
        hs.add("123");
        hs.add("000");
        hs.add("996");
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
//        HashSet<person> hsp = new HashSet<person>();
//        hsp.add(new person("lisa","77"));
//        hsp.add(new person("lisa","77"));
//        hsp.add(new person("lisa","77"));
//        Iterator it = hsp.iterator();
//        while(it.hasNext()){
//            //                                                                                                                                                                                                                                                                person pp = (person) it.next();
//            System.out.println(it.next());
//        }

    }
}
