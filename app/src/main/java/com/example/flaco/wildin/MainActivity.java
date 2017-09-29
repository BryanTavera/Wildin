package com.example.flaco.wildin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button checkprev,checkimg,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        checkprev=(Button) findViewById(R.id.checkprev);
        checkimg=(Button) findViewById(R.id.checkimg);
        exit=(Button) findViewById(R.id.exit);
        View.OnClickListener onClickListeneristener=new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (v.getId()==checkprev.getId()){
                    //do things with check prev
                    Toast.makeText(MainActivity.this,"check prev",Toast.LENGTH_LONG).show();

                }else if (v.getId()==checkimg.getId()){
                    // do things with check img
                    Toast.makeText(MainActivity.this,"check img",Toast.LENGTH_LONG).show();
                }
                else{
                    //do things with exit
                    Toast.makeText(MainActivity.this,"exit",Toast.LENGTH_LONG).show();
                }
            }
        };
        checkprev.setOnClickListener(onClickListeneristener);
        checkimg.setOnClickListener(onClickListeneristener);
        exit.setOnClickListener(onClickListeneristener);
    }
}
