package org.example;

public class Rectangle2 extends Shape {
    private int width;
    private int height;

    public int getWidth() { return width; }
    public void setWidth(int width) { this.width = width; }
    public int getHeight() { return height; }
    public void setHeight(int height) { this.height = height; }

    double area() {
        return (double)width * height;
    }
    void draw() {
        System.out.println("(" + this.getX() + ", " + this.getY() + ") 위치에 가로: " + width + " 세로: " + height);
//        System.out.println("(" + x + ", " + y + ") 위치에 가로: " + width + " 세로: " + height);
        // 부모 클래스의 private 멤버 x와 y는 사용할 수 없다.
    }
}
