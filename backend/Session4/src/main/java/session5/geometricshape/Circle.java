package session5.geometricshape;

import lombok.Getter;

@Getter
public class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle parameters ->" +
                "\nRadius length: " + this.radius +
                "\nPerimeter: " + this.perimeter +
                "\nArea: " + this.area;
    }
}
