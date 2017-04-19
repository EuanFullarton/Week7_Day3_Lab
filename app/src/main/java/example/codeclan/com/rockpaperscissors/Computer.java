package example.codeclan.com.rockpaperscissors;

/**
 * Created by user on 19/04/2017.
 */

public class Computer {

    private String choice;

    public Computer() {
    choice = null;
    }

    public void computerChoice(String choice) {
        this.choice = choice;
    }

    public String getComputerChoice() {
        return choice;
    }
}

