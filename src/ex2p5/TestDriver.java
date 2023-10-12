package ex2p5;
public class TestDriver {
    public static void main(String[] args) {
        Customer c1 = new Customer(1234, "Anh vi", 'm');
        System.out.println(c1);

        System.out.println("ID is: "+c1.getID());
        System.out.println("name is: "+c1.getName());
        System.out.println("gender is: "+c1.getGender());

        Account a1 = new Account(1456, c1, 1000);
        System.out.println(a1);

        a1.deposit(50);
        System.out.println(a1);
        a1.withdraw(100);
        System.out.println(a1);

    }
}
