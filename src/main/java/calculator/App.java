package calculator;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 입력받아야 하는 값이 있을 때 사용, 반드시 Scanner 클래스를 import 해주어야 한다.
        System.out.println("첫 번째 숫자를 입력하세요: ");
        int firstNum = sc.nextInt();
        // 숫자를 입력받으면 해당값을 저장한다.
        System.out.println("두 번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();
        // 숫자를 입력받으면 해당값을 저장한다.

    }
}
