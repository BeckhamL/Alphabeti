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
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class letter_o extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letter_o);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final AlertDialog.Builder alertBuilder = new AlertDialog.Builder(letter_o.this);

        alertBuilder.setTitle("Great Job!");
        alertBuilder.setMessage("Did you know: Canada has more lakes than the rest of the world's combined?")
                .setCancelable(false)
                .setPositiveButton("Next", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent intent = new Intent(letter_o.this,letter_p.class);
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
            window.setStatusBarColor(Color.parseColor("#601386"));
        }

        final Spinner spinner = (Spinner)findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.letter_o_animal,
                android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final Spinner spinner2 = (Spinner)findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.letter_o_provinces,
                android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);

        final TextView textView1 = (TextView)findViewById(R.id.textView17);
        final TextView textView2 = (TextView)findViewById(R.id.textView18);
        final TextView textView3 = (TextView)findViewById(R.id.textView19);
        final Button button1 = (Button)findViewById(R.id.button6);
        final Button button2 = (Button)findViewById(R.id.button40);
        final Button button3 = (Button)findViewById(R.id.button39);
        final Button button4 = (Button)findViewById(R.id.button38);

        textView1.setVisibility(View.INVISIBLE);
        textView2.setVisibility(View.INVISIBLE);
        textView3.setVisibility(View.INVISIBLE);
        spinner2.setVisibility(View.INVISIBLE);
        button1.setVisibility(View.INVISIBLE);
        button2.setVisibility(View.INVISIBLE);
        button3.setVisibility(View.INVISIBLE);
        button4.setVisibility(View.INVISIBLE);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                switch (position){
                    case 1:
                        Toast.makeText(letter_o.this,"It's not a moose!",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:

                        Toast.makeText(letter_o.this,"It's not a Red Fox!",Toast.LENGTH_SHORT).show();

                        break;
                    case 3:

                        Toast.makeText(letter_o.this,"Well done!",Toast.LENGTH_SHORT).show();

                        textView1.setVisibility(View.VISIBLE);
                        textView2.setVisibility(View.VISIBLE);
                        spinner2.setVisibility(View.VISIBLE);
                        break;
                    case 4:
                        Toast.makeText(letter_o.this,"It's not a Polar Bear!",Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(letter_o.this,"It's not a Sea Otter!",Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(letter_o.this,"It's not a White-Tailed Deer!",Toast.LENGTH_SHORT).show();
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long l) {

                switch (position){
                    case 1:
                        Toast.makeText(letter_o.this,"There are more!",Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(letter_o.this,"There are more!",Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        textView3.setVisibility(View.VISIBLE);
                        button1.setVisibility(View.VISIBLE);
                        button2.setVisibility(View.VISIBLE);
                        button3.setVisibility(View.VISIBLE);
                        button4.setVisibility(View.VISIBLE);
                        Toast.makeText(letter_o.this,"Well done!",Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(letter_o.this,"There are less!",Toast.LENGTH_SHORT).show();
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MediaPlayer mpcorrect = MediaPlayer.create(getApplicationContext(), R.raw.correct);

                button1.setBackgroundColor(Color.parseColor("#97e99b"));
                mpcorrect.start();
                alertDialog.show();
                }

        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_o.this, "Try again!", Toast.LENGTH_SHORT).show();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_o.this, "Try again!", Toast.LENGTH_SHORT).show();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(letter_o.this, "Try again!", Toast.LENGTH_SHORT).show();
            }
        });

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#831AB8"));
        ab.setBackgroundDrawable(colorDrawable);
        ab.setTitle("Letter O");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
