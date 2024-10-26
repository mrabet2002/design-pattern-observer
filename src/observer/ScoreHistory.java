package observer;

import java.util.ArrayList;
import java.util.List;

public class ScoreHistory implements Observer<Player> {
    private String playerName;
    private final List<Integer> scores = new ArrayList<>();

    public void update(Player player){
        playerName = player.getName();
        scores.add(player.getScore());
    }

    public void showHistory(){
        System.out.println("Score history of " + playerName + ":");
        for (int i = 0; i < scores.size(); i++) {
            System.out.println("Score " + (i + 1) + ": " + scores.get(i));
        }
    }
}
