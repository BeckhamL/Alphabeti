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
import android.widget.CheckBox;
import android.widget.ScrollView;
import android.widget.Toast;

public class letter_z extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_z);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_z.this);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        alertBuilder.setTitle("Great Job!");
        alertBuilder.setMessage("Did you know: Hurricane's can produce more than 2 million trillion gallons of rain " +
                " per day?")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_z.this,end.class);
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
            window.setStatusBarColor(Color.parseColor("#1100cc"));
        }


        final Button button = (Button)findViewById(R.id.z_button);

        final ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView);

        final Button button1 = (Button)findViewById(R.id.button1);
        final Button button2 = (Button)findViewById(R.id.button2);
        final Button button3 = (Button)findViewById(R.id.button3);
        final Button button4 = (Button)findViewById(R.id.button4);
        final Button button5 = (Button)findViewById(R.id.button5);
        final Button button6 = (Button)findViewById(R.id.button6);
        final Button button7 = (Button)findViewById(R.id.button7);
        final Button button8 = (Button)findViewById(R.id.button8);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox checkBox1 = (CheckBox)findViewById(R.id.check1);
                CheckBox checkBox2 = (CheckBox)findViewById(R.id.check2);
                CheckBox checkBox3 = (CheckBox)findViewById(R.id.check3);
                CheckBox checkBox4 = (CheckBox)findViewById(R.id.check4);


                if (checkBox1.isChecked()){
                    Toast.makeText(letter_z.this,"Woops!",Toast.LENGTH_SHORT).show();
                }
                else if (checkBox2.isChecked()){

                    scrollView.post(new Runnable() {
                        @Override
                        public void run() {
                            scrollView.fullScroll(View.FOCUS_DOWN);
                        }
                    });

                    button.setBackgroundColor(Color.parseColor("#97e99b"));
                }
                else if (checkBox3.isChecked()){
                    Toast.makeText(letter_z.this,"Woops!",Toast.LENGTH_SHORT).show();
                }
                else if (checkBox4.isChecked()){
                    Toast.makeText(letter_z.this,"Woops!",Toast.LENGTH_SHORT).show();
                }


            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_z.this,"That is a real name!",Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_z.this,"That is a real name!",Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button3.setBackgroundColor(Color.parseColor("#97e99b"));

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_z.this,"That is a real name!",Toast.LENGTH_SHORT).show();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_z.this,"Please try again!",Toast.LENGTH_SHORT).show();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_z.this,"Please try again!",Toast.LENGTH_SHORT).show();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (button3.callOnClick()){
                    button7.setBackgroundColor(Color.parseColor("#97e99b"));
                    mpcorrect.start();
                    alertDialog.show();

                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_z.this,"Please try again!",Toast.LENGTH_SHORT).show();
            }
        });


        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#1700FF"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter Z");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
