package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.Queue;

/* renamed from: com.inmobi.media.r */
/* compiled from: BackgroundRunnable */
public abstract class C5456r<T> implements Runnable {

    /* renamed from: a */
    private static final String f12570a = C5456r.class.getSimpleName();

    /* renamed from: b */
    private Handler f12571b;

    /* renamed from: c */
    private byte f12572c = -1;

    /* renamed from: f */
    WeakReference<T> f12573f;

    /* renamed from: a */
    public abstract void mo39944a();

    protected C5456r(T t, byte b) {
        this.f12572c = b;
        this.f12573f = new WeakReference<>(t);
        this.f12571b = new Handler(Looper.getMainLooper());
    }

    public final void run() {
        mo39944a();
        this.f12571b.post(new Runnable() {
            public final void run() {
                Object obj = C5456r.this.f12573f.get();
                if (obj != null) {
                    C5316gq a = C5316gq.m12231a();
                    int hashCode = obj.hashCode();
                    Queue queue = a.f12194a.get(hashCode);
                    if (queue != null) {
                        queue.poll();
                        C5456r rVar = (C5456r) queue.peek();
                        if (queue.size() > 0 && rVar != null) {
                            a.mo40659a(rVar);
                        }
                        if (queue.size() == 0) {
                            a.f12194a.remove(hashCode);
                        }
                    }
                }
            }
        });
    }

    /* renamed from: b */
    public void mo39946b() {
        C5327gw.m12263a((byte) 1, f12570a, "Could not execute runnable due to OutOfMemory.");
        Object obj = this.f12573f.get();
        if (obj != null) {
            C5316gq.m12231a().mo40657a(obj.hashCode());
        }
    }
}
