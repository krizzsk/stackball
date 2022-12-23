package com.ironsource.mediationsdk.p141b;

import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.b.a */
public abstract class C5679a<T> {

    /* renamed from: a */
    protected T f13524a;

    /* renamed from: b */
    private Timer f13525b;

    /* renamed from: c */
    private long f13526c;

    public C5679a(long j) {
        this.f13526c = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo41814a();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41815a(T t) {
        if (!(this.f13526c <= 0) && t != null) {
            this.f13524a = t;
            mo41816b();
            Timer timer = new Timer();
            this.f13525b = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C5679a.this.mo41814a();
                }
            }, this.f13526c);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo41816b() {
        Timer timer = this.f13525b;
        if (timer != null) {
            timer.cancel();
            this.f13525b = null;
        }
    }

    /* renamed from: c */
    public final void mo41817c() {
        this.f13524a = null;
    }
}
