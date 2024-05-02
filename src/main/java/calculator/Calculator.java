package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    List<Integer> results = new ArrayList<>(); // 연산 결과를 저장하는 컬렉션 필드 선언
    public int calculate (int num1, int num2, char operator) { // 반환 타입이 int 고 3개의 매개변수를 가진 calculate 메서드
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
}
