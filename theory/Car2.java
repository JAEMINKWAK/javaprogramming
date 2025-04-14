package org.example;

public class Car2 {
    int speed;
    Car2() {
        System.out.println("속도는 " + speed);
    }
    {
        speed = 100;
    }
    public static void main(String args[]) {
        Car2 c1 = new Car2();
        Car2 c2 = new Car2();
//        속도는 100
//        속도는 100
    }
}
