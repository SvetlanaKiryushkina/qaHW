package HomaWork_8.Shape.Ex1;

public class Circle extends Figura {
    //Обьявляем переменную радиус
    private final double radius;

    //Конструктор
    public Circle(double radius) {
        this.radius = radius;
    }

    //переопределяем метод
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
