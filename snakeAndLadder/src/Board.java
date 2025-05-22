import java.util.HashMap;
import java.util.Map;

public class Board {
    private final int size;
    private final Map<Integer, Integer> jumps;

    public Board(int size) {
        this.size = size;
        this.jumps = new HashMap<>();
    }

    public int getSize() {
        return size;
    }

    public void addJump(Jump jump) {
        jumps.put(jump.getStart(), jump.getEnd());
    }

    public int resolveJump(int position) {
        int newPos = jumps.getOrDefault(position, position);
        if (newPos != position) {
            if (newPos < position) {
                System.out.println("Oops! Hit a snake 🐍 from " + position + " to " + newPos);
            } else {
                System.out.println("Yay! Climbed a ladder 🪜 from " + position + " to " + newPos);
            }
        }
        return newPos;
    }

}
