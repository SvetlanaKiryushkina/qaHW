package HomeWork_7;

import HomeWork_7.Phone.Phone;

public class MyHome {
    public static void main(String[] args) {
        createPhone();
    }

    public static void createPhone() {
        Phone phone = new Phone(253658963, "Nokia", 152);
        System.out.println (phone.getPhoneInformation());

    }
}
