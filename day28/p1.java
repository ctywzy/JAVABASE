package day28;

public class p1 {
    public static void show(){
        final int j;
        {
            j=1;
        }
        System.out.println(j);
    }
    public static void main(String[] args) {
        final int j;//不报错,叫做final空白，声明时不赋值，使用前赋值
        //System.out.println(j);//错
        byte b1=1,b2=2,b3,b6,b8;
        //System.out.println(b8);
        final byte b4=4,b5=6,b7;
        b3= (byte) (b1+b2);  /*语句1*/
        b6=b4+b5;    /*语句2*/
        b8= (byte) (b1+b4);  /*语句3*/
        //b7= (byte) (b2+b5);  /*语句4*/
        show();
        //System.out.println(b3+b6);
    }
}
