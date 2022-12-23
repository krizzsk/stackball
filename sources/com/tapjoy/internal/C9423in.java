package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;

/* renamed from: com.tapjoy.internal.in */
public final class C9423in extends View {

    /* renamed from: a */
    public boolean f23409a = false;

    /* renamed from: b */
    private Bitmap f23410b = null;

    /* renamed from: c */
    private Rect f23411c = null;

    /* renamed from: d */
    private Rect f23412d = null;

    /* renamed from: e */
    private Rect f23413e = null;

    /* renamed from: f */
    private Rect f23414f = new Rect();

    public C9423in(Context context) {
        super(context);
    }

    public final void setImageBitmap(Bitmap bitmap) {
        this.f23410b = bitmap;
        int width = bitmap.getWidth();
        int height = this.f23410b.getHeight();
        int i = width / 2;
        this.f23412d = new Rect(0, 0, i, height);
        this.f23411c = new Rect(i, 0, width, height);
        mo58363a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo58363a() {
        if (this.f23409a) {
            this.f23413e = this.f23411c;
        } else {
            this.f23413e = this.f23412d;
        }
    }

    public final void onDraw(Canvas canvas) {
        if (this.f23413e != null && this.f23410b != null) {
            getDrawingRect(this.f23414f);
            canvas.drawBitmap(this.f23410b, this.f23413e, this.f23414f, (Paint) null);
        }
    }
}
