package ex3p5;
public class Test {
    public static void main(String[] args) {
        MyDate d1 = new MyDate(2012, 2, 28);
        System.out.println(d1);             // Tuesday 28 Feb 2012
        System.out.println(d1.nextDay());   // Wednesday 29 Feb 2012
        System.out.println(d1.nextMonth());
        System.out.println(d1.nextYear());
        System.out.println();

        MyDate d2 = new MyDate(2012, 1, 2);
        System.out.println(d2);
        System.out.println(d2.previousDay());
        System.out.println(d2.previousDay());
        System.out.println(d2.previousMonth()); // Wednesday 30 Nov 2011
        System.out.println(d2.previousYear());
        System.out.println();

        MyDate d3 = new MyDate(2012, 2, 29);
        System.out.println(d3.previousYear());  // Monday 28 Feb 2011

    }
}
