package hackerranke.comperator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Player> players =
            new ArrayList<>(List.of(
                new Player("Mohannad", 123),
                new Player("Mohammad", 123),
                new Player("Ibra", 123),
                new Player("khalid", 13),
                new Player("Ahmed", 1050),
                new Player("Maro", 1442)
            ));
        Collections.sort(players, new Checker());
        System.out.println(players);
    }
}
