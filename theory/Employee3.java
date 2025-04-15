package org.example;

public class Employee3 {
    private String name;
    private Date1 birthDate;

    public Employee3(String name, Date1 birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", birthDate=" + birthDate + "]";
    }
}
