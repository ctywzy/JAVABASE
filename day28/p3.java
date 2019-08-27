package day28;

public class p3 {
    public static void main(String[] args) {


        String str1 = "str";
        String str2 = "ing";
        String str3 = "str" + "ing";
        String str4 = str1 + str2;//因为str1与str2都是变量，虽然他们在编译时期被赋值
        //但是str4由两个变量相加而成，他并不知道str1和str2的值，所以并不能在编译器被赋值，只能创造一个新的对象。
        System.out.println(str3 == str4);//false

        String str5 = "string";
        System.out.println(str3 == str5);//true
    }
}
