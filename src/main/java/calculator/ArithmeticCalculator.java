package calculator;

import java.util.List;

public class ArithmeticCalculator<T extends Number> extends Calculator{ // 포함관계를 가질 필요가 없다
    public final Class<T> type;

    public ArithmeticCalculator(List<Double> results, Class<T> type) {
        super(results);
        this.type = type;
    }

    public T calculate (T num1, T num2, char operator) { // 반환 타입이 int 고 3개의 매개변수를 가진 calculate 메서드
        return operatorFactory(operator).operate(num1, num2);
    }

    private Operator<T> operatorFactory(char operator) {// 연산 구현체를 선택하는 역할 구현
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch (operatorType) { // 람다식 스위치
            case ADDITION -> new AddOperator(type);
            case SUBSTRACTION -> new SubtractOperator(type);
            case MULTIPLICATION -> new MultiplyOperator(type);
            case DIVISION -> new DivideOperator(type);
            case MODULO -> new ModOperator(type); // 연산자가 추가되도 여기만 추가해주면 됨
        };
    }


    @Override // 추상 메서드에 있는 inquiryResults 를 오버라이딩, 재정의했다
    public void inquiryResults() { // inquiryResults 메서드 구현, 실제 조회를 실행
        for (Double result : super.getResults()) {
            System.out.println("연산 결과 = " + result);
        }
    }
}
