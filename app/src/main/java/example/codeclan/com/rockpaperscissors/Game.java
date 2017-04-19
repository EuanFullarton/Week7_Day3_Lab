package example.codeclan.com.rockpaperscissors;

/**
 * Created by user on 19/04/2017.
 */

public class Game {

    Player player;
    Computer computer;
    private String choice;

    public Game(Player player, Computer computer) {
        this.player = player;
        this.computer = computer;
    }

    public String play() {
        if (player.getPlayerChoice() == computer.getComputerChoice()) {
            return "Draw!";
        }

        if (player.getPlayerChoice() == "Rock" && computer.getComputerChoice() == "Scissors") {
            return "Player wins!";
        } else if (player.getPlayerChoice() == "Rock" && computer.getComputerChoice() == "Paper") {
            return "Computer wins!";
        } else if (player.getPlayerChoice() == "Paper" && computer.getComputerChoice() == "Scissors") {
            return "Computer wins!";
        } else if (player.getPlayerChoice() == "Paper" && computer.getComputerChoice() == "Rock") {
            return "Player wins!";
        } else if (player.getPlayerChoice() == "Scissors" && computer.getComputerChoice() == "Paper") {
            return "Player wins!";
        } else if (player.getPlayerChoice() == "Scissors" && computer.getComputerChoice() == "Rock") {
            return "Computer wins!";
        } else {
            return "Please make a choice!";
        }
    }


}

