package org.example;

public class CarTest {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.changeGear(1);
        myCar.speedUp();
        System.out.println(myCar);
//      Car [color=null, speed=10, gear=1]
    }
}
