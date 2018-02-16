package com.amritha.acadgild.android_session9_assignment1;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Definig TextView
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get TextView object from xml

        textView = findViewById(R.id.textView);
    }

    //creating options menu method which uses inflater
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.submenu, menu);//calling submenu.xml

        return super.onCreateOptionsMenu(menu);
    }

    //creating options item selected method which uses switch cases
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {

            case R.id.red:
                textView.setTextColor(Color.parseColor("#F44336"));//changing Text View color to Red
                break;

            case R.id.blue:
                textView.setTextColor(Color.parseColor("#2196F3"));//changing Text View color to Green
                break;

            case R.id.green:
                textView.setTextColor(Color.parseColor("#4CAF50"));//changing Text View color to Blue
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
