package Figures;

    /*
    1. Написать иерархию классов «Фигуры».
    Фигура -> Треугольник -> Прямоугольник -> Круг.
    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
    Создать массив из 3 фигур.
    Вывести на экран сумму периметра всех фигур в массиве.
    */

public class Main {
    public static void main(String[] args) {
        Figure[] figure = {
                new Triangle(3, 4, 5),
                new Rectangle(1, 2),
                new Circle(6)};

        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getArea());

        for(Figure fig : figure)
            System.out.println(fig.getName() + ": area = " + fig.getPerimeter());
    }
}
