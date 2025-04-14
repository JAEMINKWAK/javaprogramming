package org.example;

public class CircleTest {
    public static void main(String args[]) {
        Point2 p = new Point2(25, 78);
        Circle c = new Circle(p, 10);
        System.out.println(c);
        // Circle [radius=10, center=Point2 [x=25, y=78]]
    }
}
