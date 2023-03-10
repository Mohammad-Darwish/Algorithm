package hackerranke.comperator;

public class Player {
    private final String name;
    private final int score;

    public Player(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Player{" +
            "name='" + name + '\'' +
            ", score=" + score +
            '}';
    }
}
