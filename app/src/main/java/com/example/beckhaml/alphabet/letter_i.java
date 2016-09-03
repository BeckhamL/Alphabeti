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

public class letter_i extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_i);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_i.this);

        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);
        alertBuilder.setTitle("Good Job!");
        alertBuilder.setMessage("In the Quecha native language, Machu Picchu means 'Old Peak' or 'Old Mountain'")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_i.this,letter_j.class);
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
            window.setStatusBarColor(Color.parseColor("#3b9900"));
        }

        final Button button1 = (Button)findViewById(R.id.button16);
        final Button button2 = (Button)findViewById(R.id.button17);
        final Button button3 = (Button)findViewById(R.id.button18);
        final Button button4 = (Button)findViewById(R.id.button19);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast =  Toast.makeText(letter_i.this,"Woops that is incorrect! Please try again",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,215);
                toast.show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button2.setBackgroundColor(Color.parseColor("#97e99b"));
                mpcorrect.start();
                alertDialog.show();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast =  Toast.makeText(letter_i.this,"Woops that is incorrect! Please try again",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,215);
                toast.show();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast =  Toast.makeText(letter_i.this,"Woops that is incorrect! Please try again",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP,0,215);
                toast.show();

            }
        });


        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#4ecc00"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter I");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
