package Figures;

public class Rectangle extends Figure {
    private static final String NAME = "Rectangle";

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }
    @Override
    public double getPerimeter() {
        double perimeter = (width + height) * 2;
        return perimeter;
    }

    @Override
    public String getName() {
        return NAME;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
