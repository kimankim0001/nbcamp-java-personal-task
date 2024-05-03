package calculator;

public interface Operator<T extends Number> { // 추상 메서드 선언
    T operate(T num1, T num2);
}
