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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class letter_w extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_w);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_w.this);

        alertBuilder.setTitle("Well done!");
        alertBuilder.setMessage("Did you know: Newborn wildebeest calves can stand and walk in less than 7 minutes?")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_w.this,letter_x.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        final AlertDialog alertDialog = alertBuilder.create();
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#b7e10e"));
        }

        final Button button1 = (Button)findViewById(R.id.check1);
        final Button button2 = (Button)findViewById(R.id.check2);
        final Button button3 = (Button)findViewById(R.id.check3);
        final Button button4 = (Button)findViewById(R.id.check4);

        final Button button5 = (Button)findViewById(R.id.button1);
        final Button button6 = (Button)findViewById(R.id.button2);
        final Button button7 = (Button)findViewById(R.id.button3);
        final Button button8 = (Button)findViewById(R.id.button4);
        final ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView);

        button5.setVisibility(View.INVISIBLE);
        button6.setVisibility(View.INVISIBLE);
        button7.setVisibility(View.INVISIBLE);
        button8.setVisibility(View.INVISIBLE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_w.this,"Different animal!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0,25);
                toast.show();

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button2.setBackgroundColor(Color.parseColor("#97e99b"));

                button5.setVisibility(View.VISIBLE);
                button6.setVisibility(View.VISIBLE);
                button7.setVisibility(View.VISIBLE);
                button8.setVisibility(View.VISIBLE);

                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(View.FOCUS_DOWN);
                    }
                });

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_w.this,"Different animal!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0,25);
                toast.show();

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_w.this,"Different animal!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.BOTTOM, 0,25);
                toast.show();

            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_w.this,"That doesn't seem right!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0,150);
                toast.show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_w.this,"That doesn't seem right!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0,150);
                toast.show();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button7.setBackgroundColor(Color.parseColor("#97e99b"));
                mpcorrect.start();
                alertDialog.show();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(letter_w.this,"That doesn't seem right!",Toast.LENGTH_SHORT);
                toast.setGravity(Gravity.TOP, 0,150);
                toast.show();
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#cbf231"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter W");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
