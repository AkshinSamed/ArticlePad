package org.example.session5.geometricshape;

public abstract class Shape {
    protected double perimeter;
    protected double area;

    public abstract void calculatePerimeter();

    public abstract void calculateArea();

    // If any fields that in subclasses change, it will change perimeter and area too. So we need to update them.
    public double getPerimeter(){
        calculatePerimeter();
        return this.perimeter;
    }

    public double getArea(){
        calculateArea();
        return this.area;
    }
}
