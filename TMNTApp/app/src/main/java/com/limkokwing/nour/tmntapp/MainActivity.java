package com.limkokwing.nour.tmntapp;

import android.app.Activity;
import android.media.Image;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    public void pickTurtle(View view){
        ImageView turtle = (ImageView) findViewById(R.id.imageT);
        if(view.getId() == R.id.leo){
            turtle.setImageResource(R.drawable.tmntleo);
        }
        else if (view.getId() == R.id.Mike){
            turtle.setImageResource(R.drawable.tmntmike);
        }
        else if (view.getId() == R.id.Don){
            turtle.setImageResource(R.drawable.tmntdon);
        }
        else if (view.getId() == R.id.Raph){
            turtle.setImageResource(R.drawable.tmntraph);
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

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
}
