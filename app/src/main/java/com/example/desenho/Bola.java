package com.example.desenho;

/*
 * Criado em aula no dia 14/06/2022 para a matéria de desenvolvimento mobile no Cotuca
 * */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Bola extends View {

    private final float x;
    private final float y;
    private final int r;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);



    public Bola(Context context, float x, float y, int r) {
        super(context);
        this.x = x;
        this.y = y;
        this.r = r;
        //define a cor base
        mPaint.setColor(0xFFFFFAA0); //cor
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //desenha circulo
        canvas.drawCircle(x,y,r,mPaint);
    }

}
