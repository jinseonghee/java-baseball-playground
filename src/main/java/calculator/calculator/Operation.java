package calculator.calculator;

public class Operation {
    private final String str;
    private final String SPLITER = " ";

    public Operation(String value) {
        this.str = value;
    }

    public String[] split() {
        return this.str.split(SPLITER);
    }
}
