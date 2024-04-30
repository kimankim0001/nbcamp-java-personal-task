package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // while 문을 사용하여 입력 및 연산을 감싸준다.
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
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.next();
            if (end.equals("exit")) {
                break;
            }
            // 마지막에 if 문을 사용하여 exit 입력 시 break 하여 while 문을 종료시킨다.
        }
    }
}
