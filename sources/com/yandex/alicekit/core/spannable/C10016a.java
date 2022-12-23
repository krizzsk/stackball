package com.yandex.alicekit.core.spannable;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.style.ReplacementSpan;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.alicekit.core.spannable.a */
public final class C10016a extends ReplacementSpan {

    /* renamed from: b */
    private final float f23991b;

    /* renamed from: c */
    private final C10017a f23992c;

    /* renamed from: d */
    private final Drawable f23993d;

    /* renamed from: com.yandex.alicekit.core.spannable.a$a */
    public enum C10017a {
        BASELINE,
        LINE_BOTTOM
    }

    public C10016a(Context context, Bitmap bitmap, float f, int i, int i2, Integer num, boolean z, C10017a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        Intrinsics.checkNotNullParameter(aVar, "anchorPoint");
        this.f23991b = f;
        this.f23992c = aVar;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
        this.f23993d = bitmapDrawable;
        if (z) {
            m25725a(bitmap, i, i2);
        } else {
            bitmapDrawable.setBounds(0, 0, i, i2);
        }
        if (num != null) {
            bitmapDrawable.setColorFilter(new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m25725a(android.graphics.Bitmap r6, int r7, int r8) {
        /*
            r5 = this;
            int r0 = r6.getWidth()
            int r6 = r6.getHeight()
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r7 <= 0) goto L_0x0010
            float r2 = (float) r0
            float r7 = (float) r7
            float r2 = r2 / r7
            goto L_0x0012
        L_0x0010:
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x0012:
            if (r8 <= 0) goto L_0x0018
            float r7 = (float) r6
            float r8 = (float) r8
            float r1 = r7 / r8
        L_0x0018:
            float r7 = java.lang.Math.max(r2, r1)
            android.graphics.drawable.Drawable r8 = r5.f23993d
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 <= 0) goto L_0x0030
            int r4 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0029
            r4 = 1
            goto L_0x002a
        L_0x0029:
            r4 = 0
        L_0x002a:
            if (r4 != 0) goto L_0x0030
            float r0 = (float) r0
            float r0 = r0 / r7
            int r0 = (int) r0
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            if (r6 <= 0) goto L_0x003f
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 != 0) goto L_0x0038
            goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            if (r1 != 0) goto L_0x003f
            float r6 = (float) r6
            float r6 = r6 / r7
            int r6 = (int) r6
            goto L_0x0040
        L_0x003f:
            r6 = 0
        L_0x0040:
            r8.setBounds(r3, r3, r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.alicekit.core.spannable.C10016a.m25725a(android.graphics.Bitmap, int, int):void");
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Intrinsics.checkNotNullParameter(charSequence, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        canvas.save();
        int ordinal = this.f23992c.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i4 = i5;
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        canvas.translate(f, ((float) (i4 - this.f23993d.getBounds().bottom)) + this.f23991b);
        this.f23993d.draw(canvas);
        canvas.restore();
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        double d;
        int i3;
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(charSequence, "text");
        if (fontMetricsInt != null) {
            if (i == 0 && Build.VERSION.SDK_INT < 28) {
                fontMetricsInt.top = 0;
                fontMetricsInt.ascent = 0;
                fontMetricsInt.bottom = 0;
                fontMetricsInt.descent = 0;
                fontMetricsInt.leading = 0;
            }
            int i4 = this.f23993d.getBounds().top;
            int i5 = this.f23993d.getBounds().bottom;
            int ordinal = this.f23992c.ordinal();
            if (ordinal == 0) {
                d = Math.ceil((double) (((float) i5) - this.f23991b));
            } else if (ordinal == 1) {
                d = Math.ceil((double) ((((float) i5) - this.f23991b) - ((float) fontMetricsInt.bottom)));
            } else {
                throw new NoWhenBranchMatchedException();
            }
            int i6 = -((int) ((float) d));
            fontMetricsInt.ascent = Math.min(i6, fontMetricsInt.ascent);
            fontMetricsInt.top = Math.min(i6, fontMetricsInt.top);
            int ordinal2 = this.f23992c.ordinal();
            if (ordinal2 == 0) {
                i3 = (int) ((float) Math.ceil((double) this.f23991b));
            } else if (ordinal2 == 1) {
                i3 = fontMetricsInt.bottom;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            fontMetricsInt.descent = Math.max(i3, fontMetricsInt.descent);
            fontMetricsInt.bottom = Math.max(i3, fontMetricsInt.bottom);
            fontMetricsInt.leading = fontMetricsInt.descent - fontMetricsInt.ascent;
        }
        return this.f23993d.getBounds().right;
    }
}
