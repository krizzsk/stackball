package com.yandex.mobile.ads.exo.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.util.MimeTypes;
import com.tapjoy.TapjoyConstants;
import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.exo.drm.C12188d;
import com.yandex.mobile.ads.exo.drm.DrmInitData;
import com.yandex.mobile.ads.exo.extractor.Extractor;
import com.yandex.mobile.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.exo.metadata.icy.IcyHeaders;
import com.yandex.mobile.ads.exo.source.C12283d;
import com.yandex.mobile.ads.exo.source.C12285e;
import com.yandex.mobile.ads.exo.source.C12290g;
import com.yandex.mobile.ads.exo.source.C12306k;
import com.yandex.mobile.ads.exo.trackselection.C12330d;
import com.yandex.mobile.ads.impl.C12888dh;
import com.yandex.mobile.ads.impl.C13325hj;
import com.yandex.mobile.ads.impl.C13416ik;
import com.yandex.mobile.ads.impl.C13477j7;
import com.yandex.mobile.ads.impl.C13479j9;
import com.yandex.mobile.ads.impl.C13504jj;
import com.yandex.mobile.ads.impl.C14284pk;
import com.yandex.mobile.ads.impl.C14387qj;
import com.yandex.mobile.ads.impl.fy0;
import com.yandex.mobile.ads.impl.hj0;
import com.yandex.mobile.ads.impl.ib1;
import com.yandex.mobile.ads.impl.ih1;
import com.yandex.mobile.ads.impl.jy0;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.mj0;
import com.yandex.mobile.ads.impl.og1;
import com.yandex.mobile.ads.impl.po0;
import com.yandex.mobile.ads.impl.q70;
import com.yandex.mobile.ads.impl.r01;
import com.yandex.mobile.ads.impl.s71;
import com.yandex.mobile.ads.impl.w50;
import com.yandex.mobile.ads.impl.wn0;
import com.yandex.mobile.ads.impl.x50;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.yandex.mobile.ads.exo.source.h */
final class C12295h implements C12285e, x50, mj0.C13983b<C12296a>, mj0.C13987f, C12306k.C12308b {
    /* access modifiers changed from: private */

    /* renamed from: N */
    public static final Map<String, String> f30097N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public static final Format f30098O = Format.m31679a("icy", MimeTypes.APPLICATION_ICY, Long.MAX_VALUE);

    /* renamed from: A */
    private boolean f30099A;

    /* renamed from: B */
    private boolean f30100B;

    /* renamed from: C */
    private boolean f30101C;

    /* renamed from: D */
    private int f30102D;

    /* renamed from: E */
    private long f30103E;

    /* renamed from: F */
    private long f30104F;

    /* renamed from: G */
    private boolean f30105G;

    /* renamed from: H */
    private long f30106H;

    /* renamed from: I */
    private long f30107I;

    /* renamed from: J */
    private boolean f30108J;

    /* renamed from: K */
    private int f30109K;

    /* renamed from: L */
    private boolean f30110L;

    /* renamed from: M */
    private boolean f30111M;

    /* renamed from: b */
    private final Uri f30112b;

    /* renamed from: c */
    private final C13325hj f30113c;

    /* renamed from: d */
    private final C12188d<?> f30114d;

    /* renamed from: e */
    private final hj0 f30115e;

    /* renamed from: f */
    private final C12290g.C12291a f30116f;

    /* renamed from: g */
    private final C12298c f30117g;

    /* renamed from: h */
    private final C13477j7 f30118h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final String f30119i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final long f30120j;

    /* renamed from: k */
    private final mj0 f30121k = new mj0("Loader:ProgressiveMediaPeriod");

    /* renamed from: l */
    private final C12297b f30122l;

    /* renamed from: m */
    private final C12888dh f30123m;

    /* renamed from: n */
    private final Runnable f30124n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Runnable f30125o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final Handler f30126p;

    /* renamed from: q */
    private C12285e.C12286a f30127q;

    /* renamed from: r */
    private s71 f30128r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public IcyHeaders f30129s;

    /* renamed from: t */
    private C12306k[] f30130t;

    /* renamed from: u */
    private C12301f[] f30131u;

    /* renamed from: v */
    private boolean f30132v;

    /* renamed from: w */
    private boolean f30133w;

    /* renamed from: x */
    private C12299d f30134x;

    /* renamed from: y */
    private boolean f30135y;

    /* renamed from: z */
    private int f30136z;

    /* renamed from: com.yandex.mobile.ads.exo.source.h$a */
    final class C12296a implements mj0.C13986e, C12283d.C12284a {

        /* renamed from: a */
        private final Uri f30137a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final ib1 f30138b;

        /* renamed from: c */
        private final C12297b f30139c;

        /* renamed from: d */
        private final x50 f30140d;

        /* renamed from: e */
        private final C12888dh f30141e;

        /* renamed from: f */
        private final r01 f30142f = new r01();

        /* renamed from: g */
        private volatile boolean f30143g;

        /* renamed from: h */
        private boolean f30144h = true;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public long f30145i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public C13504jj f30146j = m32363a(0);
        /* access modifiers changed from: private */

        /* renamed from: k */
        public long f30147k = -1;

        /* renamed from: l */
        private ke1 f30148l;

        /* renamed from: m */
        private boolean f30149m;

        public C12296a(Uri uri, C13325hj hjVar, C12297b bVar, x50 x50, C12888dh dhVar) {
            this.f30137a = uri;
            this.f30138b = new ib1(hjVar);
            this.f30139c = bVar;
            this.f30140d = x50;
            this.f30141e = dhVar;
        }

        /* renamed from: a */
        public void mo65316a() throws IOException, InterruptedException {
            C13416ik ikVar;
            int i = 0;
            while (i == 0 && !this.f30143g) {
                try {
                    long j = this.f30142f.f39340a;
                    long j2 = j;
                    C13504jj jjVar = new C13504jj(this.f30137a, j, -1, C12295h.this.f30119i, 6, (Map<String, String>) C12295h.f30097N);
                    this.f30146j = jjVar;
                    long a = this.f30138b.mo65275a(jjVar);
                    this.f30147k = a;
                    if (a != -1) {
                        this.f30147k = a + j2;
                    }
                    Uri a2 = this.f30138b.mo65276a();
                    a2.getClass();
                    IcyHeaders unused = C12295h.this.f30129s = IcyHeaders.m32053a(this.f30138b.mo65278b());
                    C13325hj hjVar = this.f30138b;
                    if (!(C12295h.this.f30129s == null || C12295h.this.f30129s.f29897g == -1)) {
                        hjVar = new C12283d(this.f30138b, C12295h.this.f30129s.f29897g, this);
                        ke1 m = C12295h.this.mo65314m();
                        this.f30148l = m;
                        m.mo65339a(C12295h.f30098O);
                    }
                    C13416ik ikVar2 = new C13416ik(hjVar, j2, this.f30147k);
                    try {
                        w50 a3 = this.f30139c.mo65319a(ikVar2, this.f30140d, a2);
                        if (C12295h.this.f30129s != null && (a3 instanceof po0)) {
                            ((po0) a3).mo69389a();
                        }
                        if (this.f30144h) {
                            a3.mo64889a(j2, this.f30145i);
                            this.f30144h = false;
                        }
                        long j3 = j2;
                        while (i == 0 && !this.f30143g) {
                            this.f30141e.mo66581a();
                            i = a3.mo64888a(ikVar2, this.f30142f);
                            if (ikVar2.mo67811c() > C12295h.this.f30120j + j3) {
                                j3 = ikVar2.mo67811c();
                                this.f30141e.mo66582b();
                                C12295h.this.f30126p.post(C12295h.this.f30125o);
                            }
                        }
                        if (i == 1) {
                            i = 0;
                        } else {
                            this.f30142f.f39340a = ikVar2.mo67811c();
                        }
                        ih1.m37378a((C13325hj) this.f30138b);
                    } catch (Throwable th) {
                        th = th;
                        ikVar = ikVar2;
                        if (!(i == 1 || ikVar == null)) {
                            this.f30142f.f39340a = ikVar.mo67811c();
                        }
                        ih1.m37378a((C13325hj) this.f30138b);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    ikVar = null;
                    this.f30142f.f39340a = ikVar.mo67811c();
                    ih1.m37378a((C13325hj) this.f30138b);
                    throw th;
                }
            }
        }

        /* renamed from: b */
        public void mo65318b() {
            this.f30143g = true;
        }

        /* renamed from: a */
        public void mo65317a(fy0 fy0) {
            long max = !this.f30149m ? this.f30145i : Math.max(C12295h.this.m32330l(), this.f30145i);
            int a = fy0.mo67098a();
            ke1 ke1 = this.f30148l;
            ke1.getClass();
            ke1.mo65341a(fy0, a);
            ke1.mo65337a(max, 1, a, 0, (ke1.C13702a) null);
            this.f30149m = true;
        }

        /* renamed from: a */
        private C13504jj m32363a(long j) {
            return new C13504jj(this.f30137a, j, -1, C12295h.this.f30119i, 6, (Map<String, String>) C12295h.f30097N);
        }

        /* renamed from: a */
        static void m32365a(C12296a aVar, long j, long j2) {
            aVar.f30142f.f39340a = j;
            aVar.f30145i = j2;
            aVar.f30144h = true;
            aVar.f30149m = false;
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.h$c */
    interface C12298c {
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.h$d */
    private static final class C12299d {

        /* renamed from: a */
        public final s71 f30153a;

        /* renamed from: b */
        public final TrackGroupArray f30154b;

        /* renamed from: c */
        public final boolean[] f30155c;

        /* renamed from: d */
        public final boolean[] f30156d;

        /* renamed from: e */
        public final boolean[] f30157e;

        public C12299d(s71 s71, TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f30153a = s71;
            this.f30154b = trackGroupArray;
            this.f30155c = zArr;
            int i = trackGroupArray.f30063b;
            this.f30156d = new boolean[i];
            this.f30157e = new boolean[i];
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.h$e */
    private final class C12300e implements C12309l {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f30158a;

        public C12300e(int i) {
            this.f30158a = i;
        }

        /* renamed from: c */
        public boolean mo65273c() {
            return C12295h.this.mo65310a(this.f30158a);
        }

        /* renamed from: a */
        public void mo65271a() throws IOException {
            C12295h.this.mo65313d(this.f30158a);
        }

        /* renamed from: a */
        public int mo65270a(q70 q70, C14387qj qjVar, boolean z) {
            return C12295h.this.mo65303a(this.f30158a, q70, qjVar, z);
        }

        /* renamed from: a */
        public int mo65269a(long j) {
            return C12295h.this.mo65302a(this.f30158a, j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.h$f */
    private static final class C12301f {

        /* renamed from: a */
        public final int f30160a;

        /* renamed from: b */
        public final boolean f30161b;

        public C12301f(int i, boolean z) {
            this.f30160a = i;
            this.f30161b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C12301f.class != obj.getClass()) {
                return false;
            }
            C12301f fVar = (C12301f) obj;
            if (this.f30160a == fVar.f30160a && this.f30161b == fVar.f30161b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f30160a * 31) + (this.f30161b ? 1 : 0);
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(com.google.android.exoplayer2.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        f30097N = Collections.unmodifiableMap(hashMap);
    }

    public C12295h(Uri uri, C13325hj hjVar, Extractor[] extractorArr, C12188d<?> dVar, hj0 hj0, C12290g.C12291a aVar, C12298c cVar, C13477j7 j7Var, String str, int i) {
        this.f30112b = uri;
        this.f30113c = hjVar;
        this.f30114d = dVar;
        this.f30115e = hj0;
        this.f30116f = aVar;
        this.f30117g = cVar;
        this.f30118h = j7Var;
        this.f30119i = str;
        this.f30120j = (long) i;
        this.f30122l = new C12297b(extractorArr);
        this.f30123m = new C12888dh();
        this.f30124n = new Runnable() {
            public final void run() {
                C12295h.this.m32333p();
            }
        };
        this.f30125o = new Runnable() {
            public final void run() {
                C12295h.this.m32332o();
            }
        };
        this.f30126p = new Handler();
        this.f30131u = new C12301f[0];
        this.f30130t = new C12306k[0];
        this.f30107I = -9223372036854775807L;
        this.f30104F = -1;
        this.f30103E = -9223372036854775807L;
        this.f30136z = 1;
        aVar.mo65287a();
    }

    /* renamed from: k */
    private int m32329k() {
        int i = 0;
        for (C12306k f : this.f30130t) {
            i += f.mo65349f();
        }
        return i;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public long m32330l() {
        long j = Long.MIN_VALUE;
        for (C12306k c : this.f30130t) {
            j = Math.max(j, c.mo65346c());
        }
        return j;
    }

    /* renamed from: n */
    private boolean m32331n() {
        return this.f30107I != -9223372036854775807L;
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public void m32332o() {
        if (!this.f30111M) {
            C12285e.C12286a aVar = this.f30127q;
            aVar.getClass();
            aVar.mo64929a(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m32333p() {
        int i;
        Metadata metadata;
        s71 s71 = this.f30128r;
        if (!this.f30111M && !this.f30133w && this.f30132v && s71 != null) {
            C12306k[] kVarArr = this.f30130t;
            int length = kVarArr.length;
            boolean z = false;
            int i2 = 0;
            while (i2 < length) {
                if (kVarArr[i2].mo65348e() != null) {
                    i2++;
                } else {
                    return;
                }
            }
            this.f30123m.mo66582b();
            int length2 = this.f30130t.length;
            TrackGroup[] trackGroupArr = new TrackGroup[length2];
            boolean[] zArr = new boolean[length2];
            this.f30103E = s71.mo64899c();
            for (int i3 = 0; i3 < length2; i3++) {
                Format e = this.f30130t[i3].mo65348e();
                String str = e.f29530j;
                boolean e2 = wn0.m43728e(str);
                boolean z2 = e2 || wn0.m43730g(str);
                zArr[i3] = z2;
                this.f30135y = z2 | this.f30135y;
                IcyHeaders icyHeaders = this.f30129s;
                if (icyHeaders != null) {
                    if (e2 || this.f30131u[i3].f30161b) {
                        Metadata metadata2 = e.f29528h;
                        if (metadata2 == null) {
                            metadata = new Metadata(icyHeaders);
                        } else {
                            metadata = metadata2.mo64996a(icyHeaders);
                        }
                        e = e.mo64770a(e.f29533m, metadata);
                    }
                    if (e2 && e.f29526f == -1 && (i = icyHeaders.f29892b) != -1) {
                        e = e.mo64767a(i);
                    }
                }
                DrmInitData drmInitData = e.f29533m;
                if (drmInitData != null) {
                    e = e.mo64771a(this.f30114d.mo64854b(drmInitData));
                }
                trackGroupArr[i3] = new TrackGroup(e);
            }
            if (this.f30104F == -1 && s71.mo64899c() == -9223372036854775807L) {
                z = true;
            }
            this.f30105G = z;
            this.f30136z = z ? 7 : 1;
            this.f30134x = new C12299d(s71, new TrackGroupArray(trackGroupArr), zArr);
            this.f30133w = true;
            ((C12302i) this.f30117g).mo65323b(this.f30103E, s71.mo64897a(), this.f30105G);
            C12285e.C12286a aVar = this.f30127q;
            aVar.getClass();
            aVar.mo64926a(this);
        }
    }

    /* renamed from: r */
    private void m32334r() {
        C12296a aVar = new C12296a(this.f30112b, this.f30113c, this.f30122l, this, this.f30123m);
        if (this.f30133w) {
            C12299d dVar = this.f30134x;
            dVar.getClass();
            s71 s71 = dVar.f30153a;
            C13479j9.m37708b(m32331n());
            long j = this.f30103E;
            if (j == -9223372036854775807L || this.f30107I <= j) {
                C12296a.m32365a(aVar, s71.mo64898b(this.f30107I).f39865a.f40583b, this.f30107I);
                this.f30107I = -9223372036854775807L;
            } else {
                this.f30110L = true;
                this.f30107I = -9223372036854775807L;
                return;
            }
        }
        this.f30109K = m32329k();
        this.f30116f.mo65294a(aVar.f30146j, 1, -1, (Format) null, 0, (Object) null, aVar.f30145i, this.f30103E, this.f30121k.mo68695a(aVar, this, ((C14284pk) this.f30115e).mo69373a(this.f30136z)));
    }

    /* renamed from: s */
    private boolean m32335s() {
        return this.f30100B || m32331n();
    }

    /* renamed from: c */
    public void mo65263c(long j) {
    }

    /* renamed from: g */
    public long mo65267g() {
        if (this.f30102D == 0) {
            return Long.MIN_VALUE;
        }
        return mo65265e();
    }

    /* renamed from: h */
    public long mo65268h() {
        if (!this.f30101C) {
            this.f30116f.mo65300c();
            this.f30101C = true;
        }
        if (!this.f30100B) {
            return -9223372036854775807L;
        }
        if (!this.f30110L && m32329k() <= this.f30109K) {
            return -9223372036854775807L;
        }
        this.f30100B = false;
        return this.f30106H;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public ke1 mo65314m() {
        return m32319a(new C12301f(0, true));
    }

    /* renamed from: q */
    public void mo65315q() {
        if (this.f30133w) {
            for (C12306k j : this.f30130t) {
                j.mo65352j();
            }
        }
        this.f30121k.mo68698a((mj0.C13987f) this);
        this.f30126p.removeCallbacksAndMessages((Object) null);
        this.f30127q = null;
        this.f30111M = true;
        this.f30116f.mo65297b();
    }

    /* renamed from: b */
    public boolean mo65262b(long j) {
        if (this.f30110L || this.f30121k.mo68700c() || this.f30108J) {
            return false;
        }
        if (this.f30133w && this.f30102D == 0) {
            return false;
        }
        boolean d = this.f30123m.mo66584d();
        if (this.f30121k.mo68701d()) {
            return d;
        }
        m32334r();
        return true;
    }

    /* renamed from: c */
    public void mo65311c() {
        this.f30132v = true;
        this.f30126p.post(this.f30124n);
    }

    /* renamed from: d */
    public void mo65312d() {
        for (C12306k k : this.f30130t) {
            k.mo65353k();
        }
        this.f30122l.mo65320a();
    }

    /* renamed from: e */
    public long mo65265e() {
        long j;
        C12299d dVar = this.f30134x;
        dVar.getClass();
        boolean[] zArr = dVar.f30155c;
        if (this.f30110L) {
            return Long.MIN_VALUE;
        }
        if (m32331n()) {
            return this.f30107I;
        }
        if (this.f30135y) {
            int length = this.f30130t.length;
            j = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.f30130t[i].mo65350h()) {
                    j = Math.min(j, this.f30130t[i].mo65346c());
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = m32330l();
        }
        return j == Long.MIN_VALUE ? this.f30106H : j;
    }

    /* renamed from: f */
    public void mo65266f() throws IOException {
        this.f30121k.mo68697a(((C14284pk) this.f30115e).mo69373a(this.f30136z));
        if (this.f30110L && !this.f30133w) {
            throw new jy0("Loading finished before preparation is complete.");
        }
    }

    /* renamed from: a */
    public void mo65308a(mj0.C13986e eVar, long j, long j2, boolean z) {
        C12296a aVar = (C12296a) eVar;
        this.f30116f.mo65295a(aVar.f30146j, aVar.f30138b.mo67770d(), aVar.f30138b.mo67771e(), 1, -1, (Format) null, 0, (Object) null, aVar.f30145i, this.f30103E, j, j2, aVar.f30138b.mo67769c());
        if (!z) {
            if (this.f30104F == -1) {
                this.f30104F = aVar.f30147k;
            }
            for (C12306k b : this.f30130t) {
                b.mo65345b(false);
            }
            if (this.f30102D > 0) {
                C12285e.C12286a aVar2 = this.f30127q;
                aVar2.getClass();
                aVar2.mo64929a(this);
            }
        }
    }

    /* renamed from: c */
    private void m32323c(int i) {
        C12299d dVar = this.f30134x;
        dVar.getClass();
        boolean[] zArr = dVar.f30155c;
        if (this.f30108J && zArr[i] && !this.f30130t[i].mo65343a(false)) {
            this.f30107I = 0;
            this.f30108J = false;
            this.f30100B = true;
            this.f30106H = 0;
            this.f30109K = 0;
            for (C12306k b : this.f30130t) {
                b.mo65345b(false);
            }
            C12285e.C12286a aVar = this.f30127q;
            aVar.getClass();
            aVar.mo64929a(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo65313d(int i) throws IOException {
        this.f30130t[i].mo65351i();
        this.f30121k.mo68697a(((C14284pk) this.f30115e).mo69373a(this.f30136z));
    }

    /* renamed from: b */
    public TrackGroupArray mo65261b() {
        C12299d dVar = this.f30134x;
        dVar.getClass();
        return dVar.f30154b;
    }

    /* renamed from: b */
    private void m32321b(int i) {
        C12299d dVar = this.f30134x;
        dVar.getClass();
        boolean[] zArr = dVar.f30157e;
        if (!zArr[i]) {
            Format a = dVar.f30154b.mo65240a(i).mo65232a(0);
            this.f30116f.mo65288a(wn0.m43727d(a.f29530j), a, 0, (Object) null, this.f30106H);
            zArr[i] = true;
        }
    }

    /* renamed from: a */
    public void mo65307a(mj0.C13986e eVar, long j, long j2) {
        s71 s71;
        C12296a aVar = (C12296a) eVar;
        if (this.f30103E == -9223372036854775807L && (s71 = this.f30128r) != null) {
            boolean a = s71.mo64897a();
            long l = m32330l();
            long j3 = l == Long.MIN_VALUE ? 0 : l + TapjoyConstants.TIMER_INCREMENT;
            this.f30103E = j3;
            ((C12302i) this.f30117g).mo65323b(j3, a, this.f30105G);
        }
        this.f30116f.mo65299b(aVar.f30146j, aVar.f30138b.mo67770d(), aVar.f30138b.mo67771e(), 1, -1, (Format) null, 0, (Object) null, aVar.f30145i, this.f30103E, j, j2, aVar.f30138b.mo67769c());
        if (this.f30104F == -1) {
            this.f30104F = aVar.f30147k;
        }
        this.f30110L = true;
        C12285e.C12286a aVar2 = this.f30127q;
        aVar2.getClass();
        aVar2.mo64929a(this);
    }

    /* renamed from: com.yandex.mobile.ads.exo.source.h$b */
    private static final class C12297b {

        /* renamed from: a */
        private final w50[] f30151a;

        /* renamed from: b */
        private w50 f30152b;

        public C12297b(w50[] w50Arr) {
            this.f30151a = w50Arr;
        }

        /* renamed from: a */
        public w50 mo65319a(C13416ik ikVar, x50 x50, Uri uri) throws IOException, InterruptedException {
            w50 w50 = this.f30152b;
            if (w50 != null) {
                return w50;
            }
            w50[] w50Arr = this.f30151a;
            if (w50Arr.length == 1) {
                this.f30152b = w50Arr[0];
            } else {
                int length = w50Arr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    w50 w502 = w50Arr[i];
                    try {
                        if (w502.mo64891a(ikVar)) {
                            this.f30152b = w502;
                            ikVar.mo67812d();
                            break;
                        }
                        ikVar.mo67812d();
                        i++;
                    } catch (EOFException unused) {
                    } catch (Throwable th) {
                        ikVar.mo67812d();
                        throw th;
                    }
                }
                if (this.f30152b == null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the available extractors (");
                    w50[] w50Arr2 = this.f30151a;
                    int i2 = ih1.f34858a;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i3 = 0; i3 < w50Arr2.length; i3++) {
                        sb2.append(w50Arr2[i3].getClass().getSimpleName());
                        if (i3 < w50Arr2.length - 1) {
                            sb2.append(", ");
                        }
                    }
                    sb.append(sb2.toString());
                    sb.append(") could read the stream.");
                    throw new og1(sb.toString(), uri);
                }
            }
            this.f30152b.mo64890a(x50);
            return this.f30152b;
        }

        /* renamed from: a */
        public void mo65320a() {
            w50 w50 = this.f30152b;
            if (w50 != null) {
                w50.release();
                this.f30152b = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0084  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.yandex.mobile.ads.impl.mj0.C13984c mo65305a(com.yandex.mobile.ads.impl.mj0.C13986e r31, long r32, long r34, java.io.IOException r36, int r37) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            com.yandex.mobile.ads.exo.source.h$a r1 = (com.yandex.mobile.ads.exo.source.C12295h.C12296a) r1
            long r2 = r0.f30104F
            r4 = -1
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0014
            long r2 = r1.f30147k
            r0.f30104F = r2
        L_0x0014:
            com.yandex.mobile.ads.impl.hj0 r2 = r0.f30115e
            int r7 = r0.f30136z
            r6 = r2
            com.yandex.mobile.ads.impl.pk r6 = (com.yandex.mobile.ads.impl.C14284pk) r6
            r8 = r34
            r10 = r36
            r11 = r37
            long r2 = r6.mo69374a(r7, r8, r10, r11)
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = 1
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x0032
            com.yandex.mobile.ads.impl.mj0$c r2 = com.yandex.mobile.ads.impl.mj0.f37396e
            goto L_0x0086
        L_0x0032:
            int r9 = r30.m32329k()
            int r10 = r0.f30109K
            r11 = 0
            if (r9 <= r10) goto L_0x003d
            r10 = 1
            goto L_0x003e
        L_0x003d:
            r10 = 0
        L_0x003e:
            long r12 = r0.f30104F
            int r14 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r14 != 0) goto L_0x007a
            com.yandex.mobile.ads.impl.s71 r4 = r0.f30128r
            if (r4 == 0) goto L_0x0051
            long r4 = r4.mo64899c()
            int r12 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r12 == 0) goto L_0x0051
            goto L_0x007a
        L_0x0051:
            boolean r4 = r0.f30133w
            if (r4 == 0) goto L_0x005e
            boolean r4 = r30.m32335s()
            if (r4 != 0) goto L_0x005e
            r0.f30108J = r8
            goto L_0x007d
        L_0x005e:
            boolean r4 = r0.f30133w
            r0.f30100B = r4
            r4 = 0
            r0.f30106H = r4
            r0.f30109K = r11
            com.yandex.mobile.ads.exo.source.k[] r6 = r0.f30130t
            int r7 = r6.length
            r9 = 0
        L_0x006c:
            if (r9 >= r7) goto L_0x0076
            r12 = r6[r9]
            r12.mo65345b((boolean) r11)
            int r9 = r9 + 1
            goto L_0x006c
        L_0x0076:
            com.yandex.mobile.ads.exo.source.C12295h.C12296a.m32365a(r1, r4, r4)
            goto L_0x007c
        L_0x007a:
            r0.f30109K = r9
        L_0x007c:
            r11 = 1
        L_0x007d:
            if (r11 == 0) goto L_0x0084
            com.yandex.mobile.ads.impl.mj0$c r2 = com.yandex.mobile.ads.impl.mj0.m39464a((boolean) r10, (long) r2)
            goto L_0x0086
        L_0x0084:
            com.yandex.mobile.ads.impl.mj0$c r2 = com.yandex.mobile.ads.impl.mj0.f37395d
        L_0x0086:
            com.yandex.mobile.ads.exo.source.g$a r9 = r0.f30116f
            com.yandex.mobile.ads.impl.jj r10 = r1.f30146j
            com.yandex.mobile.ads.impl.ib1 r3 = r1.f30138b
            android.net.Uri r11 = r3.mo67770d()
            com.yandex.mobile.ads.impl.ib1 r3 = r1.f30138b
            java.util.Map r12 = r3.mo67771e()
            long r18 = r1.f30145i
            long r3 = r0.f30103E
            r20 = r3
            com.yandex.mobile.ads.impl.ib1 r1 = r1.f30138b
            long r26 = r1.mo67769c()
            boolean r1 = r2.mo68702a()
            r29 = r1 ^ 1
            r13 = 1
            r14 = -1
            r15 = 0
            r16 = 0
            r17 = 0
            r22 = r32
            r24 = r34
            r28 = r36
            r9.mo65296a(r10, r11, r12, r13, r14, r15, r16, r17, r18, r20, r22, r24, r26, r28, r29)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.source.C12295h.mo65305a(com.yandex.mobile.ads.impl.mj0$e, long, long, java.io.IOException, int):com.yandex.mobile.ads.impl.mj0$c");
    }

    /* renamed from: a */
    public void mo65259a(C12285e.C12286a aVar, long j) {
        this.f30127q = aVar;
        this.f30123m.mo66584d();
        m32334r();
    }

    /* renamed from: a */
    public void mo65258a(long j, boolean z) {
        if (!m32331n()) {
            C12299d dVar = this.f30134x;
            dVar.getClass();
            boolean[] zArr = dVar.f30156d;
            int length = this.f30130t.length;
            for (int i = 0; i < length; i++) {
                this.f30130t[i].mo65338a(j, z, zArr[i]);
            }
        }
    }

    /* renamed from: a */
    public boolean mo65260a() {
        return this.f30121k.mo68701d() && this.f30123m.mo66583c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo65310a(int i) {
        return !m32335s() && this.f30130t[i].mo65343a(this.f30110L);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo65303a(int i, q70 q70, C14387qj qjVar, boolean z) {
        if (m32335s()) {
            return -3;
        }
        m32321b(i);
        int a = this.f30130t[i].mo65336a(q70, qjVar, z, this.f30110L, this.f30106H);
        if (a == -3) {
            m32323c(i);
        }
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo65302a(int i, long j) {
        int i2;
        if (m32335s()) {
            return 0;
        }
        m32321b(i);
        C12306k kVar = this.f30130t[i];
        if (!this.f30110L || j <= kVar.mo65346c()) {
            i2 = kVar.mo65334a(j);
        } else {
            i2 = kVar.mo65333a();
        }
        if (i2 == 0) {
            m32323c(i);
        }
        return i2;
    }

    /* renamed from: a */
    public ke1 mo65304a(int i, int i2) {
        return m32319a(new C12301f(i, false));
    }

    /* renamed from: a */
    public void mo65309a(s71 s71) {
        if (this.f30129s != null) {
            s71 = new s71.C14567b(-9223372036854775807L, 0);
        }
        this.f30128r = s71;
        this.f30126p.post(this.f30124n);
    }

    /* renamed from: a */
    public void mo65306a(Format format) {
        this.f30126p.post(this.f30124n);
    }

    /* renamed from: a */
    private ke1 m32319a(C12301f fVar) {
        int length = this.f30130t.length;
        for (int i = 0; i < length; i++) {
            if (fVar.equals(this.f30131u[i])) {
                return this.f30130t[i];
            }
        }
        C12306k kVar = new C12306k(this.f30118h, this.f30126p.getLooper(), this.f30114d);
        kVar.mo65340a((C12306k.C12308b) this);
        int i2 = length + 1;
        C12301f[] fVarArr = (C12301f[]) Arrays.copyOf(this.f30131u, i2);
        fVarArr[length] = fVar;
        int i3 = ih1.f34858a;
        this.f30131u = fVarArr;
        C12306k[] kVarArr = (C12306k[]) Arrays.copyOf(this.f30130t, i2);
        kVarArr[length] = kVar;
        this.f30130t = kVarArr;
        return kVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007c, code lost:
        if (java.lang.Math.abs(r8 - r0) <= java.lang.Math.abs(r4 - r0)) goto L_0x0081;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long mo65256a(long r21, com.yandex.mobile.ads.impl.t71 r23) {
        /*
            r20 = this;
            r0 = r21
            r2 = r20
            r3 = r23
            com.yandex.mobile.ads.exo.source.h$d r4 = r2.f30134x
            r4.getClass()
            com.yandex.mobile.ads.impl.s71 r4 = r4.f30153a
            boolean r5 = r4.mo64897a()
            r6 = 0
            if (r5 != 0) goto L_0x0016
            return r6
        L_0x0016:
            com.yandex.mobile.ads.impl.s71$a r4 = r4.mo64898b(r0)
            com.yandex.mobile.ads.impl.u71 r5 = r4.f39865a
            long r8 = r5.f40582a
            com.yandex.mobile.ads.impl.u71 r4 = r4.f39866b
            long r4 = r4.f40582a
            com.yandex.mobile.ads.impl.t71 r10 = com.yandex.mobile.ads.impl.t71.f40257c
            boolean r10 = r10.equals(r3)
            if (r10 == 0) goto L_0x002c
            r12 = r0
            goto L_0x0086
        L_0x002c:
            long r10 = r3.f40259a
            r12 = -9223372036854775808
            long r14 = r0 - r10
            long r10 = r10 ^ r0
            long r16 = r0 ^ r14
            long r10 = r10 & r16
            int r16 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r16 >= 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r12 = r14
        L_0x003d:
            long r10 = r3.f40260b
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r16 = r0 + r10
            long r18 = r0 ^ r16
            long r10 = r10 ^ r16
            long r10 = r18 & r10
            int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r3 >= 0) goto L_0x0051
            goto L_0x0053
        L_0x0051:
            r14 = r16
        L_0x0053:
            r3 = 1
            r6 = 0
            int r7 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r7 > 0) goto L_0x005f
            int r7 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r7 > 0) goto L_0x005f
            r7 = 1
            goto L_0x0060
        L_0x005f:
            r7 = 0
        L_0x0060:
            int r10 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r10 > 0) goto L_0x0069
            int r10 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            if (r10 > 0) goto L_0x0069
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r7 == 0) goto L_0x007f
            if (r3 == 0) goto L_0x007f
            long r6 = r8 - r0
            long r6 = java.lang.Math.abs(r6)
            long r0 = r4 - r0
            long r0 = java.lang.Math.abs(r0)
            int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x0085
            goto L_0x0081
        L_0x007f:
            if (r7 == 0) goto L_0x0083
        L_0x0081:
            r12 = r8
            goto L_0x0086
        L_0x0083:
            if (r3 == 0) goto L_0x0086
        L_0x0085:
            r12 = r4
        L_0x0086:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.exo.source.C12295h.mo65256a(long, com.yandex.mobile.ads.impl.t71):long");
    }

    /* renamed from: a */
    public long mo65255a(long j) {
        boolean z;
        C12299d dVar = this.f30134x;
        dVar.getClass();
        s71 s71 = dVar.f30153a;
        boolean[] zArr = dVar.f30155c;
        if (!s71.mo64897a()) {
            j = 0;
        }
        this.f30100B = false;
        this.f30106H = j;
        if (m32331n()) {
            this.f30107I = j;
            return j;
        }
        if (this.f30136z != 7) {
            int length = this.f30130t.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                } else if (this.f30130t[i].mo65342a(j, false) || (!zArr[i] && this.f30135y)) {
                    i++;
                }
            }
            z = false;
            if (z) {
                return j;
            }
        }
        this.f30108J = false;
        this.f30107I = j;
        this.f30110L = false;
        if (this.f30121k.mo68701d()) {
            this.f30121k.mo68696a();
        } else {
            this.f30121k.mo68699b();
            for (C12306k b : this.f30130t) {
                b.mo65345b(false);
            }
        }
        return j;
    }

    /* renamed from: a */
    public long mo65257a(C12330d[] dVarArr, boolean[] zArr, C12309l[] lVarArr, boolean[] zArr2, long j) {
        C12299d dVar = this.f30134x;
        dVar.getClass();
        TrackGroupArray trackGroupArray = dVar.f30154b;
        boolean[] zArr3 = dVar.f30156d;
        int i = this.f30102D;
        int i2 = 0;
        for (int i3 = 0; i3 < dVarArr.length; i3++) {
            if (lVarArr[i3] != null && (dVarArr[i3] == null || !zArr[i3])) {
                int a = lVarArr[i3].f30158a;
                C13479j9.m37708b(zArr3[a]);
                this.f30102D--;
                zArr3[a] = false;
                lVarArr[i3] = null;
            }
        }
        boolean z = !this.f30099A ? j != 0 : i == 0;
        for (int i4 = 0; i4 < dVarArr.length; i4++) {
            if (lVarArr[i4] == null && dVarArr[i4] != null) {
                C12330d dVar2 = dVarArr[i4];
                C13479j9.m37708b(dVar2.mo65390d() == 1);
                C13479j9.m37708b(dVar2.mo65388b(0) == 0);
                int a2 = trackGroupArray.mo65239a(dVar2.mo65387a());
                C13479j9.m37708b(!zArr3[a2]);
                this.f30102D++;
                zArr3[a2] = true;
                lVarArr[i4] = new C12300e(a2);
                zArr2[i4] = true;
                if (!z) {
                    C12306k kVar = this.f30130t[a2];
                    z = !kVar.mo65342a(j, true) && kVar.mo65347d() != 0;
                }
            }
        }
        if (this.f30102D == 0) {
            this.f30108J = false;
            this.f30100B = false;
            if (this.f30121k.mo68701d()) {
                C12306k[] kVarArr = this.f30130t;
                int length = kVarArr.length;
                while (i2 < length) {
                    kVarArr[i2].mo65344b();
                    i2++;
                }
                this.f30121k.mo68696a();
            } else {
                for (C12306k b : this.f30130t) {
                    b.mo65345b(false);
                }
            }
        } else if (z) {
            j = mo65255a(j);
            while (i2 < lVarArr.length) {
                if (lVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.f30099A = true;
        return j;
    }
}
