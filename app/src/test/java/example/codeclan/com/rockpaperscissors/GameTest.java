package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class GameTest {

    @Before
    Game game = new Game();
    Player player = new Player();
    Computer computer = new Computer();

    @Test
    public void testWin(){
        player.playerChoice("Rock");
        computer.computerChoice("Scissors");
        assertEquals("Player1 wins", game.play());

    }
}
