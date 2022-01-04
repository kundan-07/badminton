package com.exam.badmintonscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt = (Button) findViewById(R.id.singles);
        bt.setOnClickListener(this);

    }
    /*public void call(View view){
        Intent inten = new Intent(MainActivity.this, players_name.class);
        startActivity(inten);
    }*/

    @Override
    public void onClick(View v) {

        Intent inten = new Intent(MainActivity.this, players_name.class);
        startActivity(inten);
    }
}