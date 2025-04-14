package org.example;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person("jaemin", 24);
        Person person2 = new Person("jeonggeun", 25);

        person1.introduce();
        person2.introduce();

        int newAge = person1.haveBirthday();
        System.out.println(person1.name + " just had a birthday and is now " + newAge + " years old.");
    }
}
