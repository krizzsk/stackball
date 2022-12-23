package com.yandex.mobile.ads.impl;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import com.facebook.internal.NativeProtocol;
import kotlin.jvm.internal.Intrinsics;

public final class h61 implements v81 {

    /* renamed from: a */
    private final ge0 f34277a;

    /* renamed from: b */
    private final Paint f34278b;

    /* renamed from: c */
    private final RectF f34279c;

    public h61(ge0 ge0) {
        Intrinsics.checkNotNullParameter(ge0, NativeProtocol.WEB_DIALOG_PARAMS);
        this.f34277a = ge0;
        Paint paint = new Paint();
        paint.setColor(ge0.mo67255b());
        this.f34278b = paint;
        this.f34279c = new RectF(0.0f, 0.0f, ge0.mo67262h(), ge0.mo67261g());
    }

    /* renamed from: a */
    public void mo67421a(Canvas canvas, float f, float f2, float f3, float f4, float f5, int i) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        this.f34278b.setColor(i);
        RectF rectF = this.f34279c;
        float f6 = f3 / 2.0f;
        rectF.left = f - f6;
        float f7 = f4 / 2.0f;
        rectF.top = f2 - f7;
        rectF.right = f + f6;
        rectF.bottom = f2 + f7;
        canvas.drawRoundRect(rectF, f5, f5, this.f34278b);
    }

    /* renamed from: a */
    public void mo67422a(Canvas canvas, RectF rectF, float f) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(rectF, "rect");
        this.f34278b.setColor(this.f34277a.mo67264i());
        canvas.drawRoundRect(rectF, f, f, this.f34278b);
    }
}
