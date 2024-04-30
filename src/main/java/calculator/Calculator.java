package calculator;

import java.util.ArrayList;

public class Calculator {

    private ArrayList<Integer> intList = new ArrayList<Integer>();
    // 컬렉션 타입 필드를 외부에서 직접 전근하지 못하도록 private 으로 수정


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
    // Getter 메서드
    public ArrayList<Integer> getIntList() {
        return intList;
    }
    // Setter 메서드
    public void setIntList(ArrayList<Integer> intList) {
        this.intList = intList;
    }
}
