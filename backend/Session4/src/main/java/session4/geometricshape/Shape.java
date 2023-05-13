package session4.geometricshape;

public class Shape {
    private int sideCount;
    private double sideLength;
    private double area;

    public Shape() {
    }

    public Shape(int sideCount, double sideLength) {
        this.sideCount = sideCount;
        this.sideLength = sideLength;
    }

    public int getSideCount() {
        return this.sideCount;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public double getArea() {
        return area;
    }

    public void setSideLength(double sideLength) {

        this.sideLength = sideLength;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double findArea() {
        double perimeter = sideCount * sideLength;
        double apothem = (sideLength / 2) / (Math.PI / sideCount);
        return (perimeter * apothem) / 2;
    }

    @Override
    public String toString() {
        return "A shape with " + this.sideCount +
                " sides, each of length " + sideLength +
                ", and area " + area;
    }

    @Override
    public Shape clone() throws CloneNotSupportedException {
        Shape clone = (Shape) super.clone();

        return clone;
    }
}
