

package com.example.stepp.numberguessinggame;

import android.app.*;
import android.os.*;
import android.view.*;
import android.widget.*;
import java.util.*;

public class MainActivity extends Activity {

    private int num1;   //left button
    private int num2;   //right button
    private int points; //score

    // View is a type eg: int,float, view is the var name. View != view .
    public void clickButton1(View view){
        check(num1,num2);
    }

    public void clickButton2(View view){
        check(num2,num1);
    }

    private void check(int a,int b){

        if(a>b){
        points++;
        Toast.makeText(this,"Correct!",Toast.LENGTH_SHORT).show();
        }
        else{
         points--;
         if(points>-5)
             Toast.makeText(this,"focus",Toast.LENGTH_SHORT).show();
            else
            Toast.makeText(this,"Nope?",Toast.LENGTH_SHORT).show();
        }
        //Type   Name of Var
        // int a=2 , string c="4"  a=(int)c
        TextView pointsView = (TextView)findViewById(R.id.score);
        pointsView.setText("Points:" + points);
        roll();
    }
    private void roll(){

        Random x = new Random();

        num1=x.nextInt(9);
        num2=x.nextInt(9);

        while(num1==num2){
            num2=x.nextInt(9);
        }
        Button left = (Button)findViewById(R.id.buttonLeft);
        left.setText("" + num1);

        Button right = (Button)findViewById(R.id.buttonRight);
        right.setText("" + num2);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        roll();

    }
}
