package day9.Task2;

public class TestFigures {
    public static void main(String[] args) {

        Figure[] figures = {
                new Triangle("Red", 10, 10, 10),
                new Triangle("Green", 10, 20, 30),
                new Triangle("Red", 10, 20, 15),
                new Rectangle("Red", 5, 10),
                new Rectangle("Orange", 40, 15),
                new Circle("Red", 4),
                new Circle("Red", 10),
                new Circle("Blue", 5)
        };

        double sumOfPerimetrs = calculateRedPerimeter(figures);
        double sumOfAreas = calculateRedArea(figures);
        System.out.println("Сумма периметров красных фигур = " + sumOfPerimetrs);
        System.out.println("Сумма площадей красных фигур = " + sumOfAreas);


    }

    public static double calculateRedPerimeter(Figure[] figures) {
        double sumOfPerimetrs = 0;
        for (Figure fg : figures) {
            if (fg.getColor().equals("Red")) {
                sumOfPerimetrs += fg.perimeter();
            }
        }
        return sumOfPerimetrs;
    }

    public static double calculateRedArea(Figure[] figures) {
        double sumOfAreas = 0;
        for (Figure fg : figures) {
            if (fg.getColor().equals("Red")) {
                sumOfAreas += fg.area();
            }
        }
        return sumOfAreas;

    }

}
