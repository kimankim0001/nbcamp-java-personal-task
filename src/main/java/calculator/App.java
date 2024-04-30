package calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        ArrayList<Integer> intList = new ArrayList<Integer>();
        // List 컬렉션 타입의 변수 선언
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
            intList.add(result);
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String input = sc.next();
            if (input.equals("remove")) {
                intList.remove(0);
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String check = sc.next();
            if (check.equals("inquiry")) {
                for (int i:intList) {
                    System.out.print(i + " ");
                }
                System.out.println();
                // 결과 출력 후에 바로 옆에 다음 프린트값이 나와서 한 줄 추가함.
            }
            // inquiry 입력시 향상된 for 문으로 저장된 연산 결과들 출력

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.next();
            if (end.equals("exit")) {
                break;
            }

        }
    }
}
