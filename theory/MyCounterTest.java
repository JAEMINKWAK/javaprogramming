package org.example;

public class MyCounterTest {
    public static void main(String[] args[]) {
        MyCounter obj1 = new MyCounter(100);
        MyCounter obj2 = new MyCounter(200);
        System.out.println("객체 1의 counter = " + obj1.counter); // 객체 1의 counter = 100
        System.out.println("객체 2의 counter = " + obj2.counter); // 객체 2의 counter = 200
    }
}
