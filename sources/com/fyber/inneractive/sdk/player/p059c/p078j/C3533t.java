package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.t */
public final class C3533t implements C3506g {

    /* renamed from: a */
    private final C3506g f9584a;

    /* renamed from: b */
    private final C3504f f9585b;

    public C3533t(C3506g gVar, C3504f fVar) {
        this.f9584a = (C3506g) C3535a.m8781a(gVar);
        this.f9585b = (C3504f) C3535a.m8781a(fVar);
    }

    /* renamed from: a */
    public final long mo18703a(C3509i iVar) throws IOException {
        long a = this.f9584a.mo18703a(iVar);
        if (iVar.f9502e == -1 && a != -1) {
            iVar = new C3509i(iVar.f9498a, iVar.f9500c, iVar.f9501d, a, iVar.f9503f, iVar.f9504g);
        }
        this.f9585b.mo19322a(iVar);
        return a;
    }

    /* renamed from: a */
    public final int mo18702a(byte[] bArr, int i, int i2) throws IOException {
        int a = this.f9584a.mo18702a(bArr, i, i2);
        if (a > 0) {
            this.f9585b.mo19323a(bArr, i, a);
        }
        return a;
    }

    /* renamed from: a */
    public final Uri mo18704a() {
        return this.f9584a.mo18704a();
    }

    /* renamed from: b */
    public final void mo18705b() throws IOException {
        try {
            this.f9584a.mo18705b();
        } finally {
            this.f9585b.mo19321a();
        }
    }
}
