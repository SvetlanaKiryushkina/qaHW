package HomaWork_8.Shape.Ex1;

public class Rectangle extends Figura {
    //Обьявляем переменные, длинна и ширина
    private final double width;
    private final double height;

    //конструктор
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    //переопределяем метод, расчет площади
    @Override
    public double getArea() {
        return width * height;
    }

    //переопределяем метод.расчет периметра
    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}