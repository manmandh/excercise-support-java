package ex1p4;
public class Employee {
    private int id;
    private String fistName;
    private String lastName;
    private int salary;

    public Employee(int id, String fistName, String lastName, int salary) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return id;
    }

    public String getFirstName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getName() {
        return fistName + " " + lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAnnualSalary() {
        return salary*12;
    }

    public int raiseSalary (int percent) {
        return salary =percent*salary/100 + salary;
    }

    @Override
    public String toString() {
        return "Employee[id ="+ id +", name = "+fistName+" "+ lastName +", salary= "+ salary + "]";
    }
}
