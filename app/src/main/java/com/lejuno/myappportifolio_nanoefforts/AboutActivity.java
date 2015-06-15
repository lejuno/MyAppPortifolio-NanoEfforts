package com.lejuno.myappportifolio_nanoefforts;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;


public class AboutActivity extends ActionBarActivity {

    private String LOG_TAG;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "onCreate()");
        setContentView(R.layout.activity_about);
    }
}
