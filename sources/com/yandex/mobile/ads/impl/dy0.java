package com.yandex.mobile.ads.impl;

public final class dy0 implements cx0 {

    /* renamed from: a */
    private final int f32803a;

    /* renamed from: b */
    private int f32804b = -1;

    /* renamed from: c */
    private float f32805c;

    /* renamed from: d */
    private float f32806d;

    /* renamed from: e */
    private int f32807e;

    public dy0(int i) {
        this.f32803a = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0032, code lost:
        if (r7 != 3) goto L_0x0086;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo66357a(android.view.ViewGroup r7, android.view.MotionEvent r8) {
        /*
            r6 = this;
            java.lang.String r0 = "target"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            android.view.ViewParent r0 = r7.getParent()
            r1 = 0
            if (r0 != 0) goto L_0x0012
            return r1
        L_0x0012:
            int r2 = r6.f32804b
            r3 = -1
            if (r2 != r3) goto L_0x0025
            android.content.Context r7 = r7.getContext()
            android.view.ViewConfiguration r7 = android.view.ViewConfiguration.get(r7)
            int r7 = r7.getScaledTouchSlop()
            r6.f32804b = r7
        L_0x0025:
            int r7 = r8.getActionMasked()
            r2 = 1
            if (r7 == 0) goto L_0x0075
            if (r7 == r2) goto L_0x0071
            r3 = 2
            if (r7 == r3) goto L_0x0035
            r8 = 3
            if (r7 == r8) goto L_0x0071
            goto L_0x0086
        L_0x0035:
            int r7 = r6.f32807e
            if (r7 != 0) goto L_0x0064
            float r7 = r6.f32805c
            float r4 = r8.getX()
            float r7 = r7 - r4
            float r7 = java.lang.Math.abs(r7)
            float r4 = r6.f32806d
            float r8 = r8.getY()
            float r4 = r4 - r8
            float r8 = java.lang.Math.abs(r4)
            int r4 = r6.f32804b
            float r4 = (float) r4
            int r5 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x005c
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L_0x005c
            r2 = 0
            goto L_0x0062
        L_0x005c:
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x0061
            goto L_0x0062
        L_0x0061:
            r2 = 2
        L_0x0062:
            r6.f32807e = r2
        L_0x0064:
            int r7 = r6.f32807e
            if (r7 == 0) goto L_0x0086
            int r8 = r6.f32803a
            r7 = r7 & r8
            if (r7 != 0) goto L_0x0086
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0086
        L_0x0071:
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0086
        L_0x0075:
            float r7 = r8.getX()
            r6.f32805c = r7
            float r7 = r8.getY()
            r6.f32806d = r7
            r6.f32807e = r1
            r0.requestDisallowInterceptTouchEvent(r2)
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.dy0.mo66357a(android.view.ViewGroup, android.view.MotionEvent):boolean");
    }
}
