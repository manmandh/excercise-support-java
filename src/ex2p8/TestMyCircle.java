package ex2p8;
public class TestMyCircle {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(3, 5);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(2, 3);
        System.out.println();

        MyCircle c1 = new MyCircle(3, 4, 12);
        System.out.println(c1);
        MyCircle c2 = new MyCircle(p1, 4);
        System.out.println(c2);

        System.out.println("area is: "+ c2.getArea());
        System.out.println("circumference is: "+c1.getCircumference());
        System.out.println("distance is: "+c1.distance(c2));

    }
}
