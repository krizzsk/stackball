package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.p025b.C1368b;
import com.applovin.impl.sdk.utils.C1554p;
import java.util.Map;

/* renamed from: com.applovin.impl.sdk.b */
public class C1364b implements AppLovinBroadcastManager.Receiver {

    /* renamed from: a */
    private final C1469j f2794a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C1366a f2795b;

    /* renamed from: c */
    private C1554p f2796c;

    /* renamed from: d */
    private final Object f2797d = new Object();

    /* renamed from: e */
    private long f2798e;

    /* renamed from: com.applovin.impl.sdk.b$a */
    public interface C1366a {
        void onAdExpired();
    }

    public C1364b(C1469j jVar, C1366a aVar) {
        this.f2794a = jVar;
        this.f2795b = aVar;
    }

    /* renamed from: b */
    private void m2626b() {
        C1554p pVar = this.f2796c;
        if (pVar != null) {
            pVar.mo13347d();
            this.f2796c = null;
        }
    }

    /* renamed from: c */
    private void m2627c() {
        synchronized (this.f2797d) {
            m2626b();
        }
    }

    /* renamed from: d */
    private void m2628d() {
        boolean z;
        synchronized (this.f2797d) {
            long currentTimeMillis = this.f2798e - System.currentTimeMillis();
            if (currentTimeMillis <= 0) {
                mo12832a();
                z = true;
            } else {
                mo12833a(currentTimeMillis);
                z = false;
            }
        }
        if (z) {
            this.f2795b.onAdExpired();
        }
    }

    /* renamed from: a */
    public void mo12832a() {
        synchronized (this.f2797d) {
            m2626b();
            this.f2794a.mo13108ae().unregisterReceiver(this);
        }
    }

    /* renamed from: a */
    public void mo12833a(long j) {
        synchronized (this.f2797d) {
            mo12832a();
            this.f2798e = System.currentTimeMillis() + j;
            this.f2794a.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_paused"));
            this.f2794a.mo13108ae().registerReceiver(this, new IntentFilter("com.applovin.application_resumed"));
            if (((Boolean) this.f2794a.mo13088a(C1368b.f2811G)).booleanValue() || !this.f2794a.mo13084X().mo13378a()) {
                this.f2796c = C1554p.m3559a(j, this.f2794a, new Runnable() {
                    public void run() {
                        C1364b.this.mo12832a();
                        C1364b.this.f2795b.onAdExpired();
                    }
                });
            }
        }
    }

    public void onReceive(Context context, Intent intent, Map<String, Object> map) {
        String action = intent.getAction();
        if ("com.applovin.application_paused".equals(action)) {
            m2627c();
        } else if ("com.applovin.application_resumed".equals(action)) {
            m2628d();
        }
    }
}
