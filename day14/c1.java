package day14;

public class c1 {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','e'};
        String s = new String(arr,0,5);
        System.out.println(s);
        String s2 = s.substring(2,3);
        System.out.println(s2);
        System.out.println(s.indexOf('a'));
        String s3 = "aa,bb,cc,dd";
        String[] s4 = s3.split(",");
        System.out.println("s4的长度" + s4.length);
        for(int i=0;i<s4.length;i++){
            System.out.println('.'+s4[i]);
        }
        System.out.println("------------------------");
        String s5 = s.replace("ddd","b");
        System.out.println(s5);
        String s6 = s.toUpperCase();
        System.out.println(s6+s);
        String ss = "aaa";
        String sss = "aaaa";
        System.out.println(ss.compareTo(sss));
        System.out.println(ss.indexOf("bb"));
    }
}
