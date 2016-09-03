package com.example.beckhaml.alphabet;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Alphabeti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphabeti);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        if (Build.VERSION.SDK_INT < 16) {
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }

        // level
        final Spinner spinner = (Spinner)findViewById(R.id.spinner3);
        final ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.beginnin_level,
                android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        final Spinner spinner1 = (Spinner)findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this, R.array.beginning_subject,
                android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);

        final Button button = (Button)findViewById(R.id.button41);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (spinner.getSelectedItemPosition() == 0 && spinner1.getSelectedItemPosition() == 0 ){
                    Toast.makeText(Alphabeti.this, "Please select a subject and level", Toast.LENGTH_SHORT).show();
                }
                else if (spinner.getSelectedItemPosition() == 0){
                    Toast.makeText(Alphabeti.this, "Please select a level", Toast.LENGTH_SHORT).show();
                }
                else if (spinner1.getSelectedItemPosition() == 0){
                    Toast.makeText(Alphabeti.this, "Please select a subject", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(Alphabeti.this,MainActivity.class);
                    startActivity(intent);
                }

            }
        });

        /*
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        */

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.hide();

    }

}

