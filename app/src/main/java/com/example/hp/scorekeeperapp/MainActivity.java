package com.example.hp.scorekeeperapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//Variable for denoting Score of Team A
    int scoreOfTeamA=0;
    //Variable for denoting Score of Team A
    int scoreOfTeamB=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Adding three to score of team A
    public void addThreeToTeamAScore(View v) {
        scoreOfTeamA = scoreOfTeamA + 3;
        displayTeamA(scoreOfTeamA);
    }


   //Adding two to score of team A
    public void addTwoToTeamAScore(View v) {
        scoreOfTeamA = scoreOfTeamA + 2;
        displayTeamA(scoreOfTeamA);
    }


    //Adding one to score of team A
    public void FreeThrowA(View v) {
        scoreOfTeamA = scoreOfTeamA + 1;
        displayTeamA(scoreOfTeamA);
    }


    //Reset Score
    public void scoreReset(View v) {
        scoreOfTeamA = 0;
        scoreOfTeamB = 0;
        displayTeamA(scoreOfTeamA);
        displayTeamB(scoreOfTeamB);
    }



    //adding one to score of team B
    public void FreeThrowB(View v) {
        scoreOfTeamB= scoreOfTeamB + 1;
        displayTeamB(scoreOfTeamB);
    }

    //adding two to score of team B
    public void addTwoToTeamBScore(View v) {
        scoreOfTeamB= scoreOfTeamB + 2;
        displayTeamB(scoreOfTeamB);
    }


    //adding three to score of team B
    public void addThreeToTeamBScore(View v) {
        scoreOfTeamB= scoreOfTeamB + 3;
        displayTeamB(scoreOfTeamB);
    }


    //display score of team A
    public void displayTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreOfTeamA);
        scoreView.setText(String.valueOf(score));
    }


    //display score of team B
    public void displayTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreOfTeamB);
        scoreView.setText(String.valueOf(score));
    }


}
