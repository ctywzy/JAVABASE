package day27;

import java.util.TreeSet;
/*
正则表达式练习
1.把字符串改成我要学编程
2.对给定的ip地址进行排序
3.邮箱地址校验
 */
public class o5 {

    public static void main(String[] args){
        //f1();
        //f2();
        f3("asdf_1@2adf_.com.com.cssssssssso");
    }
    public static void f1(){
        String str = "我我..我我..我.我.我要.....要.要.要.要....要要要学学学学....学学学编编....编....编程程程..程";
        String regex = "";
        str = str.replaceAll("\\.+","");
        System.out.println(str);
        str = str.replaceAll("(.)\\1+","$1");
        System.out.println(str);
    }
    public static void f2(){
        String s1 = "102.168.1.1   13.13.13     3.3.3.2";
        s1 = s1.replaceAll("(\\d+)","00$1");//连续出现的数字前补0;
        s1 = s1.replaceAll("\\d*(\\d{3})","$1");//所有数字都用后三位代替
        //获取
        //s1 = s1.replaceAll("0*(\\d{3})","$1");

        //s1 = s1.replaceAll("0*(\\d+)","$1");
        String ips[] = s1.split(" +");
        System.out.println(ips.length);
        TreeSet<String> ts = new TreeSet<String>();

        for(String ip:ips){
            ts.add(ip);
            //System.out.println(ip);
        }

        for(String ip : ts){
            System.out.println(ip.replaceAll("0*(\\d+)","$1"));
        }
    }
    public static void f3(String str){
        String regex = "[a-zA-Z0-9_]+@[a-zA-Z0-9_]+(\\.[a-zA-Z]{1,3}){1,3}";
        System.out.println(str.matches(regex));
    }
}
