public class Drum {
    private int[] balls;
    private int numberRemainingBalls;
    public Drum(int numBalls){
        numberRemainingBalls = numBalls;
        balls = new int[numBalls];
        for (int i = 0; i < numBalls; i++) {
            balls[i]=i+1;
        }
    }
    public int extractBalls() {
        int randomIndex = (int)(Math.random() * numberRemainingBalls);
        int ball = balls[randomIndex];
        numberRemainingBalls--;
        balls[randomIndex] = balls[numberRemainingBalls];
        return ball;
    }
}
