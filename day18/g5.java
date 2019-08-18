package day18;

import java.util.Calendar;

public class g5 {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        System.out.println(date.get(Calendar.MONTH));
        date.set(2019,2,1);
        System.out.println(date.get(Calendar.YEAR));
        System.out.println(date.get(Calendar.MONTH));
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
        date.add(Calendar.DAY_OF_MONTH,-1);
        //date.add(Calendar.MONTH,-4);
        System.out.println(date.get(Calendar.YEAR));
        System.out.println(date.get(Calendar.MONTH));
        System.out.println(date.get(Calendar.DAY_OF_MONTH));
    }
}
