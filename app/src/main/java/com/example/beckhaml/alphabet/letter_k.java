package com.example.beckhaml.alphabet;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class letter_k extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_k);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#0066cc"));
        }

        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);
        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_k.this);

        alertBuilder.setTitle("Well Done!");
        alertBuilder.setMessage("Did you know: Grasslands make up 25% of land on earth!")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_k.this,letter_l.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        final AlertDialog alertDialog = alertBuilder.create();

        final Button button1 = (Button)findViewById(R.id.button21);
        final Button button2 = (Button)findViewById(R.id.button22);
        final Button button3 = (Button)findViewById(R.id.button23);
        final Button button4 = (Button)findViewById(R.id.button24);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_k.this,"Please try again",Toast.LENGTH_SHORT).show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_k.this,"Please try again",Toast.LENGTH_SHORT).show();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_k.this,"Please try again",Toast.LENGTH_SHORT).show();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mpcorrect.start();
                alertDialog.show();
                button4.setBackgroundColor(Color.parseColor("#97e99b"));
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#007EFF"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter K");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
