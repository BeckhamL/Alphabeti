package com.example.beckhaml.alphabet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class letter_a extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_a);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_a.this);

        alertBuilder.setTitle("Great Job!");
        alertBuilder.setMessage("Did you know the biggest Great Lake is Lake Superior spanning" +
                " 95,160 square miles")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_a.this,letter_b.class);
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
            window.setStatusBarColor(Color.parseColor("#0170cb"));
        }

        final Button button1 = (Button)findViewById(R.id.check1);
        final Button button2 = (Button)findViewById(R.id.check2);
        final Button button3 = (Button)findViewById(R.id.check3);
        final Button button4 = (Button)findViewById(R.id.check4);

        final EditText editText1 = (EditText)findViewById(R.id.editText5);
        final EditText editText2 = (EditText)findViewById(R.id.editText6);
        final EditText editText3 = (EditText)findViewById(R.id.editText7);
        final EditText editText4 = (EditText)findViewById(R.id.editText8);
        final EditText editText5 = (EditText)findViewById(R.id.editText9);

        final ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView);

        final Button button = (Button)findViewById(R.id.a_button);

        editText1.setVisibility(View.INVISIBLE);
        editText2.setVisibility(View.INVISIBLE);
        editText3.setVisibility(View.INVISIBLE);
        editText4.setVisibility(View.INVISIBLE);
        editText5.setVisibility(View.INVISIBLE);
        button.setVisibility(View.INVISIBLE);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_a.this,"Thats not correct!",Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_a.this,"Thats not correct!",Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                button3.setBackgroundColor(Color.parseColor("#97e99b"));
                editText1.setVisibility(View.VISIBLE);
                editText2.setVisibility(View.VISIBLE);
                editText3.setVisibility(View.VISIBLE);
                editText4.setVisibility(View.VISIBLE);
                editText5.setVisibility(View.VISIBLE);
                button.setVisibility(View.VISIBLE);

                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(View.FOCUS_DOWN);
                    }
                });
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_a.this,"Thats not correct!",Toast.LENGTH_SHORT).show();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

                final EditText editText1 = (EditText)findViewById(R.id.editText5);
                final EditText editText2 = (EditText)findViewById(R.id.editText6);
                final EditText editText3 = (EditText)findViewById(R.id.editText7);
                final EditText editText4 = (EditText)findViewById(R.id.editText8);
                final EditText editText5 = (EditText)findViewById(R.id.editText9);

                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();
                String str3 = editText3.getText().toString();
                String str4 = editText4.getText().toString();
                String str5 = editText5.getText().toString();

                if ((str1.equals("Lake Huron") || str1.equals("Huron"))
                        && (str2.equals("Lake Ontario") || str2.equals("Ontario"))
                        && (str3.equals("Lake Michigan") || str3.equals("Michigan"))
                        && (str4.equals("Lake Erie") || str4.equals("Erie"))
                        && (str5.equals("Lake Superior") || str5.equals("Superior"))){

                    mpcorrect.start();
                    alertDialog.show();

                }

                else if (str1.matches("") && str2.matches("") && str3.matches("") && str4.matches("") &&
                        str5.matches("")) {
                    Toast.makeText(letter_a.this,"You didn't give an answer!",Toast.LENGTH_SHORT).show();
                }
                else if(str1.matches("")) {
                    Toast.makeText(letter_a.this,"You forgot the first Lake!",Toast.LENGTH_SHORT).show();
                }
                else if(str2.matches("")){
                    Toast.makeText(letter_a.this,"You forgot the second Lake!",Toast.LENGTH_SHORT).show();
                }
                else if (str3.matches("")){
                    Toast.makeText(letter_a.this,"You forgot the third Lake!",Toast.LENGTH_SHORT).show();
                }
                else if (str4.matches("")){
                    Toast.makeText(letter_a.this,"You forgot the fourth Lake!",Toast.LENGTH_SHORT).show();
                }
                else if (str5.matches("")) {
                    Toast.makeText(letter_a.this,"You forgot the fifth Lake!",Toast.LENGTH_SHORT).show();
                }
                else if (!(str1.equals("Lake Huron") || str1.equals("Huron"))) {
                    Toast.makeText(letter_a.this,"Are you sure the first lake is correct?",Toast.LENGTH_SHORT).show();
                }
                else if (!(str2.equals("Lake Ontario") || str2.equals("Ontario"))) {
                    Toast.makeText(letter_a.this,"Are you sure the second lake is correct?",Toast.LENGTH_SHORT).show();
                }
                else if (!(str3.equals("Lake Michigan") || str3.equals("Michigan"))) {
                    Toast.makeText(letter_a.this,"Are you sure the third lake is correct?",Toast.LENGTH_SHORT).show();
                }
                else if (!(str4.equals("Lake Erie") || str4.equals("Erie"))) {
                    Toast.makeText(letter_a.this,"Are you sure the fourth lake is correct?",Toast.LENGTH_SHORT).show();
                }
                else if (!(str5.equals("Lake Superior") || str5.equals("Superior"))) {
                    Toast.makeText(letter_a.this,"Are you sure the fifth lake is correct?",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(letter_a.this,"Woops! Check your answers!",Toast.LENGTH_SHORT).show();
                }
            }

        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#1B96FE"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter A");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
