package com.example.manse.easytimer;

import android.content.DialogInterface;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

//import android.os.MyCountDownTimer;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private CountDownTimer countDownTimer;
    //private MyCountDownTimer countDownTimer;

    private long timeElapsed;
    private boolean timerHasStarted = false;
    private Button startB;

    //private View text;
    //private View timeElapsedView;
    private TextView text;
    private TextView timeElapsedView;


    private final long startTime = 50 * 1000;
    private final long interval = 1 * 1000;
    public long millisUntilFinished = startTime - timeElapsed;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//calls super constructor
        setContentView(R.layout.activity_main);
        //button  = R.id.this.button;

        startB = (Button) this.findViewById(R.id.button);
        startB.setOnClickListener(this);
        text = (TextView) this.findViewById(R.id.timer);
        timeElapsedView = (TextView) this.findViewById(R.id.timeElapsed);
        countDownTimer = new CountDownTimer(startTime, interval);
        text.setText(text.getText() + String.valueOf(startTime));



        //button  = R.id.this.button;


        /*
        button.setOnCLickListener(new View.OnClickListner()){

            @Override
            public void onClick(View view) {

            }

        }
        */



    }

    //Button button;

    //public class CountDownTimer(long millisInFuture, long countDownInterval){


    //}


    public class CountDownTimer extends android.os.CountDownTimer{


        public CountDownTimer(long millisInFuture, long countDownInterval) {
            super(millisInFuture, countDownInterval);
        }

        @Override
        public void onTick(long l) {

            text.setText("Time remain: " + millisUntilFinished);
            timeElapsed = startTime - millisUntilFinished;
            timeElapsedView.setText("Time Elapsed: " + String.valueOf(timeElapsed));

        }

        @Override
        public void onFinish() {

            text.setText("Time's up!");
            timeElapsedView.setText("Time Elapsed: " + String.valueOf(startTime));

        }
    }


    @Override
    public void onClick(View view) {

        if(!timerHasStarted) {
            countDownTimer.start();
            timerHasStarted = true;
            startB.setText("Start");
        } else {
            countDownTimer.cancel();
            timerHasStarted = false;
            startB.setText("Reset");
        }

    }




}
