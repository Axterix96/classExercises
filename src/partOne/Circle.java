package partOne;

import partOne.GeometricObject;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

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

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
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

    public static <T extends Circle> void orderArea(T[] AreaArray){
        Arrays.sort(AreaArray);

        for(int i = 0; i < AreaArray.length; i++){
            System.out.println("AreaArray[i] = " + AreaArray[i]);
        }

    }


}
