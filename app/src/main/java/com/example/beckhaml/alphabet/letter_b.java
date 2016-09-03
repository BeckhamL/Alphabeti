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
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class letter_b extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_b);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_b.this);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        alertBuilder.setTitle("Great Job!");
        alertBuilder.setMessage("Did you know: The UK has less surface area then that of Oregon!")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_b.this,letter_c.class);
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
            window.setStatusBarColor(Color.parseColor("#039900"));
        }

        final Button button1 = (Button)findViewById(R.id.check1);
        final Button button2 = (Button)findViewById(R.id.check2);
        final Button button3 = (Button)findViewById(R.id.check3);
        final Button button4 = (Button)findViewById(R.id.check4);

        final Button button = (Button)findViewById(R.id.b_button);

        final ScrollView scrollView = (ScrollView)findViewById(R.id.scrollView);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_b.this, "Try again!", Toast.LENGTH_SHORT).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(letter_b.this, "Try again!", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_b.this, "Try again!", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                button4.setBackgroundColor(Color.parseColor("#97e99b"));

                scrollView.post(new Runnable() {
                    @Override
                    public void run() {
                        scrollView.fullScroll(View.FOCUS_DOWN);
                    }
                });
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final EditText edittext1 = (EditText)findViewById(R.id.editText5);
                final EditText edittext2 = (EditText)findViewById(R.id.editText6);
                final EditText edittext3 = (EditText)findViewById(R.id.editText7);
                final EditText edittext4 = (EditText)findViewById(R.id.editText8);

                String str1 = edittext1.getText().toString();
                String str2 = edittext2.getText().toString();
                String str3 = edittext3.getText().toString();
                String str4 = edittext4.getText().toString();

                if (str1.equals("England") && str2.equals("Scotland") && str3.equals("Northern Ireland") &&
                        str4.equals("Wales")){

                    mpcorrect.start();
                    alertDialog.show();
                }
                else if (!str1.equals("England")){
                    Toast.makeText(letter_b.this, "Check the first country!", Toast.LENGTH_SHORT).show();
                }
                else if (!str2.equals("Scotland")){
                    Toast.makeText(letter_b.this, "Check the second country!", Toast.LENGTH_SHORT).show();
                }
                else if (!str3.equals("Northern Ireland")){
                    Toast.makeText(letter_b.this, "Check the third country!", Toast.LENGTH_SHORT).show();
                }
                else if (!str4.equals("Wales")){
                    Toast.makeText(letter_b.this, "Check the fourth country!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast toase = Toast.makeText(letter_b.this, "Are you sure those are the correct countries?", Toast.LENGTH_SHORT);
                    toase.setGravity(Gravity.CENTER,0,0);
                    toase.show();
                }
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#03cc00"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter B");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
