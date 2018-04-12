package com.example.android.myquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Score extends AppCompatActivity {
    public final static String Message_KEY = "com.example.android.myquiz.message.key";
    String score;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

      setContentView(R.layout.activity_score);

      score = getIntent().getExtras().getString("score");
        TextView textView = (TextView)findViewById(R.id.score1);
        textView.setText(score);
        //get the intent from the other page
//        Intent intent = getIntent();
//        String message = intent.getStringExtra(Message_KEY);
//        //Creating a new TextView on the fly
//        TextView textView = new TextView(this);
//       // textView.setTextColor(000);
//        textView.setTextSize(45);
//        textView.setText(message);
//        setContentView(textView);
       // Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
      //  setSupportActionBar(toolbar);
        Button back = (Button)findViewById(R.id.back);
       back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(Score.this,MainActivity.class);

                startActivity(intent);
            }
        });
    }

}
