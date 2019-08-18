package day20;
/*
内部类
 */

class ii5{
    int k = 1;
    iii5 ii = new iii5();
    class iii5{
        int k=2;
        public void show(){
            /*同名情况下取外部类变量*/
            System.out.println(ii5.this.k);
        }
    }
}
public class i5 {
    public static void main(String[] args) {
        ii5 ii = new ii5();
        ii5.iii5 iii = ii.new iii5();
        iii.show();
    }
}
