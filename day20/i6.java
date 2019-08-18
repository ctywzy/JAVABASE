package day20;
/*
匿名内部类
 */
public class i6 {
    int k = 1;
    public void show(){
        System.out.println("111");
    }
    public static void main(String[] args) {
        i6 ii = new i6(){
            int k = 2;
            public void show(){
                System.out.println("222");
            }
        };
        ii.show();
        System.out.println(ii.k);
        /*
        222
        1
         */
    }
}
