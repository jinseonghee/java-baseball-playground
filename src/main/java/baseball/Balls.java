package baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private final List<Ball> answers;

    public Balls(List<Integer> answers) {
        this.answers = mapBall(answers);
    }

    public PlayResult play(List<Integer> userBall) {
        Balls userBalls = new Balls(userBall);
        PlayResult result = new PlayResult();
        for (Ball answer : answers) {
            BallStatus status = userBalls.play(answer);
            result.report(status);
        }
        return result;
    }

    public BallStatus play(Ball ball) {
        return answers.stream()
                .map(answer -> answer.play(ball))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    private List<Ball> mapBall(List<Integer> answers) {
        List<Ball> balls = new ArrayList<>();
        int length = answers.size();
        for (int i = 0; i < length; i++) {
            balls.add(new Ball(i + 1, answers.get(i)));
        }
        return balls;
    }
}
