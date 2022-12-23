package com.chartboost.sdk.impl;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/* renamed from: com.chartboost.sdk.impl.r1 */
public abstract class C1976r1 extends View {

    /* renamed from: a */
    private Bitmap f5081a = null;

    /* renamed from: b */
    private Canvas f5082b = null;

    public C1976r1(Context context) {
        super(context);
        m4802a(context);
    }

    /* renamed from: a */
    private void m4802a(Context context) {
        try {
            Class<?> cls = getClass();
            cls.getMethod("setLayerType", new Class[]{Integer.TYPE, Paint.class}).invoke(this, new Object[]{1, null});
        } catch (Exception unused) {
        }
    }

    /* renamed from: b */
    private boolean m4803b(Canvas canvas) {
        try {
            return ((Boolean) Canvas.class.getMethod("isHardwareAccelerated", new Class[0]).invoke(canvas, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo14674a(Canvas canvas);

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Bitmap bitmap = this.f5081a;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.f5081a.recycle();
        }
        this.f5081a = null;
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        boolean b = m4803b(canvas);
        if (b) {
            Bitmap bitmap = this.f5081a;
            if (!(bitmap != null && bitmap.getWidth() == canvas.getWidth() && this.f5081a.getHeight() == canvas.getHeight())) {
                Bitmap bitmap2 = this.f5081a;
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    this.f5081a.recycle();
                }
                try {
                    this.f5081a = Bitmap.createBitmap(canvas.getWidth(), canvas.getHeight(), Bitmap.Config.ARGB_8888);
                    this.f5082b = new Canvas(this.f5081a);
                } catch (Throwable unused) {
                    return;
                }
            }
            this.f5081a.eraseColor(0);
            canvas2 = canvas;
            canvas = this.f5082b;
        } else {
            canvas2 = null;
        }
        mo14674a(canvas);
        if (b) {
            canvas2.drawBitmap(this.f5081a, 0.0f, 0.0f, (Paint) null);
        }
    }
}
