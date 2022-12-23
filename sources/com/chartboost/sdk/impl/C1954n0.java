package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.LinearLayout;

/* renamed from: com.chartboost.sdk.impl.n0 */
public class C1954n0 extends LinearLayout {

    /* renamed from: a */
    private final Paint f5016a;

    /* renamed from: b */
    private int f5017b = 0;

    public C1954n0(Context context) {
        super(context);
        int round = Math.round(context.getResources().getDisplayMetrics().density * 5.0f);
        setPadding(round, round, round, round);
        setBaselineAligned(false);
        Paint paint = new Paint();
        this.f5016a = paint;
        paint.setStyle(Paint.Style.FILL);
    }

    /* renamed from: a */
    public void mo14714a(int i) {
        this.f5017b = i;
    }

    /* renamed from: b */
    public void mo14715b(int i) {
        this.f5016a.setColor(i);
        invalidate();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = getContext().getResources().getDisplayMetrics().density;
        if ((this.f5017b & 1) > 0) {
            canvas.drawRect(0.0f, 0.0f, (float) canvas.getWidth(), f * 1.0f, this.f5016a);
        }
        if ((this.f5017b & 2) > 0) {
            canvas.drawRect(((float) canvas.getWidth()) - (f * 1.0f), 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), this.f5016a);
        }
        if ((this.f5017b & 4) > 0) {
            canvas.drawRect(0.0f, ((float) canvas.getHeight()) - (f * 1.0f), (float) canvas.getWidth(), (float) canvas.getHeight(), this.f5016a);
        }
        if ((this.f5017b & 8) > 0) {
            canvas.drawRect(0.0f, 0.0f, f * 1.0f, (float) canvas.getHeight(), this.f5016a);
        }
    }
}
