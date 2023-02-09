package homework19;

public class CreditCardTest {

    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard();
        creditCard.balance=500;
        creditCard.interest=1.25;
        creditCard.interestCalculator();

        Visa visaCard=new Visa();
        visaCard.balance=400;
        visaCard.interest=1.35;
        visaCard.interestCalculator();

        AX axCard=new AX();
        axCard.balance=300;
        axCard.interest=1.5;
        axCard.interestCalculator();



    }
}
