package org.example;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String proverb = "A barking dog"; // new 연산자 생략
        String s1, s2, s3, s4; // 참조 변수로서 메소드에서 반환된 참조값을 받는다.

        System.out.println("문자열의 길이 = " + proverb.length()); // 문자열의 길이 = 13

        s1 = proverb.concat("never Bites!"); // 문자열 결합
        s2 = proverb.replace('B', 'b'); // 문자 교환
        s3 = proverb.substring(2, 5); // 부분 문자열 추출
        s4 = proverb.toUpperCase(); // 대문자로 변환

        System.out.println(s1); // A barking dognever Bites!
        System.out.println(s2); // A barking dog
        System.out.println(s3); // bar
        System.out.println(s4); // A BARKING DOG

        String str;
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.print("문자열을 입력하세요> ");
            str = sc.next();
            if(str.equals("quit") == true)
                break;
            if(str.matches("^www\\..+")) {
                System.out.println(str + "은 'www'로 시작합니다.");
            } else {
                System.out.println(str + "은 'www'로 시작하지 않습니다.");
            }
        }
    }
}
