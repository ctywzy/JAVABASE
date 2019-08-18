package day19;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class MyBufferedReader{
    private static final int BUFFER_SIZE = 1024;
    private FileReader filename;
    private char[] buf = new char[BUFFER_SIZE];

    private int pos = 0;

    private int count = 0;

    MyBufferedReader(FileReader file){
        this.filename = file;
    }
    public int MyRead() throws IOException {

        if(count == 0){
            count = filename.read(buf);
            pos = 0;
        }
        if(count < 0)
            return -1;
        int ch = buf[pos++];
        count--;
        return ch;
    }

    public String MyReadLine() throws IOException {
        StringBuilder sb = new StringBuilder();
        int ch = 0;
        while((ch = MyRead()) != -1){
            if(ch=='\r'){
                continue;
            }if(ch == '\n'){
                return sb.toString();
            }
            sb.append((char)ch);
        }
        return null;
    }

    public void MyClose() throws IOException {
        filename.close();
    }
}
public class h3 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("demo.txt");
        MyBufferedReader mbr = new MyBufferedReader(fr);
        String line = null;
        while((line = mbr.MyReadLine()) != null){
            System.out.println(line);
        }
        mbr.MyClose();
    }
}
