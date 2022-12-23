package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.C5789b;
import java.util.Timer;
import java.util.TimerTask;

/* renamed from: com.ironsource.mediationsdk.Z */
public final class C5628Z {

    /* renamed from: a */
    C5648aa f13253a;

    /* renamed from: b */
    private C5789b f13254b;

    /* renamed from: c */
    private Timer f13255c = null;

    public C5628Z(C5789b bVar, C5648aa aaVar) {
        this.f13254b = bVar;
        this.f13253a = aaVar;
    }

    /* renamed from: e */
    private void m13736e() {
        Timer timer = this.f13255c;
        if (timer != null) {
            timer.cancel();
            this.f13255c = null;
        }
    }

    /* renamed from: a */
    public final synchronized void mo41659a() {
        if (this.f13254b.f13925m) {
            m13736e();
            Timer timer = new Timer();
            this.f13255c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C5628Z.this.f13253a.mo41411c();
                }
            }, this.f13254b.f13923k);
        }
    }

    /* renamed from: b */
    public final synchronized void mo41660b() {
        if (!this.f13254b.f13925m) {
            m13736e();
            Timer timer = new Timer();
            this.f13255c = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    C5628Z.this.f13253a.mo41411c();
                }
            }, this.f13254b.f13923k);
        }
    }

    /* renamed from: c */
    public final void mo41661c() {
        synchronized (this) {
            m13736e();
        }
        this.f13253a.mo41411c();
    }

    /* renamed from: d */
    public final synchronized void mo41662d() {
        m13736e();
        Timer timer = new Timer();
        this.f13255c = timer;
        timer.schedule(new TimerTask() {
            public final void run() {
                C5628Z.this.f13253a.mo41411c();
            }
        }, this.f13254b.f13922j);
    }
}
