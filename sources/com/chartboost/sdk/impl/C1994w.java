package com.chartboost.sdk.impl;

import android.os.Handler;
import com.chartboost.sdk.Libraries.CBLogging;

/* renamed from: com.chartboost.sdk.impl.w */
abstract class C1994w implements C1987v {

    /* renamed from: a */
    private Handler f5148a;

    /* renamed from: b */
    private double f5149b = 0.0d;

    /* renamed from: c */
    private double f5150c;

    /* renamed from: d */
    private Runnable f5151d = new Runnable() {
        public final void run() {
            C1994w.this.mo14850d();
        }
    };

    C1994w(double d) {
        this.f5150c = d;
    }

    /* renamed from: b */
    private void m4887b() {
        if (this.f5148a == null) {
            this.f5148a = new Handler();
        }
    }

    /* renamed from: f */
    private void m4888f() {
        m4887b();
        Runnable runnable = this.f5151d;
        if (runnable != null) {
            this.f5148a.postDelayed(runnable, 1000);
        }
    }

    /* renamed from: j */
    private void m4889j() {
        Runnable runnable;
        Handler handler = this.f5148a;
        if (handler != null && (runnable = this.f5151d) != null) {
            handler.removeCallbacks(runnable);
            this.f5148a = null;
        }
    }

    /* renamed from: c */
    public Double mo14849c() {
        return Double.valueOf(this.f5149b);
    }

    /* renamed from: d */
    public void mo14850d() {
        double d = this.f5149b + 1.0d;
        this.f5149b = d;
        if (d >= this.f5150c) {
            mo14787a();
        } else {
            m4888f();
        }
    }

    /* renamed from: e */
    public void mo14851e() {
        m4889j();
    }

    /* renamed from: g */
    public void mo14852g() {
        if (this.f5149b > 0.0d) {
            CBLogging.m3991a("BannerTimer", "Resume timer at: " + this.f5149b + " sec");
            mo14853h();
        }
    }

    /* renamed from: h */
    public void mo14853h() {
        m4888f();
    }

    /* renamed from: i */
    public void mo14788i() {
        m4889j();
        this.f5149b = 0.0d;
    }
}
