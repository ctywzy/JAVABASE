package day14;

public class sb1 {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer();
        sb1.append("abc").append(false).append(16);
        sb1.insert(1,"adfasf");
        StringBuffer sb2 = new StringBuffer("abc");
        sb2.delete(0,2);
        sb2.setLength(10);
        sb2.reverse();
        System.out.println(sb2);
        String s="abc";
    }
}
