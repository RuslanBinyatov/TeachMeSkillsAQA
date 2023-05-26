package Figures;

public class Rectangle extends Figure {
    public Rectangle(String figureType, double a, double b) {
        super(figureType);
        this.a = a;
        this.b = b;
    }

    double a;
    double b;

    @Override
    double calculateArea() {
        double s = a * b;
        return s;
    }

    @Override
    double calculatePerimeter() {
        double p = 2 * (a + b);
        return p;
    }
}