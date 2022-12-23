package com.fyber.inneractive.sdk.player.p059c.p063d.p069f;

import android.support.p003v4.media.session.PlaybackStateCompat;
import android.util.SparseArray;
import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3268f;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3269g;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3270h;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3271i;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3275l;
import com.fyber.inneractive.sdk.player.p059c.p063d.C3276m;
import com.fyber.inneractive.sdk.player.p059c.p063d.p069f.C3396v;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3547j;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3548k;
import com.fyber.inneractive.sdk.player.p059c.p080k.C3558r;
import com.google.common.base.Ascii;
import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.player.c.d.f.p */
public final class C3385p implements C3268f {

    /* renamed from: a */
    public static final C3271i f9114a = new C3271i() {
        /* renamed from: a */
        public final C3268f[] mo19002a() {
            return new C3268f[]{new C3385p()};
        }
    };

    /* renamed from: b */
    private final C3558r f9115b;

    /* renamed from: c */
    private final SparseArray<C3387a> f9116c;

    /* renamed from: d */
    private final C3548k f9117d;

    /* renamed from: e */
    private boolean f9118e;

    /* renamed from: f */
    private boolean f9119f;

    /* renamed from: g */
    private boolean f9120g;

    /* renamed from: h */
    private C3270h f9121h;

    public C3385p() {
        this(new C3558r(0));
    }

    private C3385p(C3558r rVar) {
        this.f9115b = rVar;
        this.f9117d = new C3548k(4096);
        this.f9116c = new SparseArray<>();
    }

    /* renamed from: a */
    public final boolean mo19001a(C3269g gVar) throws IOException, InterruptedException {
        byte[] bArr = new byte[14];
        gVar.mo19014c(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << Ascii.CAN) | ((bArr[1] & 255) << Ascii.DLE) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        gVar.mo19013c(bArr[13] & 7);
        gVar.mo19014c(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << Ascii.DLE) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo19000a(C3270h hVar) {
        this.f9121h = hVar;
        hVar.mo19057a((C3276m) new C3276m.C3277a(-9223372036854775807L));
    }

    /* renamed from: a */
    public final void mo18999a(long j, long j2) {
        this.f9115b.f9653b = -9223372036854775807L;
        for (int i = 0; i < this.f9116c.size(); i++) {
            C3387a valueAt = this.f9116c.valueAt(i);
            valueAt.f9127f = false;
            valueAt.f9122a.mo19156a();
        }
    }

    /* renamed from: a */
    public final int mo18998a(C3269g gVar, C3275l lVar) throws IOException, InterruptedException {
        if (!gVar.mo19011b(this.f9117d.f9625a, 0, 4, true)) {
            return -1;
        }
        this.f9117d.mo19386c(0);
        int j = this.f9117d.mo19396j();
        if (j == 441) {
            return -1;
        }
        if (j == 442) {
            gVar.mo19014c(this.f9117d.f9625a, 0, 10);
            this.f9117d.mo19386c(9);
            gVar.mo19009b((this.f9117d.mo19387d() & 7) + 14);
            return 0;
        } else if (j == 443) {
            gVar.mo19014c(this.f9117d.f9625a, 0, 2);
            this.f9117d.mo19386c(0);
            gVar.mo19009b(this.f9117d.mo19389e() + 6);
            return 0;
        } else if (((j & InputDeviceCompat.SOURCE_ANY) >> 8) != 1) {
            gVar.mo19009b(1);
            return 0;
        } else {
            int i = j & 255;
            C3387a aVar = this.f9116c.get(i);
            if (!this.f9118e) {
                if (aVar == null) {
                    C3373h hVar = null;
                    if (!this.f9119f && i == 189) {
                        hVar = new C3366b();
                        this.f9119f = true;
                    } else if (!this.f9119f && (i & 224) == 192) {
                        hVar = new C3382m();
                        this.f9119f = true;
                    } else if (!this.f9120g && (i & 240) == 224) {
                        hVar = new C3374i();
                        this.f9120g = true;
                    }
                    if (hVar != null) {
                        hVar.mo19158a(this.f9121h, new C3396v.C3400d(i, 256));
                        aVar = new C3387a(hVar, this.f9115b);
                        this.f9116c.put(i, aVar);
                    }
                }
                if ((this.f9119f && this.f9120g) || gVar.mo19012c() > PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                    this.f9118e = true;
                    this.f9121h.mo19058b();
                }
            }
            gVar.mo19014c(this.f9117d.f9625a, 0, 2);
            this.f9117d.mo19386c(0);
            int e = this.f9117d.mo19389e() + 6;
            if (aVar == null) {
                gVar.mo19009b(e);
            } else {
                this.f9117d.mo19379a(e);
                gVar.mo19010b(this.f9117d.f9625a, 0, e);
                this.f9117d.mo19386c(6);
                C3548k kVar = this.f9117d;
                kVar.mo19382a(aVar.f9124c.f9621a, 0, 3);
                aVar.f9124c.mo19374a(0);
                aVar.f9124c.mo19376b(8);
                aVar.f9125d = aVar.f9124c.mo19375a();
                aVar.f9126e = aVar.f9124c.mo19375a();
                aVar.f9124c.mo19376b(6);
                aVar.f9128g = aVar.f9124c.mo19377c(8);
                kVar.mo19382a(aVar.f9124c.f9621a, 0, aVar.f9128g);
                aVar.f9124c.mo19374a(0);
                aVar.f9129h = 0;
                if (aVar.f9125d) {
                    aVar.f9124c.mo19376b(4);
                    aVar.f9124c.mo19376b(1);
                    aVar.f9124c.mo19376b(1);
                    long c = (((long) aVar.f9124c.mo19377c(3)) << 30) | ((long) (aVar.f9124c.mo19377c(15) << 15)) | ((long) aVar.f9124c.mo19377c(15));
                    aVar.f9124c.mo19376b(1);
                    if (!aVar.f9127f && aVar.f9126e) {
                        aVar.f9124c.mo19376b(4);
                        aVar.f9124c.mo19376b(1);
                        aVar.f9124c.mo19376b(1);
                        long c2 = (long) aVar.f9124c.mo19377c(15);
                        aVar.f9124c.mo19376b(1);
                        aVar.f9123b.mo19422a(c2 | (((long) aVar.f9124c.mo19377c(3)) << 30) | ((long) (aVar.f9124c.mo19377c(15) << 15)));
                        aVar.f9127f = true;
                    }
                    aVar.f9129h = aVar.f9123b.mo19422a(c);
                }
                aVar.f9122a.mo19157a(aVar.f9129h, true);
                aVar.f9122a.mo19159a(kVar);
                aVar.f9122a.mo19160b();
                C3548k kVar2 = this.f9117d;
                kVar2.mo19384b(kVar2.mo19385c());
            }
            return 0;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.c.d.f.p$a */
    private static final class C3387a {

        /* renamed from: a */
        final C3373h f9122a;

        /* renamed from: b */
        final C3558r f9123b;

        /* renamed from: c */
        final C3547j f9124c = new C3547j(new byte[64]);

        /* renamed from: d */
        boolean f9125d;

        /* renamed from: e */
        boolean f9126e;

        /* renamed from: f */
        boolean f9127f;

        /* renamed from: g */
        int f9128g;

        /* renamed from: h */
        long f9129h;

        public C3387a(C3373h hVar, C3558r rVar) {
            this.f9122a = hVar;
            this.f9123b = rVar;
        }
    }
}
