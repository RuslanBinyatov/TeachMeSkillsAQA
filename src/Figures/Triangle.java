package Figures;

public class Triangle extends Figure {
    public Triangle(String figureType, double a, double b, double c) {
        super(figureType);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    double a;
    double b;
    double c;

    @Override
    double calculatePerimeter() {
        double p = a + b + c;
        return p;
    }

    @Override
    double calculateArea() {
        double p2 = calculatePerimeter() / 2;
        double s = Math.sqrt(p2 * (p2 - a) * (p2 - b) * (p2 - c));
        return s;
    }
}