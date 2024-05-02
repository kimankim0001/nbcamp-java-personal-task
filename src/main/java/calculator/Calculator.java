package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private static final double PI = 3.14; // 상수니까 고정
    private List<Integer> results; // 연산 결과를 저장하는 컬렉션 필드 선언
    // 접근제어자를 사용, 정보 은닉, 캡슐화, 직접 접근을 막음
    private List<Double> circleResults; // 월의 넓이 연산 결과 저장
    public Calculator(List<Integer> results, List<Double> circleResults) { // 오버로딩된 생성자
        this.results = results; // 생성자를 초기화
        this.circleResults = circleResults; // 초기화
    }

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

    public double calculateCircleArea(int radius) { // 3.14 가 있으니까 double 형으로 선언
        return PI * radius * radius; // 원의 반지름 = radius , 반지름*반지름*3.14 = 원의 넓이 를 리턴
    }

    // alt + insert 키를 누르면 호출 가능
    public List<Integer> getResults() { // 간접 접근을 할 수 있도록 getter 메서드 구현
        return results;
    }

    public void setResults(List<Integer> results) {
        this.results = results;
    }

    public List<Double> getCircleResults() {
        return circleResults;
    }

    public void setCircleResults(List<Double> circleResults) {
        this.circleResults = circleResults;
    }

    public void removeResults(int index) { // removeResults 메서드 구현
        this.results.remove(index);
    }

    public void inquiryResults() { // inquiryResults 메서드 구현, 실제 조회를 실행
        for (Integer result : results) {
            System.out.println("연산 결과 = " + result);
        }
    }

    public void inquiryCircleResults() {
        for (Double circleResult : circleResults) {
            System.out.println("원의 넓이 = " + circleResult);
        }
    }
}
