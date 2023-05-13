package org.example.session5.geometricshape;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Square extends Shape {
    private double sideLength;

    public Square() {

    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
        calculatePerimeter();
        calculateArea();
    }

    @Override
    public void calculatePerimeter() {
        this.perimeter = 4 * sideLength;
    }

    @Override
    public void calculateArea() {
        this.area = sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square parameters ->" +
                "\nSide length: " + this.sideLength +
                "\nPerimeter: " + this.getPerimeter() +
                "\nArea: " + this.getArea();
    }
}
