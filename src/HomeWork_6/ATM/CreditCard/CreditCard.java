package HomeWork_6.ATM.CreditCard;

public class CreditCard {
    String cardAccountNumber;
    double cardBalanceSum;

    //Создаем конструктор
    public CreditCard(String cardAccountNumber, double cardBalanceSum) {
        this.cardAccountNumber = cardAccountNumber;
        this.cardBalanceSum = cardBalanceSum;
    }

    //метод вывода информации по картам
    public String getCreditCardInformation (){
        return "Account Number is: " + cardAccountNumber + "\n"+
                "Balance Sum is: " + cardBalanceSum;
    }
    // метод пополнения карты
    public void addMoney(double money){
        this.cardBalanceSum += money;
    }
    //метод снятия с карты
    public void takeMoney(double money){
        this.cardBalanceSum -= money;
    }

    //отобразить текущий баланс
    public double getBalance(){
        return this.cardBalanceSum;
    }

}
