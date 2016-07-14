package com.example.android.scoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score_a = 0, score_b = 0;
    int time_a_m = 0, time_a_s = 0, time_b_s = 0;

    public void set_time_a(int a_m, int a_s) {
        time_a_m = a_m;
        time_a_s = a_s;
        TextView time_a_TextView = (TextView) findViewById(
                R.id.time_a);
        time_a_TextView.setText(time_a_m + " : " + time_a_s);
    }

    public void set_time_b(int b_s) {
        time_b_s = b_s;
        TextView time_b_TextView = (TextView) findViewById(
                R.id.time_b);
        time_b_TextView.setText(time_b_s);
    }

    public void set_score(int team, int change) {
        if (team == 0)
            score_a += change;
        else if (team == 1)
            score_b += change;
        TextView score_infoTextView = (TextView) findViewById(
                R.id.score_info);
        score_infoTextView.setText(score_a + " : " + score_b);
    }

    public void button_a_0_click(View view) {
        if (score_a > 0)
            set_score(0, -1);
    }

    public void button_a_1_click(View view) {
        set_score(0, 1);
    }

    public void button_b_0_click(View view) {
        if (score_b > 0)
            set_score(1, -1);
    }

    public void button_b_1_click(View view) {
        set_score(1, 1);
    }

    public void button_a_2_click(View view) {
        set_score(0, 2);
    }

    public void button_a_3_click(View view) {
        set_score(0, 3);
    }

    public void button_b_2_click(View view) {
        set_score(1, 2);
    }

    public void button_b_3_click(View view) {
        set_score(1, 3);
    }

    public void button_reset_click(View view) {
        score_a = 0;
        score_b = 0;
        TextView score_infoTextView = (TextView) findViewById(
                R.id.score_info);
        score_infoTextView.setText(score_a + " : " + score_b);
    }

}
