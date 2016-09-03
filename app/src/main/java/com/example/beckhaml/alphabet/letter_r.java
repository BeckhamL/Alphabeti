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
import android.widget.EditText;
import android.widget.Toast;

public class letter_r extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_r);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_r.this);

        alertBuilder.setTitle("Great Work!");
        alertBuilder.setMessage("Did you know: The Great Barrier Reef spans 1,243 miles" +
                " making it the largest living structure which can be seen from space?")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_r.this,letter_s.class);
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
            window.setStatusBarColor(Color.parseColor("#7a49e4"));
        }

        final Button button = (Button)findViewById(R.id.r_button);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final CheckBox checkBox1 = (CheckBox)findViewById(R.id.check1);
                final CheckBox checkBox2 = (CheckBox)findViewById(R.id.check2);
                final CheckBox checkBox3 = (CheckBox)findViewById(R.id.check3);
                final CheckBox checkBox4 = (CheckBox)findViewById(R.id.check4);

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

                if (checkBox1.isChecked()){
                    Toast.makeText(letter_r.this,"Those aren't the Ocean's!",Toast.LENGTH_SHORT).show();
                }
                else if (checkBox2.isChecked()){
                    Toast.makeText(letter_r.this,"Those aren't the Ocean's!",Toast.LENGTH_SHORT).show();

                }
                else if (checkBox3.isChecked()){

                    if ((str1.equals("Pacific") || str1.equals("Pacific Ocean")) && (str2.equals("Atlantic") || str2.equals("Atlantic Ocean"))
                            && (str3.equals("Indian") || str3.equals("Indian Ocean")) && (str4.equals("Southern") || str4.equals("Southern Ocean"))
                            && (str5.equals("Artic") || str5.equals("Artic Ocean")) ){

                        mpcorrect.start();
                        alertDialog.show();
                    }
                    else if (!(str1.equals("Pacific") || str1.equals("Pacific Ocean"))){
                        Toast.makeText(letter_r.this, "The first Ocean seems wrong!", Toast.LENGTH_SHORT).show();
                    }
                    else if (!(str2.equals("Atlantic") || str2.equals("Atlantic Ocean"))){
                        Toast.makeText(letter_r.this, "The second Ocean seems wrong!", Toast.LENGTH_SHORT).show();
                    }
                    else if (!(str3.equals("Indian") || str3.equals("Indian Ocean"))){
                        Toast.makeText(letter_r.this, "The third Ocean seems wrong!", Toast.LENGTH_SHORT).show();
                    }
                    else if (!(str4.equals("Southern") || str4.equals("Southern Ocean"))){
                        Toast.makeText(letter_r.this, "The fourth Ocean seems wrong!", Toast.LENGTH_SHORT).show();

                    }
                    else if (!(str5.equals("Artic") || str5.equals("Artic Ocean"))){
                        Toast.makeText(letter_r.this, "The fifth Ocean seems wrong!", Toast.LENGTH_SHORT).show();

                    }

                }
                else if (checkBox4.isChecked()){
                    Toast.makeText(letter_r.this,"Those aren't the Ocean's!",Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(letter_r.this, "Try again!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#9C77EB"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter R");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
