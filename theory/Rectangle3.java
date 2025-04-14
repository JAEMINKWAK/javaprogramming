package org.example;

public class Rectangle3 extends Shape2 {
    private int width;
    private int height;

    public Rectangle3(int x, int y, int width, int height) {
        super(x, y);
        System.out.println("Rectangle()");
        this.width = width;
        this.height = height;
    }

    double calcArea()  {
        return width * height;
    }

}
