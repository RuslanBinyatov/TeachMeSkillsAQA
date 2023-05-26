package Figures;

    /*
    1. Написать иерархию классов «Фигуры».
    Фигура -> Треугольник -> Прямоугольник -> Круг.
    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
    Создать массив из 5 фигур.
    Вывести на экран сумму периметра всех фигур в массиве.
    */

public class Main {
    public static void main(String[] args) {
        createArrayOfFigures();
    }

    public static void createArrayOfFigures() {

        Figure[] figure = {
                new Triangle("Triangle", 3, 4, 5),
                new Rectangle("Rectangle1", 6, 7),
                new Rectangle("Rectangle2", 8, 9),
                new Circle("Circle1", 1),
                new Circle("Circle2", 2)
        };

        for (int i = 0; i < figure.length; i++) {
            System.out.println("Area of a " + figure[i].getFigureType() + " = " + figure[i].calculateArea());
        }
        System.out.println();

        for (int i = 0; i < figure.length; i++) {
            System.out.println("Perimeter of a " + figure[i].getFigureType() + " = " + figure[i].calculatePerimeter());
        }
        System.out.println();

        double sum = 0;

        for (int i = 0; i < figure.length; i++) {
            sum += figure[i].calculatePerimeter();
        }
        System.out.println("Sum of perimeters of all figures = " + sum);
    }
}



//public class Main {
//    public static void main(String[] args) {
//        Figure[] figure = {
//                new Triangle(3, 4, 5),
//                new Rectangle(1, 2),
//                new Circle(6)},
//                new Rectangle2(7, 8),
//        new
//
//        for(Figure fig : figure)
//            System.out.println(fig.getName() + ": area = " + fig.getArea());
//        System.out.println();
//        for(Figure fig : figure)
//            System.out.println(fig.getName() + ": perimeter = " + fig.getPerimeter());
//        System.out.println();
//
//        double sum = 0;
//        for (int i = 0; i < figure.length; i++) {
//            sum += figure[i].getPerimeter();
//        }
//        System.out.println("Sum of perimeters of all figures = " + sum);
//    }
//}
