package com.yandex.mobile.ads.nativeads.template;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.widget.TextView;
import com.yandex.mobile.ads.impl.lo1;

/* renamed from: com.yandex.mobile.ads.nativeads.template.f */
final class C15548f extends TextView {

    /* renamed from: a */
    private Rect f44078a;

    /* renamed from: b */
    private Paint f44079b;

    /* renamed from: c */
    private int f44080c;

    /* renamed from: d */
    private int f44081d;

    public C15548f(Context context) {
        super(context);
        m45363a();
    }

    /* renamed from: a */
    private void m45363a() {
        this.f44078a = new Rect();
        this.f44079b = new Paint();
        this.f44080c = lo1.m38864a(getContext(), 1.0f);
        this.f44081d = lo1.m38864a(getContext(), 4.0f);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int a = lo1.m38863a(getCurrentTextColor(), 85.0f);
        Paint paint = this.f44079b;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth((float) this.f44080c);
        paint.setColor(a);
        int lineCount = getLineCount();
        Layout layout = getLayout();
        for (int i = 0; i < lineCount; i++) {
            int lineBounds = getLineBounds(i, this.f44078a);
            int lineStart = layout.getLineStart(i);
            int lineEnd = layout.getLineEnd(i);
            float primaryHorizontal = layout.getPrimaryHorizontal(lineStart);
            float primaryHorizontal2 = layout.getPrimaryHorizontal(lineEnd - 1) + (layout.getPrimaryHorizontal(lineStart + 1) - primaryHorizontal);
            float f = (float) (lineBounds + this.f44081d);
            canvas.drawLine(primaryHorizontal, f, primaryHorizontal2, f, paint);
        }
        super.onDraw(canvas);
    }
}
