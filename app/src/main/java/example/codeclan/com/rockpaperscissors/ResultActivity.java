package example.codeclan.com.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    private TextView resultView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        resultView = (TextView) findViewById(R.id.rock_button);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String result = extras.getString("result");
        resultView.setText(result);
    }

}
