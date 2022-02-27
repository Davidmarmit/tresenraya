package com.tresenraya.tresenraya;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private final Button[][] botons = new Button[3][3];
    private static boolean jugador1 = true;
    private TextView text;
    private Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int idBoto;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        reset = (Button) findViewById(R.id.resetB);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0; i < 3; i++){
                    for (int j = 0; j < 3; j++){
                        botons[i][j].setText("");
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        text = (TextView)findViewById(R.id.maintext);
        botons[0][0] = (Button) findViewById(R.id.button_00);
        botons[0][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        if((botons[0][1].getText().equals("X"))&(botons[0][2].getText().equals("X"))){
                            ((TextView)text).setText("Jugador 1 guanyador");
                        }
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        botons[0][1] = (Button) findViewById(R.id.button_01);
        botons[0][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        botons[0][2] = (Button) findViewById(R.id.button_02);
        botons[0][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        botons[1][0] = (Button) findViewById(R.id.button_10);
        botons[1][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        botons[1][1] = (Button) findViewById(R.id.button_11);
        botons[1][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        botons[1][2] = (Button) findViewById(R.id.button_12);
        botons[1][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        botons[2][0] = (Button) findViewById(R.id.button_20);
        botons[2][0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        botons[2][1] = (Button) findViewById(R.id.button_21);
        botons[2][1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
        botons[2][2] = (Button) findViewById(R.id.button_22);
        botons[2][2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((Button)v).getText().toString().equals("")){
                    if(jugador1){
                        ((Button) v).setText("X");
                        ((Button) v).setTextSize(100);
                        jugador1=false;
                        ((TextView) text).setText(R.string.j2);
                    } else{
                        ((Button) v).setText("O");
                        ((Button) v).setTextSize(100);
                        jugador1=true;
                        ((TextView) text).setText(R.string.j1);
                    }
                }
            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
    }


}