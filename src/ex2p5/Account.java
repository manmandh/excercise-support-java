package ex2p5;
public class Account {
    private int id;
    private Customer customer;
    private double balance =0;

    public Account(int id, Customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public Account(int id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public int getID() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return customer+" balance= "+balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public void deposit (double amount) {
        if (amount <=0)
            System.out.println("you can not deposit zero or less");
        else
            balance = balance +amount;
    }

    public void withdraw (double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
        else System.out.println("amount withdraw exceeds the current balance");
    }

}
