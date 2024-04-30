package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받아야 하는 값이 있을 때 사용, 반드시 Scanner 클래스를 import 해주어야 한다.
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        // 숫자를 입력받으면 해당값을 저장한다.
        System.out.println("두 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();
        // 숫자를 입력받으면 해당값을 저장한다.
        System.out.println("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0);
        // 기호 하나만 넣으니까 String 이 아닌 char 를 사용
        // 이때, 스캐너는 String 타입으로만 입력을 받을 수 있어서 charAt() 을 사용하여 char 타입으로 변환해준다.
        int result = 0;
        // 사칙연산의 결과값이 될 result 를 선언과 초기화
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
        System.out.println("계산 결과는 " + result + " 입니다");
        // if 문을 사용하여 사칙연산 기호마다 결과값을 계산
        // 사칙연산 기호 이외의 입력값에는 에러 메시지를 출력

    }
}
