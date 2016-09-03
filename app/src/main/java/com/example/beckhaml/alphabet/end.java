package com.example.beckhaml.alphabet;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class end extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final Button button = (Button)findViewById(R.id.UA_b);
        final TextView textView1 = (TextView)findViewById(R.id.UA_text1);
        final TextView textView2 = (TextView)findViewById(R.id.UA_text2);
        final TextView textView3 = (TextView)findViewById(R.id.UA_text3);

        final Typeface typeface = Typeface.createFromAsset(getAssets(),"GROBOLD.ttf");
        textView1.setTypeface(typeface);
        textView2.setTypeface(typeface);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(end.this,Alphabeti.class);
                startActivity(intent);
            }
        });

        String paragraph = "Thank you for downloading and playing this app!";

        String paragraph2 = "More levels and subjects are in development so please stay tuned!";

        String paragraph3 = "If there are any areas that you would like to see improvement in, feel free to send an " +
                "email to alphabetiCAN@outlook.com";

        textView1.setText(paragraph);
        textView1.setMovementMethod(new ScrollingMovementMethod());

        textView2.setText(paragraph2);
        textView2.setMovementMethod(new ScrollingMovementMethod());

        textView3.setText(paragraph3);
        textView3.setMovementMethod(new ScrollingMovementMethod());

        android.support.v7.app.ActionBar ab = getSupportActionBar();
        ab.hide();

    }

}
