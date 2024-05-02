package calculator;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new ArrayList<>()); // 인스턴스 생성 new ArrayList 구현체를 입력
        Scanner sc = new Scanner(System.in); // Scanner 클래스를 반드시 import
        do { // 무조건 최초에 한번은 실행되어야 하므로 do while 반복문을 사용
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // int 값을 입력받으면 해당 값을 변수 num1에 저장
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // int 값을 입력받으면 해당 값을 변수 num2에 저장
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0); // charAt() 을 사용하여 타입을 일치
            int result = calculator.calculate(num1, num2, operator); //Calculator 클래스 연산 결과를 변수에 선언
            System.out.println("결과 : " + result);
            calculator.getResults().add(result); // .add 메서드를 사용하여 컬렉션에 연산 결과값을 저장
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            if ("remove".equals(sc.next())) { // 피드백 내용 반영, 입력값이 remove 와 동일할 때,
                calculator.removeResults(0); // index 0 값을 삭제
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if ("inquiry".equals(sc.next())) { // 피드백 내용 반영, 입력값이 inquiry 와 동일할 때,
                calculator.inquiryResults(); // 조회 요청만 수행
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
        } while (!sc.next().equals("exit")); // exit 라고 입력하기전까지는 반복되어야 하므로 ! 를 사용
    }

}
