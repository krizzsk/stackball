package com.yandex.mobile.ads.impl;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.BlockingQueue;

public class dv0 extends Thread {

    /* renamed from: b */
    private final BlockingQueue<l41<?>> f32784b;

    /* renamed from: c */
    private final cv0 f32785c;

    /* renamed from: d */
    private final C13045fd f32786d;

    /* renamed from: e */
    private final h51 f32787e;

    /* renamed from: f */
    private volatile boolean f32788f = false;

    public dv0(BlockingQueue<l41<?>> blockingQueue, cv0 cv0, C13045fd fdVar, h51 h51) {
        this.f32784b = blockingQueue;
        this.f32785c = cv0;
        this.f32786d = fdVar;
        this.f32787e = h51;
    }

    /* renamed from: a */
    private void m35481a() throws InterruptedException {
        l41 take = this.f32784b.take();
        SystemClock.elapsedRealtime();
        take.mo68333a(3);
        try {
            take.mo68337a("network-queue-take");
            if (take.mo68350n()) {
                take.mo68341c("network-discard-cancelled");
                take.mo68352p();
            } else {
                if (Build.VERSION.SDK_INT >= 14) {
                    TrafficStats.setThreadStatsTag(take.mo68348k());
                }
                fv0 a = ((C14878vb) this.f32785c).mo70466a(take);
                take.mo68337a("network-http-complete");
                if (!a.f33759e || !take.mo68349m()) {
                    c51 a2 = take.mo66994a(a);
                    take.mo68337a("network-parse-complete");
                    if (take.mo68353q() && a2.f31811b != null) {
                        this.f32786d.mo66991a(take.mo68343d(), a2.f31811b);
                        take.mo68337a("network-cache-written");
                    }
                    take.mo68351o();
                    ((g40) this.f32787e).mo67181a((l41<?>) take, (c51<?>) a2);
                    take.mo68334a((c51<?>) a2);
                    take.mo68333a(4);
                    return;
                }
                take.mo68341c("not-modified");
                take.mo68352p();
            }
            take.mo68333a(4);
        } catch (op1 e) {
            SystemClock.elapsedRealtime();
            ((g40) this.f32787e).mo67183a((l41<?>) take, take.mo67425b(e));
            take.mo68352p();
        } catch (Exception e2) {
            pp1.m40898a(e2, "Unhandled exception %s", e2.toString());
            op1 op1 = new op1((Throwable) e2);
            SystemClock.elapsedRealtime();
            ((g40) this.f32787e).mo67183a((l41<?>) take, op1);
            take.mo68352p();
        } catch (Throwable th) {
            take.mo68333a(4);
            throw th;
        }
    }

    /* renamed from: b */
    public void mo66704b() {
        this.f32788f = true;
        interrupt();
    }

    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                m35481a();
            } catch (InterruptedException unused) {
                if (this.f32788f) {
                    Thread.currentThread().interrupt();
                    return;
                }
                pp1.m40900c("Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it", new Object[0]);
            }
        }
    }
}
