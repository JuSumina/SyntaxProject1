package class23;

public class BankAccount { //parent class or super class or base class

    long accountNumber;
    double money;
    void deposit(){
        System.out.println("Deposit methods from Bank account class");
    }
}

class Checking extends BankAccount {

    double interest;

    void transfer() {
        System.out.println("transfer methods from Checking class");
    }
}

    class Savings extends BankAccount {

        double profit;

        void takeProfit () {
            System.out.println("Profit method from Saving class");
        }
    }


