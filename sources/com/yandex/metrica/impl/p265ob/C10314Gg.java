package com.yandex.metrica.impl.p265ob;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* renamed from: com.yandex.metrica.impl.ob.Gg */
public class C10314Gg extends ResultReceiver {

    /* renamed from: b */
    public static final /* synthetic */ int f24786b = 0;

    /* renamed from: a */
    private final C10224Eg f24787a;

    public C10314Gg(Handler handler, C10224Eg eg) {
        super(handler);
        this.f24787a = eg;
    }

    /* access modifiers changed from: protected */
    public void onReceiveResult(int i, Bundle bundle) {
        if (i == 1) {
            C10255Fg fg = null;
            try {
                fg = C10255Fg.m26312a(bundle.getByteArray("referrer"));
            } catch (Throwable unused) {
            }
            this.f24787a.mo61194a(fg);
        }
    }
}
