package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.h41;
import java.util.HashMap;

class vd0 {

    /* renamed from: a */
    private final wd0 f41259a;

    /* renamed from: b */
    private boolean f41260b;

    /* renamed from: c */
    private boolean f41261c;

    vd0(wd0 wd0) {
        this.f41259a = wd0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo70474a() {
        this.f41260b = false;
        this.f41261c = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo70475b() {
        if (!this.f41260b) {
            this.f41260b = true;
            this.f41259a.mo70677a(h41.C13276b.IMPRESSION_TRACKING_START);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo70476c() {
        if (!this.f41261c) {
            this.f41261c = true;
            HashMap hashMap = new HashMap();
            hashMap.put("failure_tracked", Boolean.FALSE);
            this.f41259a.mo70679b(h41.C13276b.IMPRESSION_TRACKING_SUCCESS, hashMap);
        }
    }
}
