package com.yandex.mobile.ads.impl;

import android.os.Build;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionSet;
import android.widget.PopupWindow;
import kotlin.jvm.internal.Intrinsics;

public final class d00 {
    /* renamed from: a */
    public static final void m34963a(PopupWindow popupWindow, c00 c00, j50 j50) {
        Transition transition;
        Transition transition2;
        Intrinsics.checkNotNullParameter(popupWindow, "<this>");
        Intrinsics.checkNotNullParameter(c00, "divTooltip");
        Intrinsics.checkNotNullParameter(j50, "resolver");
        if (Build.VERSION.SDK_INT >= 23) {
            C13420in inVar = c00.f31760a;
            if (inVar != null) {
                transition = m34961a(inVar, c00.f31766g.mo66924a(j50), true, j50);
            } else {
                transition = m34962a(c00, j50);
            }
            popupWindow.setEnterTransition(transition);
            C13420in inVar2 = c00.f31761b;
            if (inVar2 != null) {
                transition2 = m34961a(inVar2, c00.f31766g.mo66924a(j50), false, j50);
            } else {
                transition2 = m34962a(c00, j50);
            }
            popupWindow.setExitTransition(transition2);
            return;
        }
        popupWindow.setAnimationStyle(16973826);
    }

    /* renamed from: a */
    private static final TransitionSet m34962a(c00 c00, j50 j50) {
        return new TransitionSet().addTransition(new Fade()).addTransition(new ff1(c00.f31766g.mo66924a(j50), (Float) null)).setInterpolator(new za1());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        r5 = r5.mo66924a(r7);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final android.transition.Transition m34961a(com.yandex.mobile.ads.impl.C13420in r4, com.yandex.mobile.ads.impl.c00.C12691d r5, boolean r6, com.yandex.mobile.ads.impl.j50 r7) {
        /*
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.in$e> r0 = r4.f34937e
            java.lang.Object r0 = r0.mo66924a((com.yandex.mobile.ads.impl.j50) r7)
            com.yandex.mobile.ads.impl.in$e r0 = (com.yandex.mobile.ads.impl.C13420in.C13425e) r0
            int r0 = r0.ordinal()
            r1 = 0
            if (r0 == 0) goto L_0x008d
            r2 = 1
            if (r0 == r2) goto L_0x006a
            r2 = 2
            if (r0 == r2) goto L_0x0068
            r2 = 3
            if (r0 == r2) goto L_0x0048
            r2 = 4
            if (r0 == r2) goto L_0x0025
            r5 = 5
            if (r0 != r5) goto L_0x001f
            goto L_0x0068
        L_0x001f:
            kotlin.NoWhenBranchMatchedException r4 = new kotlin.NoWhenBranchMatchedException
            r4.<init>()
            throw r4
        L_0x0025:
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            java.util.List<com.yandex.mobile.ads.impl.in> r2 = r4.f34936d
            if (r2 != 0) goto L_0x0030
            goto L_0x0092
        L_0x0030:
            java.util.Iterator r2 = r2.iterator()
        L_0x0034:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0092
            java.lang.Object r3 = r2.next()
            com.yandex.mobile.ads.impl.in r3 = (com.yandex.mobile.ads.impl.C13420in) r3
            android.transition.Transition r3 = m34961a(r3, r5, r6, r7)
            r0.addTransition(r3)
            goto L_0x0034
        L_0x0048:
            if (r6 == 0) goto L_0x004d
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r5 = r4.f34939g
            goto L_0x004f
        L_0x004d:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r5 = r4.f34934b
        L_0x004f:
            com.yandex.mobile.ads.impl.u61 r0 = new com.yandex.mobile.ads.impl.u61
            if (r5 != 0) goto L_0x0054
            goto L_0x005c
        L_0x0054:
            java.lang.Object r5 = r5.mo66924a((com.yandex.mobile.ads.impl.j50) r7)
            java.lang.Double r5 = (java.lang.Double) r5
            if (r5 != 0) goto L_0x005f
        L_0x005c:
            r5 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0064
        L_0x005f:
            double r5 = r5.doubleValue()
            float r5 = (float) r5
        L_0x0064:
            r0.<init>(r5)
            goto L_0x0092
        L_0x0068:
            r0 = r1
            goto L_0x0092
        L_0x006a:
            com.yandex.mobile.ads.impl.ff1 r0 = new com.yandex.mobile.ads.impl.ff1
            if (r6 == 0) goto L_0x0071
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r6 = r4.f34939g
            goto L_0x0073
        L_0x0071:
            com.yandex.mobile.ads.impl.f50<java.lang.Double> r6 = r4.f34934b
        L_0x0073:
            if (r6 != 0) goto L_0x0076
            goto L_0x007e
        L_0x0076:
            java.lang.Object r6 = r6.mo66924a((com.yandex.mobile.ads.impl.j50) r7)
            java.lang.Double r6 = (java.lang.Double) r6
            if (r6 != 0) goto L_0x0080
        L_0x007e:
            r6 = r1
            goto L_0x0089
        L_0x0080:
            double r2 = r6.doubleValue()
            float r6 = (float) r2
            java.lang.Float r6 = java.lang.Float.valueOf(r6)
        L_0x0089:
            r0.<init>(r5, r6)
            goto L_0x0092
        L_0x008d:
            android.transition.Fade r0 = new android.transition.Fade
            r0.<init>()
        L_0x0092:
            if (r0 != 0) goto L_0x0095
            goto L_0x00b9
        L_0x0095:
            com.yandex.mobile.ads.impl.f50<java.lang.Integer> r5 = r4.f34933a
            java.lang.Object r5 = r5.mo66924a((com.yandex.mobile.ads.impl.j50) r7)
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            long r5 = (long) r5
            android.transition.Transition r5 = r0.setDuration(r5)
            if (r5 != 0) goto L_0x00a9
            goto L_0x00b9
        L_0x00a9:
            com.yandex.mobile.ads.impl.f50<com.yandex.mobile.ads.impl.jn> r4 = r4.f34935c
            java.lang.Object r4 = r4.mo66924a((com.yandex.mobile.ads.impl.j50) r7)
            com.yandex.mobile.ads.impl.jn r4 = (com.yandex.mobile.ads.impl.C13525jn) r4
            android.view.animation.Interpolator r4 = com.yandex.mobile.ads.impl.t00.m42195a((com.yandex.mobile.ads.impl.C13525jn) r4)
            android.transition.Transition r1 = r5.setInterpolator(r4)
        L_0x00b9:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.d00.m34961a(com.yandex.mobile.ads.impl.in, com.yandex.mobile.ads.impl.c00$d, boolean, com.yandex.mobile.ads.impl.j50):android.transition.Transition");
    }
}
