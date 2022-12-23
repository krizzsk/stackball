package com.tapjoy.internal;

import android.content.Context;
import android.view.ViewGroup;

/* renamed from: com.tapjoy.internal.ip */
public final class C9428ip extends C9064ai {

    /* renamed from: a */
    private final C9390hu f23433a;

    /* renamed from: b */
    private final C9429iq f23434b;

    /* renamed from: c */
    private C9052aa f23435c = null;

    public C9428ip(Context context, C9390hu huVar, C9429iq iqVar) {
        super(context);
        this.f23433a = huVar;
        this.f23434b = iqVar;
        addView(iqVar, new ViewGroup.LayoutParams(-1, -1));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            com.tapjoy.internal.aa r0 = com.tapjoy.internal.C9052aa.m24281a(r0)
            com.tapjoy.internal.hu r1 = r6.f23433a
            boolean r1 = r1.mo58327a()
            r2 = 1
            r3 = 3
            r4 = 0
            if (r1 == 0) goto L_0x005b
            com.tapjoy.internal.hu r1 = r6.f23433a
            boolean r1 = r1.mo58328b()
            if (r1 == 0) goto L_0x0041
            boolean r1 = r0.mo57744a()
            if (r1 == 0) goto L_0x0024
            com.tapjoy.internal.aa r0 = com.tapjoy.internal.C9052aa.PORTRAIT
            goto L_0x003d
        L_0x0024:
            boolean r0 = r0.mo57745b()
            if (r0 != 0) goto L_0x003b
            android.content.Context r0 = r6.getContext()
            com.tapjoy.internal.aa r0 = com.tapjoy.internal.C9052aa.m24282b(r0)
            boolean r0 = r0.mo57744a()
            if (r0 == 0) goto L_0x003b
            com.tapjoy.internal.aa r0 = com.tapjoy.internal.C9052aa.PORTRAIT
            goto L_0x003d
        L_0x003b:
            com.tapjoy.internal.aa r0 = com.tapjoy.internal.C9052aa.LANDSCAPE
        L_0x003d:
            r6.setRotationCount(r4)
            goto L_0x0075
        L_0x0041:
            com.tapjoy.internal.aa r1 = com.tapjoy.internal.C9052aa.PORTRAIT
            boolean r5 = r0.mo57745b()
            if (r5 == 0) goto L_0x0057
            int r0 = r0.mo57746c()
            if (r0 != r3) goto L_0x0053
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x0053:
            r6.setRotationCount(r3)
            goto L_0x0074
        L_0x0057:
            r6.setRotationCount(r4)
            goto L_0x0074
        L_0x005b:
            com.tapjoy.internal.aa r1 = com.tapjoy.internal.C9052aa.LANDSCAPE
            boolean r5 = r0.mo57744a()
            if (r5 == 0) goto L_0x0071
            int r0 = r0.mo57746c()
            if (r0 != r3) goto L_0x006d
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x006d:
            r6.setRotationCount(r2)
            goto L_0x0074
        L_0x0071:
            r6.setRotationCount(r4)
        L_0x0074:
            r0 = r1
        L_0x0075:
            com.tapjoy.internal.aa r1 = r6.f23435c
            if (r1 == r0) goto L_0x0084
            r6.f23435c = r0
            com.tapjoy.internal.iq r1 = r6.f23434b
            boolean r0 = r0.mo57745b()
            r1.setLandscape(r0)
        L_0x0084:
            super.onMeasure(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C9428ip.onMeasure(int, int):void");
    }
}
