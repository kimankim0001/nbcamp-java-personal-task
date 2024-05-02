package calculator;

import java.util.ArrayList;
import java.util.List;

public abstract class Calculator { // 추상 클래스 스스로는 답을 만들지 못함
    public static final double PI = 3.14; // 상수니까 고정
    private final List<Double> results; // 연산 결과를 저장하는 컬렉션 필드 선언
    // 접근제어자를 사용, 정보 은닉, 캡슐화, 직접 접근을 막음
    public Calculator(List<Double> results) { // 오버로딩된 생성자
        this.results = results; // 생성자를 초기화
    }

    public void removeResults(int index) { // removeResults 메서드 구현
        this.results.remove(index);
    }

    abstract void inquiryResults();// 추상 메서드

    public List<Double> getResults() {
        return results;
    }
}
