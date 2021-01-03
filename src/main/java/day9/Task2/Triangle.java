package day9.Task2;

public class Triangle extends Figure {

    private double lengthA;
    private double lengthB;
    private double lengthC;

    public Triangle(String color, double lengthA, double lengthB, double lengthC) {
        super(color);
        this.lengthA = lengthA;
        this.lengthB = lengthB;
        this.lengthC = lengthC;
    }

    @Override
    public double area() {
        double p = perimeter() / 2;
        return (Math.sqrt(p * (p - lengthA) * (p - lengthB) * (p - lengthC)));
    }

    @Override
    public double perimeter() {
        return (lengthA + lengthB + lengthC);
    }
}
