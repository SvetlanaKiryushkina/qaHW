package HomeWork_7.Phone;

public class Phone {
//первый принцип инкапсуляции, скрыть данные
        private int phoneNumber;
        private String phoneModel;
        private double phoneWeight;

    // Конструктор без параметров
    public Phone() {}


    // Конструктор с двумя параметрами
    public Phone(int phoneNumber, String phoneModel) {
        this.phoneNumber = phoneNumber;
        this.phoneModel = phoneModel;
    }

        //конструктор c тремя параметрами
        public Phone(int phoneNumber, String phoneModel, double phoneWeight){
            this.phoneNumber = phoneNumber;
            this.phoneModel = phoneModel;
            this.phoneWeight = phoneWeight;
        }
        //второй принцип инкапсуляции. Работа с полями через методы. Использование гетеров и сетеров
        //классический геттер. Возвращает номер телефона
    public int getNumber(){
            return  this.phoneNumber;
    }

    //метод receiveCall. Выводит имя звонящего
        public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    //перегруженный метод receiveCall. Принимает два параметра имя и номер
    public String receiveCall(String name, int number){
        return "Имя:" + name + ", Номер:" + number;
    }

    // Метод sendMessage
    public void sendMessage(String... numbers) {
        System.out.println("Отправка сообщения на номера:");
        for (String num : numbers) {
            System.out.println(num);
        }
    }

      public String getPhoneInformation(){
            return "Your phone information is: \n"+
                    "Phone Number:" + this.phoneNumber + "\n" +
                    "Phone Model:" + this.phoneModel + "\n" +
                    "Phone Weight:" + this.phoneWeight;
        }
    }
