package org.example;

public class SafeArrayTest {
    public static void main(String args[]) {
        // 크기 3의 SafeArray 객체 생성
        SafeArray array = new SafeArray(3);

        // 인덱스 0부터 3까지 반복 → 일부러 배열 크기보다 하나 더 많이 접근함
        for(int i = 0; i < (array.length + 1); i++) {
            array.put(i, i * 10); // 배열에 값 저장
        }
    }
}

