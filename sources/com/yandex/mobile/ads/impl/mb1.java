package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.exo.Format;
import com.yandex.mobile.ads.impl.ke1;
import com.yandex.mobile.ads.impl.s71;
import java.io.IOException;

abstract class mb1 {

    /* renamed from: a */
    private final dw0 f37288a = new dw0();

    /* renamed from: b */
    private ke1 f37289b;

    /* renamed from: c */
    private x50 f37290c;

    /* renamed from: d */
    private fw0 f37291d;

    /* renamed from: e */
    private long f37292e;

    /* renamed from: f */
    private long f37293f;

    /* renamed from: g */
    private long f37294g;

    /* renamed from: h */
    private int f37295h;

    /* renamed from: i */
    private int f37296i;

    /* renamed from: j */
    private C13968b f37297j;

    /* renamed from: k */
    private long f37298k;

    /* renamed from: l */
    private boolean f37299l;

    /* renamed from: m */
    private boolean f37300m;

    /* renamed from: com.yandex.mobile.ads.impl.mb1$b */
    static class C13968b {

        /* renamed from: a */
        Format f37301a;

        /* renamed from: b */
        fw0 f37302b;

        C13968b() {
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.mb1$c */
    private static final class C13969c implements fw0 {
        private C13969c() {
        }

        /* renamed from: a */
        public long mo67092a(C13416ik ikVar) {
            return -1;
        }

        /* renamed from: a */
        public s71 mo67093a() {
            return new s71.C14567b(-9223372036854775807L, 0);
        }

        /* renamed from: a */
        public void mo67094a(long j) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract long mo67361a(fy0 fy0);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo68643a(x50 x50, ke1 ke1) {
        this.f37290c = x50;
        this.f37289b = ke1;
        mo67362a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo67363a(fy0 fy0, long j, C13968b bVar) throws IOException, InterruptedException;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public long mo68644b(long j) {
        return (((long) this.f37296i) * j) / 1000000;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo68645c(long j) {
        this.f37294g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo67362a(boolean z) {
        if (z) {
            this.f37297j = new C13968b();
            this.f37293f = 0;
            this.f37295h = 0;
        } else {
            this.f37295h = 1;
        }
        this.f37292e = -1;
        this.f37294g = 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo68642a(long j, long j2) {
        this.f37288a.mo66709c();
        if (j == 0) {
            mo67362a(!this.f37299l);
        } else if (this.f37295h != 0) {
            long j3 = (((long) this.f37296i) * j2) / 1000000;
            this.f37292e = j3;
            this.f37291d.mo67094a(j3);
            this.f37295h = 2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo68640a(C13416ik ikVar, r01 r01) throws IOException, InterruptedException {
        C13416ik ikVar2 = ikVar;
        int i = this.f37295h;
        if (i == 0) {
            boolean z = true;
            while (z) {
                if (!this.f37288a.mo66707a(ikVar2)) {
                    this.f37295h = 3;
                    return -1;
                }
                this.f37298k = ikVar.mo67811c() - this.f37293f;
                z = mo67363a(this.f37288a.mo66708b(), this.f37293f, this.f37297j);
                if (z) {
                    this.f37293f = ikVar.mo67811c();
                }
            }
            Format format = this.f37297j.f37301a;
            this.f37296i = format.f29544x;
            if (!this.f37300m) {
                this.f37289b.mo65339a(format);
                this.f37300m = true;
            }
            fw0 fw0 = this.f37297j.f37302b;
            if (fw0 != null) {
                this.f37291d = fw0;
            } else if (ikVar.mo67804a() == -1) {
                this.f37291d = new C13969c();
            } else {
                ew0 a = this.f37288a.mo66706a();
                this.f37291d = new C14390qk(this, this.f37293f, ikVar.mo67804a(), (long) (a.f33169d + a.f33170e), a.f33167b, (a.f33166a & 4) != 0);
            }
            this.f37297j = null;
            this.f37295h = 2;
            this.f37288a.mo66710d();
            return 0;
        } else if (i == 1) {
            ikVar2.mo67813d((int) this.f37293f);
            this.f37295h = 2;
            return 0;
        } else if (i == 2) {
            long a2 = this.f37291d.mo67092a(ikVar2);
            if (a2 >= 0) {
                r01.f39340a = a2;
                return 1;
            }
            if (a2 < -1) {
                mo68645c(-(a2 + 2));
            }
            if (!this.f37299l) {
                this.f37290c.mo65309a(this.f37291d.mo67093a());
                this.f37299l = true;
            }
            if (this.f37298k > 0 || this.f37288a.mo66707a(ikVar2)) {
                this.f37298k = 0;
                fy0 b = this.f37288a.mo66708b();
                long a3 = mo67361a(b);
                if (a3 >= 0) {
                    long j = this.f37294g;
                    if (j + a3 >= this.f37292e) {
                        long j2 = (j * 1000000) / ((long) this.f37296i);
                        this.f37289b.mo65341a(b, b.mo67107c());
                        this.f37289b.mo65337a(j2, 1, b.mo67107c(), 0, (ke1.C13702a) null);
                        this.f37292e = -1;
                    }
                }
                this.f37294g += a3;
                return 0;
            }
            this.f37295h = 3;
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public long mo68641a(long j) {
        return (j * 1000000) / ((long) this.f37296i);
    }
}
