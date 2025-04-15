package org.example;

public class DynamicCallTest {
    public static void main(String[] args) {
        Animal2 animal = new Animal2();
        Dog dog = new Dog();
        Cat cat3 = new Cat();

        Animal2 obj;

        obj = animal;
        obj.sound();

        obj = dog;
        obj.sound();

        obj = cat3;
        obj.sound();

//        Sound of Animal2 class
//        멍멍
//        야옹
    }
}
