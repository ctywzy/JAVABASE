package day27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
网页爬虫
获取邮箱
 */
public class o6 {
    public static void main(String[] args) throws IOException {
        //前提是这个路径能够正常访问,
        URL url = new URL("https://mail.qq.com/cgi-bin/frame_html?sid=Uz0MruVElI-TM1MO&r=179c675082e559d2897d9aae67d3fa90");
        BufferedReader bfin = new BufferedReader(new InputStreamReader(url.openStream()));
        String regex = "\\w+@\\w+(\\.\\w+)+";
        List<String> lists = new ArrayList<String>();
        Pattern p = Pattern.compile(regex);

        String line = null;
        while((line = bfin.readLine())!=null){
            System.out.println(line);
//            Matcher m =p.matcher(line);
//            while (m.find()){
//                lists.add(m.group());
//            }
        }
        for(String mail : lists){
            System.out.println(mail);
        }
    }
}
