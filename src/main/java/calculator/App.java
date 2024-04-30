package calculator;


import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        // Calculator 인스턴스 생성

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.println("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.println("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);
            try {
                System.out.println("결과 " + calculator.calculate(operator, num1, num2));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.println("예외처리 핸들링 완료 계속 진행");
            }
            // try catch finally 문으로 결과값 감싸서 에러 발생시 예외처리

            // 결과값 calculator 클래스에서 연산하여 출력
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String input = sc.next();
            if (input.equals("remove")) {
                calculator.removeResult();
                // removeResult 메서드 활용
            }
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String check = sc.next();
            if (check.equals("inquiry")) {
                for (int i: calculator.getIntList()) {
                    // intList 를 calculator 클래스에서 가져온다
                    // 구현한 Getter 메서드 활용
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String end = sc.next();
            if (end.equals("exit")) {
                break;
            }

        }
    }
}
