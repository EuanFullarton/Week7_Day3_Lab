package example.codeclan.com.rockpaperscissors;

/**
 * Created by user on 19/04/2017.
 */

public class Player {

    private String choice;

    public Player() {
        choice = null;
    }

    public void playerChoice(String choice) {
        this.choice = choice;
    }

    public String getPlayerChoice() {
        return choice;
    }
}
