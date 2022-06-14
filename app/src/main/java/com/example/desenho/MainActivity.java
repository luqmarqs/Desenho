package com.example.desenho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obter o id da view
        main = (FrameLayout) findViewById(R.id.main_view);

        main.addView(new Bola(this, 100, 100, 40));
    }

    public boolean onTouchEvent(MotionEvent event) {
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                main.addView(new Bola(this,
                        event.getX(),
                        event.getY(),
                        40));
                return true;
            case MotionEvent.ACTION_MOVE:
                return true;

        }

        return true;
    }
}