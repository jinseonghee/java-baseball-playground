package calculator.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OperationTest {

    @Test
    void 문자열을_빈_공백_문자열을_기준으로_분리한다() {
        String input = "2 + 3 * 4 / 2";
        Operation operation = new Operation(input);
        String[] split = operation.split();

        assertThat(split).hasSize(7);
        assertThat(split[0]).isEqualTo("2");
        assertThat(split[split.length - 1]).isEqualTo("2");

    }
}