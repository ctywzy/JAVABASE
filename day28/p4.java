package day28;

public class p4 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = new String("abc");
        System.out.println(s1==s2);
        s2 = s2.intern();
        System.out.println(s1==s2);
    }
}
