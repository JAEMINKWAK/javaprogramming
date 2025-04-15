package org.example;

public class ShapeTest {
    public static void main(String[] args) {
        Shape4 s1, s2;

        s1 = new Shape4(); // 상속 ㄱㄴ
        s2 = new Rectangle5(); // upcasting
        // Rectangle 객체를 Shape 변수로 가리킬 수 있을까?
        // No.
        // Shape4 타입의 변수 s2는 Rectangle5에만 있는 width, height에는 접근할 수 없습니다.
    }
}
