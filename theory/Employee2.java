package org.example;

public class Employee2 {
    public String name; // 이름: public 멤버
    String address; // 주소: package 멤버
    protected int salary; // 월급: protected 멤버
    private int rrn; // 주민등록번호: private 멤버

    public Employee2(String name, String address, int salary, int rrn) {
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.rrn = rrn;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", addres=" + address + ", salary=" + salary + ", rrn=" + rrn + "]";
    }
}
