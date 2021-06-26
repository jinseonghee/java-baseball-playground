package calculator.calculator;

import java.util.Arrays;
import java.util.function.BiFunction;

public enum Arithmetic {

    PLUS("+", (num1, num2) -> num1 + num2),
    MINUS("-", (num1, num2) -> num1 - num2),
    MULTIPLY("*", (num1, num2) -> num1 * num2),
    DIVIDE("/", (num1, num2) -> num1 / num2);

    private final String operator;
    private final BiFunction<Integer, Integer, Integer> expression;

    Arithmetic(String operator, BiFunction<Integer, Integer, Integer> expression) {
        this.operator = operator;
        this.expression = expression;
    }

    public int calculation(int num1, int num2) {
        return expression.apply(num1, num2);
    }

    public static Arithmetic getOperation(String operator) {
        return Arrays.stream(values())
                .filter(o -> o.operator.equals(operator))
                .findFirst().orElseThrow(IllegalArgumentException::new);
    }
}
