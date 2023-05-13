package session5.geometricshape;

import lombok.Getter;

@Getter
public class Square extends Shape {
    private final double sideLength;

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * sideLength;
    }

    @Override
    public double calculateArea() {
        return sideLength * sideLength;
    }

    @Override
    public String toString() {
        return "Square parameters ->" +
                "\nSide length: " + this.sideLength +
                "\nPerimeter: " + this.perimeter +
                "\nArea: " + this.area;
    }
}
