package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

public final class x61 extends Drawable {

    /* renamed from: a */
    private C15153c f42443a = C15153c.NO_SCALE;

    /* renamed from: b */
    private C15151a f42444b = C15151a.LEFT;

    /* renamed from: c */
    private C15152b f42445c = C15152b.TOP;

    /* renamed from: d */
    private Bitmap f42446d;

    /* renamed from: e */
    private final Paint f42447e = new Paint(3);

    /* renamed from: f */
    private Matrix f42448f = new Matrix();

    /* renamed from: g */
    private boolean f42449g;

    /* renamed from: h */
    private float f42450h = 1.0f;

    /* renamed from: i */
    private float f42451i;

    /* renamed from: j */
    private float f42452j;

    /* renamed from: com.yandex.mobile.ads.impl.x61$a */
    public enum C15151a {
        LEFT,
        CENTER,
        RIGHT
    }

    /* renamed from: com.yandex.mobile.ads.impl.x61$b */
    public enum C15152b {
        TOP,
        CENTER,
        BOTTOM
    }

    /* renamed from: com.yandex.mobile.ads.impl.x61$c */
    public enum C15153c {
        NO_SCALE,
        FIT,
        FILL
    }

    /* renamed from: a */
    public final void mo70835a(C15153c cVar) {
        Intrinsics.checkNotNullParameter(cVar, "<set-?>");
        this.f42443a = cVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0085  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r11) {
        /*
            r10 = this;
            java.lang.String r0 = "canvas"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r11.save()
            android.graphics.Bitmap r0 = r10.f42446d
            r1 = 0
            if (r0 != 0) goto L_0x000f
            r0 = 0
            goto L_0x0013
        L_0x000f:
            int r0 = r0.getWidth()
        L_0x0013:
            android.graphics.Bitmap r2 = r10.f42446d
            if (r2 != 0) goto L_0x0019
            r2 = 0
            goto L_0x001d
        L_0x0019:
            int r2 = r2.getHeight()
        L_0x001d:
            if (r2 <= 0) goto L_0x00ac
            if (r0 > 0) goto L_0x0023
            goto L_0x00ac
        L_0x0023:
            boolean r3 = r10.f42449g
            if (r3 == 0) goto L_0x0090
            android.graphics.Rect r3 = r10.getBounds()
            int r3 = r3.width()
            float r3 = (float) r3
            android.graphics.Rect r4 = r10.getBounds()
            int r4 = r4.height()
            float r4 = (float) r4
            float r0 = (float) r0
            float r5 = r3 / r0
            float r2 = (float) r2
            float r6 = r4 / r2
            com.yandex.mobile.ads.impl.x61$c r7 = r10.f42443a
            int r7 = r7.ordinal()
            r8 = 1
            r9 = 2
            if (r7 == r8) goto L_0x0053
            if (r7 == r9) goto L_0x004e
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0057
        L_0x004e:
            float r5 = java.lang.Math.max(r5, r6)
            goto L_0x0057
        L_0x0053:
            float r5 = java.lang.Math.min(r5, r6)
        L_0x0057:
            r10.f42450h = r5
            float r0 = r0 * r5
            float r2 = r2 * r5
            com.yandex.mobile.ads.impl.x61$a r5 = r10.f42444b
            int r5 = r5.ordinal()
            r6 = 0
            if (r5 == r8) goto L_0x006e
            if (r5 == r9) goto L_0x006a
            r3 = 0
            goto L_0x0074
        L_0x006a:
            float r3 = r3 - r0
            float r0 = r10.f42450h
            goto L_0x0073
        L_0x006e:
            float r3 = r3 - r0
            float r0 = (float) r9
            float r3 = r3 / r0
            float r0 = r10.f42450h
        L_0x0073:
            float r3 = r3 / r0
        L_0x0074:
            r10.f42451i = r3
            com.yandex.mobile.ads.impl.x61$b r0 = r10.f42445c
            int r0 = r0.ordinal()
            if (r0 == r8) goto L_0x0085
            if (r0 == r9) goto L_0x0081
            goto L_0x008c
        L_0x0081:
            float r4 = r4 - r2
            float r0 = r10.f42450h
            goto L_0x008a
        L_0x0085:
            float r4 = r4 - r2
            float r0 = (float) r9
            float r4 = r4 / r0
            float r0 = r10.f42450h
        L_0x008a:
            float r6 = r4 / r0
        L_0x008c:
            r10.f42452j = r6
            r10.f42449g = r1
        L_0x0090:
            float r0 = r10.f42450h
            r11.scale(r0, r0)
            float r0 = r10.f42451i
            float r1 = r10.f42452j
            r11.translate(r0, r1)
            android.graphics.Bitmap r0 = r10.f42446d
            if (r0 != 0) goto L_0x00a1
            goto L_0x00a8
        L_0x00a1:
            android.graphics.Matrix r1 = r10.f42448f
            android.graphics.Paint r2 = r10.f42447e
            r11.drawBitmap(r0, r1, r2)
        L_0x00a8:
            r11.restore()
            return
        L_0x00ac:
            android.graphics.Bitmap r0 = r10.f42446d
            if (r0 != 0) goto L_0x00b1
            goto L_0x00b8
        L_0x00b1:
            android.graphics.Matrix r1 = r10.f42448f
            android.graphics.Paint r2 = r10.f42447e
            r11.drawBitmap(r0, r1, r2)
        L_0x00b8:
            r11.restore()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.x61.draw(android.graphics.Canvas):void");
    }

    public int getOpacity() {
        return this.f42447e.getAlpha();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f42449g = true;
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.f42447e.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    /* renamed from: a */
    public final void mo70833a(C15151a aVar) {
        Intrinsics.checkNotNullParameter(aVar, "<set-?>");
        this.f42444b = aVar;
    }

    /* renamed from: a */
    public final void mo70834a(C15152b bVar) {
        Intrinsics.checkNotNullParameter(bVar, "<set-?>");
        this.f42445c = bVar;
    }

    /* renamed from: a */
    public final void mo70832a(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        this.f42446d = bitmap;
        this.f42449g = true;
        invalidateSelf();
    }
}
