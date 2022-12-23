package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.impressionData.ImpressionData;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.server.C5782b;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.m */
public abstract class C5716m {

    /* renamed from: a */
    private HashSet<ImpressionDataListener> f13677a = new HashSet<>();

    public C5716m(HashSet<ImpressionDataListener> hashSet) {
        this.f13677a = hashSet;
    }

    /* renamed from: b */
    protected static String m14099b() {
        return "fallback_" + System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo41913a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f13677a.add(impressionDataListener);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo41914a(C5782b bVar, String str) {
        if (bVar != null) {
            ImpressionData a = bVar.mo42081a(str);
            if (a != null) {
                Iterator<ImpressionDataListener> it = this.f13677a.iterator();
                while (it.hasNext()) {
                    ImpressionDataListener next = it.next();
                    IronLog ironLog = IronLog.CALLBACK;
                    ironLog.info("onImpressionSuccess " + next.getClass().getSimpleName() + ": " + a);
                    next.onImpressionSuccess(a);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    /* renamed from: b */
    public final void mo41915b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f13677a.remove(impressionDataListener);
        }
    }

    /* renamed from: b_ */
    public final void mo41916b_() {
        synchronized (this) {
            this.f13677a.clear();
        }
    }
}
