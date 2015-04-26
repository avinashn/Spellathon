package in.codingcorner.spellathon;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;


public class GameOver_Screen extends Activity {
    Intent iin;
    Bundle b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gameover_screen);

        TextView displayScore = (TextView) findViewById(R.id.tv_displayScore);
        TextView playagain = (TextView) findViewById(R.id.tv_playagain);
        TextView solution = (TextView) findViewById(R.id.tv_showSolution);


        playagain.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(GameOver_Screen.this,
                        MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);

            }
        });


        iin = getIntent();
        b = iin.getExtras();


        if (b != null) {

            String passed_score = (String) b.get("score");
            displayScore.setText(passed_score);
            final int passed_set = b.getInt("set");

            solution.setOnClickListener(new OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent mm = new Intent(GameOver_Screen.this, MissedWords.class);
                    mm.putExtra("setaa", passed_set);
                    startActivity(mm);
                }
            });
        }

    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(GameOver_Screen.this,
                MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}

