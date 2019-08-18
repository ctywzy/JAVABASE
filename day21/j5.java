package day21;

import java.io.File;
/*
搜索文件夹
 */
public class j5 {
    public static void dfs(String path,int level){
        File f = new File(path);
        String[] names = f.list();
        if(names!=null){
            for(String name:names){
                for(int i=0;i<level;i++)
                    System.out.print("--");
                System.out.println(name);
                dfs(path+"\\"+name,level+1);
            }
        }

    }
    public static void main(String[] args) {
        String path = "E:\\BaiduNetdiskDownload\\讲义+笔记+资料";
        dfs(path,0);
    }
}
