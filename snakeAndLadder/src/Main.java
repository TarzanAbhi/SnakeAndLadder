import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create the board
        Board board = new Board(100);

        // Add snakes
        board.addJump(new Snake(99, 21));
        board.addJump(new Snake(95, 72));
        board.addJump(new Snake(75, 32));

        // Add ladders
        board.addJump(new Ladder(5, 25));
        board.addJump(new Ladder(40, 89));
        board.addJump(new Ladder(10, 50));

        // Create dice
        Dice dice = new Dice(6);

        // Create players
        Player p1 = new Player("Alice");
        Player p2 = new Player("Bob");

        // Start game
        Game game = new Game(board, Arrays.asList(p1, p2), dice);
        game.play();
    }
}
