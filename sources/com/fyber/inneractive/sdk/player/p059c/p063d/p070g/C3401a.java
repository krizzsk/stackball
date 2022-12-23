package com.fyber.inneractive.sdk.player.p059c.p063d.p070g;

import android.util.Log;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.C3295l;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3275l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p070g.C3404c;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3535a;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3560t;
import java.io.IOException;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.g.a */
public final class C3401a implements C3268f, C3276m {

    /* renamed from: a */
    public static final C3271i f9175a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3401a()};
        }
    };

    /* renamed from: b */
    private C3270h f9176b;

    /* renamed from: c */
    private C3278n f9177c;

    /* renamed from: d */
    private C3403b f9178d;

    /* renamed from: e */
    private int f9179e;

    /* renamed from: f */
    private int f9180f;

    /* renamed from: b_ */
    public final boolean mo18995b_() {
        return true;
    }

    /* renamed from: a */
    public final boolean mo19001a(C3269g gVar) throws IOException, InterruptedException {
        return C3404c.m8472a(gVar) != null;
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        this.f9176b = hVar;
        this.f9177c = hVar.mo19056a(0);
        this.f9178d = null;
        hVar.mo19058b();
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        this.f9180f = 0;
    }

    /* renamed from: a */
    public final int mo18998a(C3269g gVar, C3275l lVar) throws IOException, InterruptedException {
        C3269g gVar2 = gVar;
        if (this.f9178d == null) {
            C3403b a = C3404c.m8472a(gVar);
            this.f9178d = a;
            if (a != null) {
                this.f9177c.mo19040a(C3290h.m8114a((String) null, "audio/raw", a.f9182b * a.f9185e * a.f9181a, 32768, this.f9178d.f9181a, this.f9178d.f9182b, this.f9178d.f9186f, (List<byte[]>) null, (C3227a) null, 0, (String) null));
                this.f9179e = this.f9178d.f9184d;
            } else {
                throw new C3295l("Unsupported or unrecognized wav header.");
            }
        }
        C3403b bVar = this.f9178d;
        if (!((bVar.f9187g == 0 || bVar.f9188h == 0) ? false : true)) {
            C3403b bVar2 = this.f9178d;
            C3535a.m8781a(gVar);
            C3535a.m8781a(bVar2);
            gVar.mo19006a();
            C3548k kVar = new C3548k(8);
            C3404c.C3405a a2 = C3404c.C3405a.m8473a(gVar2, kVar);
            while (a2.f9189a != C3560t.m8893e("data")) {
                Log.w("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.f9189a);
                long j = a2.f9190b + 8;
                if (a2.f9189a == C3560t.m8893e("RIFF")) {
                    j = 12;
                }
                if (j <= 2147483647L) {
                    gVar2.mo19009b((int) j);
                    a2 = C3404c.C3405a.m8473a(gVar2, kVar);
                } else {
                    throw new C3295l("Chunk is too large (~2GB+) to skip; id: " + a2.f9189a);
                }
            }
            gVar2.mo19009b(8);
            long c = gVar.mo19012c();
            long j2 = a2.f9190b;
            bVar2.f9187g = c;
            bVar2.f9188h = j2;
            this.f9176b.mo19057a((C3276m) this);
        }
        int a3 = this.f9177c.mo19035a(gVar2, 32768 - this.f9180f, true);
        if (a3 != -1) {
            this.f9180f += a3;
        }
        int i = this.f9180f / this.f9179e;
        if (i > 0) {
            C3403b bVar3 = this.f9178d;
            int i2 = i * this.f9179e;
            int i3 = this.f9180f - i2;
            this.f9180f = i3;
            this.f9177c.mo19038a(((gVar.mo19012c() - ((long) this.f9180f)) * 1000000) / ((long) bVar3.f9183c), 1, i2, i3, (byte[]) null);
        }
        if (a3 == -1) {
            return -1;
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo18994b() {
        C3403b bVar = this.f9178d;
        return ((bVar.f9188h / ((long) bVar.f9184d)) * 1000000) / ((long) bVar.f9182b);
    }

    /* renamed from: a */
    public final long mo18993a(long j) {
        C3403b bVar = this.f9178d;
        return Math.min((((j * ((long) bVar.f9183c)) / 1000000) / ((long) bVar.f9184d)) * ((long) bVar.f9184d), bVar.f9188h - ((long) bVar.f9184d)) + bVar.f9187g;
    }
}
