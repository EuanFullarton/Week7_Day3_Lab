package example.codeclan.com.rockpaperscissors;


import java.util.ArrayList;
import java.util.Random;

public class Computer {

    private String choice;
    private ArrayList<String> moves;

    public Computer() {
        moves = new ArrayList<String>();
        setupMoves();
        choice = null;
    }

    public void computerChoice(String choice) {
        this.choice = choice;

    }

    public String getComputerChoice(){
        return choice;
    }

    private void setupMoves(){
        String[] possibleMoves = {
                "Rock",
                "Scissors",
                "Paper"
        };
        for (String move: possibleMoves){
            moves.add(move);
        }
    }

    public int getLength(){
        return moves.size();
    }

    public String getMoveAtIndex(int index){
        return moves.get(index);
    }

    public String getRandomComputerChoice() {
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        String choice = getMoveAtIndex(index);
        return choice;
    }
}

