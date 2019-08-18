package day18;

import java.io.IOException;
/*
利用runtime类打开本地程序
 */
public class g2 {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        try {
            Process p = r.exec("notepad.exe");
            Thread.sleep(1000);
            p.destroy();
            System.out.println(Math.PI);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
