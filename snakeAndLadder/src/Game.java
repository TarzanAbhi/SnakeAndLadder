import java.util.*;

public class Game {
    private final Board board;
    private final Queue<Player> players;
    private final Dice dice;

    public Game(Board board, List<Player> players, Dice dice) {
        this.board = board;
        this.players = new LinkedList<>(players);
        this.dice = dice;
    }

    public void play() {
        boolean won = false;
        while (!won) {
            Player curr = players.poll();
            int roll = dice.roll();
            System.out.println(curr.getName() + " rolled a " + roll);
            int next = curr.getPosition() + roll;
            if (next > board.getSize()) {
                System.out.println("Can't move. Remain at " + curr.getPosition());
            } else {
                next = board.resolveJump(next);
                curr.setPosition(next);
                System.out.println(curr.getName() + " moved to " + next);
                if (next == board.getSize()) {
                    System.out.println("🎉 " + curr.getName() + " wins!");
                    won = true;
                    continue;
                }
            }
            players.offer(curr);
            System.out.println("-------------------");
        }
    }

}
