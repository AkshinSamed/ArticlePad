package session5.geometricshape;

public class Triangle extends Shape {
    private final double base;
    private final double height;
    private final double firstSideLen;
    private final double secondSideLen;
    private final double thirdSideLen;

    public Triangle(double base, double height, double firstSideLen,
                    double secondSideLen, double thirdSideLen) {
        this.base = base;
        this.height = height;
        this.firstSideLen = firstSideLen;
        this.secondSideLen = secondSideLen;
        this.thirdSideLen = thirdSideLen;
        this.perimeter = calculatePerimeter();
        this.area = calculateArea();
    }

    @Override
    public double calculatePerimeter() {
        return (firstSideLen + secondSideLen + thirdSideLen);
    }

    @Override
    public double calculateArea() {
        return (0.5 * base * height);
    }

    @Override
    public String toString() {
        return "Triangle paremeters ->" +
                "\nBase length: " + this.base +
                "\nHeight length: " + this.height +
                "\nFirst side length: " + this.firstSideLen +
                "\nSecond side length: " + this.secondSideLen +
                "\nThird side length: " + this.thirdSideLen +
                "\nPerimeter: " + this.perimeter +
                "\nArea: " + this.area;
    }
}
