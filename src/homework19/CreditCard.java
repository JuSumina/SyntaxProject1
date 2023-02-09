package homework19;

public class CreditCard {

    double balance;
    double interest;

    void interestCalculator () {
        System.out.println("The interest on your outstanding balance is "+(balance*(interest/100)));
    }
}

class Visa extends CreditCard{

}

class AX extends CreditCard{

    void interestCalculator () {
        System.out.println("The interest on your outstanding balance is "+(balance*(interest/100))+"%. And you also have to pay extra $25 fee every month.");
    }

}