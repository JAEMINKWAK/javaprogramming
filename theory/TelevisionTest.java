package org.example;

public class TelevisionTest {
    public static void main(String[] args) {
        Television myTv = new Television(); // 객체 생성
        myTv.channel = 7;
        myTv.volume = 9;
        myTv.onOff = true;
        Television yourTv = new Television();
        yourTv.channel = 9;
        yourTv.volume = 12;
        yourTv.onOff = true;
        System.out.println("텔레비전의 채널은 " + myTv.channel + "이고 볼륨은 " + myTv.volume + "입니다.");
        System.out.println("텔레비전의 채널은 " + yourTv.channel + "이고 볼륨은 " + yourTv.volume + "입니다.");
//      텔레비전의 채널은 7이고 볼륨은 9입니다.
//      텔레비전의 채널은 9이고 볼륨은 12입니다.
        myTv.print();
        yourTv.print();
//      채널은 7이고 볼륨은 9입니다.
//      채널은 9이고 볼륨은 12입니다.
        int ch = myTv.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");
//      현재 채널은 7입니다.
        myTv.setChannel(11);
        ch = myTv.getChannel();
        System.out.println("현재 채널은 " + ch + "입니다.");
//      현재 채널은 11입니다.
    }
}