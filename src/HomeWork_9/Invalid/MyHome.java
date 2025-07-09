package HomeWork_9.Invalid;

import HomeWork_9.Invalid.Document.InvalidDocumentNumber;

import java.util.Scanner;

public class MyHome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер документа: ");
        String documentNumber = scanner.nextLine();

        try {
            validateDocumentNumber(documentNumber);
            System.out.println("Документ прошел все проверки успешно.");
        } catch (InvalidDocumentNumber e) {
            System.out.println("Исключение: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Методы, который проверяют условия и выбрасывает исключение при нарушении
    public static void validateDocumentNumber(String number) throws InvalidDocumentNumber {
        // Проверка 1: содержит ли 'abc'
        if (!number.contains("abc")) {
            throw new InvalidDocumentNumber("номер документа должен содержать 'abc'");
        }

        // Проверка 2: начинается ли с '555'
        if (!number.startsWith("555")) {
            throw new InvalidDocumentNumber("номер документа должен начинаться с '555'");
        }

        // Проверка 3: заканчивается ли на '1a2b'
        if (!number.endsWith("1a2b")) {
            throw new InvalidDocumentNumber("номер документа должен заканчиваться на '1a2b'");
        }
    }
}
