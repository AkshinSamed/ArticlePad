package org.example.session5.geometricshape;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Triangle extends Shape {
    private double base;
    private double height;
    private double firstSideLen;
    private double secondSideLen;
    private double thirdSideLen;

    public Triangle() {

    }

    public Triangle(double base, double height, double firstSideLen,
                    double secondSideLen, double thirdSideLen) {
        this.base = base;
        this.height = height;
        this.firstSideLen = firstSideLen;
        this.secondSideLen = secondSideLen;
        this.thirdSideLen = thirdSideLen;
        calculatePerimeter();
        calculateArea();
    }

    @Override
    public void calculatePerimeter() {
        this.perimeter = (firstSideLen + secondSideLen + thirdSideLen);
    }

    @Override
    public void calculateArea() {
        this.area = (0.5 * base * height);
    }

    @Override
    public String toString() {
        return "Triangle paremeters ->" +
                "\nBase length: " + this.base +
                "\nHeight length: " + this.height +
                "\nFirst side length: " + this.firstSideLen +
                "\nSecond side length: " + this.secondSideLen +
                "\nThird side length: " + this.thirdSideLen +
                "\nPerimeter: " + this.getPerimeter() +
                "\nArea: " + this.getArea();
    }
}
