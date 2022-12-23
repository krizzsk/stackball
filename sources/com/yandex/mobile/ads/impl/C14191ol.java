package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;

/* renamed from: com.yandex.mobile.ads.impl.ol */
public class C14191ol {

    /* renamed from: a */
    private final s61 f38258a = new s61();

    /* renamed from: b */
    private final a71 f38259b = new a71();

    /* renamed from: a */
    public C14104nl mo69198a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        Point a = this.f38259b.mo65691a(context);
        int i = a.x;
        int i2 = a.y;
        float f = displayMetrics.density;
        float f2 = (float) i;
        float f3 = (float) i2;
        float min = Math.min(f2 / f, f3 / f);
        float f4 = f * 160.0f;
        float f5 = f2 / f4;
        float f6 = f3 / f4;
        double sqrt = Math.sqrt((double) ((f5 * f5) + (f6 * f6)));
        if (m40442a(context, sqrt)) {
            return C14104nl.TV;
        }
        if (sqrt >= 7.0d || min >= 600.0f) {
            return C14104nl.TABLET;
        }
        return C14104nl.PHONE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r4 = (android.app.UiModeManager) r4.getSystemService("uimode");
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m40442a(android.content.Context r4, double r5) {
        /*
            r3 = this;
            r0 = 13
            boolean r0 = com.yandex.mobile.ads.impl.C13378i5.m37280a((int) r0)
            if (r0 == 0) goto L_0x001a
            java.lang.String r5 = "uimode"
            java.lang.Object r4 = r4.getSystemService(r5)
            android.app.UiModeManager r4 = (android.app.UiModeManager) r4
            if (r4 == 0) goto L_0x002c
            int r4 = r4.getCurrentModeType()
            r5 = 4
            if (r4 != r5) goto L_0x002c
            goto L_0x002a
        L_0x001a:
            r0 = 4624633867356078080(0x402e000000000000, double:15.0)
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x002c
            com.yandex.mobile.ads.impl.s61 r5 = r3.f38258a
            java.lang.String r6 = "android.hardware.touchscreen"
            boolean r4 = r5.mo69895a(r4, r6)
            if (r4 != 0) goto L_0x002c
        L_0x002a:
            r4 = 1
            goto L_0x002d
        L_0x002c:
            r4 = 0
        L_0x002d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C14191ol.m40442a(android.content.Context, double):boolean");
    }
}
