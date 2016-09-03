package com.example.beckhaml.alphabet;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
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
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

public class letter_d extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_d);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_d.this);

        alertBuilder.setTitle("Amazing!");
        alertBuilder.setMessage("Did you know: South Africa has 3 capitals - Pretoria, Cape Town and Bloemfontein!")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_d.this,letter_e.class);
                        startActivity(intent);
                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                dialogInterface.cancel();
            }
        });

        final AlertDialog alertDialog = alertBuilder.create();

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter_d(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {

                MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

                switch (position){

                    case 0:
                        Toast.makeText(letter_d.this,"That is a color on the flag!",Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(letter_d.this,"That is a color on the flag!",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        mpcorrect.start();
                        alertDialog.show();
                        break;
                    case 3:
                        Toast.makeText(letter_d.this,"That is a color on the flag!",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(letter_d.this,"That is a color on the flag!",Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(letter_d.this,"That is a color on the flag!",Toast.LENGTH_SHORT).show();
                        break;

                }

            }
        });

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#cc0e00"));
        }

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#FF1200"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter D");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
