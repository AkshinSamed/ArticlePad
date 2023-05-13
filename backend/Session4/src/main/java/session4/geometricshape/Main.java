package session4.geometricshape;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        try {
            Triangle triangle = new Triangle(3, 4 * 3 * 3 / 3);
            System.out.println(triangle);
            triangle.setHeight(7);
            System.out.println(triangle);

        } catch (Exception e){
            System.out.println(e.toString());
        }
    }
}
