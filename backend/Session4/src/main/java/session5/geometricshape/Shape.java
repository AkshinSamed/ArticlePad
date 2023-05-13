package session5.geometricshape;

public abstract class Shape {
    protected double perimeter;
    protected double area;

    public Shape() {
    }

    public abstract double calculatePerimeter();

    public abstract double calculateArea();
}
