package com.example.fujitaken.chinpanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tx;
    int a=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tx = (TextView) findViewById(R.id.textview);
        //Button button = (Button)findViewById(R.id.button);
    }

    public void onAdd(android.view.View v){
        a++;
        tx.setText(String.valueOf(a));
    }
}
