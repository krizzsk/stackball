package com.inmobi.media;

import android.content.Context;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.ej */
/* compiled from: NativeRootContainerLayout */
public final class C5176ej extends C5154ee {

    /* renamed from: a */
    private WeakReference<C5397j> f11895a;

    public C5176ej(Context context) {
        super(context);
    }

    public final void setNativeStrandAd(C5397j jVar) {
        this.f11895a = new WeakReference<>(jVar);
    }

    public final C5397j getNativeStrandAd() {
        return (C5397j) this.f11895a.get();
    }
}
