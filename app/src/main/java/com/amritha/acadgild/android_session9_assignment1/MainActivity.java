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

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();

        inflater.inflate(R.menu.submenu, menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()) {

            case R.id.red:
                textView.setTextColor(Color.parseColor("#F44336"));
                break;

            case R.id.blue:
                textView.setTextColor(Color.parseColor("#2196F3"));
                break;

            case R.id.green:
                textView.setTextColor(Color.parseColor("#4CAF50"));
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
