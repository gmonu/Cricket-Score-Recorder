package com.example.cricketscorerecorder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button one, two, three, four, six, wide, no, out;
    Button convert;
    EditText resultconvert;
    int runs = 0, wickets=0, balls=0;
    double overs=0.0;
    EditText run, wicket, over;
    Button Extra;
    EditText exruns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        run = (EditText)findViewById(R.id.runs);
        wicket = (EditText) findViewById(R.id.out);
        over = (EditText)findViewById(R.id.over);
        one = (Button)findViewById(R.id.one);
        two = (Button)findViewById(R.id.two);
        three = (Button)findViewById(R.id.three);
        four = (Button)findViewById(R.id.four);
        six = (Button)findViewById(R.id.six);
        wide = (Button)findViewById(R.id.wide);
        no = (Button)findViewById(R.id.no);
        out = (Button)findViewById(R.id.button2);
        convert = (Button)findViewById(R.id.convert);
        resultconvert = (EditText)findViewById(R.id.covertedresult);
        Extra = (Button)findViewById(R.id.button3);
        exruns = (EditText)findViewById(R.id.extra);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
        public void onClick(View v) {
            runs = runs+1;
            run.setText(Integer.toString(runs));
            balls=balls+1;
            over.setText(Integer.toString(balls));
        }
    });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs+2;
                run.setText(Integer.toString(runs));
                balls = balls+1;
                over.setText(Integer.toString(balls));
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs+3;
                run.setText(Integer.toString(runs));
                balls = balls+1;
                over.setText(Integer.toString(balls));
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs+4;
                run.setText(Integer.toString(runs));
                balls = balls+1;
                over.setText(Integer.toString(balls));
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs+6;
                run.setText(Integer.toString(runs));
                balls = balls+1;
                over.setText(Integer.toString(balls));
            }
        });
        wide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                runs = runs+1;
                run.setText(Integer.toString(runs));
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                runs = runs+1;
                run.setText(Integer.toString(runs));



            }
        });
        out.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                wickets = wickets+1;
                wicket.setText(Integer.toString(wickets));
                balls = balls+1;
                over.setText(Integer.toString(balls));
            }
        });

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no=over.getText().toString();
                int a = Integer.parseInt(no);
                int rem = a%6;
                int quotient = a/6;
                resultconvert.setText((quotient+"."+rem));
            }
        });

        Extra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String no = exruns.getText().toString();
                int zero =0;
                int a = Integer.parseInt(no);
                runs = runs+a;
                run.setText(Integer.toString(runs));
                exruns.setText(Integer.toString(zero));
            }
        });
    }
}
