package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.webkit.WebView;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.AdResultReceiver;
import java.lang.ref.WeakReference;
import java.util.Map;

public class j80 implements jb0 {

    /* renamed from: a */
    private final AdResponse<String> f35145a;

    /* renamed from: b */
    private final ab0 f35146b;

    /* renamed from: c */
    private final wc1 f35147c;

    /* renamed from: d */
    private WeakReference<C14892vh> f35148d;

    /* renamed from: e */
    private xe1 f35149e;

    public j80(Context context, C14645t1 t1Var, AdResponse<String> adResponse, AdResultReceiver adResultReceiver) {
        this.f35145a = adResponse;
        boolean s = t1Var.mo70113s();
        this.f35146b = new ab0(context, t1Var);
        this.f35147c = new C13946m0(context, s, adResultReceiver);
    }

    /* renamed from: a */
    public void mo64404a(C12350a2 a2Var) {
    }

    /* renamed from: a */
    public void mo67942a(C14892vh vhVar) {
        this.f35148d = new WeakReference<>(vhVar);
    }

    /* renamed from: a */
    public void mo66858a(boolean z) {
    }

    public void onAdLoaded() {
    }

    /* renamed from: a */
    public void mo67943a(xe1 xe1) {
        this.f35149e = xe1;
    }

    /* renamed from: a */
    public void mo64356a(WebView webView, Map<String, String> map) {
        xe1 xe1 = this.f35149e;
        if (xe1 != null) {
            xe1.mo66018a(map);
        }
        WeakReference<C14892vh> weakReference = this.f35148d;
        C14892vh vhVar = weakReference != null ? (C14892vh) weakReference.get() : null;
        if (vhVar != null) {
            vhVar.mo68612a();
        }
    }

    /* renamed from: a */
    public void mo66857a(String str) {
        this.f35146b.mo65717a(str, this.f35145a, this.f35147c);
    }
}
