package com.example.manse.easytimer;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Button button;

    //public class CountDownTimer(long millisInFuture, long countDownInterval){


    //}


    public class CountDownTimer extends android.os.CountDownTimer{


        public CountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {

        }

        @Override
        public void onFinish() {

        }
    }


    @Override
    public void onClick(View view) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//calls super constructor
        setContentView(R.layout.activity_main);

        //button  = R.id.this.button;


        /*
        button.setOnCLickListener(new View.OnClickListner()){

            @Override
            public void onClick(View view) {

            }

        }
        */



    }


}
