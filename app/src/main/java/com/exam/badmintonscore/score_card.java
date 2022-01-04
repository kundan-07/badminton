package com.exam.badmintonscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class score_card extends AppCompatActivity {
    String player_one  , player_two;
    int team_a_score = 0, team_b_score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_card);


        Intent intentofscore = getIntent();
        player_one = intentofscore.getStringExtra("player1");
        player_two = intentofscore.getStringExtra("player2");
        TextView playerone = (TextView) findViewById(R.id.firstplayer);
        TextView playertwo = (TextView) findViewById(R.id.secondplayer);
        playerone.setText(String.valueOf(player_one));
        playertwo.setText(String.valueOf(player_two));
    }
    public void increase_score_a(View view){
        if ((team_b_score < 21) && (team_a_score<21)) {


            team_a_score += 1;
            display(team_a_score, team_b_score);
        }
    }

    public void increase_score_b(View view){
        if((team_b_score < 21) && (team_a_score<21)) {
            team_b_score += 1;
            display(team_a_score, team_b_score);
        }
    }
    private void display(int a,int b){
        TextView score_of_a = (TextView) findViewById(R.id.score_a);
        TextView score_of_b = (TextView) findViewById(R.id.score_b);
        score_of_a.setText(String.valueOf(a));
        score_of_b.setText(String.valueOf(b));

    }
}