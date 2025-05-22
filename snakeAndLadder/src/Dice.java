import java.util.Random;
public class Dice {
    private final int max;
    private final Random random;
    public Dice(int max){
        this.max = max;
        this.random = new Random();
    }
    public int roll() {
        return random.nextInt(max) + 1;
    }
}
