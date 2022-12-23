package com.applovin.adview;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.KeyEvent;
import com.applovin.impl.adview.C1092j;
import com.applovin.impl.adview.C1138o;
import com.applovin.impl.adview.p009a.p011b.C1044a;
import com.applovin.impl.sdk.utils.C1514c;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenActivity extends Activity implements C1092j {
    public static C1138o parentInterstitialWrapper;

    /* renamed from: a */
    private C1044a f1621a;

    /* renamed from: b */
    private final AtomicBoolean f1622b = new AtomicBoolean(true);

    /* renamed from: c */
    private int f1623c;

    public void dismiss() {
        this.f1621a.mo11831f();
    }

    public void onBackPressed() {
        this.f1621a.mo11835j();
        if (C1514c.m3412a(getApplicationContext()).mo13304a("applovin.sdk.is_test_environment")) {
            super.onBackPressed();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1621a.mo11818a(configuration);
    }

    /* JADX WARNING: type inference failed for: r8v18, types: [com.applovin.impl.adview.a.b.a] */
    /* JADX WARNING: type inference failed for: r0v15, types: [com.applovin.impl.adview.a.b.b] */
    /* JADX WARNING: type inference failed for: r0v16, types: [com.applovin.impl.adview.a.b.d] */
    /* JADX WARNING: type inference failed for: r0v17, types: [com.applovin.impl.adview.a.b.c] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            super.onCreate(r8)
            int r8 = r7.f1623c
            r0 = 1
            int r8 = r8 + r0
            r7.f1623c = r8
            r7.requestWindowFeature(r0)
            android.view.Window r8 = r7.getWindow()
            r0 = 1024(0x400, float:1.435E-42)
            r8.setFlags(r0, r0)
            android.view.Window r8 = r7.getWindow()
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            r8.addFlags(r0)
            android.view.Window r8 = r7.getWindow()
            r0 = 128(0x80, float:1.794E-43)
            r8.addFlags(r0)
            r8 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r8 = r7.findViewById(r8)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8.setBackgroundColor(r0)
            com.applovin.impl.adview.o r8 = parentInterstitialWrapper
            if (r8 != 0) goto L_0x00bf
            android.content.Intent r8 = r7.getIntent()
            java.lang.String r0 = "com.applovin.interstitial.wrapper_id"
            java.lang.String r8 = r8.getStringExtra(r0)
            com.applovin.impl.adview.o r8 = com.applovin.impl.adview.C1138o.m1748a((java.lang.String) r8)
            parentInterstitialWrapper = r8
            if (r8 != 0) goto L_0x00bf
            com.applovin.sdk.AppLovinSdk r8 = com.applovin.sdk.AppLovinSdk.getInstance(r7)
            com.applovin.impl.sdk.j r8 = com.applovin.impl.sdk.utils.C1557r.m3585a((com.applovin.sdk.AppLovinSdk) r8)
            com.applovin.impl.sdk.a r0 = r8.mo13086Z()
            android.app.Activity r0 = r0.mo12601a()
            com.applovin.impl.sdk.c.h r1 = r8.mo13072L()
            com.applovin.impl.sdk.c.g r2 = com.applovin.impl.sdk.p026c.C1387g.f3251d
            r1.mo12929b(r2)
            com.applovin.impl.sdk.c.h r1 = r8.mo13072L()
            com.applovin.impl.sdk.c.g r2 = com.applovin.impl.sdk.p026c.C1387g.f3261n
            r1.mo12929b(r2)
            com.applovin.impl.sdk.b.c<java.lang.Boolean> r1 = com.applovin.impl.sdk.p025b.C1369c.f3125fg
            java.lang.Object r1 = r8.mo13088a(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x007a
            goto L_0x00bf
        L_0x007a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Parent interstitial wrapper is null. Top activity: "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = " sa: "
            r2.append(r0)
            com.applovin.impl.sdk.c.h r0 = r8.mo13072L()
            com.applovin.impl.sdk.c.g r3 = com.applovin.impl.sdk.p026c.C1387g.f3251d
            long r3 = r0.mo12929b(r3)
            r2.append(r3)
            java.lang.String r0 = " ma: "
            r2.append(r0)
            com.applovin.impl.sdk.c.h r8 = r8.mo13072L()
            com.applovin.impl.sdk.c.g r0 = com.applovin.impl.sdk.p026c.C1387g.f3261n
            long r3 = r8.mo12929b(r0)
            r2.append(r3)
            java.lang.String r8 = " counter: "
            r2.append(r8)
            int r8 = r7.f1623c
            r2.append(r8)
            java.lang.String r8 = r2.toString()
            r1.<init>(r8)
            throw r1
        L_0x00bf:
            com.applovin.impl.adview.o r8 = parentInterstitialWrapper
            com.applovin.impl.sdk.ad.g r1 = r8.mo12035b()
            com.applovin.impl.adview.o r8 = parentInterstitialWrapper
            com.applovin.impl.sdk.j r3 = r8.mo12032a()
            com.applovin.impl.adview.o r8 = parentInterstitialWrapper
            com.applovin.sdk.AppLovinAdClickListener r4 = r8.mo12038e()
            com.applovin.impl.adview.o r8 = parentInterstitialWrapper
            com.applovin.sdk.AppLovinAdDisplayListener r5 = r8.mo12037d()
            com.applovin.impl.adview.o r8 = parentInterstitialWrapper
            com.applovin.sdk.AppLovinAdVideoPlaybackListener r6 = r8.mo12036c()
            boolean r8 = r1 instanceof com.applovin.impl.p008a.C1000a
            if (r8 == 0) goto L_0x00eb
            com.applovin.impl.adview.a.b.c r8 = new com.applovin.impl.adview.a.b.c
            r0 = r8
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
        L_0x00e8:
            r7.f1621a = r8
            goto L_0x0101
        L_0x00eb:
            boolean r8 = r1.hasVideoUrl()
            if (r8 == 0) goto L_0x00f9
            com.applovin.impl.adview.a.b.d r8 = new com.applovin.impl.adview.a.b.d
            r0 = r8
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x00e8
        L_0x00f9:
            com.applovin.impl.adview.a.b.b r8 = new com.applovin.impl.adview.a.b.b
            r0 = r8
            r2 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L_0x00e8
        L_0x0101:
            com.applovin.impl.adview.a.b.a r8 = r7.f1621a
            r8.mo11827c()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.adview.AppLovinFullscreenActivity.onCreate(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        parentInterstitialWrapper = null;
        this.f1621a.mo11833h();
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        this.f1621a.mo11815a(i, keyEvent);
        return super.onKeyDown(i, keyEvent);
    }

    public void onLowMemory() {
        this.f1621a.mo11834i();
        super.onLowMemory();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        this.f1621a.mo11830e();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f1622b.get()) {
            this.f1621a.mo11829d();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        this.f1621a.mo11832g();
    }

    public void onWindowFocusChanged(boolean z) {
        if (!this.f1622b.getAndSet(false)) {
            this.f1621a.mo11828c(z);
        }
        if (z) {
            getWindow().getDecorView().setSystemUiVisibility(5894);
        }
        super.onWindowFocusChanged(z);
    }
}
