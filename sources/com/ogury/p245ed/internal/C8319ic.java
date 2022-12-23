package com.ogury.p245ed.internal;

import java.lang.ref.WeakReference;

/* renamed from: com.ogury.ed.internal.ic */
public final class C8319ic {

    /* renamed from: a */
    private final WeakReference<C8324ig> f21497a;

    /* renamed from: b */
    private final C8362jh f21498b;

    /* renamed from: c */
    private final C8185eb f21499c;

    /* renamed from: d */
    private final long f21500d;

    private C8319ic(WeakReference<C8324ig> weakReference, C8362jh jhVar, C8185eb ebVar, long j) {
        C8467mq.m23881b(weakReference, "presageAdGatewayRef");
        C8467mq.m23881b(jhVar, "webView");
        C8467mq.m23881b(ebVar, "ad");
        this.f21497a = weakReference;
        this.f21498b = jhVar;
        this.f21499c = ebVar;
        this.f21500d = j;
    }

    /* renamed from: a */
    public final WeakReference<C8324ig> mo53728a() {
        return this.f21497a;
    }

    /* renamed from: b */
    public final C8362jh mo53729b() {
        return this.f21498b;
    }

    /* renamed from: c */
    public final C8185eb mo53730c() {
        return this.f21499c;
    }

    public /* synthetic */ C8319ic(WeakReference weakReference, C8362jh jhVar, C8185eb ebVar) {
        this(weakReference, jhVar, ebVar, System.currentTimeMillis());
    }

    /* renamed from: d */
    public final long mo53731d() {
        return this.f21500d;
    }
}
