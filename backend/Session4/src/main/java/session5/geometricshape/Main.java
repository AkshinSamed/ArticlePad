package session5.geometricshape;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(1,3, 4, 5, 7);
        Square square1 = new Square(5);

        System.out.println(triangle);
        System.out.println(circle);
        System.out.println(square1);
    }
}
