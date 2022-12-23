package com.yandex.mobile.ads.impl;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Map;

public class pp0 implements jb0 {

    /* renamed from: a */
    private final cy0 f38772a;

    /* renamed from: b */
    private final sd0 f38773b;

    /* renamed from: c */
    private final dm1 f38774c = new dm1();

    /* renamed from: d */
    private final fq1 f38775d;

    /* renamed from: e */
    private final zo0 f38776e = new zo0();

    /* renamed from: f */
    private final yu0 f38777f;

    /* renamed from: g */
    private C12877df f38778g;

    pp0(lp0 lp0, sd0 sd0, yu0 yu0) {
        this.f38772a = lp0;
        this.f38773b = sd0;
        this.f38777f = yu0;
        this.f38775d = new fq1(lp0);
    }

    /* renamed from: a */
    public void mo64356a(WebView webView, Map<String, String> map) {
    }

    /* renamed from: a */
    public void mo64404a(C12350a2 a2Var) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69391a(C12877df dfVar) {
        this.f38778g = dfVar;
    }

    /* renamed from: a */
    public void mo66858a(boolean z) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo69392b(String str) {
        eb0 a = fb0.m35946a().mo66950a(this.f38776e.mo71268a(str));
        cy0 cy0 = this.f38772a;
        dm1 dm1 = this.f38774c;
        sd0 sd0 = this.f38773b;
        yu0 yu0 = this.f38777f;
        a.mo66656a(cy0, this, dm1, sd0, yu0, yu0).mo66543a(str);
    }

    public void onAdLoaded() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo69390a() {
        this.f38775d.mo67066a((Map<String, String>) Collections.emptyMap());
    }

    /* renamed from: a */
    public void mo66857a(String str) {
        C12877df dfVar = this.f38778g;
        if (dfVar != null) {
            ((vo0) dfVar).mo70509a(this.f38772a, str);
        }
    }
}
