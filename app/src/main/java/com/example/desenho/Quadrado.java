package com.example.desenho;

/*
 * Criado em aula no dia 14/06/2022 para a matéria de desenvolvimento mobile no Cotuca
 * */

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

public class Quadrado extends View {

    private final float left;
    private final float right;
    private final float top;
    private final float bottom;
    private final Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);



    public Quadrado(Context context, float left, float right, float bottom, float top) {
        super(context);
        this.left = left;
        this.right = right;
        this.top = top;
        this.bottom = bottom;

        //define a cor base
        mPaint.setColor(0xFFFFFAA0); //cor
    }


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawRect(left, top, bottom, right, mPaint);
    }

}
