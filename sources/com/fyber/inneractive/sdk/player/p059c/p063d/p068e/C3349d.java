package com.fyber.inneractive.sdk.player.p059c.p063d.p068e;

import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.e.d */
final class C3349d {

    /* renamed from: a */
    final C3350e f8854a = new C3350e();

    /* renamed from: b */
    final C3548k f8855b = new C3548k(new byte[65025], 0);

    /* renamed from: c */
    int f8856c = -1;

    /* renamed from: d */
    boolean f8857d;

    /* renamed from: e */
    private int f8858e;

    C3349d() {
    }

    /* renamed from: a */
    public final boolean mo19143a(C3269g gVar) throws IOException, InterruptedException {
        int i;
        C3535a.m8784b(gVar != null);
        if (this.f8857d) {
            this.f8857d = false;
            this.f8855b.mo19378a();
        }
        while (!this.f8857d) {
            if (this.f8856c < 0) {
                if (!this.f8854a.mo19145a(gVar, true)) {
                    return false;
                }
                int i2 = this.f8854a.f8867h;
                if ((this.f8854a.f8861b & 1) == 1 && this.f8855b.f9627c == 0) {
                    i2 += m8291a(0);
                    i = this.f8858e + 0;
                } else {
                    i = 0;
                }
                gVar.mo19009b(i2);
                this.f8856c = i;
            }
            int a = m8291a(this.f8856c);
            int i3 = this.f8856c + this.f8858e;
            if (a > 0) {
                if (this.f8855b.mo19385c() < this.f8855b.f9627c + a) {
                    C3548k kVar = this.f8855b;
                    kVar.f9625a = Arrays.copyOf(kVar.f9625a, this.f8855b.f9627c + a);
                }
                gVar.mo19010b(this.f8855b.f9625a, this.f8855b.f9627c, a);
                C3548k kVar2 = this.f8855b;
                kVar2.mo19384b(kVar2.f9627c + a);
                this.f8857d = this.f8854a.f8869j[i3 + -1] != 255;
            }
            if (i3 == this.f8854a.f8866g) {
                i3 = -1;
            }
            this.f8856c = i3;
        }
        return true;
    }

    /* renamed from: a */
    private int m8291a(int i) {
        int i2 = 0;
        this.f8858e = 0;
        while (this.f8858e + i < this.f8854a.f8866g) {
            int[] iArr = this.f8854a.f8869j;
            int i3 = this.f8858e;
            this.f8858e = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }
}
