package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.metrica.IReporter;
import com.yandex.mobile.ads.impl.g71;

class tn0 implements g71.C13180a {

    /* renamed from: a */
    private final C14659t8 f40384a = new C14659t8();

    /* renamed from: b */
    private final l71 f40385b = l71.m38631c();

    /* renamed from: c */
    private IReporter f40386c;

    public tn0(g71 g71) {
        g71.mo67204a(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo70208a(Context context) {
        d71 a = this.f40385b.mo68362a(context);
        return a != null && a.mo66444I();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70207a(IReporter iReporter) {
        this.f40386c = iReporter;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r2.f40385b.mo68371f() != false) goto L_0x0031;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo67205a(android.content.Context r3, com.yandex.mobile.ads.impl.d71 r4) {
        /*
            r2 = this;
            com.yandex.metrica.IReporter r0 = r2.f40386c
            if (r0 == 0) goto L_0x000d
            boolean r4 = r4.mo66444I()
            com.yandex.metrica.IReporter r0 = r2.f40386c
            r0.setStatisticsSending(r4)
        L_0x000d:
            com.yandex.mobile.ads.impl.l71 r4 = r2.f40385b
            com.yandex.mobile.ads.impl.d71 r4 = r4.mo68362a((android.content.Context) r3)
            r0 = 1
            r1 = 0
            if (r4 == 0) goto L_0x001f
            boolean r4 = r4.mo66444I()
            if (r4 == 0) goto L_0x001f
            r4 = 1
            goto L_0x0020
        L_0x001f:
            r4 = 0
        L_0x0020:
            if (r4 == 0) goto L_0x0030
            com.yandex.mobile.ads.impl.l71 r4 = r2.f40385b
            r4.mo68369d()
            com.yandex.mobile.ads.impl.l71 r4 = r2.f40385b
            boolean r4 = r4.mo68371f()
            if (r4 == 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r0 = 0
        L_0x0031:
            com.yandex.mobile.ads.impl.t8 r4 = r2.f40384a
            r4.mo70138a(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.tn0.mo67205a(android.content.Context, com.yandex.mobile.ads.impl.d71):void");
    }
}
