package com.fyber.inneractive.sdk.player.p059c.p063d.p070g;

import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.g.c */
final class C3404c {
    /* renamed from: a */
    public static C3403b m8472a(C3269g gVar) throws IOException, InterruptedException {
        C3405a a;
        C3535a.m8781a(gVar);
        C3548k kVar = new C3548k(16);
        if (C3405a.m8473a(gVar, kVar).f9189a != C3560t.m8893e("RIFF")) {
            return null;
        }
        gVar.mo19014c(kVar.f9625a, 0, 4);
        kVar.mo19386c(0);
        int j = kVar.mo19396j();
        if (j != C3560t.m8893e("WAVE")) {
            Log.e("WavHeaderReader", "Unsupported RIFF format: " + j);
            return null;
        }
        while (true) {
            a = C3405a.m8473a(gVar, kVar);
            if (a.f9189a == C3560t.m8893e("fmt ")) {
                break;
            }
            gVar.mo19013c((int) a.f9190b);
        }
        C3535a.m8784b(a.f9190b >= 16);
        gVar.mo19014c(kVar.f9625a, 0, 16);
        kVar.mo19386c(0);
        int f = kVar.mo19391f();
        int f2 = kVar.mo19391f();
        int o = kVar.mo19401o();
        int o2 = kVar.mo19401o();
        int f3 = kVar.mo19391f();
        int f4 = kVar.mo19391f();
        int i = (f2 * f4) / 8;
        if (f3 == i) {
            int a2 = C3560t.m8870a(f4);
            if (a2 == 0) {
                Log.e("WavHeaderReader", "Unsupported WAV bit depth: " + f4);
                return null;
            } else if (f == 1 || f == 65534) {
                gVar.mo19013c(((int) a.f9190b) - 16);
                return new C3403b(f2, o, o2, f3, f4, a2);
            } else {
                Log.e("WavHeaderReader", "Unsupported WAV format type: " + f);
                return null;
            }
        } else {
            throw new C3295l("Expected block alignment: " + i + "; got: " + f3);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.g.c$a */
    private static final class C3405a {

        /* renamed from: a */
        public final int f9189a;

        /* renamed from: b */
        public final long f9190b;

        private C3405a(int i, long j) {
            this.f9189a = i;
            this.f9190b = j;
        }

        /* renamed from: a */
        public static C3405a m8473a(C3269g gVar, C3548k kVar) throws IOException, InterruptedException {
            gVar.mo19014c(kVar.f9625a, 0, 8);
            kVar.mo19386c(0);
            return new C3405a(kVar.mo19396j(), kVar.mo19395i());
        }
    }
}
