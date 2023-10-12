package ex2p9;
public class TestDrive {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(2, 5);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(0, 3);
        System.out.println(p2);
        MyPoint p3 = new MyPoint(1, 4);
        System.out.println(p3);

        MyTriangle t1 = new MyTriangle(p1, p2, p3);
        System.out.println(t1);
        System.out.println("perimeter is: "+t1.getPerimeter());
        System.out.println("type is: "+t1.getType());
    }

}
