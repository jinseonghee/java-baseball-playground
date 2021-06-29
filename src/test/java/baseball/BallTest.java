package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class BallTest {

    Ball com;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 3);
    }

    @Test
    void strike() {
        assertThat(com.play(new Ball(1, 3))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    void ball() {
        assertThat(com.play(new Ball(2, 3))).isEqualTo(BallStatus.BALL);
    }

    @Test
    void nothing() {
        assertThat(com.play(new Ball(3, 4))).isEqualTo(BallStatus.NOTHING);
    }
}
