package HomeWork_3;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        numberScan();
    }

    //Управляющие конструкции. Задание 1. Вывести название поры года по номеру месяца,используя оператор switch-case
    public static void seasonSwitch() {
        int month = 15;
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Unknown time of the year");
        }
    }

    //Задание 2. Вывести название поры года по номеру месяца,используя оператор if-else-if
    public static void seasonIfElse() {
        int month = 1;

        String season;

        if (month >= 3 && month <= 5) {
            season = "Spring";
        } else if (month >= 6 && month <= 8) {
            season = "Summer";
        } else if (month >= 9 && month <= 11) {
            season = "Autumn";
        } else if (month == 12 || month == 1 || month == 2) {
            season = "Winter";
        } else {
            season = "Unknown time of the year";
        }

        System.out.println("Season: " + season);
    }

    //Задание 3. Определение четности исла
    public static void definitionParity() {
        int number = 25;

        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
    }

    //Задание 4. Темперетура на улице
    public static void temperatura() {
        int number = 152;
        String temperature;

        if (number > -5) {
            temperature = "Hot";
        } else if (number <= -5 && number > -20) {
            temperature = "Normal";
        } else if (number >= -20) {
            temperature = "Cold";
        } else {
            temperature = "Unknown weather";
        }
        System.out.println("Temp: " + temperature);
    }

    //Задание 5. Определить цвет радуги
    public static void colorRainbow() {
        int color = 10;
        switch (color) {
            case 1:
                System.out.println("Orange");
                break;
            case 2:
                System.out.println("Red");
                break;
            case 3:
                System.out.println("Green");
                break;
            case 4:
                System.out.println("Blue");
                break;
            default:
                System.out.println("Unknown the color");
        }
    }

    //Циклы. Задание 1. Вывести нечетные цифры при помощи цикла for
    public static void oddNumbers() {
        for (int i = 1; i <= 99; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
    //Циклы. Задание 2. Вывести на экран от 5 до 1. Использовать декремент --
    public static void numbers(){
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
    //Циклы. Задание 3.Использовать сканер
    public static void numberScan(){
        Scanner scanner = new Scanner(System.in);

        int number;

        // Запрашиваем у пользователя положительное число
        do {
            System.out.print("Enter a positive integer: ");
            number = scanner.nextInt();
        } while (number <= 0);

        int sum = 0;

        // Суммируем числа от 1 до введенного числа
        for (int i = 1; i <= number; i++) {
            sum += i;
        }

        System.out.println("The sum of the numbers from 1 to " + number + " =: " + sum);

        scanner.close();
    }
    //Циклы. Задание 4. While. Вывести последовательность
    public static void sequenceOne(){
        int number = 7;       // начальное число
        int maxNumber = 98;   // конечное число
        int step = 7;         // шаг последовательности

        while (number <= maxNumber) {
            System.out.print(number + " ");
            number += step; // прибавляем шаг для следующего числа
        }
    }
    //Циклы. Задание 5.
    public static void sequenceTwo() {
        int start = 0;
        int step = -5;
        int count = 10;

        for (int i = 0; i < count; i++) {
            System.out.println(start);
            start += step;
        }
    }
    //Циклы. Задание 6. Квадраты 10 и 20
    public static void squaresТnumbers() {
        for (int i = 10; i <= 20; i++) {
            System.out.println("Squares of numbers " + i + " = " + (i * i));
        }
    }
}
