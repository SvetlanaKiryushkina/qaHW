package HomeWork_7;

import HomeWork_7.Phone.Phone;

public class MyHome {
    public static void main(String[] args) {

        // Создаём три экземпляра класса Phone, выводим на консоль значение переменных для каждого экземпляра
        Phone phone1 = new Phone(1234567, "Samsung", 150.3);
        System.out.println(phone1.getPhoneInformation());
        Phone phone2 = new Phone(1987654, "iPhone");
        System.out.println(phone2.getPhoneInformation());
        Phone phone3 = new Phone();
        System.out.println(phone3.getPhoneInformation());
        System.out.println("**********************************");


        // Вызов метода receiveCall
        phone1.receiveCall("Alex");
        phone2.receiveCall("Mary");
        phone3.receiveCall("Tim");
        System.out.println("**********************************");

        //Вызов метода getNumber
        System.out.println("Номер телефона 1:" + phone1.getNumber());
        System.out.println("Номер телефона 2:" + phone2.getNumber());
        System.out.println("Номер телефона 3:" + phone3.getNumber());
        System.out.println("***********************************");

        //Вызов перегруженного метода receiveCall
        System.out.println("Звонит: "+ phone1.receiveCall("Alex", 80299546));
        System.out.println("Звонит: "+ phone2.receiveCall("Alex", 80299546));
        System.out.println("Звонит: "+ phone3.receiveCall("Alex", 80299546));
        System.out.println("**********************************");

        // Вызов метода sendMessage
        phone1.sendMessage("1234567890", "0987654321");
        phone2.sendMessage("1234567890");
    }
}
