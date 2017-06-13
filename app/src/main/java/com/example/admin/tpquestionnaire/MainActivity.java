package com.example.admin.tpquestionnaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Question[] questions = new Question[]{
            new Question("Numéro atomique du Carbone : ", "5", "6", false),
            new Question("Numéro atomique du Bore : ", "5", "2", true),
            new Question("Numéro atomique du Hélium : ", "4", "2", false),
            new Question("Numéro atomique du Bérylium : ", "4", "3", true),
            new Question("Numéro atomique du Oxygen : ", "8", "6", true)
    };

    private int i = 0;
    private int score = 0;
    private int question_lenght = questions.length;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.question);
        TextView button1 = (TextView) findViewById(R.id.resp1);
        TextView button2 = (TextView) findViewById(R.id.resp2);
        textView.setText(questions[i].getQuestion());
        button1.setText(questions[i].getQuestion1());
        button2.setText(questions[i].getQuestion2());
    }

    public void onrep1(View view) {
        int param = 0;
        Questionnaire(param);
    }

    public void onrep2(View view) {
        int param = 1;
        Questionnaire(param);
    }

    public void Questionnaire(int param) {
        if (i+1 <= question_lenght) {
            TextView textView = (TextView) findViewById(R.id.question);
            TextView button1 = (TextView) findViewById(R.id.resp1);
            TextView button2 = (TextView) findViewById(R.id.resp2);
            TextView rep = (TextView) findViewById(R.id.response);
            if (i+1 < question_lenght) {
                textView.setText(questions[i+1].getQuestion());
                button1.setText(questions[i+1].getQuestion1());
                button2.setText(questions[i+1].getQuestion2());
                if ((questions[i].isReponse() && param == 0) || (!questions[i].isReponse() && param == 1)) {
                    rep.setText("Correct");
                    score += 1;
                }
                else {
                    rep.setText("Incorrect");
                }
            }
            else {
                if ((questions[i].isReponse() && param == 0) || (!questions[i].isReponse() && param == 1)) {
                    score += 1;
                }
                rep.setText("Votre score est de : "+String.valueOf(score)+"/5");
            }
            i += 1;
        }
        else {
            TextView textView = (TextView) findViewById(R.id.response);
            textView.setText(String.valueOf(score));
        }
    }
}
