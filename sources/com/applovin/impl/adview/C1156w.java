package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import androidx.core.view.ViewCompat;
import com.applovin.impl.adview.C1086h;

/* renamed from: com.applovin.impl.adview.w */
public final class C1156w extends C1086h {

    /* renamed from: c */
    private static final Paint f2130c = new Paint(1);

    /* renamed from: d */
    private static final Paint f2131d = new Paint(1);

    /* renamed from: e */
    private static final Paint f2132e = new Paint(1);

    public C1156w(Context context) {
        super(context);
        f2130c.setColor(-1);
        f2131d.setColor(ViewCompat.MEASURED_STATE_MASK);
        f2132e.setColor(-1);
        f2132e.setStyle(Paint.Style.STROKE);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f1959a * 10.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleOffset() {
        return this.f1959a * 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getInnerCircleRadius() {
        return getCenter() - getInnerCircleOffset();
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f1959a * 3.0f;
    }

    public C1086h.C1087a getStyle() {
        return C1086h.C1087a.WHITE_ON_BLACK;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f2130c);
        canvas.drawCircle(center, center, getInnerCircleRadius(), f2131d);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f2132e.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f = crossOffset;
        float f2 = size;
        canvas2.drawLine(f, crossOffset, f2, size, f2132e);
        canvas2.drawLine(f, size, f2, crossOffset, f2132e);
    }
}
