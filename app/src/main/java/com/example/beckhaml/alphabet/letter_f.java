package com.example.beckhaml.alphabet;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
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
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ScrollView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class letter_f extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_f);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#00997a"));
        }

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_f.this);

        alertBuilder.setTitle("Superb!");
        alertBuilder.setMessage("Incredibly, those four countries account for 43.97% of the entire worlds population!")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_f.this,letter_g.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        final AlertDialog alertDialog = alertBuilder.create();

        final Button button = (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

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

                    if(str1.equals("China") && str2.equals("India") && (str3.equals("America") || str3.equals("Usa")) && str4.equals("Indonesia")){

                        mpcorrect.start();
                        alertDialog.show();
                    }

                    else if(!str1.equals("China")){

                        Toast.makeText(letter_f.this, "Please check first country", Toast.LENGTH_SHORT).show();
                    }
                    else if(!str2.equals("India")){

                        Toast.makeText(letter_f.this, "Please check second country", Toast.LENGTH_SHORT).show();
                    }
                    else if(!str4.equals("Indonesia")){

                        Toast.makeText(letter_f.this, "Please check fourth country", Toast.LENGTH_SHORT).show();
                    }
                    else if(!str3.equals("America") || !str3.equals("Usa")){

                        Toast.makeText(letter_f.this, "Please check third country", Toast.LENGTH_SHORT).show();
                    }

                }
                else if (checkBox2.isChecked()){

                    Toast.makeText(letter_f.this, "Those countries don't have the largest population!", Toast.LENGTH_SHORT).show();

                }
                else if (checkBox3.isChecked()){

                    Toast.makeText(letter_f.this, "Those countries don't have the largest population!", Toast.LENGTH_SHORT).show();

                }
                else if (checkBox4.isChecked()){

                    Toast.makeText(letter_f.this, "Those countries don't have the largest population!", Toast.LENGTH_SHORT).show();

                }
                else {
                    Toast.makeText(letter_f.this, "Try again!", Toast.LENGTH_SHORT).show();
                }

            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#00cca3"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter F");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
