package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* renamed from: com.fyber.inneractive.sdk.util.ag */
public final class C3626ag extends Handler {

    /* renamed from: a */
    private final WeakReference<C3627ah> f9893a;

    public C3626ag(Looper looper, C3627ah ahVar) {
        super(looper);
        this.f9893a = new WeakReference<>(ahVar);
    }

    public final void handleMessage(Message message) {
        super.handleMessage(message);
        C3627ah ahVar = (C3627ah) C3670q.m9152a(this.f9893a);
        if (ahVar != null) {
            ahVar.mo18413a(message);
        }
    }
}
