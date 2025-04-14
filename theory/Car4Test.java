package org.example;

public class Car4Test {
    public static void main(String[] args) {
        Car4 c1 = new Car4("S600", "white", 80);
        Car4 c2 = new Car4("E500", "blue", 80);
        int n = Car4.getNumberOfCars(); // 정적 메소드 호출
        System.out.println("지금까지 생성된 자동차 수 = " + n);
        // 지금까지 생성된 자동차 수 = 2
    }
}
