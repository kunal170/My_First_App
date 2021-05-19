package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

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
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public void button3(View view){
        scoreTeamA+=3;
        displayForTeamA(scoreTeamA);
    }
    public void button2(View view){
        scoreTeamA+=2;
        displayForTeamA(scoreTeamA);
    }
    public void button1(View view){
        scoreTeamA+=1;
        displayForTeamA(scoreTeamA);
    }
    public void button1B(View view){
        scoreTeamB+=1;
        displayForTeamB(scoreTeamB);
    }
    public void button2B(View view){
        scoreTeamB+=2;
        displayForTeamB(scoreTeamB);
    }
    public void button3B(View view){
        scoreTeamB+=3;
        displayForTeamB(scoreTeamB);
    }
    public void change(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamB(scoreTeamB);
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}