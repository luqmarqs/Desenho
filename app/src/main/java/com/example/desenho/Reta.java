package com.example.desenho;

/*
 * Aluno: Lucas Marques de Almeida
 * RA: 21104
 * Criado em aula no dia 18/06/2022 para a matéria de desenvolvimento mobile no Cotuca.
 * Última modificação: 19/06/2022
 *
 * */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Reta extends View implements Forma{

    private final float start_x;
    private final float start_y;
    private final float stop_x;
    private final float stop_y;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);



    public Reta(Context context, float start_x, float start_y, float stop_x, float stop_y) {
        super(context);
        this.start_x = start_x;
        this.start_y = start_y;
        this.stop_x = stop_x;
        this.stop_y = stop_y;

        //define a cor base
        mPaint.setColor(0xFFFFFAA0); //cor
    }




    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //desenha reta
        canvas.drawLine(start_x, start_y, stop_x, stop_y, mPaint);
    }

}
