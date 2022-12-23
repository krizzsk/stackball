package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.applovin.impl.adview.C1086h;

/* renamed from: com.applovin.impl.adview.q */
public final class C1148q extends C1086h {

    /* renamed from: c */
    private static final Paint f2111c = new Paint(1);

    /* renamed from: d */
    private static final Paint f2112d = new Paint(1);

    public C1148q(Context context) {
        super(context);
        f2111c.setARGB(80, 0, 0, 0);
        f2112d.setColor(-1);
        f2112d.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void mo11952a(int i) {
        setViewScale(((float) i) / 30.0f);
    }

    /* access modifiers changed from: protected */
    public float getCenter() {
        return getSize() / 2.0f;
    }

    /* access modifiers changed from: protected */
    public float getCrossOffset() {
        return this.f1959a * 8.0f;
    }

    /* access modifiers changed from: protected */
    public float getStrokeWidth() {
        return this.f1959a * 2.0f;
    }

    public C1086h.C1087a getStyle() {
        return C1086h.C1087a.WHITE_ON_TRANSPARENT;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float center = getCenter();
        canvas.drawCircle(center, center, center, f2111c);
        float crossOffset = getCrossOffset();
        float size = getSize() - crossOffset;
        f2112d.setStrokeWidth(getStrokeWidth());
        Canvas canvas2 = canvas;
        float f = crossOffset;
        float f2 = size;
        canvas2.drawLine(f, crossOffset, f2, size, f2112d);
        canvas2.drawLine(f, size, f2, crossOffset, f2112d);
    }
}
