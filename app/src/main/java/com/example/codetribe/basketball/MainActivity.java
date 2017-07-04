package com.example.codetribe.basketball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayScore(int score){
        TextView scoreTextView = (TextView) findViewById(R.id.scoreA);
                scoreTextView.setText("" + score);
    }

     //* increase score for team A by adding 3
     //
    public void max(View view){
        score = score + 3;
        displayScore(score);
     }
     //* increase score for team A by adding 2
     //
     public void Average(View view){
          score = score + 2;
         displayScore(score);

     }

      //* increase score for team A by adding 1
     //
    public void minimum(View view){
        score = score +1;
        displayScore(score);
    }
        public void displayTotal(int score){
        TextView scoreTextView = (TextView) findViewById(R.id.scoreB);
        scoreTextView.setText("" + score);
    }

      //* increase score for team B by adding 3
      //
    public void maxB(View view){
        score = score + 3;
        displayTotal(score);
    }
      //* increase score for team B by adding 2
      //
    public void AverageB(View view){
        score =score + 2;
        displayTotal(score);
    }
       //* increase score for team B by adding 1
       //
     public void minimumB(View view){
         score = score +1;
         displayTotal(score);
     }

     //reset button for both teams score

    public void reset( View view){
        score = 0;
        displayScore(score);
        displayTotal(score);


    }
}