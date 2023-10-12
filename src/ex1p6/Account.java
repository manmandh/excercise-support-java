package ex1p6;
public class Account {

        private String id;
        private String name;
        private int balance  ;

        public Account(String id, String name) {
            this.id = id;
            this.name = name;
            balance =0;
        }

        public Account(String id, String name, int balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }

        public String getID() {
            return this.id;
        }

        public String getName() {
            return this.name;
        }

        public int getBalance() {
            return this.balance;
        }

        public int credit(int amount) {
            return balance = amount+ balance;
        }

        public int debit(int amount) {
            if (amount <= balance)
                balance = balance - amount;
            else
                System.out.println("Amount exceeded balance");
            return balance;
        }

        public int tranferTo (Account another, int amount) {
            if (amount <= this.balance) {
                this.balance = this.balance- amount;
                another.balance = another.balance+ amount;
            }
            else {
                System.out.println("Amount exceeded balance");
            }
            return balance;
        }

        @Override
        public String toString() {
            return "Account[id= "+id+", name= "+name+", balance= "+balance+"]";
        }

}
