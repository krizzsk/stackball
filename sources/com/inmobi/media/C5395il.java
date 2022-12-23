package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.inmobi.media.il */
/* compiled from: Task */
public final class C5395il {

    /* renamed from: a */
    private static final Object f12356a = new Object();

    /* renamed from: b */
    private final Handler f12357b;

    /* renamed from: com.inmobi.media.il$a */
    /* compiled from: Task */
    static class C5396a {

        /* renamed from: a */
        static final C5395il f12358a = new C5395il((byte) 0);
    }

    /* synthetic */ C5395il(byte b) {
        this();
    }

    private C5395il() {
        this.f12357b = new Handler(Looper.getMainLooper());
    }

    /* renamed from: a */
    public static C5395il m12500a() {
        return C5396a.f12358a;
    }

    /* renamed from: a */
    public final void mo40767a(Runnable runnable) {
        this.f12357b.post(runnable);
    }
}
