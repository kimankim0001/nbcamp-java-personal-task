package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int[] results = new int[10];
        // 배열생성
        int index = 0;
        // index 를 저장하는 변수를 선언
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int firstNum = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            int result = 0;
            if (operator == '+') {
                result = firstNum + secondNum;
            } else if (operator == '-') {
                result = firstNum - secondNum;
            } else if (operator == '*') {
                result = firstNum * secondNum;
            } else if (operator == '/') {
                result = firstNum / secondNum;
            } else {
                System.out.println("연산자 기호를 정확히 입력해주세요(+ - * /)");
            }
            System.out.println("결과 " + result);
            results[index] = result;
            // index 에 결과값을 저장
            index++;
            // index 번호를 증가시킨다.
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.next();
            if (end.equals("exit")) {
                break;
            }

        }
    }
}
