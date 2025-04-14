package org.example;

public class DateTest {
    public static void main(String[] args) {
        Date date1 = new Date(2015, "8월", 10);
        Date date2 = new Date(2020);
        Date date3 = new Date();
        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
//        Date [year=2015, month=8월, day=10]
//        Date [year=2020, month=1월, day=1]
//        Date [year=1900, month=1월, day=1]
    }
}
