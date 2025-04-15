package org.example;

public class ShapeTest4 {
    public static void printLocation(Shape5 s){
        System.out.println("x="+s.x+",y="+s.y);
    }
    public static void main(String[] args) {
        Rectangle6 s1 = new Rectangle6();
        Triangle6 s2 = new Triangle6();
        Circle6 s3 = new Circle6();

        printLocation(s1);
        printLocation(s2);
        printLocation(s3);
    }
}
