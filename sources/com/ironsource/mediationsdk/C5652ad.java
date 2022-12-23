package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.ad */
public final class C5652ad {

    /* renamed from: a */
    ConcurrentHashMap<String, CopyOnWriteArrayList<C5564G>> f13359a = new ConcurrentHashMap<>();

    /* renamed from: b */
    String f13360b = "";

    /* renamed from: c */
    C5564G f13361c;

    /* renamed from: d */
    private String f13362d = "";

    /* renamed from: e */
    private final List<String> f13363e;

    /* renamed from: f */
    private final int f13364f;

    /* renamed from: g */
    private final Timer f13365g = new Timer();

    public C5652ad(List<String> list, int i) {
        this.f13363e = list;
        this.f13364f = i;
    }

    /* renamed from: c */
    private synchronized boolean m13827c() {
        return this.f13361c != null && this.f13361c.f12908b.equals(this.f13362d);
    }

    /* renamed from: a */
    public final CopyOnWriteArrayList<C5564G> mo41715a() {
        CopyOnWriteArrayList<C5564G> copyOnWriteArrayList = this.f13359a.get(this.f13360b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    /* renamed from: a */
    public final synchronized void mo41716a(C5564G g) {
        IronLog.INTERNAL.verbose("");
        this.f13361c = g;
    }

    /* renamed from: a */
    public final void mo41717a(CopyOnWriteArrayList<C5564G> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.info("updating new  waterfall with id " + str);
        this.f13359a.put(str, copyOnWriteArrayList);
        if (!TextUtils.isEmpty(this.f13362d)) {
            if (m13827c()) {
                IronLog ironLog2 = IronLog.INTERNAL;
                ironLog2.info("ad from previous waterfall " + this.f13362d + " is still showing - the current waterfall " + this.f13360b + " will be deleted instead");
                String str2 = this.f13360b;
                this.f13360b = this.f13362d;
                this.f13362d = str2;
            }
            final String str3 = this.f13362d;
            this.f13365g.schedule(new TimerTask() {
                public final void run() {
                    try {
                        IronLog ironLog = IronLog.INTERNAL;
                        ironLog.info("removing waterfall with id " + str3 + " from memory");
                        C5652ad.this.f13359a.remove(str3);
                        IronLog ironLog2 = IronLog.INTERNAL;
                        ironLog2.info("waterfall size is currently " + C5652ad.this.f13359a.size());
                    } finally {
                        cancel();
                    }
                }
            }, (long) this.f13364f);
        }
        this.f13362d = this.f13360b;
        this.f13360b = str;
    }

    /* renamed from: b */
    public final boolean mo41718b() {
        return this.f13359a.size() > 5;
    }

    /* renamed from: b */
    public final synchronized boolean mo41719b(C5564G g) {
        boolean z;
        IronLog.INTERNAL.verbose("");
        if (g != null) {
            if (this.f13361c != null) {
                if (g.mo41427c() != LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK || !this.f13361c.mo41606k().equals(g.mo41606k())) {
                    if ((g.mo41427c() == LoadWhileShowSupportState.NONE || this.f13363e.contains(g.mo41607l())) && this.f13361c.mo41607l().equals(g.mo41607l())) {
                    }
                }
            }
            z = false;
            if (z && g != null) {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.info(g.mo41606k() + " does not support load while show and will not be added to the auction request");
            }
        }
        z = true;
        IronLog ironLog2 = IronLog.INTERNAL;
        ironLog2.info(g.mo41606k() + " does not support load while show and will not be added to the auction request");
        return !z;
    }
}
