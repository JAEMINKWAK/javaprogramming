package org.example; // 이 클래스가 속한 패키지 이름

// 계좌(Account)를 나타내는 클래스 정의
public class Account {
    // 계좌 번호를 저장하는 변수 (외부에서 직접 접근 불가능)
    private int regNumber;

    // 계좌 주인의 이름을 저장하는 변수 (외부에서 직접 접근 불가능)
    private String name;

    // 계좌 잔액을 저장하는 변수 (외부에서 직접 접근 불가능)
    private int balance;

    // 계좌 주인의 이름을 반환하는 메서드 (Getter)
    public String getName() {
        return name;
    }

    // 계좌 주인의 이름을 설정하는 메서드 (Setter)
    public void setName(String name) {
        this.name = name;
    }

    // 계좌의 잔액을 반환하는 메서드 (Getter)
    public int getBalance() {
        return balance;
    }

    // 계좌의 잔액을 설정하는 메서드 (Setter)
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
