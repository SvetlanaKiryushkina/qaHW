package HomeWork_5;

import java.util.Random;
import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        createchessboard();
    }

    //Задание 1. Создать трехмерный массив
    public static void createthreearray() {
        Scanner scanner = new Scanner(System.in);

        // Задаем размеры массива
        int x = 2; // количество блоков
        int y = 2; // количество строк в блоке
        int z = 2; // количество столбцов в блоке

        // Создаем трехмерный массив
        int[][][] array = new int[x][y][z];

        // Заполняем массив случайными числами (например, от 0 до 9)
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] = (int) (Math.random() * 10);
                }
            }
        }

        // Выводим исходный массив
        System.out.println("Исходный массив:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        // Запрашиваем число для увеличения
        System.out.print("Введите число для увеличения каждого элемента: ");
        int increment = scanner.nextInt();

        // Увеличиваем каждый элемент на заданное число
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    array[i][j][k] += increment;
                }
            }
        }

        // Выводим измененный массив
        System.out.println("Массив после увеличения:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                for (int k = 0; k < z; k++) {
                    System.out.print(array[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

        scanner.close();
    }

    //Задание 2. Шахматная доска
    public static void createchessboard (){
        Scanner scanner = new Scanner(System.in);

        // Задаем размеры массива 8x8
        int x = 8; // количество строк
        int y = 8; // количество столбцов

        // Создаем двухмерный массив
        String[][] board = new String[x][y];

        // Заполняем доску
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                // Если сумма индексов четная, клетка черная, иначе белая
                if ((i + j) % 2 == 0) {
                    board[i][j] = "B";
                } else {
                    board[i][j] = "W";
                }
            }
        }

        // Выводим доску
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
