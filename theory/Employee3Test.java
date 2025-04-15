package org.example;

public class Employee3Test {
    public static void main(String[] args) {
        Date1 birth = new Date1(1990, 1, 1);
        Employee3 employee3 = new Employee3("홍길동", birth);
        System.out.println(employee3);
        // Employee [name=홍길동, birthDate=Date [year=1990, month=1, day=1]]
    }
}
