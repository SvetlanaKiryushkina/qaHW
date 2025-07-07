package HomaWork_8.Shape;

import HomaWork_8.Shape.Ex1.Circle;
import HomaWork_8.Shape.Ex1.Figura;
import HomaWork_8.Shape.Ex1.Rectangle;
import HomaWork_8.Shape.Ex1.Triangle;
import HomaWork_8.Shape.Ex2.Accountant;
import HomaWork_8.Shape.Ex2.Director;
import HomaWork_8.Shape.Ex2.Position;
import HomaWork_8.Shape.Ex2.Worker;

public class MyHome {
        public static void main(String[] args) {
            createFigura();
            createPrintPosition ();
        }

        public static void createFigura (){
            Figura[] figures = new Figura[]{
            new Triangle(3, 4, 5),
            new Rectangle(4, 6),
            new Circle(3),
            new Rectangle(5, 7),
            new Triangle(6, 8, 10),
            };

            double perimeterSum = 0;

            for (Figura fig : figures) {
                perimeterSum += fig.getPerimeter();
            }

            System.out.println("Общая сумма периметров всех фигур: " + perimeterSum);
            System.out.println("**********************************");

            }


        public static void createPrintPosition () {
                    Director director = new Director();
                    Worker worker = new Worker();
                    Accountant accountant = new Accountant();
        // Вызов метода для каждого экземпляра
        director.printPosition();
        worker.printPosition();
        accountant.printPosition();
    }
}

