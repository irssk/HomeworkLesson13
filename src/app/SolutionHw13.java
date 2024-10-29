package app;

import app.shapes.Shape;
import app.shapes.Circle;
import app.shapes.Triangle;
import app.shapes.Square;

public class SolutionHw13 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[] {
                new Circle(5),
                new Triangle(4, 3),
                new Square(6)
        };

        double totalArea = calculateTotalArea(shapes);
        System.out.println("Суммарная площадь всех фигур: " + totalArea);
    }

    public static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.getArea();
        }
        return totalArea;
    }
}