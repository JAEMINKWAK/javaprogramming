package org.example;

public class MyCounterTest3 {
    public static void main(String args[]) {
        MyCounter3 obj = new MyCounter3();
        System.out.println("obj.value = " + obj.value);
        obj.inc(obj);
        System.out.println("obj.value = " + obj.value);
//        obj.value = 0
//        obj.value = 1
    }
}
