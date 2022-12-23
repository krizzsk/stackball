package com.fyber.inneractive.sdk.player.p059c.p063d;

import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.io.EOFException;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e */
public final class C3267e implements C3278n {
    /* renamed from: a */
    public final void mo19038a(long j, int i, int i2, int i3, byte[] bArr) {
    }

    /* renamed from: a */
    public final void mo19040a(C3290h hVar) {
    }

    /* renamed from: a */
    public final int mo19035a(C3269g gVar, int i, boolean z) throws IOException, InterruptedException {
        int a = gVar.mo19004a(i);
        if (a != -1) {
            return a;
        }
        if (z) {
            return -1;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public final void mo19041a(C3548k kVar, int i) {
        kVar.mo19388d(i);
    }
}
