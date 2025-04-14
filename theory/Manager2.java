package org.example;

public class Manager2 extends Employee2{
    private int bonus;

    public Manager2(String name, String address, int salary, int rrn, int bonus) {
        super(name, address, salary, rrn);
        this.bonus = bonus;
    }

    void test() {
        System.out.println("name="+name);
        System.out.println("address="+address);
        System.out.println("salary="+salary);
        // System.out.println("rrn="+rrn);
    }
}
