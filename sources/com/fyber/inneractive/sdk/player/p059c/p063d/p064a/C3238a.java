package com.fyber.inneractive.sdk.player.p059c.p063d.p064a;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.p059c.C3290h;
import com.fyber.inneractive.sdk.player.p059c.p062c.C3227a;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3278n;
import com.fyber.inneractive.sdk.player.p059c.p063d.p064a.C3242d;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3538c;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.a.a */
final class C3238a extends C3242d {

    /* renamed from: a */
    private static final int[] f8158a = {5512, 11025, 22050, 44100};

    /* renamed from: c */
    private boolean f8159c;

    /* renamed from: d */
    private boolean f8160d;

    /* renamed from: e */
    private int f8161e;

    public C3238a(C3278n nVar) {
        super(nVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo18997a(C3548k kVar) throws C3242d.C3243a {
        if (!this.f8159c) {
            int d = kVar.mo19387d();
            int i = (d >> 4) & 15;
            this.f8161e = i;
            if (i == 2) {
                this.f8178b.mo19040a(C3290h.m8115a((String) null, "audio/mpeg", -1, -1, 1, f8158a[(d >> 2) & 3], (List<byte[]>) null, (C3227a) null, (String) null));
                this.f8160d = true;
            } else if (i == 7 || i == 8) {
                this.f8178b.mo19040a(C3290h.m8114a((String) null, this.f8161e == 7 ? "audio/g711-alaw" : "audio/g711-mlaw", -1, -1, 1, 8000, (d & 1) == 1 ? 2 : 3, (List<byte[]>) null, (C3227a) null, 0, (String) null));
                this.f8160d = true;
            } else if (i != 10) {
                throw new C3242d.C3243a("Audio format not supported: " + this.f8161e);
            }
            this.f8159c = true;
        } else {
            kVar.mo19388d(1);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18996a(C3548k kVar, long j) {
        if (this.f8161e == 2) {
            int b = kVar.mo19383b();
            this.f8178b.mo19041a(kVar, b);
            this.f8178b.mo19038a(j, 1, b, 0, (byte[]) null);
            return;
        }
        int d = kVar.mo19387d();
        if (d == 0 && !this.f8160d) {
            int b2 = kVar.mo19383b();
            byte[] bArr = new byte[b2];
            kVar.mo19382a(bArr, 0, b2);
            Pair<Integer, Integer> a = C3538c.m8788a(bArr);
            this.f8178b.mo19040a(C3290h.m8115a((String) null, "audio/mp4a-latm", -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(bArr), (C3227a) null, (String) null));
            this.f8160d = true;
        } else if (this.f8161e != 10 || d == 1) {
            int b3 = kVar.mo19383b();
            this.f8178b.mo19041a(kVar, b3);
            this.f8178b.mo19038a(j, 1, b3, 0, (byte[]) null);
        }
    }
}
