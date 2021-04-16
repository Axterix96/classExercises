package partOne;

import partOne.GeometricObject;

public class Circle implements GeometricObject {
    protected double radius = 0;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "partOne.Circle{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * 3.1416 * radius;
        return perimeter;
    }

    @Override
    public double getArea() {
        double area = Math.PI*Math.pow(radius, 2);
        return area;
    }
}
