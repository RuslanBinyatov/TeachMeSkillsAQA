package Figures;

public abstract class Figure {
    private String figureType;

    public Figure(String figureType) {
        this.figureType = figureType;
    }

    public String getFigureType() {
        return figureType;
    }

    abstract double calculateArea();

    abstract double calculatePerimeter();
}