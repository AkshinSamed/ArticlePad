package org.example;

import org.example.session5.geometricshape.Circle;
import org.example.session5.geometricshape.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(1, 2, 3, 5, 7);
        System.out.println(triangle);
        triangle.setHeight(5);
        System.out.println(triangle);
    }
}
