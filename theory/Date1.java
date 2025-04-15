package org.example;

public class Date1 {
    private int year;
    private int month;
    private int day;

    public Date1(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "Date [year=" + year + ", month=" + month + ", day=" + day + "]";
    }
}
