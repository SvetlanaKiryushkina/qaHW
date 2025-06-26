package HomeWork_6.ATM.CreditCard;

public class CreditCard {
    String cardAccountNumber;
    double cardBalanceSum;

    public String gerCreditCardInformation (){
        return "Account Number is: " + cardAccountNumber + "\n"+
                "Balance Sum is: " + cardBalanceSum + "\n";
    }

}
