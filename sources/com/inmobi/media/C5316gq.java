package com.inmobi.media;

import android.util.SparseArray;
import com.inmobi.media.C5239ey;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.gq */
/* compiled from: AdExecutorService */
public class C5316gq {

    /* renamed from: b */
    private static final String f12193b = C5316gq.class.getSimpleName();

    /* renamed from: a */
    public SparseArray<Queue<C5456r>> f12194a;

    /* renamed from: c */
    private final ExecutorService f12195c;

    /* renamed from: d */
    private byte f12196d;

    /* renamed from: com.inmobi.media.gq$a */
    /* compiled from: AdExecutorService */
    static class C5317a {

        /* renamed from: a */
        static final C5316gq f12197a = new C5316gq((byte) 0);
    }

    /* synthetic */ C5316gq(byte b) {
        this();
    }

    private C5316gq() {
        this.f12196d = -1;
        this.f12194a = new SparseArray<>();
        C5220ev evVar = (C5220ev) C5239ey.m11987a(CampaignUnit.JSON_KEY_ADS, C5314go.m12211f(), (C5239ey.C5242c) null);
        int i = evVar.maxPoolSize;
        int i2 = evVar.maxPoolSize;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, 5, timeUnit, linkedBlockingQueue, new C5326gv(f12193b + "-AD"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f12195c = threadPoolExecutor;
    }

    /* renamed from: a */
    public static C5316gq m12231a() {
        return C5317a.f12197a;
    }

    /* renamed from: a */
    public final void mo40658a(int i, C5456r rVar) {
        Queue queue = this.f12194a.get(i);
        if (queue == null) {
            queue = new LinkedList();
            this.f12194a.put(i, queue);
        }
        queue.add(rVar);
        C5456r rVar2 = (C5456r) queue.peek();
        if (queue.size() == 1 && rVar2 != null) {
            mo40659a(rVar2);
        }
    }

    /* renamed from: a */
    public final void mo40659a(C5456r rVar) {
        try {
            this.f12195c.execute(rVar);
        } catch (OutOfMemoryError unused) {
            rVar.mo39946b();
        }
    }

    /* renamed from: a */
    public final void mo40657a(int i) {
        this.f12194a.remove(i);
        this.f12194a.size();
    }
}
