package example.codeclan.com.rockpaperscissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 19/04/2017.
 */

public class GameTest {

    @Before
    public void before() {
        game = new Game(player, computer);
    }


    Game game;
    Player player = new Player();
    Computer computer = new Computer();

    @Test
    public void testPlayerWin() {
        player.playerChoice("Rock");
        computer.computerChoice("Scissors");
        assertEquals("Player wins!", game.play());
    }

    @Test
    public void testDraw() {
        player.playerChoice("Rock");
        computer.computerChoice("Rock");
        assertEquals("Draw!", game.play());
    }

    @Test
    public void testComputerWin() {
        player.playerChoice("Rock");
        computer.computerChoice("Paper");
        assertEquals("Computer wins!", game.play());
    }
}
