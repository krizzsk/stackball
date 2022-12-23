package com.yandex.mobile.ads.impl;

import java.util.Map;

public class fq1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final cy0 f33570a;

    /* renamed from: b */
    private final x81 f33571b = new x81();

    /* renamed from: com.yandex.mobile.ads.impl.fq1$a */
    class C13103a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ Map f33572b;

        C13103a(Map map) {
            this.f33572b = map;
        }

        public void run() {
            fq1.this.f33570a.setVisibility(0);
            fq1.m36181a(fq1.this, this.f33572b);
        }
    }

    public fq1(cy0 cy0) {
        this.f33570a = cy0;
    }

    /* renamed from: a */
    public void mo67066a(Map<String, String> map) {
        this.f33571b.mo70847a(new C13103a(map));
    }

    /* renamed from: a */
    static void m36181a(fq1 fq1, Map map) {
        jb0 jb0 = fq1.f33570a.f32295f;
        if (jb0 != null) {
            jb0.onAdLoaded();
            jb0.mo64356a(fq1.f33570a, map);
        }
    }
}
