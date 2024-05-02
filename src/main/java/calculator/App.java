package calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 클래스를 반드시 import
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); // int 값을 입력받으면 해당 값을 변수 num1에 저장
        System.out.println("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt(); // int 값을 입력받으면 해당 값을 변수 num2에 저장
        System.out.println("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0); // charAt() 을 사용하여 타입을 일치

    }

}
