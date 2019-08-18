package day17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class pp{
    String name;
    public pp(String name){
        this.name = name;
    }
    @Override
    public String toString() {
        return "pp{" +
                "name='" + name + '\'' +
                '}';
    }
}
class p1 extends pp{
    public p1(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "p1{" +
                "name='" + name + '\'' +
                '}';
    }
}
class p2 extends pp{
    public p2(String name) {
        super(name);
    }
    @Override
    public String toString() {
        return "p2{" +
                "name='" + name + '\'' +
                '}';
    }
}
interface  Inter<T>{
    public void show(T t);
}
class implement implements Inter<String>{

    @Override
    public void show(String s) {
        System.out.println("show:" + s);
    }
}
class implement1<T> implements  Inter<T>{


    @Override
    public void show(T t) {
        System.out.println("show"+t);
    }
}
public class f2 {
    public static void main(String[] args) {
        implement imp = new implement();
        imp.show("abc");
        ArrayList<p1> pp1 = new ArrayList<p1>();
        pp1.add(new p1("abc"));
        pp1.add(new p1("abc"));
        print(pp1);
        ArrayList<p2> pp2 = new ArrayList<p2>();
        pp2.add(new p2("def"));
        pp2.add(new p2("def"));
        print(pp2);
    }
    public static void print(Collection<? extends pp> a1){
        Iterator<? extends  pp> it = a1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
