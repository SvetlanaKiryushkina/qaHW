package HomeWork_9.Invalid.Document;

//Создаем собственное исключение
public class InvalidDocumentNumber extends Exception {
    public InvalidDocumentNumber (String message) {
        super(message);
    }

}
