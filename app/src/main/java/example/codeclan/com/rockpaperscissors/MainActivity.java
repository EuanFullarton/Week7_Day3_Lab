package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button rockButton;
    private Button paperButton;
    private Button scissorsButton;

    Game game;
    Player player = new Player();
    Computer computer = new Computer();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rockButton = (Button) findViewById(R.id.rock_button);
        paperButton = (Button) findViewById(R.id.paper_button);
        scissorsButton = (Button) findViewById(R.id.scissors_button);
    }

    public void onRockButtonClicked(View button){

        Game game = new Game(player, computer);

        String chooseRock = rockButton.getText().toString();
        player.playerChoice(chooseRock);
        player.getPlayerChoice();
        computer.getRandomComputerChoice();

        String result = game.play();

        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("result", result);
        startActivity(intent);


    }

}
