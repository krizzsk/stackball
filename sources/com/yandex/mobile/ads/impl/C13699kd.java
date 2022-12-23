package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.upstream.cache.CacheDataSink;
import com.yandex.mobile.ads.impl.C13207gj;
import com.yandex.mobile.ads.impl.C13325hj;
import com.yandex.mobile.ads.impl.C13489jd;
import com.yandex.mobile.ads.impl.x60;

/* renamed from: com.yandex.mobile.ads.impl.kd */
public final class C13699kd implements C13325hj.C13326a {

    /* renamed from: a */
    private final C12966ed f36096a;

    /* renamed from: b */
    private final C13325hj.C13326a f36097b;

    /* renamed from: c */
    private final C13325hj.C13326a f36098c;

    /* renamed from: d */
    private final C13207gj.C13208a f36099d;

    public C13699kd(C12966ed edVar, C13325hj.C13326a aVar, int i) {
        this(edVar, aVar, new x60.C15149a(), new C13405id(edVar, CacheDataSink.DEFAULT_FRAGMENT_SIZE), i, (C13489jd.C13490a) null);
    }

    /* renamed from: a */
    public C13325hj mo66840a() {
        C12966ed edVar = this.f36096a;
        C13325hj a = this.f36097b.mo66840a();
        C13325hj a2 = this.f36098c.mo66840a();
        C13207gj.C13208a aVar = this.f36099d;
        return new C13489jd(edVar, a, a2, aVar == null ? null : ((C13405id) aVar).mo67774a(), 0, (C13489jd.C13490a) null, (C14586sd) null);
    }

    public C13699kd(C12966ed edVar, C13325hj.C13326a aVar, C13325hj.C13326a aVar2, C13207gj.C13208a aVar3, int i, C13489jd.C13490a aVar4) {
        this(edVar, aVar, aVar2, aVar3, i, (C13489jd.C13490a) null, (C14586sd) null);
    }

    public C13699kd(C12966ed edVar, C13325hj.C13326a aVar, C13325hj.C13326a aVar2, C13207gj.C13208a aVar3, int i, C13489jd.C13490a aVar4, C14586sd sdVar) {
        this.f36096a = edVar;
        this.f36097b = aVar;
        this.f36098c = aVar2;
        this.f36099d = aVar3;
    }
}
