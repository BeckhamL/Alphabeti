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
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

public class letter_q extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_q);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_q.this);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        alertBuilder.setTitle("Good Job!");
        alertBuilder.setMessage("Did you know: Colarado contains 75% of the land in America that is over 10,000 feet!")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_q.this, letter_r.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        final AlertDialog alertDialog = alertBuilder.create();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#0f8f73"));
        }

        final Button button1 = (Button)findViewById(R.id.button25);
        final Button button2 = (Button)findViewById(R.id.button26);
        final Button button3 = (Button)findViewById(R.id.button27);
        final Button button4 = (Button)findViewById(R.id.button28);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_q.this,"Argh! That's not Nebraska",Toast.LENGTH_SHORT).show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mpcorrect.start();
                alertDialog.show();
                button2.setBackgroundColor(Color.parseColor("#97e99b"));
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_q.this,"Argh! That's not Wyoming",Toast.LENGTH_SHORT).show();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_q.this,"Argh! That's not Utah",Toast.LENGTH_SHORT).show();

            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#14BE99"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter Q");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
