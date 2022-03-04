package com.example.assignment2animation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Animation anim;
    ImageView img;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.textView);
        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        btn3 = findViewById(R.id.button3);
        btn4 = findViewById(R.id.button4);
        btn5 = findViewById(R.id.button5);
        btn6 = findViewById(R.id.button6);
        img = findViewById(R.id.imageView);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.blink);
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim);

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.rotate);
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slide);
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim);

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade);
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim);

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                anim = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom);
                img.setVisibility(View.VISIBLE);
                img.startAnimation(anim);

            }
        });

    }
}