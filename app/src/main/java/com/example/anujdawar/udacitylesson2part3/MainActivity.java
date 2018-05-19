package com.example.anujdawar.udacitylesson2part3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreATV, scoreBTV;
    int scoreA, scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("Court Counter");

        scoreA = scoreB = 0;
        scoreATV = (TextView) findViewById(R.id.teamAScore);
        scoreBTV = (TextView) findViewById(R.id.teamBScore);
    }

    public void teamAPoints3(View view)
    {
        scoreA += 3;
        scoreATV.setText(String.valueOf(scoreA));
    }

    public void teamAPoints2(View view)
    {
        scoreA += 2;
        scoreATV.setText(String.valueOf(scoreA));
    }

    public void teamAPoints1(View view)
    {
        scoreA += 1;
        scoreATV.setText(String.valueOf(scoreA));
    }

    public void teamBPoints3(View view)
    {
        scoreB += 3;
        scoreBTV.setText(String.valueOf(scoreB));
    }

    public void teamBPoints2(View view)
    {
        scoreB += 2;
        scoreBTV.setText(String.valueOf(scoreB));
    }

    public void teamBPoints1(View view)
    {
        scoreB += 1;
        scoreBTV.setText(String.valueOf(scoreB));
    }

    public void resetScores(View view)
    {
        scoreA = scoreB = 0;
        scoreATV.setText(String.valueOf(scoreA));
        scoreBTV.setText(String.valueOf(scoreB));

        setContentView(R.layout.second);
    }
}