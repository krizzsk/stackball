package com.yandex.mobile.ads.base;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import java.lang.ref.WeakReference;

public final class AdResultReceiver extends ResultReceiver {

    /* renamed from: b */
    private WeakReference<C12088a> f29135b = new WeakReference<>((Object) null);

    /* renamed from: com.yandex.mobile.ads.base.AdResultReceiver$a */
    public interface C12088a {
        /* renamed from: a */
        void mo64487a(int i, Bundle bundle);
    }

    public AdResultReceiver(Handler handler) {
        super(handler);
    }

    /* renamed from: a */
    public void mo64485a(C12088a aVar) {
        this.f29135b = new WeakReference<>(aVar);
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        C12088a aVar;
        WeakReference<C12088a> weakReference = this.f29135b;
        if (weakReference != null && (aVar = (C12088a) weakReference.get()) != null) {
            aVar.mo64487a(i, bundle);
        }
    }
}
