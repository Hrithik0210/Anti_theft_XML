package com.example.antitheft;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static  int SPLASH_TIME_OUT=4000;

    View first,second,third,forth,fifth,sixth;
    ImageView back,logo;
    TextView slogan;

    Animation topAnimation,bottomAnimation,middleAnimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        topAnimation= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnimation= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        middleAnimation= AnimationUtils.loadAnimation(this,R.anim.middle_animation);

        first=findViewById(R.id.first_line);
        second=findViewById(R.id.second_line);
        third=findViewById(R.id.third_line);
        forth=findViewById(R.id.forth_line);
        fifth=findViewById(R.id.fifth_line);
        sixth=findViewById(R.id.sixth_line);

        logo=findViewById(R.id.logo);
        back=findViewById(R.id.back);
        slogan=findViewById(R.id.tag_line);

        first.setAnimation(topAnimation);
        second.setAnimation(topAnimation);
        third.setAnimation(topAnimation);
        forth.setAnimation(topAnimation);
        fifth.setAnimation(topAnimation);
        sixth.setAnimation(topAnimation);

        logo.setAnimation(middleAnimation);
        back.setAnimation(middleAnimation);

        slogan.setAnimation(bottomAnimation);

        //Splash screen
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent=new Intent(MainActivity.this,Login.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_TIME_OUT);

    }
}