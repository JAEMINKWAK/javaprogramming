package org.example;

public class Box3Test {
    public static void main(String[] args) {
        Box3 obj1 = new Box3(10, 20, 50);
        Box3 obj2 = new Box3(10, 20, 50);

        System.out.println("obj1 == obj2 : " + obj1.isSameBox(obj2));
        // obj1 == obj2 : true
    }
}
