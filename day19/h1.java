package day19;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class h1 {
    public static void main(String[] args) {
        int[] a = new int[2];
        try{
            System.out.println(a[2]);
            ReadWriteLock rwl = new ReentrantReadWriteLock();
            rwl.readLock().lock();
            //Lock lock = new Ree
        }catch(Exception e){
            System.out.println("0000");
        }

    }
}
