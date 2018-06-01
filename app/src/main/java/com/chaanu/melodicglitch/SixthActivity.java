package com.chaanu.melodicglitch;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class SixthActivity extends AppCompatActivity {
    protected MediaPlayer mp = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);
        mp= MediaPlayer.create(this, R.raw.coldpay);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroupSecond);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.radioButton1: {
                        if (mp.isPlaying())
                            mp.pause();
                        Toast.makeText(getApplicationContext(), "Well done",
                                Toast.LENGTH_SHORT).show();

                        Intent goToNext = new Intent();
                        goToNext.setClass(getApplicationContext(), SeventhActivity.class);
                        startActivity(goToNext);
                        finish();
                        break;
                    }
                    case R.id.radioButton2: {
                        if (mp.isPlaying())
                            mp.pause();
                        Toast.makeText(getApplicationContext(), "Wrong Answer. Start Over",
                                Toast.LENGTH_SHORT).show();

                        Intent goToFirst = new Intent();
                        goToFirst.setClass(getApplicationContext(), FirstActivity.class);
                        startActivity(goToFirst);
                        finish();
                        break;
                    }
                    case R.id.radioButton3: {
                        if (mp.isPlaying())
                            mp.pause();
                        Toast.makeText(getApplicationContext(), "Wrong Answer. Start Over",
                                Toast.LENGTH_SHORT).show();

                        Intent goToFirst = new Intent();
                        goToFirst.setClass(getApplicationContext(), FirstActivity.class);
                        startActivity(goToFirst);
                        finish();
                        break;
                    }
                    case R.id.radioButton4: {
                        if (mp.isPlaying())
                            mp.pause();
                        Toast.makeText(getApplicationContext(), "Wrong Answer. Start Over",
                                Toast.LENGTH_SHORT).show();

                        Intent goToFirst = new Intent();
                        goToFirst.setClass(getApplicationContext(), FirstActivity.class);
                        startActivity(goToFirst);
                        finish();
                        break;
                    }

                }
            }
        });

    }
    public void play(View v){
        mp.start();
    }
    public void pause(View v) {
        if (mp.isPlaying())
            mp.pause();
    }
    public void onBackPressed(){
        Intent goToFirst = new Intent();
        goToFirst.setClass(getApplicationContext(), FirstActivity.class);
        startActivity(goToFirst);
        finish();
    }

}
