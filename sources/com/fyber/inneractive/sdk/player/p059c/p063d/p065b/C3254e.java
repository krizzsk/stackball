package com.fyber.inneractive.sdk.player.p059c.p063d.p065b;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.b.e */
final class C3254e {

    /* renamed from: a */
    final C3548k f8298a = new C3548k(8);

    /* renamed from: b */
    int f8299b;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final long mo19031a(C3269g gVar) throws IOException, InterruptedException {
        int i = 0;
        gVar.mo19014c(this.f8298a.f9625a, 0, 1);
        byte b = this.f8298a.f9625a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (~i2);
        gVar.mo19014c(this.f8298a.f9625a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f8298a.f9625a[i] & 255) + (i4 << 8);
        }
        this.f8299b += i3 + 1;
        return (long) i4;
    }
}
