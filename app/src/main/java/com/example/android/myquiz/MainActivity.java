package com.example.android.myquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;


public class MainActivity extends AppCompatActivity {
    public final static String Message_KEY = "com.example.android.myquiz.message.key";
    String number;
    String scoreInfo;
    int score= 0;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button saveScore = (Button)findViewById(R.id.submit);

        saveScore.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v) {
                EditText yName = (EditText) findViewById(R.id.name);
                String userName = yName.getText().toString();

                    if( TextUtils.isEmpty(userName)){
                        yName.setError( "First name is required!" );

                    }
                    else{
                        int myScore = Question1() + Question2() + Question3()+ Question4();
                        scoreInfo = userName + " Your score is " + myScore+ "%";
                        Intent intent = new Intent(MainActivity.this,Score.class);
                        intent.putExtra("score", scoreInfo);
                        startActivity(intent);
                    }
                }//End of onClick(View V)
        });//End of setOnClickListener
    }

    public int Question1(){
        RadioButton answer1 = (RadioButton)findViewById(R.id.Mary);

        if(answer1.isChecked()){
          score = 25;
        }
        else {
            score=0;
        }
        return score;
    }
    public int Question2(){
        CheckBox answer2 = (CheckBox) findViewById(R.id.Jack);
        CheckBox answer3 = (CheckBox) findViewById(R.id.Jill);

        if(answer2.isChecked() && answer3.isChecked()){
            score = 25;
        }
        else {
            score =0;
        }
        return score;
    }
    public int Question3(){
        RadioButton answer4 = (RadioButton)findViewById(R.id.corn);

        if(answer4.isChecked()){
            score = 25;
        }
        else {
            score=0;
        }
        return score;
    }
    public int Question4(){
        RadioButton answer5 = (RadioButton)findViewById(R.id.cradle);

        if(answer5.isChecked()){
            score = 25;
        }
        else {
            score=0;
        }
        return score;
    }
}


