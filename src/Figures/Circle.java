package Figures;

public class Circle extends Figure {
    public Circle(String figureType, double radius) {
        super(figureType);
        this.radius = radius;
    }

    double radius;

    @Override
    double calculateArea() {
        double s = Math.PI * radius * radius;
        return s;
    }

    @Override
    double calculatePerimeter() {
        double p = Math.PI * radius * 2;
        return p;
    }
}