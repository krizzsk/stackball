package com.yandex.mobile.ads.impl;

import android.os.Process;
import com.yandex.mobile.ads.impl.C13045fd;
import java.util.concurrent.BlockingQueue;

/* renamed from: com.yandex.mobile.ads.impl.md */
public class C13971md extends Thread {

    /* renamed from: h */
    private static final boolean f37306h = pp1.f38780b;

    /* renamed from: b */
    private final BlockingQueue<l41<?>> f37307b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final BlockingQueue<l41<?>> f37308c;

    /* renamed from: d */
    private final C13045fd f37309d;

    /* renamed from: e */
    private final h51 f37310e;

    /* renamed from: f */
    private volatile boolean f37311f = false;

    /* renamed from: g */
    private final wp1 f37312g;

    public C13971md(BlockingQueue<l41<?>> blockingQueue, BlockingQueue<l41<?>> blockingQueue2, C13045fd fdVar, h51 h51) {
        this.f37307b = blockingQueue;
        this.f37308c = blockingQueue2;
        this.f37309d = fdVar;
        this.f37310e = h51;
        this.f37312g = new wp1(this, blockingQueue2, h51);
    }

    /* renamed from: b */
    public void mo68646b() {
        this.f37311f = true;
        interrupt();
    }

    public void run() {
        if (f37306h) {
            pp1.m40901d("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.f37309d.mo66990a();
        while (true) {
            try {
                m39396a();
            } catch (InterruptedException unused) {
                if (this.f37311f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                pp1.m40900c("Ignoring spurious interrupt of CacheDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    private void m39396a() throws InterruptedException {
        l41 take = this.f37307b.take();
        take.mo68337a("cache-queue-take");
        take.mo68333a(1);
        try {
            if (take.mo68350n()) {
                take.mo68341c("cache-discard-canceled");
                return;
            }
            C13045fd.C13046a a = this.f37309d.mo66989a(take.mo68343d());
            if (a == null) {
                take.mo68337a("cache-miss");
                if (!this.f37312g.mo70737a(take)) {
                    this.f37308c.put(take);
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                boolean z = false;
                if (a.f33323e < currentTimeMillis) {
                    take.mo68337a("cache-hit-expired");
                    take.mo68329a(a);
                    if (!this.f37312g.mo70737a(take)) {
                        this.f37308c.put(take);
                    }
                } else {
                    take.mo68337a("cache-hit");
                    c51 a2 = take.mo66994a(new fv0(200, a.f33319a, a.f33325g, false, 0));
                    take.mo68337a("cache-hit-parsed");
                    if (!(a2.f31812c == null)) {
                        take.mo68337a("cache-parsing-failed");
                        this.f37309d.mo66992a(take.mo68343d(), true);
                        take.mo68329a((C13045fd.C13046a) null);
                        if (!this.f37312g.mo70737a(take)) {
                            this.f37308c.put(take);
                        }
                    } else {
                        if (a.f33324f < currentTimeMillis) {
                            z = true;
                        }
                        if (!z) {
                            ((g40) this.f37310e).mo67181a((l41<?>) take, (c51<?>) a2);
                        } else {
                            take.mo68337a("cache-hit-refresh-needed");
                            take.mo68329a(a);
                            a2.f31813d = true;
                            if (!this.f37312g.mo70737a(take)) {
                                ((g40) this.f37310e).mo67182a(take, a2, new C13853ld(this, take));
                            } else {
                                ((g40) this.f37310e).mo67181a((l41<?>) take, (c51<?>) a2);
                            }
                        }
                    }
                }
            }
            take.mo68333a(2);
        } finally {
            take.mo68333a(2);
        }
    }
}
