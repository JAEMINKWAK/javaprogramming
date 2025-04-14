package org.example;

public class ManagerTest2 {
    public static void main(String[] args) {
        Manager2 m = new Manager2("Tom", "Seoul", 1000000, 123456, 50000);
        System.out.println(m);
        m.test();
//        Employee [name=Tom, address=Seoul, salary=1000000, rrn=123456]
//        name=Tom
//        address=Seoul
//        salary=1000000
    }
}
