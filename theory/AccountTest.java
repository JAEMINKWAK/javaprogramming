package org.example;

public class AccountTest {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setName("Jaemin");
        obj.setBalance(100000);
        System.out.println("이름은 " + obj.getName() + " 통장 잔고는 " + obj.getBalance() + "입니다.");
        // 이름은 Jaemin 통장 잔고는 100000입니다.
    }
}
