package com.limkokwing.nour.numbergame;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends Activity {

    private int num1;
    private int num2;
    private int score;


//    function type -- return type -- fucnton name (input)
    public void clickButton1(View view){   check(num1,num2);  }
    public void clickButton2(View view){   check(num2,num1);  }

//    comprae the values
    private void check(int a,int b) {

        if(a>b){
            score++;
            Toast.makeText(this,"Correct",Toast.LENGTH_SHORT).show();
        }
        else{
            score--;
            Toast.makeText(this,"nope?",Toast.LENGTH_SHORT).show();
        }

        TextView points =(TextView)findViewById(R.id.Score);
        points.setText("Points: " + score);


        roll();


    }




//    generate random numbers
    private void roll(){
        Random x = new Random();

        num1 = x.nextInt(9);
        num2 = x.nextInt(9);

        while(num1==num2){
            num2 = x.nextInt(9);
        }

//        int x = (int)2.01;
        Button left = (Button)findViewById(R.id.Button1);
        left.setText("" + num1);

        Button right = (Button)findViewById(R.id.Button2);
        right.setText("" + num2);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
