package ex3p1;
public class Test {
    public static void main(String[] args) {
        MyComplex c1 = new MyComplex(2, 5);
        System.out.println(c1);

        MyComplex c2 = new MyComplex(3, 4);
        System.out.println(c2);

        System.out.println(c1.isReal());
        System.out.println(c2.isImaginary());
        System.out.println(c1.equals(c2));
        System.out.println(c2.magnitude());

        System.out.println("add: "+c1.add(c2));
        System.out.println("add: "+c1.subtract(c2));
        System.out.println("add: "+c1.multiply(c2));
        System.out.println("add: "+c1.divide(c2));
        System.out.println(c1.conjugate());
    }
}
