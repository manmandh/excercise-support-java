package ex3p4;
public class Test {
    public static void main(String[] args) {
        MyTime t1 = new MyTime(23, 59, 59);
        t1.nextSecond();
        System.out.println(t1);
        System.out.println(t1.nextMinute());
        System.out.println(t1.nextHour());
        System.out.println(t1.previousSecond());

        MyTime t2 = new MyTime(0, 0, 0);
        System.out.println(t2.previousSecond());
        System.out.println(t2.previousMinute());
        System.out.println(t2.previousHour());
    }
}
