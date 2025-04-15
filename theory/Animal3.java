package org.example;

public class Animal3 {
    public static void eat() {
        System.out.println("Animal의 정적 메소드 eat()");
    }
    public void sound() {
        System.out.println("Animal의 인스턴스 메소드 sound()");
    }
}

class Cat2 extends Animal3 {
    public static void eat() {
        System.out.println("Cat의 정적 메소드 eat()");
    }
    public void sound() {
        System.out.println("Cat의 인스턴스 메소드 sound()");
    }

    public static void main(String[] args) {
        Cat2 myCat = new Cat2();
        Animal3 myAnimal = myCat;
        Animal3.eat();
        myAnimal.sound();
//        Animal의 정적 메소드 eat()
//        Cat의 인스턴스 메소드 sound()
    }
}
