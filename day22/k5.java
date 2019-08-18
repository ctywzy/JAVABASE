package day22;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
PrintStream
outputstream的子类
 */
public class k5 {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter out = new PrintWriter("b.txt");
        out.write(48);
        out.close();
        out.close();
    }
}
