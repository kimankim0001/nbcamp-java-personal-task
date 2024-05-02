package calculator;

public class AddOperator implements Operator { // 인터페이스를 구현 implements
    @Override
    public int operate(int num1, int num2) {
        return num1 + num2;
    }
}
