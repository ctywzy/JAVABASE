package day28;
class pp7{
    public String name;
    public void f1(){
        System.out.println("1");
    }
}
public class p7 extends pp7{
    public String name;
    public void f1(){
        System.out.println("2");
    }
    public void f3(){
        System.out.println("3");
    }
    public static void main(String[] args) {

        pp7 k = new p7();
        k.f1();
        pp7 kk = (pp7) k;
        kk.f1();
        new p7(){
            public void f1(){
                System.out.println("4");
            }
        }.f1();
    }
}
