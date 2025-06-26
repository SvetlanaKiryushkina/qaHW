package HomeWork_6.ATM;

import HomeWork_6.ATM.CreditCard.CreditCard;

public class MyHomeWork {
    public static void main(String[] args) {
        createdCreditCard();
    }

    public static void createdCreditCard() {
        CreditCard card1 = new CreditCard("BY12345678", 125.25);
        System.out.println(card1.getCreditCardInformation());

        CreditCard card2 = new CreditCard("USD12345678", 1000.01);
        System.out.println(card2.getCreditCardInformation());

        CreditCard card3 = new CreditCard("EUR12345678", 5000.05);
        System.out.println(card3.getCreditCardInformation());
        System.out.println("******************************");

        card1.addMoney(100);
        System.out.println("Balance 1 card: " + card1.getBalance());
        card2.addMoney((1000.89));
        System.out.println("Balance 2 card: " + card2.getBalance());
        card3.takeMoney(856.35);
        System.out.println("Balance 3 card: " + card3.getBalance());
    }
}
