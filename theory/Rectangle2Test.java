package org.example;

public class Rectangle2Test {
    public static void main(String args []) {
        Rectangle2 r1 = new Rectangle2();
        Rectangle2 r2 = new Rectangle2();

        r1.setX(5);
        r1.setY(3);
        r1.setWidth(10);
        r1.setHeight(20);

        r1.setX(8);
        r1.setY(9);
        r1.setWidth(10);
        r1.setHeight(20);

        r1.print();
        r1.draw();
        r2.print();
        r2.draw();
    }
}
