package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA=0;
    int scoreTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementA(View view){
        scoreTeamA=scoreTeamA+1;
        displayTeamA(scoreTeamA);
    }

    public void incrementByTwoA(View view){
        scoreTeamA=scoreTeamA+2;
        displayTeamA(scoreTeamA);
    }

    public void incrementByThreeA(View view){
        scoreTeamA=scoreTeamA+3;
        displayTeamA(scoreTeamA);
    }

    public void displayTeamA(int score){
        TextView text= (TextView)findViewById(R.id.teamA_score_textview);
        text.setText("" +score);
    }

    public void incrementB(View view){
        scoreTeamB=scoreTeamB+1;
        displayTeamB(scoreTeamB);
    }

    public void incrementByTwoB(View view){
        scoreTeamB=scoreTeamB+2;
        displayTeamB(scoreTeamB);
    }

    public void incrementByThreeB(View view){
        scoreTeamB=scoreTeamB+3;
        displayTeamB(scoreTeamB);
    }

    public void displayTeamB(int score){
        TextView text= (TextView)findViewById(R.id.teamB_score_textview);
        text.setText("" +score);
    }

    public void reset(View view){
        scoreTeamA=0;
        displayTeamA(scoreTeamA);
        scoreTeamB=0;
        displayTeamB(scoreTeamB);
    }
}
