package day16;

import java.util.Stack;

public class e1 {
    public static long f(long k){
        long s=0;
        if(k>2){
            s += f(k-1)+f(k-2);
        }else{
            return 1;
        }
        return s;
    }
    public static void main(String[] args) {
        long k=12;
        System.out.println(f(k));

    }

}
