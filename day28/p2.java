package day28;

public class p2 {
    public static void main(String[] args) {
        Integer i1 = 40;
        Integer i2 = 40;
        Integer i3 = 0;
        Integer i4 = new Integer(40);
        Integer i5 = new Integer(40);
        Integer i6 = new Integer(0);

        System.out.println("i1=i2   " + (i1 == i2));
        System.out.println("i1=i2+i3   " + (i1 == i2 + i3));
        System.out.println("i1=i4   " + (i1 == i4));
        System.out.println("i4=i5   " + (i4 == i5));
        System.out.println("i4=i5+i6   " + (i4 == i5 + i6));
        //用了+以后 i5+i6会被自动拆箱成 int的40，就如下方语句所以，然后i4=integer不能和int比较，也被拆箱成int 40
        //所以比较的就是40==40，结果为相等。
        System.out.println("40=i5+i6   " + (40 == i5 + i6));
    }
}
