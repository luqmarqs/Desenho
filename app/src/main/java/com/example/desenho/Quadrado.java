package com.example.desenho;

/*
 * Aluno: Lucas Marques de Almeida
 * RA: 21104
 * Criado em aula no dia 14/06/2022 para a matéria de desenvolvimento mobile no Cotuca.
 *
 * */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Quadrado extends View implements Forma{

    private final float left;
    private final float right;
    private final float top;
    private final float bottom;
    private final Paint mPaint;



    public Quadrado(Context context, float left, float top, float bottom, float right) {
        super(context);
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);

        //define a cor base
        mPaint.setColor(0xFFAAFAA0); //cor
        mPaint.setStrokeWidth(25f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(left, top, bottom, right, mPaint);
    }

}
