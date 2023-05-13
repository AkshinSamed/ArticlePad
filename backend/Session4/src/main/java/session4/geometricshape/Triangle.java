package session4.geometricshape;

public class Triangle extends Shape {
    private double height;

    public Triangle() {
    }

    public Triangle(double height, double sideLength) {
        super(ShapeType.TRIANGLE.sideCount(), sideLength);
        this.height = height;
        setArea(findArea());
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
        // To handle changes occur on side length cause of height change
        double sideLength = (height * height * 4 / 3); // Pythagorean theorem
        setSideLength(sideLength);
        setArea(findArea());
    }

    // Finding area with Math Formula: (1/2) * length * height
    @Override
    public double findArea() {
        return (0.5 * getHeight() * getSideLength());
    }

    @Override
    public String toString() {
        return "A triangle with " + 3 +
                " sides, each of length " + getSideLength() +
                " height " + height +
                " area " +
                getArea();
    }

}
