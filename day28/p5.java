package day28;
interface pp5{
    public abstract pp5 show();
}
public class p5 {
    private static pp5 pp;
    public static void main(String[] args) {
        pp = new pp5() {
            @Override
            public pp5 show() {
                System.out.println("abc");
                return null;
            }
        };
        pp.show();
    }
}
