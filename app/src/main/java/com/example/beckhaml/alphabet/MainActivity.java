package com.example.beckhaml.alphabet;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        ActionBar ab = getSupportActionBar();
        ColorDrawable colorDrawable = new ColorDrawable(Color.parseColor("#4ecc00"));
        ab.setBackgroundDrawable(colorDrawable);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            Window window = getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor("#3b9900"));
        }

        //gridview

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new ImageAdapter(this));

        Parcelable index = gridview.onSaveInstanceState();
        gridview.onRestoreInstanceState(index);

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {


                switch (position){
                    case 0:
                        Intent intent = new Intent(MainActivity.this, letter_a.class);
                        startActivity(intent);
                        break;
                    case 1:
                        Intent intent1 = new Intent(MainActivity.this, letter_b.class);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(MainActivity.this, letter_c.class);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(MainActivity.this, letter_d.class);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(MainActivity.this, letter_e.class);
                        startActivity(intent4);
                        break;
                    case 5:
                        Intent intent5 = new Intent(MainActivity.this, letter_f.class);
                        startActivity(intent5);
                        break;
                    case 6:
                        Intent intent6 = new Intent(MainActivity.this, letter_g.class);
                        startActivity(intent6);
                        break;
                    case 7:
                        Intent intent7 = new Intent(MainActivity.this, letter_h.class);
                        startActivity(intent7);
                        break;
                    case 8:
                        Intent intent8 = new Intent(MainActivity.this, letter_i.class);
                        startActivity(intent8);
                        break;
                    case 9:
                        Intent intent9 = new Intent(MainActivity.this, letter_j.class);
                        startActivity(intent9);
                        break;
                    case 10:
                        Intent intent10 = new Intent(MainActivity.this, letter_k.class);
                        startActivity(intent10);
                        break;
                    case 11:
                        Intent intent11 = new Intent(MainActivity.this, letter_l.class);
                        startActivity(intent11);
                        break;
                    case 12:
                        Intent intent12 = new Intent(MainActivity.this, letter_m.class);
                        startActivity(intent12);
                        break;
                    case 13:
                        Intent intent13 = new Intent(MainActivity.this, letter_n.class);
                        startActivity(intent13);
                        break;
                    case 14:
                        Intent intent14 = new Intent(MainActivity.this, letter_o.class);
                        startActivity(intent14);
                        break;
                    case 15:
                        Intent intent15 = new Intent(MainActivity.this, letter_p.class);
                        startActivity(intent15);
                        break;
                    case 16:
                        Intent intent16 = new Intent(MainActivity.this, letter_q.class);
                        startActivity(intent16);
                        break;
                    case 17:
                        Intent intent17 = new Intent(MainActivity.this, letter_r.class);
                        startActivity(intent17);
                        break;
                    case 18:
                        Intent intent18 = new Intent(MainActivity.this, letter_s.class);
                        startActivity(intent18);
                        break;
                    case 19:
                        Intent intent19 = new Intent(MainActivity.this, letter_t.class);
                        startActivity(intent19);
                        break;
                    case 20:
                        Intent intent20 = new Intent(MainActivity.this, letter_u.class);
                        startActivity(intent20);
                        break;
                    case 21:
                        Intent intent21 = new Intent(MainActivity.this, letter_v.class);
                        startActivity(intent21);
                        break;
                    case 22:
                        Intent intent22 = new Intent(MainActivity.this, letter_w.class);
                        startActivity(intent22);
                        break;
                    case 23:
                        Intent intent23 = new Intent(MainActivity.this, letter_x.class);
                        startActivity(intent23);
                        break;
                    case 24:
                        Intent intent24 = new Intent(MainActivity.this, letter_y.class);
                        startActivity(intent24);
                        break;
                    case 25:
                        Intent intent25 = new Intent(MainActivity.this, letter_z.class);
                        startActivity(intent25);
                        break;
                }

            }
        });
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    */
}
