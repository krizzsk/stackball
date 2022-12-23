package com.ironsource.lifecycle;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.lifecycle.e */
public final class C5541e implements C5536b {

    /* renamed from: a */
    Runnable f12771a;

    /* renamed from: b */
    private String f12772b = "INTERNAL";

    /* renamed from: c */
    private Timer f12773c;

    /* renamed from: d */
    private boolean f12774d;

    /* renamed from: e */
    private Long f12775e;

    /* renamed from: f */
    private long f12776f;

    public C5541e(long j, Runnable runnable, boolean z) {
        this.f12776f = j;
        this.f12771a = runnable;
        this.f12774d = false;
        this.f12775e = null;
        if (0 == 0) {
            this.f12774d = true;
            C5537c a = C5537c.m13194a();
            if (IronsourceLifecycleProvider.m13187a() && !a.f12759h.contains(this)) {
                a.f12759h.add(this);
            }
            this.f12775e = Long.valueOf(System.currentTimeMillis() + this.f12776f);
            if (!C5537c.m13194a().mo41269b()) {
                m13201d();
            }
        }
    }

    /* renamed from: d */
    private void m13201d() {
        if (this.f12773c == null) {
            Timer timer = new Timer();
            this.f12773c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C5541e.this.f12771a.run();
                }
            }, this.f12776f);
            Calendar.getInstance().setTimeInMillis(this.f12775e.longValue());
        }
    }

    /* renamed from: e */
    private void m13202e() {
        Timer timer = this.f12773c;
        if (timer != null) {
            timer.cancel();
            this.f12773c = null;
        }
    }

    /* renamed from: a */
    public final void mo41267a() {
        Long l;
        if (this.f12773c == null && (l = this.f12775e) != null) {
            long longValue = l.longValue() - System.currentTimeMillis();
            this.f12776f = longValue;
            if (longValue <= 0) {
                mo41278c();
                this.f12771a.run();
                return;
            }
            m13201d();
        }
    }

    /* renamed from: b */
    public final void mo41268b() {
        if (this.f12773c != null) {
            m13202e();
        }
    }

    /* renamed from: c */
    public final void mo41278c() {
        m13202e();
        this.f12774d = false;
        this.f12775e = null;
        C5537c a = C5537c.m13194a();
        if (a.f12759h.contains(this)) {
            a.f12759h.remove(this);
        }
    }
}
