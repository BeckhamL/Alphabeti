package com.example.beckhaml.alphabet;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
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
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class letter_c extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_c);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#cc8100"));
        }

        /*
        final TextView textView = (TextView)findViewById(R.id.textView5);
        final Typeface typeface = Typeface.createFromAsset(getAssets(),"BebasNeue.otf");

        textView.setTypeface(typeface);
        */

        final Button button = (Button)findViewById(R.id.c_button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

                final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_c.this);

                alertBuilder.setTitle("Great Work!");
                alertBuilder.setMessage("Looks like you know Italy well!")
                        .setCancelable(false)
                        .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                Intent intent = new Intent(letter_c.this,letter_d.class);
                                startActivity(intent);
                            }
                        }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.cancel();
                    }
                });

                AlertDialog alertDialog = alertBuilder.create();

                final CheckBox checkBox1 = (CheckBox)findViewById(R.id.check1);
                final CheckBox checkBox2 = (CheckBox)findViewById(R.id.check2);
                final CheckBox checkBox3 = (CheckBox)findViewById(R.id.check3);
                final CheckBox checkBox4 = (CheckBox)findViewById(R.id.check4);

                final EditText editText1 = (EditText)findViewById(R.id.editText5);
                final EditText editText2 = (EditText)findViewById(R.id.editText6);
                final EditText editText3 = (EditText)findViewById(R.id.editText7);
                final EditText editText4 = (EditText)findViewById(R.id.editText8);

                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();
                String str3 = editText3.getText().toString();
                String str4 = editText4.getText().toString();

                if (checkBox1.isChecked()){

                    if (str1.equals("France") || str2.equals("Austria") || str3.equals("Switzerland") ||
                            str4.equals("Slovenia")){
                    }

                    Toast.makeText(letter_c.this, "Woops! Those four countries don't border Italy!", Toast.LENGTH_SHORT).show();

                }
                else if (checkBox2.isChecked()){

                    if (str1.equals("France") || str2.equals("Austria") || str3.equals("Switzerland") ||
                            str4.equals("Slovenia")){

                    }
                    Toast.makeText(letter_c.this, "Woops! Those four countries don't border Italy!", Toast.LENGTH_SHORT).show();

                }
                else if (checkBox3.isChecked()){

                    if (str1.equals("France") || str2.equals("Austria") || str3.equals("Switzerland") ||
                            str4.equals("Slovenia")){

                    }
                    Toast.makeText(letter_c.this, "Woops! Those four countries don't border Italy!", Toast.LENGTH_SHORT).show();

                }
                else if (checkBox4.isChecked()){

                    if(str1.equals("France") && str2.equals("Austria") && str3.equals("Switzerland") && str4.equals("Slovenia")){
                        // change to dialog box
                        mpcorrect.start();
                        alertDialog.show();
                    }
                    else if(!str1.equals("France")){
                        Toast.makeText(letter_c.this, "Are you sure the purple/first country is correct?", Toast.LENGTH_SHORT).show();

                    }
                    else if(!str2.equals("Austria")){
                        Toast.makeText(letter_c.this, "Are you sure the red/second country is correct?", Toast.LENGTH_SHORT).show();

                    }
                    else if(!str3.equals("Switzerland")){
                        Toast.makeText(letter_c.this, "Are you sure the green/third country is correct?", Toast.LENGTH_SHORT).show();

                    }
                    else if(!str4.equals("Slovenia")){
                        Toast.makeText(letter_c.this, "Are you sure the blue/fourth country is correct?", Toast.LENGTH_SHORT).show();

                    }

                }
                else {
                    Toast.makeText(letter_c.this, "Try again!", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FFA200"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter C");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
