package com.lejuno.myappportifolio_nanoefforts;

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

    private Toast mAppToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(LOG_TAG, "onCreate()");
        setContentView(R.layout.activity_portifolio);
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
        if (id == R.id.action_about) {
            Intent intent = new Intent(this, AboutActivity.class);
            startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

        public void buttonAction(View v) {
            //Switch based on button ID
            //Currently they all call displayToast - later they might launch intents
            switch(v.getId()) {
                case R.id.button01:
                case R.id.button02:
                case R.id.button03:
                case R.id.button04:
                case R.id.button05:
                case R.id.button06:
                    displayToast("This button will launch " + ((Button)v).getText().toString());
                    break;
                default:
                    break;
            }
        }

    private void displayToast(String msg) {
        if(mAppToast !=null){
            mAppToast.cancel();
        }
        mAppToast = Toast.makeText(this,msg,Toast.LENGTH_SHORT);
        mAppToast.show();
    }
}
