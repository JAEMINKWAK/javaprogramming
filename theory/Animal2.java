package org.example;

public class Animal2 {
    void sound() {
        System.out.println("Sound of Animal2 class");
    }
}

class Dog extends Animal2 {
    void sound() {
        System.out.println("멍멍");
    }
}

class Cat extends Animal2 {
    void sound() {
        System.out.println("야옹");
    }
}
