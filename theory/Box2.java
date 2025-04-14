package org.example; // 패키지 선언: org.example 패키지에 속함

public class Box2 {
    // 박스의 가로, 세로, 높이, 부피를 저장하는 필드
    int width, length, height;
    int volume;

    // 생성자: 가로(w), 세로(l), 높이(h)를 받아 필드 초기화하고, 부피를 계산함
    Box2(int w, int l, int h) {
        width = w;           // 가로 설정
        length = l;          // 세로 설정
        height = h;          // 높이 설정
        volume = w * l * h;  // 부피 계산: 가로 * 세로 * 높이
    }

    // 두 개의 Box2 객체를 받아 더 큰 부피를 가진 박스를 반환하는 메서드
    Box2 whosLargest(Box2 box1, Box2 box2) {
        if (box1.volume > box2.volume) {
            return box1; // box1의 부피가 더 크면 box1 반환
        } else {
            return box2; // 그렇지 않으면 box2 반환
        }
    }
}