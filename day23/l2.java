package day23;

import java.io.UnsupportedEncodingException;

public class l2 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s1 = new String("你好");

        byte[] buf = s1.getBytes("gbk");
        String s2 = new String(buf,"iso8859-1");
        System.out.println(s2);
        byte[] buf2 = s2.getBytes("iso8859-1");
        String s3 = new String(buf2,"gbk");
        System.out.println(s3);
    }
}
