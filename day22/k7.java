package day22;

import java.io.*;
import java.util.*;

/*
文件合并
 */
public class k7 {
    public static void main(String[] args) throws IOException {
        ArrayList<FileInputStream> array = new ArrayList<FileInputStream>();
        FileInputStream fis = null;
        for(int i=0;i < 10 ;i++){//搜索一下获取共有几个文件
            fis = new FileInputStream(i+".part");
            array.add(fis);

        }

        Enumeration<FileInputStream> en = Collections.enumeration(array);
        SequenceInputStream sis = new SequenceInputStream(en);
        FileOutputStream fos = new FileOutputStream("a.txt");
        byte[] buf = new byte[1024];
        int len = 0;
        File dir = new File("c:\\a");
        if(dir.exists() == false){
            dir.createNewFile();
        }
        while((len = sis.read(buf)) != -1){
            fos.write(buf,0,len);
        }
        sis.close();
        fos.close();
        fis.close();

    }
}
