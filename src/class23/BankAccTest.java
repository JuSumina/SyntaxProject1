package class23;

public class BankAccTest {

    public static void main(String[] args) {

        BankAccount ba=new BankAccount();
        ba.accountNumber=1853946528290l;
        ba.money=1000;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("--- Create an Object of Checking Account");

        Checking check=new Checking();
        check.accountNumber=129747642546l;
        check.money=2000;
        check.interest=1;


        check.deposit();
        check.transfer();

        Savings save=new Savings();
        save.accountNumber=773651375713l;
        save.money=3000;
        save.profit=100;

        save.deposit();
        save.takeProfit();

    }
}
