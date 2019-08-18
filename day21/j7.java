package day21;

import java.io.File;
/*
递归删除目录
因为直接删除最外层目录是会出错的
 */
public class j7 {
    public static void f(String path){
        File f = new File(path);
        File[] files = f.listFiles();

        if(files != null){
            for(File file : files){
                f(path+"\\"+file.getName());
                System.out.println(file.getName());
                file.delete();
            }

        }
        f.delete();


    }
    public static void main(String[] args) {
        f("D:\\1");
    }
}
