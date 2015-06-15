package com.lejuno.myappportifolio_nanoefforts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class PortifolioActivity extends ActionBarActivity {

    private String LOG_TAG = "PortfolioActivity";
    // Buttons 1 to 6 initialization
    private Button button01;
    private Button button02;
    private Button button03;
    private Button button04;
    private Button button05;
    private Button button06;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "onCreate()");
        setContentView(R.layout.activity_portifolio);
        initializeButtons();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        Log.d(LOG_TAG, "onCreateOptionsMenu()");
        getMenuInflater().inflate(R.menu.menu_portifolio, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        Log.d(LOG_TAG, "onOptionsItemSelected()");
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initializeButtons() {
        Log.d(LOG_TAG, "initializeButtons()");
        button01 = (Button) findViewById(R.id.button01);
        button01.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getContext(), "This button will launch " + button01.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button02 = (Button) findViewById(R.id.button02);
        button02.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getContext(), "This button will launch " + button02.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button03 = (Button) findViewById(R.id.button03);
        button03.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getContext(), "This button will launch " + button03.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        button04 = (Button) findViewById(R.id.button04);
        button04.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getContext(), "This button will launch " + button04.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button05 = (Button) findViewById(R.id.button05);
        button05.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getContext(), "This button will launch " + button05.getText(),Toast.LENGTH_SHORT).show();
            }
        });
        button06 = (Button) findViewById(R.id.button06);
        button06.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(getContext(), "This button will launch " + button06.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    public Context getContext() {
        Log.d(LOG_TAG, "getContext()");
        return this;
    }
}
