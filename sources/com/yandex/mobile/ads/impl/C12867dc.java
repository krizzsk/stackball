package com.yandex.mobile.ads.impl;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.yandex.mobile.ads.impl.s71;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.dc */
public abstract class C12867dc {

    /* renamed from: a */
    protected final C12868a f32510a;

    /* renamed from: b */
    protected final C12873f f32511b;

    /* renamed from: c */
    protected C12870c f32512c;

    /* renamed from: d */
    private final int f32513d;

    /* renamed from: com.yandex.mobile.ads.impl.dc$a */
    public static class C12868a implements s71 {

        /* renamed from: a */
        private final C12871d f32514a;

        /* renamed from: b */
        private final long f32515b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f32516c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public final long f32517d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final long f32518e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final long f32519f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final long f32520g;

        public C12868a(C12871d dVar, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f32514a = dVar;
            this.f32515b = j;
            this.f32516c = j2;
            this.f32517d = j3;
            this.f32518e = j4;
            this.f32519f = j5;
            this.f32520g = j6;
        }

        /* renamed from: a */
        public boolean mo64897a() {
            return true;
        }

        /* renamed from: b */
        public s71.C14566a mo64898b(long j) {
            u71 u71 = new u71(j, C12870c.m35188a(this.f32514a.mo65486a(j), this.f32516c, this.f32517d, this.f32518e, this.f32519f, this.f32520g));
            return new s71.C14566a(u71, u71);
        }

        /* renamed from: c */
        public long mo64899c() {
            return this.f32515b;
        }

        /* renamed from: c */
        public long mo66552c(long j) {
            return this.f32514a.mo65486a(j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dc$b */
    public static final class C12869b implements C12871d {
        /* renamed from: a */
        public long mo65486a(long j) {
            return j;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dc$c */
    protected static class C12870c {

        /* renamed from: a */
        private final long f32521a;

        /* renamed from: b */
        private final long f32522b;

        /* renamed from: c */
        private final long f32523c;

        /* renamed from: d */
        private long f32524d;

        /* renamed from: e */
        private long f32525e;

        /* renamed from: f */
        private long f32526f;

        /* renamed from: g */
        private long f32527g;

        /* renamed from: h */
        private long f32528h;

        protected C12870c(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f32521a = j;
            this.f32522b = j2;
            this.f32524d = j3;
            this.f32525e = j4;
            this.f32526f = j5;
            this.f32527g = j6;
            this.f32523c = j7;
            this.f32528h = m35188a(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: a */
        protected static long m35188a(long j, long j2, long j3, long j4, long j5, long j6) {
            long j7 = j4;
            if (j7 + 1 >= j5 || j2 + 1 >= j3) {
                return j7;
            }
            long j8 = (long) (((float) (j - j2)) * (((float) (j5 - j7)) / ((float) (j3 - j2))));
            long j9 = j8 / 20;
            int i = ih1.f34858a;
            return Math.max(j7, Math.min(((j8 + j7) - j6) - j9, j5 - 1));
        }

        /* renamed from: b */
        static long m35191b(C12870c cVar) {
            return cVar.f32526f;
        }

        /* renamed from: c */
        static long m35193c(C12870c cVar) {
            return cVar.f32527g;
        }

        /* renamed from: d */
        static long m35194d(C12870c cVar) {
            return cVar.f32528h;
        }

        /* renamed from: e */
        static long m35195e(C12870c cVar) {
            return cVar.f32522b;
        }

        /* renamed from: b */
        static void m35192b(C12870c cVar, long j, long j2) {
            C12870c cVar2 = cVar;
            long j3 = j;
            cVar2.f32524d = j3;
            long j4 = j2;
            cVar2.f32526f = j4;
            cVar2.f32528h = m35188a(cVar2.f32522b, j3, cVar2.f32525e, j4, cVar2.f32527g, cVar2.f32523c);
        }

        /* renamed from: a */
        static long m35189a(C12870c cVar) {
            return cVar.f32521a;
        }

        /* renamed from: a */
        static void m35190a(C12870c cVar, long j, long j2) {
            C12870c cVar2 = cVar;
            long j3 = j;
            cVar2.f32525e = j3;
            long j4 = j2;
            cVar2.f32527g = j4;
            cVar2.f32528h = m35188a(cVar2.f32522b, cVar2.f32524d, j3, cVar2.f32526f, j4, cVar2.f32523c);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dc$d */
    protected interface C12871d {
        /* renamed from: a */
        long mo65486a(long j);
    }

    /* renamed from: com.yandex.mobile.ads.impl.dc$e */
    public static final class C12872e {

        /* renamed from: d */
        public static final C12872e f32529d = new C12872e(-3, -9223372036854775807L, -1);
        /* access modifiers changed from: private */

        /* renamed from: a */
        public final int f32530a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public final long f32531b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public final long f32532c;

        private C12872e(int i, long j, long j2) {
            this.f32530a = i;
            this.f32531b = j;
            this.f32532c = j2;
        }

        /* renamed from: a */
        public static C12872e m35199a(long j, long j2) {
            return new C12872e(-1, j, j2);
        }

        /* renamed from: b */
        public static C12872e m35201b(long j, long j2) {
            return new C12872e(-2, j, j2);
        }

        /* renamed from: a */
        public static C12872e m35198a(long j) {
            return new C12872e(0, -9223372036854775807L, j);
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.dc$f */
    protected interface C12873f {

        /* renamed from: com.yandex.mobile.ads.impl.dc$f$-CC  reason: invalid class name */
        public final /* synthetic */ class CC {
            public static void $default$a(C12873f fVar) {
            }
        }

        /* renamed from: a */
        C12872e mo66553a(C13416ik ikVar, long j) throws IOException, InterruptedException;

        /* renamed from: a */
        void mo66554a();
    }

    protected C12867dc(C12871d dVar, C12873f fVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f32511b = fVar;
        this.f32513d = i;
        this.f32510a = new C12868a(dVar, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    public final s71 mo66547a() {
        return this.f32510a;
    }

    /* renamed from: b */
    public final boolean mo66551b() {
        return this.f32512c != null;
    }

    /* renamed from: a */
    public final void mo66548a(long j) {
        long j2 = j;
        C12870c cVar = this.f32512c;
        if (cVar == null || C12870c.m35189a(cVar) != j2) {
            C12870c cVar2 = r1;
            C12870c cVar3 = new C12870c(j, this.f32510a.mo66552c(j2), this.f32510a.f32516c, this.f32510a.f32517d, this.f32510a.f32518e, this.f32510a.f32519f, this.f32510a.f32520g);
            this.f32512c = cVar2;
        }
    }

    /* renamed from: a */
    public int mo66546a(C13416ik ikVar, r01 r01) throws InterruptedException, IOException {
        C12873f fVar = this.f32511b;
        fVar.getClass();
        while (true) {
            C12870c cVar = this.f32512c;
            cVar.getClass();
            long b = C12870c.m35191b(cVar);
            long c = C12870c.m35193c(cVar);
            long d = C12870c.m35194d(cVar);
            if (c - b <= ((long) this.f32513d)) {
                mo66549a(false, b);
                return mo66545a(ikVar, b, r01);
            } else if (!mo66550a(ikVar, d)) {
                return mo66545a(ikVar, d, r01);
            } else {
                ikVar.mo67812d();
                C12872e a = fVar.mo66553a(ikVar, C12870c.m35195e(cVar));
                int a2 = a.f32530a;
                if (a2 == -3) {
                    mo66549a(false, d);
                    return mo66545a(ikVar, d, r01);
                } else if (a2 == -2) {
                    C12870c.m35192b(cVar, a.f32531b, a.f32532c);
                } else if (a2 == -1) {
                    C12870c.m35190a(cVar, a.f32531b, a.f32532c);
                } else if (a2 == 0) {
                    mo66549a(true, a.f32532c);
                    mo66550a(ikVar, a.f32532c);
                    return mo66545a(ikVar, a.f32532c, r01);
                } else {
                    throw new IllegalStateException("Invalid case");
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo66549a(boolean z, long j) {
        this.f32512c = null;
        this.f32511b.mo66554a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo66550a(C13416ik ikVar, long j) throws IOException, InterruptedException {
        long c = j - ikVar.mo67811c();
        if (c < 0 || c > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ikVar.mo67813d((int) c);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo66545a(C13416ik ikVar, long j, r01 r01) {
        if (j == ikVar.mo67811c()) {
            return 0;
        }
        r01.f39340a = j;
        return 1;
    }
}
