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
import android.widget.Toast;

public class letter_p extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_p);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_p.this);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        alertBuilder.setTitle("Good Job!");
        alertBuilder.setMessage("Did you know: North America is the third largest continent only behind " +
                " Asian and Africa?")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_p.this,letter_q.class);
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
            window.setStatusBarColor(Color.parseColor("#f36a20"));
        }

        Button button = (Button)findViewById(R.id.button7);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText editText1 = (EditText)findViewById(R.id.editText10);
                EditText editText2 = (EditText)findViewById(R.id.editText11);
                EditText editText3 = (EditText)findViewById(R.id.editText12);

                String str1 = editText1.getText().toString();
                String str2 = editText2.getText().toString();
                String str3 = editText3.getText().toString();

                if (str1.equals("Canada")){
                    if ((str2.equals("America") || str2.equals("Usa")) || str2.equals("Mexico")){
                        if ((str3.equals("Mexico") && !(str3.equals("America") || str3.equals("Usa"))) || ((str3.equals("America") || str3.equals("Usa")) && !str3.equals("Mexico"))){
                            mpcorrect.start();
                            alertDialog.show();
                        }
                    }
                }
                else if (str1.equals("America") || str1.equals("Usa")){
                    if (str2.equals("Canada") || str2.equals("Mexico")){
                        if ((str3.equals("Mexico") && !str3.equals("Canada")) || (str3.equals("Canada") && !str3.equals("Mexico"))){
                            mpcorrect.start();
                            alertDialog.show();
                        }
                    }
                }
                else if (str1.equals("Mexico")){
                    if (str2.equals("Canada") || (str2.equals("America") || str2.equals("Usa"))){
                        if (((str3.equals("America") || str3.equals("Usa")) && !str3.equals("Canada")) || (str3.equals("Canada") && !(str3.equals("America") || str3.equals("Usa")))){
                            mpcorrect.start();
                            alertDialog.show();
                        }
                    }
                }
                else {
                    Toast.makeText(letter_p.this,"Please try again!",Toast.LENGTH_SHORT).show();
                }
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#F6894F"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter P");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
