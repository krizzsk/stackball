package com.p243my.target;

import android.os.Handler;
import android.os.Looper;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: com.my.target.v8 */
public final class C7710v8 implements Closeable {

    /* renamed from: a */
    public static final C7710v8 f19526a = new C7710v8(1000);

    /* renamed from: b */
    public static final Handler f19527b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final int f19528c;

    /* renamed from: d */
    public final WeakHashMap<Runnable, Boolean> f19529d = new WeakHashMap<>();

    /* renamed from: e */
    public final Runnable f19530e = new Runnable() {
        public final void run() {
            C7710v8.this.mo51749b();
        }
    };

    public C7710v8(int i) {
        this.f19528c = i;
    }

    /* renamed from: a */
    public static C7710v8 m20686a(int i) {
        return new C7710v8(i);
    }

    /* renamed from: a */
    public final void mo51747a() {
        f19527b.postDelayed(this.f19530e, (long) this.f19528c);
    }

    /* renamed from: a */
    public void mo51748a(Runnable runnable) {
        synchronized (this) {
            int size = this.f19529d.size();
            if (this.f19529d.put(runnable, Boolean.TRUE) == null && size == 0) {
                mo51747a();
            }
        }
    }

    /* renamed from: b */
    public void mo51749b() {
        synchronized (this) {
            for (Runnable run : new ArrayList(this.f19529d.keySet())) {
                run.run();
            }
            if (this.f19529d.keySet().size() > 0) {
                mo51747a();
            }
        }
    }

    /* renamed from: b */
    public void mo51750b(Runnable runnable) {
        synchronized (this) {
            this.f19529d.remove(runnable);
            if (this.f19529d.size() == 0) {
                f19527b.removeCallbacks(this.f19530e);
            }
        }
    }

    public void close() {
        this.f19529d.clear();
        f19527b.removeCallbacks(this.f19530e);
    }
}
