package calculator;

import java.util.List;

public class ArithmeticCalculator extends Calculator{ //상속을 걸어준다 생성자를 줘야한다.


    public ArithmeticCalculator(List<Double> results) {
        super(results); // 슈퍼 연산자를 통해서 상위 클래스의 생성자의 List<Double> results 를 보내준다
    }

    public double calculate (int num1, int num2, char operator) { // 반환 타입이 int 고 3개의 매개변수를 가진 calculate 메서드
        int result = 0; // 연산 결과 값을 저장할 변수 result 를 선언
        switch (operator) {
            case '+' :
                result = num1 + num2;
                break;
            case '-' :
                result = num1 - num2;
                break;
            case '*' :
                result = num1 * num2;
                break;
            case '/' :
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    throw new ArithmeticException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    // 산술, 캐스팅 또는 변환 작업에서 오류가 발생한 경우 throw 하는 예외 클래스 사용
                }
                break;
            default :
                throw new UnsupportedOperationException("올바른 선택이 아닙니다.");
                // 지원되지 않는 작업을 요청했을 때 throw 하는 예외 클래스 사용
        }
        return result;
    }

    @Override // 추상 메서드에 있는 inquiryResults 를 오버라이딩, 재정의했다
    public void inquiryResults() { // inquiryResults 메서드 구현, 실제 조회를 실행
        for (Double result : super.getResults()) {
            System.out.println("연산 결과 = " + result);
        }
    }
}
