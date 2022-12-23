package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;

/* renamed from: com.inmobi.media.af */
/* compiled from: UiRunnable */
abstract class C4935af<T> extends C5456r<C5435p> {
    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo39945a(T t);

    C4935af(C5435p pVar, byte b) {
        super(pVar, b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo39995b(final T t) {
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C4935af.this.mo39945a(t);
            }
        });
    }
}
