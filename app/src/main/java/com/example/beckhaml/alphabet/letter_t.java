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
import android.widget.Toast;

public class letter_t extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_t);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_t.this);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        alertBuilder.setTitle("Awesome!");
        alertBuilder.setMessage("Did you know: Auroras that occur on Earth's Northern pole are called " +
                " 'Aurora Borealis' whereas auroras on the Southern pole are called 'Aurora Australis'")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_t.this, letter_u.class);
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
            window.setStatusBarColor(Color.parseColor("#385a11"));
        }

        Button button = (Button)findViewById(R.id.button29);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                CheckBox checkBox1 = (CheckBox)findViewById(R.id.checkBox);
                CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox5);
                CheckBox checkBox3 = (CheckBox)findViewById(R.id.checkBox6);
                CheckBox checkBox4 = (CheckBox)findViewById(R.id.checkBox7);

                if(checkBox1.isChecked()){
                    Toast.makeText(letter_t.this,"Please try again",Toast.LENGTH_SHORT).show();
                }
                else if (checkBox2.isChecked()){
                    Toast.makeText(letter_t.this,"Please try again",Toast.LENGTH_SHORT).show();
                }
                else if (checkBox3.isChecked()){
                    Toast.makeText(letter_t.this,"Please try again",Toast.LENGTH_SHORT).show();
                }
                else if (checkBox4.isChecked()){
                    mpcorrect.start();
                    alertDialog.show();
                }
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#53861A"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter T");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
