package day20;

import java.io.File;
import java.io.IOException;
import java.io.Reader;

public class i10 {
    public static void main(String[] args) {
        File f = new File("demo.txt");
        Reader r = new Reader(f) {
            @Override
            public int read(char[] cbuf, int off, int len) throws IOException {
                return 0;
            }

            @Override
            public void close() throws IOException {

            }
        };
    }
}
