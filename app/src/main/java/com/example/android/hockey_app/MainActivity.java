package com.example.android.hockey_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreRSA=0;
    int scoreWI=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayRSA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.rsa_text_view);
        scoreView.setText(String.valueOf(score));
    }

    public void displayWI(int score) {
        TextView scoreView = (TextView) findViewById(R.id.wi_text_view);
        scoreView.setText(String.valueOf(score));
    }
    public void two_rsa(View view)
    {
        scoreRSA=scoreRSA+2;
        displayRSA(scoreRSA);
    }
    public void one_rsa(View view)
    {
        scoreRSA=scoreRSA+1;
        displayRSA(scoreRSA);
    }
    public void two_wi(View view)
    {
        scoreWI=scoreWI+2;
        displayWI(scoreWI);
    }
    public void one_wi(View view)
    {
        scoreWI=scoreWI+1;
        displayWI(scoreWI);
    }
    public void restart(View view)
    {
        scoreRSA=0;
        scoreWI=0;
        displayRSA(scoreRSA);
        displayWI(scoreWI);
    }
}
