package com.yandex.mobile.ads.nativeads;

import android.view.View;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.yandex.mobile.ads.nativeads.z */
class C15557z {

    /* renamed from: b */
    private static final Object f44099b = new Object();

    /* renamed from: c */
    private static volatile C15557z f44100c;

    /* renamed from: a */
    private final Map<View, C15504k0> f44101a = new WeakHashMap();

    C15557z() {
    }

    /* renamed from: a */
    static C15557z m45392a() {
        if (f44100c == null) {
            synchronized (f44099b) {
                if (f44100c == null) {
                    f44100c = new C15557z();
                }
            }
        }
        return f44100c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C15504k0 mo71938a(View view) {
        C15504k0 k0Var;
        synchronized (f44099b) {
            k0Var = this.f44101a.get(view);
        }
        return k0Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo71939a(View view, C15504k0 k0Var) {
        synchronized (f44099b) {
            this.f44101a.put(view, k0Var);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo71940a(C15504k0 k0Var) {
        Iterator<Map.Entry<View, C15504k0>> it = this.f44101a.entrySet().iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((C15504k0) it.next().getValue()) == k0Var) {
                it.remove();
                z = true;
            }
        }
        return z;
    }
}
