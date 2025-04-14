package org.example;

public class Television2 {
    private int channel; // 채널 번호
    private int volume; // 볼륨
    private boolean onOff; // 전원 상태

    Television2(int c, int v, boolean o) {
        channel = c;
        volume = v;
        onOff = o;
    }
    void print() {
        System.out.println("채널은 " + channel + "이고 불륨은 " + volume + "입니다.");
    }
}
