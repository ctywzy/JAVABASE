package day17;

import java.util.Iterator;
import java.util.TreeSet;

public class f1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("d");
        ts.add("c");
        ts.add("b");
        ts.add("a");

        for(Iterator it = ts.iterator();it.hasNext();){
            System.out.println(it.next());
        }
    }
}
