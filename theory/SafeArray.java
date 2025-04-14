package org.example;

public class SafeArray {
    private int a[];       // 실제 데이터를 저장할 배열 (외부에서 직접 접근 불가)
    public int length;     // 배열의 길이, 외부에서 읽을 수 있도록 public

    // 생성자: 배열 크기를 받아서 배열을 초기화함
    public SafeArray(int size) {
        a = new int[size];
        length = size;
    }

    // 안전한 get 메서드: 범위 안이면 값을 반환, 아니면 -1 반환
    public int get(int index) {
        if(index >= 0 && index < length) {
            return a[index];
        }
        return -1; // 잘못된 인덱스 접근에 대한 예외 처리
    }

    // 안전한 put 메서드: 유효한 인덱스에만 값을 넣음, 아니면 경고 출력
    public void put(int index, int value) {
        if(index >= 0 && index < length) {
            a[index] = value;
        } else {
            System.out.println("잘못된 인덱스 " + index);
        }
    }
}
