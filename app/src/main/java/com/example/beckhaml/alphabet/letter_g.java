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
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class letter_g extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_g);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#b400cc"));
        }

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_g.this);

        alertBuilder.setTitle("Well Done!");
        alertBuilder.setMessage("Did you know that only 0.3% of the Earth's water is freshwater?")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_g.this,letter_h.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        final AlertDialog alertDialog = alertBuilder.create();

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#E000FF"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter G");

        GridView gridview = (GridView) findViewById(R.id.gridview1);
        gridview.setAdapter(new ImageAdapter_g(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

                switch (position){

                    case 0:
                        Toast.makeText(letter_g.this, "Woops! Please try again!", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(letter_g.this, "Woops! Please try again!", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(letter_g.this, "Woops! Please try again!", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        mpcorrect.start();
                        alertDialog.show();
                        break;
                    case 4:
                        Toast.makeText(letter_g.this, "Woops! Please try again!", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(letter_g.this, "Woops! Please try again!", Toast.LENGTH_SHORT).show();
                        break;

                }
            }
        });

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
