package com.fyber.inneractive.sdk.player.p059c.p078j.p079a;

import com.fyber.inneractive.sdk.player.p059c.p078j.C3504f;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.a.c */
public final class C3485c implements C3504f.C3505a {

    /* renamed from: a */
    private final C3480a f9424a;

    /* renamed from: b */
    private final long f9425b;

    /* renamed from: c */
    private final int f9426c;

    public C3485c(C3480a aVar) {
        this(aVar, (byte) 0);
    }

    private C3485c(C3480a aVar, byte b) {
        this.f9424a = aVar;
        this.f9425b = 10485760;
        this.f9426c = 20480;
    }

    /* renamed from: a */
    public final C3504f mo19324a() {
        return new C3483b(this.f9424a, this.f9425b, this.f9426c);
    }
}
