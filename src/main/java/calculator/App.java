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
            // if 문을 활용하여 index 가 10번째에 다달았을 때,
            // newResults 배열을 생성하여 results 의 값을 한칸씩 당겨 넣어준다.
            // 마지막 10번째 값을 newResults 마지막에 저장한다.
            // else 로 이외의 값을 출력하게 한다.
            if (index >= results.length) {
                int[] newResults = new int[10];
                for (int i = 0; i < 10; i++) {
                    newResults[i] = results[i + 1];
                }
                newResults[9] = result;
            } else {
                results[index] = result;
            }
            index++;
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.next();
            if (end.equals("exit")) {
                break;
            }

        }
    }
}
