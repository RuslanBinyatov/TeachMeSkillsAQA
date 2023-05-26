package Figures;

public abstract class Figure {
    private String figureType;
//    final double PI = 3.14;

    public Figure(String figureType) {
        this.figureType = figureType;
    }

    public String getFigureType() {
        return figureType;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}

//public abstract class Figure {
//    public abstract double getArea();
//    public abstract String getName();
//    public abstract double getPerimeter();
//}
