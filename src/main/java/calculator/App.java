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
        int result = 0; // 연산 결과 값을 저장할 변수 result 를 선언
        switch (operator) { // if 문 보다 적절하게 표현할 수 있는 switch 문 사용하여 연산
            case '+' :
                result = num1 + num2;
                break; // switch 문 사용시 case 다음에는 반드시 break 를 넣어준다
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if (num2 != 0) { // if 문을 사용하여 분모가 0이 아닐 때에는 연산진행
                    result = num1 / num2;
                } else { // 분모가 0일 때에는 오류에 대한 내용 출력 및 return 으로 종료
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다. ");
                    return;
                }
                break;
            default : // 사칙연산 기호 이외의 값 입력 시 오류에 대한 내용 출력 및 return 으로 종료
                System.out.println("올바른 선택이 아닙니다.");
                return;
        }
        System.out.println("결과 : " + result);
    }

}
