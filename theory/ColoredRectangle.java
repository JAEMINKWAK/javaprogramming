package org.example;  // 패키지 이름 정의. 이 클래스는 org.example 패키지에 속함

// Rectangle 클래스를 상속받는 ColoredRectangle 클래스 선언
public class ColoredRectangle extends Rectangle {
    String color; // 색상을 저장할 인스턴스 변수

    // 생성자: 위치(x, y), 크기(width, height), 색상(color)을 입력받음
    public ColoredRectangle(int x, int y, int width, int height, String color) {
        super(x, y, width, height); // 부모 클래스(Rectangle)의 생성자를 호출하여 공통 필드 초기화
        System.out.println("ColoredRectangle()"); // 생성자 호출 확인용 메시지 출력
        this.color = color; // 색상 필드 초기화
    }

    // main 메소드: 실행 진입점
    public static void main(String[] args) {
        // ColoredRectangle 객체 생성: 위치 (10,10), 크기 (20x20), 색상 "Red"
        ColoredRectangle obj = new ColoredRectangle(10, 10, 20, 20, "Red");
    }
}

