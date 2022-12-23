package com.flurry.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.flurry.sdk.e */
public class C2593e {

    /* renamed from: a */
    static final String f6066a = C2593e.class.getSimpleName();

    /* renamed from: b */
    public final SharedPreferences f6067b;

    /* renamed from: c */
    int f6068c = 0;

    /* renamed from: d */
    long f6069d;

    /* renamed from: e */
    private Timer f6070e;

    /* renamed from: f */
    private final Object f6071f = new Object();

    public C2593e() {
        Context context = C2494ck.m5371a().f5832a;
        this.f6067b = context.getSharedPreferences("FLURRY_SHARED_PREFERENCES", 0);
        C2476cb.m5335a();
        this.f6068c = C2476cb.m5337b(context);
        SharedPreferences sharedPreferences = this.f6067b;
        this.f6069d = sharedPreferences != null ? sharedPreferences.getLong("refreshFetch", 604800000) : 604800000;
    }

    /* renamed from: a */
    public final int mo17792a() {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            return sharedPreferences.getInt("appVersion", 0);
        }
        return 0;
    }

    /* renamed from: e */
    private void m5618e() {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("appVersion").apply();
        }
    }

    /* renamed from: a */
    public final synchronized void mo17794a(TimerTask timerTask, long j) {
        synchronized (this.f6071f) {
            String str = f6066a;
            C2530db.m5476a(str, "Record retry after " + j + " msecs.");
            Timer timer = new Timer("retry-scheduler");
            this.f6070e = timer;
            timer.schedule(timerTask, j);
        }
    }

    /* renamed from: b */
    public final void mo17795b() {
        synchronized (this.f6071f) {
            if (this.f6070e != null) {
                C2530db.m5474a(3, f6066a, "Clear retry.");
                this.f6070e.cancel();
                this.f6070e.purge();
                this.f6070e = null;
            }
        }
    }

    /* renamed from: c */
    public final void mo17796c() {
        C2530db.m5476a(f6066a, "Clear all ConfigMeta data.");
        mo17795b();
        m5618e();
        m5619f();
        m5620g();
        m5621h();
        m5622i();
        m5623j();
    }

    /* renamed from: f */
    private void m5619f() {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("lastFetch").apply();
        }
    }

    /* renamed from: a */
    public final void mo17793a(long j) {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().putLong("lastFetch", j).apply();
        }
    }

    /* renamed from: g */
    private void m5620g() {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("lastETag").apply();
        }
    }

    /* renamed from: d */
    public final String mo17797d() {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            return sharedPreferences.getString("lastKeyId", (String) null);
        }
        return null;
    }

    /* renamed from: h */
    private void m5621h() {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("lastKeyId").apply();
        }
    }

    /* renamed from: i */
    private void m5622i() {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("lastRSA").apply();
        }
    }

    /* renamed from: j */
    private void m5623j() {
        SharedPreferences sharedPreferences = this.f6067b;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("com.flurry.sdk.variant_ids").apply();
        }
    }
}
