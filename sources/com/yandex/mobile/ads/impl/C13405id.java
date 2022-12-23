package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.yandex.mobile.ads.impl.C13207gj;

/* renamed from: com.yandex.mobile.ads.impl.id */
public final class C13405id implements C13207gj.C13208a {

    /* renamed from: a */
    private final C12966ed f34823a;

    public C13405id(C12966ed edVar, long j) {
        this(edVar, j, 20480);
    }

    /* renamed from: a */
    public C13207gj mo67774a() {
        return new C13312hd(this.f34823a, CacheDataSink.DEFAULT_FRAGMENT_SIZE, 20480);
    }

    public C13405id(C12966ed edVar, long j, int i) {
        this.f34823a = edVar;
    }
}
