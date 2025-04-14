package org.example;

public class Car3 {
    // 인스턴스 변수: 자동차마다 다른 값
    private String model;
    private String color;
    private int speed;

    // 인스턴스 변수: 자동차의 고유 ID
    private int id;

    // static 변수: 모든 Car3 객체가 공유하는 자동차 총 생산 수
//    private static int numbers = 0;
    public static int numbers = 0; // 캡슐화 깨짐
    // 캡슐화를 보호하기 위해서는 Car4와 같이 해야함
    // 정적 메소드로 return 값을 받아 외부클래스에서 사용하는 것이 좋다.

    // 생성자: 자동차가 만들어질 때 호출됨
    public Car3(String m, String c, int s) {
        model = m;    // 모델명 설정
        color = c;    // 색상 설정
        speed = s;    // 속도 설정

        // 자동차의 생산 개수를 1 증가시키고, 해당 값을 id에 부여
        id = ++numbers;
        // → 첫 번째 자동차는 1번, 두 번째는 2번... 이렇게 고유 id 부여됨
    }
}

