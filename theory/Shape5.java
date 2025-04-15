package org.example;

class Shape5 {
    protected int x, y;
    public void draw() {
        System.out.println("Shape5 Draw");
    }
}

class Rectangle6 extends Shape5 {
    private int width, height;
    public void draw() {
        System.out.println("Rectangle6 Draw");
    }
}

class Triangle6 extends Shape5 {
    private int base, height;
    public void draw() {
        System.out.println("Triangle6 Draw");
    }
}

class Circle6 extends Shape5 {
    private int radius;
    public void draw() {
        System.out.println("Circle6 Draw");
    }
}