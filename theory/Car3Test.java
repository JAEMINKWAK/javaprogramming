package org.example;

public class Car3Test {
    public static void main(String args[]) {
        Car3 c1 = new Car3("S600", "white", 80); // 첫 번째 생성자 호출
        Car3 c2 = new Car3("E500", "blue", 20); // 두 번째 생성자 호출
        int n = Car3.numbers; // 정적 변수
        System.out.print("지금까지 생성된 자동차 수 = " + n);
    }
}
