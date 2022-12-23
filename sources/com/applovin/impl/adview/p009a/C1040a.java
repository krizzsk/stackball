package com.applovin.impl.adview.p009a;

import android.content.Context;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.impl.sdk.p024ad.C1355g;
import com.applovin.impl.sdk.utils.C1557r;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.adview.a.a */
public class C1040a {

    /* renamed from: a */
    private final AppLovinFullscreenActivity f1822a;

    /* renamed from: b */
    private final int f1823b;

    /* renamed from: c */
    private final int f1824c;

    /* renamed from: d */
    private final boolean f1825d;

    public C1040a(AppLovinFullscreenActivity appLovinFullscreenActivity) {
        this.f1822a = appLovinFullscreenActivity;
        this.f1824c = C1557r.m3629e((Context) appLovinFullscreenActivity);
        boolean isTablet = AppLovinSdkUtils.isTablet(appLovinFullscreenActivity);
        this.f1825d = isTablet;
        this.f1823b = m1462a(this.f1824c, isTablet);
    }

    /* renamed from: a */
    private int m1462a(int i, boolean z) {
        if (z) {
            if (i == 0) {
                return 0;
            }
            if (i == 1) {
                return 9;
            }
            if (i == 2) {
                return 8;
            }
            return i == 3 ? 1 : -1;
        } else if (i == 0) {
            return 1;
        } else {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 9;
            }
            return i == 3 ? 8 : -1;
        }
    }

    /* renamed from: a */
    private void m1463a(int i) {
        try {
            this.f1822a.setRequestedOrientation(i);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r6 == 2) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r6 == 1) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r6 != 3) goto L_0x001a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r6 != 1) goto L_0x001a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m1464a(com.applovin.impl.sdk.p024ad.C1355g.C1358b r5, int r6, boolean r7) {
        /*
            r4 = this;
            com.applovin.impl.sdk.ad.g$b r0 = com.applovin.impl.sdk.p024ad.C1355g.C1358b.ACTIVITY_PORTRAIT
            r1 = 3
            r2 = 2
            r3 = 1
            if (r5 != r0) goto L_0x0024
            r5 = 9
            if (r7 == 0) goto L_0x0016
            if (r6 == r3) goto L_0x0010
            if (r6 == r1) goto L_0x0010
            goto L_0x001a
        L_0x0010:
            if (r6 != r3) goto L_0x001a
        L_0x0012:
            r4.m1463a((int) r5)
            goto L_0x0042
        L_0x0016:
            if (r6 == 0) goto L_0x001e
            if (r6 == r2) goto L_0x001e
        L_0x001a:
            r4.m1463a((int) r3)
            goto L_0x0042
        L_0x001e:
            if (r6 != 0) goto L_0x0021
            goto L_0x001a
        L_0x0021:
            r3 = 9
            goto L_0x001a
        L_0x0024:
            com.applovin.impl.sdk.ad.g$b r0 = com.applovin.impl.sdk.p024ad.C1355g.C1358b.ACTIVITY_LANDSCAPE
            if (r5 != r0) goto L_0x0042
            r5 = 8
            r0 = 0
            if (r7 == 0) goto L_0x0037
            if (r6 == 0) goto L_0x0032
            if (r6 == r2) goto L_0x0032
            goto L_0x003b
        L_0x0032:
            if (r6 != r2) goto L_0x0035
            goto L_0x0012
        L_0x0035:
            r5 = 0
            goto L_0x0012
        L_0x0037:
            if (r6 == r3) goto L_0x003f
            if (r6 == r1) goto L_0x003f
        L_0x003b:
            r4.m1463a((int) r0)
            goto L_0x0042
        L_0x003f:
            if (r6 != r3) goto L_0x0012
            goto L_0x0035
        L_0x0042:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.p009a.C1040a.m1464a(com.applovin.impl.sdk.ad.g$b, int, boolean):void");
    }

    /* renamed from: a */
    public void mo11810a(C1355g gVar) {
        int i;
        if (!gVar.mo12745E() || (i = this.f1823b) == -1) {
            m1464a(gVar.mo12818o(), this.f1824c, this.f1825d);
        } else {
            m1463a(i);
        }
    }
}
