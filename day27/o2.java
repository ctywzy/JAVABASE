package day27;
/*
正则切割
 */
public class o2 {
    public static void main(String[] args) {
        String names = "abc\\bcd\\ddd\\kfc";
        String[] name = names.split("\\\\");
        System.out.println(name.length);
    }
}
