package HomaWork_4;
import java.util.Scanner;
import java.util.Arrays;


public class HomeWork {
    public static void main(String[] args) {
        getarray();

    }

    //Задание 1. Создать массив целых числел. Вывести сообщение о том, входит ли заданное число в массив. Использовать сканет
    public static void skanernumberarray() {
        // Создаем массив целых чисел
        int[] array = {5, 12, 7, 22, 34, 56, 78, 90};

        // Создаем Scanner для чтения с консоли
        Scanner scanner = new Scanner(System.in);

        // Запрашиваем число для поиска
        System.out.print("Enter a number to search for: ");
        int number = scanner.nextInt();

        // Переменная для определения, найдено ли число
        boolean found = false;

        // Проходим по массиву и ищем число
        for (int num : array) {
            if (num == number) {
                found = true;
                break;
            }
        }

        // Вывод результата
        if (found) {
            System.out.println("Number " + number + " it is included in the array.");
        } else {
            System.out.println("Number " + number + " not included in the array.");
        }

        // Закрываем сканер
        scanner.close();
    }

    //Задание 2. Создать массив. Ввести число с консоли и удалить его из массива
    public static void createnewarray(){

    // Создаем массив целых чисел
    int[] array = {5, 12, 7, 12, -34, 12, 56, 78, 12, 90};
    // Создаем Scanner для чтения с консоли
    Scanner scanner = new Scanner(System.in);
    // Запрашиваем число для поиска
        System.out.print("Enter a number to search for: ");
    int number = scanner.nextInt();
    // Подсчет количества вхождений числа
    int count = 0;
        for(int num :array)
    {
        if (num == number) {
            count++;
        }
    }

        if(count ==0)

    {
        System.out.println("Number " + number + " not found in the array.");
    } else

    {
        // Создаем новый массив без искомого числа
        int[] newArray = new int[array.length - count];
        int index = 0;
        for (int num : array) {
            if (num != number) {
                newArray[index++] = num;
            }
        }

        // Вывод нового массива
        System.out.println("Array after deletion " + number + ": " + Arrays.toString(newArray));
    }
}
    //Задание 3.
    public static void getmathrandom(){
        // Создаем Scanner для чтения с консоли
        Scanner scanner = new Scanner(System.in);
        // Запрашиваем размер массива
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        //создаем массив
        int [] array = new int[size];
        // Заполняем массив случайными числами
        for (int i = 0; i < size; i++) {
            // Math.random() возвращает число от 0.0 до 1.0, умножим на 100, чтобы получить диапазон 0-99
            array[i] = (int)(Math.random() * 100);
        }

        // Выводим массив
        System.out.println("Массив: " + Arrays.toString(array));

        // Инициализируем переменные для поиска min, max, суммы
        int min = array[0];
        int max = array[0];
        int sum = 0;

        for (int num : array) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }

        double average = (double) sum / size;

        // Выводим результаты
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        System.out.println("Среднее значение: " + average);

        scanner.close();
    }
    //Задание 4.
    public static void getarray() {
        // Создаем два массива из 5 чисел
        int[] array1 = {12, 7, 25, 9, 14};
        int[] array2 = {8, 16, 22, 10, 18};

        // Выводим массивы
        System.out.println("Массив 1: " + Arrays.toString(array1));
        System.out.println("Массив 2: " + Arrays.toString(array2));

        // Вычисляем среднее арифметическое первого массива
        double average1 = getAverage(array1);

        // Вычисляем среднее арифметическое второго массива
        double average2 = getAverage(array2);

        // Выводим средние
        System.out.println("Среднее массива 1: " + average1);
        System.out.println("Среднее массива 2: " + average2);

        // Сравниваем значения
        if (average1 > average2) {
            System.out.println("Среднее арифметическое массива 1 больше.");
        } else if (average2 > average1) {
            System.out.println("Среднее арифметическое массива 2 больше.");
        } else {
            System.out.println("Средние арифметические массивов равны.");
        }
    }

    // Метод для вычисления среднего арифметического массива
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
