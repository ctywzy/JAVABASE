package day20;

import java.io.IOException;
import java.io.InputStream;

public class i9 {
    public static void main(String[] args) throws IOException {
        readkey();
        readkey2();
    }

    private static void readkey2() throws IOException {
        InputStream in = System.in;

    }

    private static void readkey() throws IOException {
        InputStream in = System.in;
        int ch1,ch2,ch3;
        ch1 = in.read();
        ch2 = in.read();
        ch3 = in.read();
        System.out.println(ch1+" "+ch2+" "+ch3);
    }
}
