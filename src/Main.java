import observer.Observable;
import observer.Player;
import observer.ScoreHistory;

public class Main {
    public static void main(String[] args){
        Player player1 = new Player("Player 1");
        Observable<Player> player1Observable = new Observable<>(player1);

        ScoreHistory scoreHistory = new ScoreHistory();
        player1Observable.subscribe(scoreHistory);

        player1Observable.subscribe(player -> {
            System.out.println("Player 1 score: " + player.getScore());
        });

        player1.setScore(5);
        player1Observable.setState(player1);

        player1.setScore(10);
        player1Observable.setState(player1);

        scoreHistory.showHistory();
    }
}