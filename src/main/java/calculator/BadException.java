package calculator;

// 예외 클래스를 만들어서 예외를 정의
public class BadException extends Exception {
    public BadException() {
        super("예외 처리");
    }
}
