package com.exam.badmintonscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class players_name extends AppCompatActivity {
    String player_one , player_two;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_players_name);
    }
    public void callScoreCard(View view){
        Intent intentofscore = new Intent(players_name.this, score_card.class);

        EditText first_player = (EditText) findViewById(R.id.playerfirst);
        player_one = first_player.getText().toString();
        EditText second_player = (EditText) findViewById(R.id.playersec);
        player_two = second_player.getText().toString();


        intentofscore.putExtra("player1" ,player_one);
        intentofscore.putExtra("player2" ,player_two);
        startActivity(intentofscore);


    }
}