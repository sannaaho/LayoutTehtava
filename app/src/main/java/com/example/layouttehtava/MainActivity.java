package com.example.layouttehtava;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Picture;
import android.media.Image;
import android.os.Bundle;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.ToggleButton;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    ImageView picture1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        picture1=(ImageView) findViewById(R.id.picture1);

    }

    public void button1Clicked(View v)
    {
        button3.setEnabled(false);
        button2.setEnabled(false);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button1.isPressed()){
                    button2.setEnabled(true);
                    button3.setEnabled(true);
                }
                else {
                    button2.setEnabled(false);
                    button3.setEnabled(false);
                }
            }
        });

    }

    public void button2Clicked(View v)
    {
        picture1.setVisibility(View.INVISIBLE);
    }

    public void button3OnLongClicked(View v)
    {
        button3.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                picture1.setVisibility(View.VISIBLE);
                return false;
            }
        });

    }



}
