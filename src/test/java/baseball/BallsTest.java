package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

class BallsTest {

    Balls com;

    @BeforeEach
    void setUp() {
        com = new Balls(Arrays.asList(3, 6, 9));
    }

    @Test
    void three_strike() {
        PlayResult result = com.play(Arrays.asList(3, 6, 9));

        assertThat(result.getStrike()).isEqualTo(3);
        assertThat(result.getBall()).isZero();
        assertThat(result.isGameEnd()).isTrue();
    }


    @Test
    void three_ball() {
        PlayResult result = com.play(Arrays.asList(6, 9, 3));

        assertThat(result.getStrike()).isZero();
        assertThat(result.getBall()).isEqualTo(3);
    }

    @Test
    void three_nothing() {
        PlayResult result = com.play(Arrays.asList(2, 5, 8));

        assertThat(result.getStrike()).isZero();
        assertThat(result.getBall()).isZero();
    }

    @Test
    void strike() {
        assertThat(com.play(new Ball(1, 3))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(com.play(new Ball(1, 6))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        assertThat(com.play(new Ball(1, 8))).isEqualTo(BallStatus.NOTHING);
    }
}
