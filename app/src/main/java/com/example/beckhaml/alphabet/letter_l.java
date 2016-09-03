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
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

public class letter_l extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_l);
        final Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_l.this);

        alertBuilder.setTitle("Good Job!");
        alertBuilder.setMessage("Did you know: Due to the world wars, there were no Olympic games " +
                " in 1916, 1940 and 1944")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_l.this, letter_m.class);
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
            window.setStatusBarColor(Color.parseColor("#998c00"));
        }

        // check button
        final Button button = (Button)findViewById(R.id.l_button);

        final Button button1 = (Button)findViewById(R.id.check1);
        final Button button2 = (Button)findViewById(R.id.check2);
        final Button button3 = (Button)findViewById(R.id.check3);
        final Button button4 = (Button)findViewById(R.id.check4);
        final ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_l.this,"Woops! That's not correct!",Toast.LENGTH_SHORT).show();
                button1.setBackgroundColor(Color.parseColor("#ff6666"));

                Intent intent = new Intent(letter_l.this,letter_l.class);
                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_l.this,"Woops! That's not correct!",Toast.LENGTH_SHORT).show();
                button2.setBackgroundColor(Color.parseColor("#ff6666"));

                Intent intent = new Intent(letter_l.this,letter_l.class);
                startActivity(intent);
            }
        });

        // toyko
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(View.FOCUS_DOWN);
                    }
                });
                button3.setBackgroundColor(Color.parseColor("#97e99b"));

            }
        });

        //rome
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_l.this,"Woops! That's not correct!",Toast.LENGTH_SHORT).show();
                button4.setBackgroundColor(Color.parseColor("#ff6666"));

                Intent intent = new Intent(letter_l.this,letter_l.class);
                startActivity(intent);

            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText1 = (EditText) findViewById(R.id.editText5);
                EditText editText2 = (EditText) findViewById(R.id.editText6);
                EditText editText3 = (EditText) findViewById(R.id.editText7);
                EditText editText4 = (EditText) findViewById(R.id.editText8);

                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();
                String str3 = editText3.getText().toString();
                String str4 = editText4.getText().toString();

                if (!str2.equals("Beijing")){
                    Toast.makeText(letter_l.this, "The 2008 Olympics seems wrong!", Toast.LENGTH_SHORT).show();
                }
                else if (!str1.equals("Athens")){
                    Toast.makeText(letter_l.this, "The 2004 Olympics seems wrong!", Toast.LENGTH_SHORT).show();
                }

                else if (!str3.equals("London")){
                    Toast.makeText(letter_l.this, "The 2012 Olympics seems wrong!", Toast.LENGTH_SHORT).show();
                }

                else if (!(str4.equals("Rio")|| str4.equals("Rio ") || str4.equals("Rio De Janerio"))){
                    Toast.makeText(letter_l.this, "The 2016 Olympics seems wrong!", Toast.LENGTH_SHORT).show();
                }

                else if (!button3.callOnClick()){
                    Toast.makeText(letter_l.this, "Did you complete the first question?", Toast.LENGTH_SHORT).show();
                }
                else if ((str1.equals("Athens") || str1.equals("Athen")) && str2.equals("Beijing") &&
                        str3.equals("London") && (str4.equals("Rio de Janerio")
                        || str4.equals("Rio") || str4.equals("Rio ") || str4.equals("Rio De Janerio"))) {

                    mpcorrect.start();
                    alertDialog.show();
                }

                else {

                    Toast.makeText(letter_l.this, "Are you sure those are correct?", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#ccbb00"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter L");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
