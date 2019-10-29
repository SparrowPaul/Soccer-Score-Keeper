package com.sparrowpaul.soccerscorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA;
    int scoreTeamB;
    int foulTeamA;
    int foulTeamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void teamAScore(View view) {
        scoreTeamA = scoreTeamA +1;
        displayScoreForTeamA(scoreTeamA);
    }

    public void teamAFoul(View view) {
        foulTeamA = foulTeamA + 1;
        displayFoulForTeamA(foulTeamA);
    }

    public void teamBScore(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayScoreForTeamB(scoreTeamB);
    }

    public void teamBFoul(View view) {
        foulTeamB = foulTeamB + 1;
        displayFoulForTeamB(foulTeamB);
    }

    public void resetButton(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        int resetID = 0;
        displayFoulForTeamB(resetID);
        displayFoulForTeamA(resetID);
        displayScoreForTeamA(resetID);
        displayScoreForTeamB(resetID);
    }


    public void displayScoreForTeamA(int score){
        TextView teamAScoreTextView = findViewById(R.id.scoreATextViewID);
        teamAScoreTextView.setText(String.valueOf(score));
    }

    public void displayScoreForTeamB(int score){
        TextView teamBScoreTextView = findViewById(R.id.scoreBTextViewID);
        teamBScoreTextView.setText(String.valueOf(score));
    }

    public void displayFoulForTeamA(int foul){
        TextView teamAFoulTextView = findViewById(R.id.foulATextViewID);
        teamAFoulTextView.setText(String.valueOf(foul));
    }

    public void displayFoulForTeamB(int foul){
        TextView teamBfoulTextView = findViewById(R.id.foulBTextViewID);
        teamBfoulTextView.setText(String.valueOf(foul));
    }
}
