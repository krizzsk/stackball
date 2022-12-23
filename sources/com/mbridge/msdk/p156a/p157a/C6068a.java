package com.mbridge.msdk.p156a.p157a;

import com.mbridge.msdk.out.PreloadListener;
import java.lang.ref.WeakReference;

/* renamed from: com.mbridge.msdk.a.a.a */
/* compiled from: PreloadListenerEx */
public final class C6068a implements PreloadListener {

    /* renamed from: a */
    WeakReference<PreloadListener> f14864a;

    /* renamed from: b */
    private boolean f14865b = false;

    /* renamed from: c */
    private int f14866c = 0;

    /* renamed from: a */
    public final boolean mo42640a() {
        return this.f14865b;
    }

    /* renamed from: a */
    public final void mo42639a(boolean z) {
        this.f14865b = z;
    }

    public C6068a(PreloadListener preloadListener) {
        if (preloadListener != null) {
            this.f14864a = new WeakReference<>(preloadListener);
        }
    }

    public final void onPreloadSucceed() {
        WeakReference<PreloadListener> weakReference = this.f14864a;
        if (weakReference != null && weakReference.get() != null) {
            ((PreloadListener) this.f14864a.get()).onPreloadSucceed();
        }
    }

    public final void onPreloadFaild(String str) {
        WeakReference<PreloadListener> weakReference = this.f14864a;
        if (weakReference != null && weakReference.get() != null) {
            ((PreloadListener) this.f14864a.get()).onPreloadFaild(str);
        }
    }
}
