package day20;

public class i3 {
    static int count = 1;
    {
        System.out.println(count);
    }
    public static void main(String[] args) throws ClassNotFoundException {
        i3 i = new i3();
        Class clasz = Class.forName("day20.i3");
        System.out.println(clasz);
        System.out.println(i3.class);
        System.out.println(Class.forName("day20.i3"));
        System.out.println(i.getClass());
        int[] a = new int[2];


    }
}
