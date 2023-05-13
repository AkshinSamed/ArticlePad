package org.example.session5.geometricshape;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Circle extends Shape {
    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
        calculatePerimeter();
        calculateArea();
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public void calculatePerimeter() {
        this.perimeter = 2 * Math.PI * this.radius;
    }

    @Override
    public void calculateArea() {
        this.area = Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle parameters ->" +
                "\nRadius length: " + this.radius +
                "\nPerimeter: " + this.getPerimeter() +
                "\nArea: " + this.getArea();
    }
}
