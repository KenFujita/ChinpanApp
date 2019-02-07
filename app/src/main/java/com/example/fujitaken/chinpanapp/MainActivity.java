package com.example.fujitaken.chinpanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    ImageView im;
    Animation am;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = findViewById(R.id.textView2);
        im = findViewById(R.id.imageView);

        am = AnimationUtils.loadAnimation(this,R.anim.translate_animation);
    }

    public void onAdd(android.view.View v){
        a++;
        tx.setText(String.valueOf(a));

        im.startAnimation(am);
    }
}
