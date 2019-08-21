package day27;
/*
正则表达式匹配
 */
public class o1 {
    public static void main(String[] args) {
        String regex = "1[358]\\d{9}";
        System.out.println("13231654655".matches(regex));

    }

}
