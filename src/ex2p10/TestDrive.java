package ex2p10;
public class TestDrive {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3,4);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(2,3);
        System.out.println(p2);
        MyPoint p3 = new MyPoint(0,1);
        System.out.println(p3);
        MyPoint p4 = new MyPoint(1,2);
        System.out.println(p4);

        MyRectangle h1 = new MyRectangle(p1, p2, p3, p4);
        System.out.println(h1);
        System.out.println("width is: "+ p1.distance(p2));
        System.out.println("length is: "+p1.distance(p3));
        System.out.println("perimeter is: "+h1.getPerimeter());
    }
}
