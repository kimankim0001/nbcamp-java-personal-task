package calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> intList = new ArrayList<Integer>();
    // List 컬렉션 타입의 변수 intList 선언

    public int calculate(char operator, int num1, int num2) throws BadException{
        // 예외 플래그를 달아준다.
        int answer = 0;
        if (operator == '+') {
            answer = num1 + num2;
        } else if (operator == '-') {
            answer = num1 - num2;
        } else if (operator == '*') {
            answer = num1 * num2;
        } else if (operator == '/') {
            answer = num1 / num2;
        } else if (operator == '/' & num2 == 0) { // 나누기에서 분모가 0일때 예외처리
            throw new BadException();
        } else { // 연산자에 사칙 연산 기호 이외의 값이 들어갈 때 예외처리
            throw new BadException();
        }
        intList.add(answer);
        return answer;
    }
    // 요구사항에 맞게 구현

}
