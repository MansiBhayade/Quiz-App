package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private String [] question = {"Did James Gosling invented Java ?","Is Java code-dependent programming language ?",
             "Is JVM used to compile Java programs","Use of pointers is a feature of Java "
              ,".java is the extension of java files"};
     private boolean[] answers = {true, false, false, false, true};
     private int score = 0;
     Button yes;
     Button no;
     TextView textView;
     private int index=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes =  findViewById(R.id.yes);
        no = findViewById(R.id.no);
        textView = findViewById(R.id.textView2);
        textView.setText(question[0]);
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=question.length-1){
                    if(answers[index]==true){
                        score++;
                    }
                    index++;
                    if(index<= question.length-1){
                        textView.setText(question[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=question.length-1){
                       if(answers[index]==false){
                    score++;
                    }
                       index++;
                       if(index<= question.length-1){
                           textView.setText(question[index]);
                       }
                       else{
                           Toast.makeText(MainActivity.this, "Your score is "+score, Toast.LENGTH_SHORT).show();
                       }
                       }
            }
        });

    }
}