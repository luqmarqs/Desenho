/*
* Aluno: Lucas Marques de Almeida
* RA: 21104
* Criado em aula no dia 14/06/2022 para a matéria de desenvolvimento mobile no Cotuca.
* Última modificação: 19/06/2022
*
* */



package com.example.desenho;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private FrameLayout main;
    private Button btn;
    private int seletor = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obter o id da view
        main = (FrameLayout) findViewById(R.id.main_view);
        btn = findViewById(R.id.apagar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = main.getChildCount(); i>=0; i--){
                    View vi = main.getChildAt(i);
                    if (vi instanceof Forma){
                        main.removeViewAt(i);
                    }
                }
            }
        });

    }

    public void seletorTraco(View view) {
        if (seletor <= 3)
            seletor++;
        else
            seletor = 0;

    }

    public boolean onTouchEvent(MotionEvent event){
        switch(seletor){
            case 0:
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
            case 1:
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        main.addView(new Quadrado(this,
                                (int)event.getX(),event.getY(), (int)event.getX()+120,event.getY()+120));
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        return true;

                }
            case 2:
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        main.addView(new Quadrado(this,
                                (int)event.getX(),event.getY(), (int)event.getX()+120,event.getY()+120));
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        return true;

                }
            case 3:
                float startX = 0;
                float startY = 0;
                float stopX;
                float stopY;
                switch (event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        startX = event.getX();
                        startY = event.getY();
                        return true;
                    case MotionEvent.ACTION_MOVE:
                        stopX = event.getX();
                        stopY = event.getY();
                        break;
                    case MotionEvent.ACTION_UP:
                        stopX = event.getX();
                        stopY = event.getY();
                        break;
                    default:
                        return false;
                }

                main.addView(new Reta(this,
                        startX,
                        startY,
                        stopX,
                        stopY));

        }
        return true;
    }
/*
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
 */

   /* public boolean onTouchEvent(MotionEvent event) {
        Log.d("dd", String.format("%04f  %04f", event.getX(),event.getY()));
        switch(event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                main.addView(new Quadrado(this,
                        (int)event.getX(),event.getY(), (int)event.getX()+120,event.getY()+120));
                return true;
            case MotionEvent.ACTION_MOVE:
                return true;

        }

        return true;
    }*/

    /*public boolean onTouchEvent(MotionEvent event) {
        float startX = 0;
        float startY = 0;
        float stopX;
        float stopY;
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = event.getX();
                startY = event.getY();
                return true;
            case MotionEvent.ACTION_MOVE:
                stopX = event.getX();
                stopY = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                stopX = event.getX();
                stopY = event.getY();
                break;
            default:
                return false;
        }

        main.addView(new Reta(this,
                startX,
                startY,
                stopX,
                stopY));
        return true;
    }*/
}