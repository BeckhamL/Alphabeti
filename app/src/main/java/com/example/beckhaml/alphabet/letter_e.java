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

public class letter_e extends AppCompatActivity {

    public int x;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_e);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#cc0069"));
        }

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_e.this);

        alertBuilder.setTitle("Good Job!");
        alertBuilder.setMessage("Did you know that Canada's coastline is 208,080 kilometers? That's 147,364 kilometers longer than" +
                " the country with the second longest coastline: Indonesia!")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_e.this, letter_f.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        final AlertDialog alertDialog = alertBuilder.create();

        final Button button1 = (Button) findViewById(R.id.button8);
        final Button button2 = (Button) findViewById(R.id.button10);
        final Button button3 = (Button) findViewById(R.id.button9);
        final Button button4 = (Button) findViewById(R.id.button11);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_e.this, "Woops that is incorrect! Please try again", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 50);
                toast.show();

                button1.setBackgroundColor(Color.parseColor("#ff6666"));

                Intent intent = new Intent(letter_e.this, letter_e.class);
                startActivity(intent);

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

                Toast toast = Toast.makeText(letter_e.this, "Woops that is incorrect! Please try again", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 50);
                toast.show();

                button3.setBackgroundColor(Color.parseColor("#ff6666"));

                Intent intent = new Intent(letter_e.this, letter_e.class);
                startActivity(intent);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_e.this, "Woops that is incorrect! Please try again", Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0, 50);
                toast.show();

                button4.setBackgroundColor(Color.parseColor("#ff6666"));

                Intent intent = new Intent(letter_e.this, letter_e.class);
                startActivity(intent);
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF0082"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter E");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
