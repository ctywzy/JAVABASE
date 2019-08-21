package day27;
/*
正则替换
 */
public class o3 {
    public static void main(String[] args) {
        String str = "aabcccdeeeeef";
        String regex = "(.)\\1+";
        str = str.replaceAll(regex,"$1");
        System.out.println(str);
    }
}
