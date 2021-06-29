package baseball;

public class PlayResult {
    private int strikeCount = 0;
    private int ballCount = 0;

    public int getStrike() {
        return this.strikeCount;
    }

    public int getBall() {
        return this.ballCount;
    }

    public void report(BallStatus status) {
        if (status.isStrike()) {
            strikeCount++;
        }

        if (status.isBall()) {
            ballCount++;
        }
    }

    public boolean isGameEnd() {
        return strikeCount == 3;
    }
}
