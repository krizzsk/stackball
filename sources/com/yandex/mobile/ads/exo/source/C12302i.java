package com.yandex.mobile.ads.exo.source;

import android.net.Uri;
import com.yandex.mobile.ads.exo.C12270q;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.exo.source.C12287f;
import com.yandex.mobile.ads.exo.source.C12295h;
import com.yandex.mobile.ads.impl.C13325hj;
import com.yandex.mobile.ads.impl.C13477j7;
import com.yandex.mobile.ads.impl.C14284pk;
import com.yandex.mobile.ads.impl.af1;
import com.yandex.mobile.ads.impl.hj0;
import com.yandex.mobile.ads.impl.w81;
import com.yandex.mobile.ads.impl.z50;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.exo.source.i */
public final class C12302i extends C12279a implements C12295h.C12298c {

    /* renamed from: f */
    private final Uri f30162f;

    /* renamed from: g */
    private final C13325hj.C13326a f30163g;

    /* renamed from: h */
    private final z50 f30164h;

    /* renamed from: i */
    private final C12188d<?> f30165i;

    /* renamed from: j */
    private final hj0 f30166j;

    /* renamed from: k */
    private final String f30167k = null;

    /* renamed from: l */
    private final int f30168l;

    /* renamed from: m */
    private final Object f30169m;

    /* renamed from: n */
    private long f30170n;

    /* renamed from: o */
    private boolean f30171o;

    /* renamed from: p */
    private boolean f30172p;

    /* renamed from: q */
    private af1 f30173q;

    /* renamed from: com.yandex.mobile.ads.exo.source.i$a */
    public static final class C12303a {

        /* renamed from: a */
        private final C13325hj.C13326a f30174a;

        /* renamed from: b */
        private z50 f30175b;

        /* renamed from: c */
        private hj0 f30176c = new C14284pk();

        public C12303a(C13325hj.C13326a aVar, z50 z50) {
            this.f30174a = aVar;
            this.f30175b = z50;
        }

        /* renamed from: a */
        public C12287f mo65324a(Uri uri) {
            return new C12302i(uri, this.f30174a, this.f30175b, C12188d.f29588a, this.f30176c, (String) null, 1048576, (Object) null);
        }
    }

    C12302i(Uri uri, C13325hj.C13326a aVar, z50 z50, C12188d<?> dVar, hj0 hj0, String str, int i, Object obj) {
        this.f30162f = uri;
        this.f30163g = aVar;
        this.f30164h = z50;
        this.f30165i = dVar;
        this.f30166j = hj0;
        this.f30168l = i;
        this.f30170n = -9223372036854775807L;
        this.f30169m = null;
    }

    /* renamed from: a */
    public void mo65281a() throws IOException {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo65253a(af1 af1) {
        this.f30173q = af1;
        this.f30165i.mo64855b();
        m32379a(this.f30170n, this.f30171o, this.f30172p);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo65254b() {
        this.f30165i.release();
    }

    /* renamed from: b */
    public void mo65323b(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.f30170n;
        }
        if (this.f30170n != j || this.f30171o != z || this.f30172p != z2) {
            m32379a(j, z, z2);
        }
    }

    /* renamed from: a */
    public C12285e mo65280a(C12287f.C12288a aVar, C13477j7 j7Var, long j) {
        C13325hj a = this.f30163g.mo66840a();
        af1 af1 = this.f30173q;
        if (af1 != null) {
            a.mo65277a(af1);
        }
        return new C12295h(this.f30162f, a, this.f30164h.mo64871a(), this.f30165i, this.f30166j, mo65247a(aVar), this, j7Var, this.f30167k, this.f30168l);
    }

    /* renamed from: a */
    public void mo65282a(C12285e eVar) {
        ((C12295h) eVar).mo65315q();
    }

    /* renamed from: a */
    private void m32379a(long j, boolean z, boolean z2) {
        this.f30170n = j;
        this.f30171o = z;
        this.f30172p = z2;
        long j2 = this.f30170n;
        mo65249a((C12270q) new w81(j2, j2, 0, 0, this.f30171o, false, this.f30172p, (Object) null, this.f30169m));
    }
}
