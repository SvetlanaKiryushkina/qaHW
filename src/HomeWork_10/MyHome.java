package HomeWork_10;

import HomeWork_9.Invalid.Document.InvalidDocumentNumber;

import java.util.Scanner;

public class MyHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер документа: ");
        String documentNumber = scanner.nextLine();

        try {
            validateNumber(documentNumber);
            System.out.println("Документ прошел все проверки успешно.");
            System.out.println("*************************************");
            // Вызов метода для вывода двух блоков по 4 цифры
            printTwoBlocksOfFourDigits(documentNumber);
            System.out.println("**************************************");
            //Вызов метода только буквы верхнего регистра
            printLettersUpperCase(documentNumber);
            System.out.println("**************************************");
            //метод, только буквы в нужном формате
            printLettersInFormat(documentNumber);
            System.out.println("****************************************");
            //Буквы заменить *
            replacingLetters (documentNumber);
        } catch (NumberDocument e) {
            System.out.println("Исключение: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Методы, который проверяют условия и выбрасывает исключение при нарушении
    public static void validateNumber(String number) throws NumberDocument {
        String formatRegex = "^\\d{4}-[a-zA-Zа-яА-я]{3}-\\d{4}-[a-zA-Zа-яА-Я]{3}-\\d[a-zA-Zа-яА-Я]\\d[a-zA-Zа-яА-Я]$";
        if (!number.matches(formatRegex)) {
            throw new NumberDocument("Неверный формат номера документа");
        }
        // Проверка 1: содержит ли 'abc'
        if (!number.contains("abc")) {
            throw new NumberDocument("номер документа должен содержать 'abc'");
        }

        // Проверка 2: начинается ли с '555'
        if (!number.startsWith("555")) {
            throw new NumberDocument("номер документа должен начинаться с '555'");
        }

        // Проверка 3: заканчивается ли на '1a2b'
        if (!number.endsWith("1a2b")) {
            throw new NumberDocument("номер документа должен заканчиваться на '1a2b'");
        }
    }
    // Мметод для вывода двух блоков по 4 цифры
    public static void printTwoBlocksOfFourDigits(String number) {
        String digits = "";
        int count = 0;

        for (int i = 0; i < number.length(); i++) {
            char ch = number.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digits += ch;
                count++;
                if (count == 4) {
                    System.out.print(digits + " ");
                    digits = "";
                    count = 0;
                }
            }
        }
        System.out.println();
    }

    //Вывести на экран только буквы в формате yyy/yyy/y/y и в верхнем регистре

    public static void printLettersUpperCase(String documentNumber) {
        StringBuilder letters = new StringBuilder();

        // Перебираем все символы строки
        for (int i = 0; i < documentNumber.length(); i++) {
            char ch = documentNumber.charAt(i);
            // Если символ — буква, добавляем в StringBuilder в верхнем регистре
            if (Character.isLetter(ch)) {
                letters.append(Character.toUpperCase(ch));
            }
        }
        // Выводим результат в нужном формате
        System.out.println("Letters " +
                letters.toString()
                        .replaceAll("^(\\w{3})(\\w{3})(\\w)(\\w)$", "$1/$2/$3/$4"));
    }


    //Вывести на экран только буквы в формате yyy/yyy/y/y
    public static void printLettersInFormat(String documentNumber) {
        StringBuilder letters = new StringBuilder();

        // Перебираем все символы строки
        for (int i = 0; i < documentNumber.length(); i++) {
            char ch = documentNumber.charAt(i);
            // Если символ — буква, добавляем в StringBuilder
            if (Character.isLetter(ch)) {
                letters.append(ch);
            }
        }
        // Выводим результат в нужном формате
        System.out.println(letters.toString()
                        .replaceAll("^(\\w{3})(\\w{3})(\\w)(\\w)$", "$1/$2/$3/$4"));
    }

    //Вывести номер документа, но буквы заменить на *
public static void replacingLetters (String documentNumber){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i< documentNumber.length(); i++){
            Character ch = documentNumber.charAt(i);

            if(Character.isLetter(ch)){
                sb.append('*');
            } else {
                sb.append(ch);
            }
        }

        System.out.println(sb.toString());

}
}

