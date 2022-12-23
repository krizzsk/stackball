package com.fyber.inneractive.sdk.player.p059c.p078j;

import android.content.Context;
import android.net.Uri;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.j.l */
public final class C3513l implements C3506g {

    /* renamed from: a */
    private final C3506g f9526a;

    /* renamed from: b */
    private final C3506g f9527b;

    /* renamed from: c */
    private final C3506g f9528c;

    /* renamed from: d */
    private final C3506g f9529d;

    /* renamed from: e */
    private C3506g f9530e;

    public C3513l(Context context, C3534u<? super C3506g> uVar, C3506g gVar) {
        this.f9526a = (C3506g) C3535a.m8781a(gVar);
        this.f9527b = new C3517p(uVar);
        this.f9528c = new C3498c(context, uVar);
        this.f9529d = new C3502e(context, uVar);
    }

    /* renamed from: a */
    public final long mo18703a(C3509i iVar) throws IOException {
        C3535a.m8784b(this.f9530e == null);
        String scheme = iVar.f9498a.getScheme();
        if (C3560t.m8884a(iVar.f9498a)) {
            if (iVar.f9498a.getPath().startsWith("/android_asset/")) {
                this.f9530e = this.f9528c;
            } else {
                this.f9530e = this.f9527b;
            }
        } else if ("asset".equals(scheme)) {
            this.f9530e = this.f9528c;
        } else if ("content".equals(scheme)) {
            this.f9530e = this.f9529d;
        } else {
            this.f9530e = this.f9526a;
        }
        return this.f9530e.mo18703a(iVar);
    }

    /* renamed from: a */
    public final int mo18702a(byte[] bArr, int i, int i2) throws IOException {
        return this.f9530e.mo18702a(bArr, i, i2);
    }

    /* renamed from: a */
    public final Uri mo18704a() {
        C3506g gVar = this.f9530e;
        if (gVar == null) {
            return null;
        }
        return gVar.mo18704a();
    }

    /* renamed from: b */
    public final void mo18705b() throws IOException {
        C3506g gVar = this.f9530e;
        if (gVar != null) {
            try {
                gVar.mo18705b();
            } finally {
                this.f9530e = null;
            }
        }
    }
}
