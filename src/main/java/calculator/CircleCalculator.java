package calculator;

import java.util.List;

public class CircleCalculator extends Calculator{
    public CircleCalculator(List<Double> results) {
        super(results);
    }

    public double calculate(int radius) { // 3.14 가 있으니까 double 형으로 선언
        return PI * radius * radius; // 원의 반지름 = radius , 반지름*반지름*3.14 = 원의 넓이 를 리턴
    }

    @Override
    public void inquiryResults() { // 동일하게 사용
        for (Double circleResult : super.getResults()) {
            System.out.println("원의 넓이 = " + circleResult);
        }
    }
}
