package HomeWork_6.ATM;

import HomeWork_6.ATM.CreditCard.CreditCard;

public class MyHomeWork {
    public static void main(String[] args) {
        createdCreditCard();
    }

    public static void createdCreditCard(){
        CreditCard cardOne = new CreditCard();
        System.out.println(cardOne.gerCreditCardInformation());
}
