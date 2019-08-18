package day14;

public class c2 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = s1.intern();
        System.out.println(s2+s1);
        System.out.println(s1==s2);
        String s3 = new String("abc");
        String s4 = s3.intern();
        System.out.println(s3==s4);

    }
}
