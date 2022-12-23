package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.sdk.p025b.C1369c;
import com.applovin.impl.sdk.p026c.C1387g;
import com.applovin.impl.sdk.utils.C1512a;
import com.applovin.impl.sdk.utils.C1557r;
import com.tapjoy.TJAdUnitConstants;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.applovin.impl.sdk.v */
public class C1564v {

    /* renamed from: a */
    final C1469j f3811a;

    /* renamed from: b */
    private final AtomicBoolean f3812b = new AtomicBoolean();

    /* renamed from: c */
    private final AtomicBoolean f3813c = new AtomicBoolean();

    /* renamed from: d */
    private Date f3814d;

    /* renamed from: e */
    private Date f3815e;

    C1564v(C1469j jVar) {
        this.f3811a = jVar;
        Application application = (Application) jVar.mo13065D();
        application.registerActivityLifecycleCallbacks(new C1512a() {
            public void onActivityResumed(Activity activity) {
                super.onActivityResumed(activity);
                C1564v.this.m3660d();
            }
        });
        application.registerComponentCallbacks(new ComponentCallbacks2() {
            public void onConfigurationChanged(Configuration configuration) {
            }

            public void onLowMemory() {
            }

            public void onTrimMemory(int i) {
                if (i == 20) {
                    C1564v.this.m3661e();
                }
            }
        });
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new BroadcastReceiver() {
            public void onReceive(Context context, Intent intent) {
                String action = intent.getAction();
                if ("android.intent.action.USER_PRESENT".equals(action)) {
                    if (C1557r.m3625c()) {
                        C1564v.this.m3660d();
                    }
                } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                    C1564v.this.m3661e();
                }
            }
        }, intentFilter);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m3660d() {
        if (this.f3813c.compareAndSet(true, false)) {
            m3663g();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m3661e() {
        if (this.f3813c.compareAndSet(false, true)) {
            m3662f();
        }
    }

    /* renamed from: f */
    private void m3662f() {
        this.f3811a.mo13139v().mo13277b("SessionTracker", "Application Paused");
        this.f3811a.mo13108ae().sendBroadcastSync(new Intent("com.applovin.application_paused"), (Map<String, Object>) null);
        if (!this.f3812b.get() && ((Boolean) this.f3811a.mo13088a(C1369c.f3026dL)).booleanValue()) {
            boolean booleanValue = ((Boolean) this.f3811a.mo13088a(C1369c.f3023dI)).booleanValue();
            long millis = TimeUnit.MINUTES.toMillis(((Long) this.f3811a.mo13088a(C1369c.f3025dK)).longValue());
            if (this.f3814d == null || System.currentTimeMillis() - this.f3814d.getTime() >= millis) {
                ((EventServiceImpl) this.f3811a.mo13133q()).mo12565a(TJAdUnitConstants.String.VIDEO_PAUSED, false);
                if (booleanValue) {
                    this.f3814d = new Date();
                }
            }
            if (!booleanValue) {
                this.f3814d = new Date();
            }
        }
    }

    /* renamed from: g */
    private void m3663g() {
        this.f3811a.mo13139v().mo13277b("SessionTracker", "Application Resumed");
        boolean booleanValue = ((Boolean) this.f3811a.mo13088a(C1369c.f3023dI)).booleanValue();
        long longValue = ((Long) this.f3811a.mo13088a(C1369c.f3024dJ)).longValue();
        this.f3811a.mo13108ae().sendBroadcastSync(new Intent("com.applovin.application_resumed"), (Map<String, Object>) null);
        if (!this.f3812b.getAndSet(false)) {
            long millis = TimeUnit.MINUTES.toMillis(longValue);
            if (this.f3815e == null || System.currentTimeMillis() - this.f3815e.getTime() >= millis) {
                ((EventServiceImpl) this.f3811a.mo13133q()).mo12565a("resumed", false);
                if (booleanValue) {
                    this.f3815e = new Date();
                }
            }
            if (!booleanValue) {
                this.f3815e = new Date();
            }
            this.f3811a.mo13072L().mo12926a(C1387g.f3258k);
        }
    }

    /* renamed from: a */
    public boolean mo13378a() {
        return this.f3813c.get();
    }

    /* renamed from: b */
    public void mo13379b() {
        this.f3812b.set(true);
    }

    /* renamed from: c */
    public void mo13380c() {
        this.f3812b.set(false);
    }
}
