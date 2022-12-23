package com.yandex.mobile.ads.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.AdResultReceiver;
import com.yandex.mobile.ads.nativeads.C15501j;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.v2 */
public class C14862v2 implements AdResultReceiver.C12088a {

    /* renamed from: a */
    private final AdResultReceiver f41175a;

    /* renamed from: b */
    private final WeakReference<C15501j> f41176b;

    public C14862v2(C15501j jVar) {
        this.f41176b = new WeakReference<>(jVar);
        AdResultReceiver adResultReceiver = new AdResultReceiver(new Handler(Looper.getMainLooper()));
        this.f41175a = adResultReceiver;
        adResultReceiver.mo64485a(this);
    }

    /* renamed from: a */
    public void mo64487a(int i, Bundle bundle) {
        C15501j jVar = (C15501j) this.f41176b.get();
        if (jVar == null) {
            return;
        }
        if (i == 19) {
            jVar.mo71688g();
        } else if (i != 20) {
            switch (i) {
                case 6:
                    jVar.mo71686e();
                    return;
                case 7:
                    jVar.mo71685d();
                    return;
                case 8:
                    jVar.mo71684c();
                    return;
                case 9:
                    jVar.mo71683b();
                    return;
                default:
                    return;
            }
        } else {
            jVar.mo71687f();
        }
    }

    /* renamed from: a */
    public AdResultReceiver mo70441a() {
        return this.f41175a;
    }
}
