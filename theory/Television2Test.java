package org.example;

public class Television2Test {
    public static void main(String[] args) {
        Television2 myTv = new Television2(7, 10, true); // 채널은 7이고 불륨은 10입니다.
        myTv.print();
        Television2 yourTv = new Television2(11, 20, true); // 채널은 11이고 불륨은 20입니다.
        yourTv.print();
    }
}
