package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator{ // 포함관계를 가질 필요가 없다

    //생성자 초기화
    public ArithmeticCalculator(List<Double> results) {
        super(results);
    }

    public double calculate (int num1, int num2, char operator) { // 반환 타입이 int 고 3개의 매개변수를 가진 calculate 메서드
        return operatorFactory(operator).operate(num1, num2);
    }

    private Operator operatorFactory(char operator) {// 연산 구현체를 선택하는 역할 구현
        return switch (operator) { // 람다식 스위치
            case '+' -> new AddOperator();
            case '-' -> new SubtractOperator();
            case '*' -> new MultiplyOperator();
            case '/' -> new DivideOperator();
            case '%' -> new ModOperator(); // 연산자가 추가되도 여기만 추가해주면 됨
            default -> throw new UnsupportedOperationException("올바른 선택이 아닙니다.");
        };
    }


    @Override // 추상 메서드에 있는 inquiryResults 를 오버라이딩, 재정의했다
    public void inquiryResults() { // inquiryResults 메서드 구현, 실제 조회를 실행
        for (Double result : super.getResults()) {
            System.out.println("연산 결과 = " + result);
        }
    }
}
