package calculator.calculator;

import java.util.regex.Pattern;

public class Calculator {
    private static final Pattern regExp = Pattern.compile("^[0-9]*$");
    private final Operation operation;
    private Arithmetic arithmetic;
    private int result;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public int calculate() {
        String[] split = operation.split();
        result = 0;
        arithmetic = Arithmetic.PLUS;

        for (String str : split) {
            calculatePartial(str);
        }

        return result;
    }

    private void calculatePartial(String str) {
        if (regExp.matcher(str).find()) {
            result = arithmetic.calculation(result, Integer.parseInt(str));
            return;
        }
        arithmetic = Arithmetic.getOperation(str);
    }
}
