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

public class letter_s extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_s);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_s.this);
        final MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

        alertBuilder.setTitle("Great Work!");
        alertBuilder.setMessage("Did you know: Belgium has more castles per kilometer than any other country" +
                " in the world?")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_s.this,letter_t.class);
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
            window.setStatusBarColor(Color.parseColor("#147115"));
        }

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter_s(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                switch (position){
                    case 0:
                        Toast.makeText(letter_s.this,"Woops! Try again",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        mpcorrect.start();
                        alertDialog.show();
                        break;
                    case 2:
                        Toast.makeText(letter_s.this,"Woops! Try again",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(letter_s.this,"Woops! Try again",Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#1C9C1E"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter S");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
