package calculator.calculator;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

class CalculatorTest {

    @ParameterizedTest
    @CsvSource(value = {"2 + 3: 5", "10 * 2 : 20", "30 - 7 : 23", "12 / 3 : 4"}, delimiter = ':')
    void 연산자_하나에_대한_계산_테스트(String input, int expected) {
        Calculator calculator = new Calculator(new Operation(input));
        int result = calculator.calculate();

        assertThat(result).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"2 + 3 * 4: 20", "3 + 3 / 3 : 2"}, delimiter = ':')
    void 멀티_연산자에_대한_계산_테스트(String input, int expected) {
        Calculator calculator = new Calculator(new Operation(input));
        int result = calculator.calculate();

        assertThat(result).isEqualTo(expected);
    }


}