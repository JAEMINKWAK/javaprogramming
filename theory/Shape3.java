package org.example;

abstract class Shape3 {
    private int x, y;
    private void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public abstract void draw();
};

class Rectangle4 extends Shape3 {
    private int width, height;
    public void draw() { // 추상 메소드 구현
        System.out.println("사각형 그리기 메소드");
    }
};

class Circle2 extends Shape3 {
    private int radius;
    public void draw() {
        System.out.println("원 그리기 메소드");
    }
};
