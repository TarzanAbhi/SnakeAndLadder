public class Player {
    private final String name;
    private int position; // Start at position 1

    public Player(String name) {
        this.name = name;
        this.position = 1;
    }

    public String getName() { return name; }
    public int getPosition() { return position; }
    public void setPosition(int position) { this.position = position; }
}
