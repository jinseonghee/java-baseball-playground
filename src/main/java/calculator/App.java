package calculator;

import calculator.calculator.Calculator;
import calculator.calculator.Operation;

import java.util.Scanner;

public class App {
    /**
     * [요구사항]
     * 사용자가 입력한 문자열 값에 따라 사칙연산을 수행할 수 있는 계산기를 구현해야 한다.
     * 문자열 계산기는 사칙연산의 계산 우선순위가 아닌 입력 값에 따라 계산 순서가 결정된다. 즉, 수학에서는 곱셈, 나눗셈이 덧셈, 뺄셈 보다 먼저 계산해야 하지만 이를 무시한다.
     * 예를 들어 "2 + 3 * 4 / 2"와 같은 문자열을 입력할 경우 2 + 3 * 4 / 2 실행 결과인 10을 출력해야 한다.
     *
     * [기능 목록]
     * 문자열을 입력받아 빈 공백 문자열을 기준으로 분리한다.
     * 두 숫자와 오퍼레이터를 입력받아 결과를 계산한다.
     * 계산된 결과를 리턴한다.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String value = scanner.nextLine();
        Calculator calculator = new Calculator(new Operation(value));
//        Calculator calculator = new Calculator(new Operation("2 + 3 * 4 / 2"));
        int result = calculator.calculate();
        System.out.println("result = " + result);
    }
}
