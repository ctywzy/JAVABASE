package day20;
class ii2{
    public ii2(){
        System.out.println("ii2");
        show();
    }
    void show(){

    }
}
public class i2 extends ii2{
    int count = 1;
    public i2(){
        show();
    }
    public void show(){
        System.out.println(count);
    }
    public static void main(String[] args) {
        i2 i = new i2();
    }
}
