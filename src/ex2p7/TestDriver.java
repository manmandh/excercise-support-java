package ex2p7;
public class TestDriver {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2, 5);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(5, 3);
        System.out.println(p2);

        MyLine l1 = new MyLine(p1, p2);
        System.out.println(l1);

        System.out.println("length is: "+l1.getLength());
        System.out.println("gradient is: "+l1.getGradient());
    }
}
