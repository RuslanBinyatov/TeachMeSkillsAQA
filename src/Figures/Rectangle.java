package Figures;

public class Rectangle extends Figure {
    public Rectangle(String figureType, int a, int b) {
        super(figureType);
        this.a = a;
        this.b = b;
    }

    int a;
    int b;

    @Override
    double calculateArea() {
        int s = a * b;
        return s;
    }

    @Override
    double calculatePerimeter() {
        double p = 2 * (a + b);
        return p;
    }
}
//public class Rectangle extends Figure {
//    private static final String NAME = "Rectangle";
//
//    private double width;
//    private double height;
//
//    public Rectangle(double width, double height) {
//        this.width = width;
//        this.height = height;
//    }
//
//    @Override
//    public double getArea() {
//        return width * height;
//    }
//    @Override
//    public double getPerimeter() {
//        double perimeter = (width + height) * 2;
//        return perimeter;
//    }
//
//    @Override
//    public String getName() {
//        return NAME;
//    }
//
//    public double getWidth() {
//        return width;
//    }
//
//    public void setWidth(double width) {
//        this.width = width;
//    }
//
//    public double getHeight() {
//        return height;
//    }
//
//    public void setHeight(double height) {
//        this.height = height;
//    }
//}
