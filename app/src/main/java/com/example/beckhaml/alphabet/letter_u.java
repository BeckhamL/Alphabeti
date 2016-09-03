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

public class letter_u extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_u);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_u.this);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        alertBuilder.setTitle("Super!");
        alertBuilder.setMessage("Did you know: There are close to 100 million species on earth with 4,500 " +
                " mammals and insects are by far the most numerous")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_u.this,letter_v.class);
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
            window.setStatusBarColor(Color.parseColor("#248cf5"));
        }

        final Button button1 = (Button)findViewById(R.id.button30);
        final Button button2 = (Button)findViewById(R.id.button31);
        final Button button3 = (Button)findViewById(R.id.button32);
        final Button button4 = (Button)findViewById(R.id.button33);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_u.this,"That doesn't seem right!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0,10);
                toast.show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_u.this,"Less than that!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0,10);
                toast.show();

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_u.this,"That doesn't seem right!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0,10);
                toast.show();

            }
        });

        // correct
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button4.setBackgroundColor(Color.parseColor("#97e99b"));
                mpcorrect.start();
                alertDialog.show();
            }
        });


        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#53A6F7"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter U");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
