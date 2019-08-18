package day23;

import java.io.UnsupportedEncodingException;

public class l3 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = new String("联通");

        byte[] buf = s1.getBytes("gbk");
        String s2 = new String(buf,"utf-8");
        System.out.println(s2);
        byte[] buf2 = s2.getBytes("utf-8");
        String s3 = new String(buf2,"gbk");
        System.out.println(s3);
    }
}
