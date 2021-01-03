package day9.Task2;

public class Circle extends Figure {

    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return (3.14 * radius);
    }

    @Override
    public double perimeter() {
        return (2 * 3.14 * radius);
    }
}
