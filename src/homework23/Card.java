package homework23;

import java.util.LinkedList;

public class Card {

    double interestRate;
    String cardType;

    Card (double interestRate, String cardType) {
        this.interestRate=interestRate;
        this.cardType=cardType;
    }

    void intRate () {
        System.out.println("Your interest rate is "+interestRate);
    }

    void cType () {
        System.out.println("You have "+cardType);
    }


    public static void main(String[] args) {

        Card chaseUnlimited = new Card(19.24, "Chase Unlimited Credit Card");
        Card amexPlatinum = new Card (20.49, "AMEX Platinum Credit Card");
        Card appleCard = new Card (15.24, "Apple Card Credit Card");

        LinkedList <Card> cards = new LinkedList<>();
        cards.add(chaseUnlimited);
        cards.add(amexPlatinum);
        cards.add(appleCard);

        for (Card c:cards) {
            c.cType();
            c.intRate();
        }
    }
}
