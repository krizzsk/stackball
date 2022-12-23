package com.yandex.mobile.ads.impl;

import com.appsflyer.internal.referrer.Payload;
import com.facebook.share.internal.ShareConstants;
import com.google.common.net.HttpHeaders;
import com.yandex.mobile.ads.impl.q90;
import java.io.Closeable;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class b51 implements Closeable {

    /* renamed from: b */
    private final m41 f31227b;

    /* renamed from: c */
    private final w11 f31228c;

    /* renamed from: d */
    private final String f31229d;

    /* renamed from: e */
    private final int f31230e;

    /* renamed from: f */
    private final m90 f31231f;

    /* renamed from: g */
    private final q90 f31232g;

    /* renamed from: h */
    private final e51 f31233h;

    /* renamed from: i */
    private final b51 f31234i;

    /* renamed from: j */
    private final b51 f31235j;

    /* renamed from: k */
    private final b51 f31236k;

    /* renamed from: l */
    private final long f31237l;

    /* renamed from: m */
    private final long f31238m;

    /* renamed from: n */
    private final d40 f31239n;

    /* renamed from: o */
    private C13191gd f31240o;

    /* renamed from: com.yandex.mobile.ads.impl.b51$a */
    public static class C12571a {

        /* renamed from: a */
        private m41 f31241a;

        /* renamed from: b */
        private w11 f31242b;

        /* renamed from: c */
        private int f31243c;

        /* renamed from: d */
        private String f31244d;

        /* renamed from: e */
        private m90 f31245e;

        /* renamed from: f */
        private q90.C14366a f31246f;

        /* renamed from: g */
        private e51 f31247g;

        /* renamed from: h */
        private b51 f31248h;

        /* renamed from: i */
        private b51 f31249i;

        /* renamed from: j */
        private b51 f31250j;

        /* renamed from: k */
        private long f31251k;

        /* renamed from: l */
        private long f31252l;

        /* renamed from: m */
        private d40 f31253m;

        public C12571a() {
            this.f31243c = -1;
            this.f31246f = new q90.C14366a();
        }

        /* renamed from: a */
        public C12571a mo65995a(m41 m41) {
            Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
            this.f31241a = m41;
            return this;
        }

        /* renamed from: b */
        public final int mo66003b() {
            return this.f31243c;
        }

        /* renamed from: c */
        public C12571a mo66007c(b51 b51) {
            if (b51.mo65974b() == null) {
                this.f31250j = b51;
                return this;
            }
            throw new IllegalArgumentException("priorResponse.body != null".toString());
        }

        /* renamed from: a */
        public C12571a mo65998a(w11 w11) {
            Intrinsics.checkNotNullParameter(w11, "protocol");
            this.f31242b = w11;
            return this;
        }

        /* renamed from: b */
        public C12571a mo66006b(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            q90.C14366a aVar = this.f31246f;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            q90.C14367b bVar = q90.f39028c;
            bVar.m41125a(str);
            bVar.m41126a(str2, str);
            aVar.mo69518a(str);
            aVar.mo69519a(str, str2);
            return this;
        }

        /* renamed from: a */
        public C12571a mo65991a(int i) {
            this.f31243c = i;
            return this;
        }

        /* renamed from: a */
        public C12571a mo65999a(String str) {
            Intrinsics.checkNotNullParameter(str, "message");
            this.f31244d = str;
            return this;
        }

        /* renamed from: a */
        public C12571a mo65996a(m90 m90) {
            this.f31245e = m90;
            return this;
        }

        /* renamed from: a */
        public C12571a mo66000a(String str, String str2) {
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            q90.C14366a aVar = this.f31246f;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(str, "name");
            Intrinsics.checkNotNullParameter(str2, "value");
            q90.C14367b bVar = q90.f39028c;
            bVar.m41125a(str);
            bVar.m41126a(str2, str);
            aVar.mo69519a(str, str2);
            return this;
        }

        public C12571a(b51 b51) {
            Intrinsics.checkNotNullParameter(b51, Payload.RESPONSE);
            this.f31243c = -1;
            this.f31241a = b51.mo65988o();
            this.f31242b = b51.mo65986m();
            this.f31243c = b51.mo65979f();
            this.f31244d = b51.mo65983j();
            this.f31245e = b51.mo65981h();
            this.f31246f = b51.mo65982i().mo69508a();
            this.f31247g = b51.mo65974b();
            this.f31248h = b51.mo65984k();
            this.f31249i = b51.mo65977d();
            this.f31250j = b51.mo65985l();
            this.f31251k = b51.mo65989p();
            this.f31252l = b51.mo65987n();
            this.f31253m = b51.mo65980g();
        }

        /* renamed from: a */
        public C12571a mo65994a(e51 e51) {
            this.f31247g = e51;
            return this;
        }

        /* renamed from: a */
        public C12571a mo65992a(long j) {
            this.f31252l = j;
            return this;
        }

        /* renamed from: a */
        public C12571a mo65997a(q90 q90) {
            Intrinsics.checkNotNullParameter(q90, "headers");
            q90.C14366a a = q90.mo69508a();
            Intrinsics.checkNotNullParameter(a, "<set-?>");
            this.f31246f = a;
            return this;
        }

        /* renamed from: b */
        public C12571a mo66004b(long j) {
            this.f31251k = j;
            return this;
        }

        /* renamed from: b */
        public C12571a mo66005b(b51 b51) {
            m34155a("networkResponse", b51);
            this.f31248h = b51;
            return this;
        }

        /* renamed from: a */
        public C12571a mo65993a(b51 b51) {
            m34155a("cacheResponse", b51);
            this.f31249i = b51;
            return this;
        }

        /* renamed from: a */
        private final void m34155a(String str, b51 b51) {
            if (b51 != null) {
                boolean z = true;
                if (b51.mo65974b() == null) {
                    if (b51.mo65984k() == null) {
                        if (b51.mo65977d() == null) {
                            if (b51.mo65985l() != null) {
                                z = false;
                            }
                            if (!z) {
                                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".priorResponse != null").toString());
                            }
                            return;
                        }
                        throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".cacheResponse != null").toString());
                    }
                    throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".networkResponse != null").toString());
                }
                throw new IllegalArgumentException(Intrinsics.stringPlus(str, ".body != null").toString());
            }
        }

        /* renamed from: a */
        public final void mo66002a(d40 d40) {
            Intrinsics.checkNotNullParameter(d40, "deferredTrailers");
            this.f31253m = d40;
        }

        /* renamed from: a */
        public b51 mo66001a() {
            int i = this.f31243c;
            if (i >= 0) {
                m41 m41 = this.f31241a;
                if (m41 != null) {
                    w11 w11 = this.f31242b;
                    if (w11 != null) {
                        String str = this.f31244d;
                        if (str != null) {
                            return new b51(m41, w11, str, i, this.f31245e, this.f31246f.mo69520a(), this.f31247g, this.f31248h, this.f31249i, this.f31250j, this.f31251k, this.f31252l, this.f31253m);
                        }
                        throw new IllegalStateException("message == null".toString());
                    }
                    throw new IllegalStateException("protocol == null".toString());
                }
                throw new IllegalStateException("request == null".toString());
            }
            throw new IllegalStateException(Intrinsics.stringPlus("code < 0: ", Integer.valueOf(i)).toString());
        }
    }

    public b51(m41 m41, w11 w11, String str, int i, m90 m90, q90 q90, e51 e51, b51 b51, b51 b512, b51 b513, long j, long j2, d40 d40) {
        Intrinsics.checkNotNullParameter(m41, ShareConstants.WEB_DIALOG_RESULT_PARAM_REQUEST_ID);
        Intrinsics.checkNotNullParameter(w11, "protocol");
        Intrinsics.checkNotNullParameter(str, "message");
        Intrinsics.checkNotNullParameter(q90, "headers");
        this.f31227b = m41;
        this.f31228c = w11;
        this.f31229d = str;
        this.f31230e = i;
        this.f31231f = m90;
        this.f31232g = q90;
        this.f31233h = e51;
        this.f31234i = b51;
        this.f31235j = b512;
        this.f31236k = b513;
        this.f31237l = j;
        this.f31238m = j2;
        this.f31239n = d40;
    }

    /* renamed from: a */
    public static String m34138a(b51 b51, String str, String str2, int i) {
        b51.getClass();
        Intrinsics.checkNotNullParameter(str, "name");
        String a = b51.f31232g.mo69510a(str);
        if (a == null) {
            return null;
        }
        return a;
    }

    /* renamed from: a */
    public final String mo65973a(String str) {
        Intrinsics.checkNotNullParameter(str, "name");
        return m34138a(this, str, (String) null, 2);
    }

    /* renamed from: b */
    public final e51 mo65974b() {
        return this.f31233h;
    }

    /* renamed from: c */
    public final C13191gd mo65975c() {
        C13191gd gdVar = this.f31240o;
        if (gdVar != null) {
            return gdVar;
        }
        C13191gd a = C13191gd.f33938n.mo67251a(this.f31232g);
        this.f31240o = a;
        return a;
    }

    public void close() {
        e51 e51 = this.f31233h;
        if (e51 != null) {
            jh1.m37826a((Closeable) e51.mo66402c());
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed".toString());
    }

    /* renamed from: d */
    public final b51 mo65977d() {
        return this.f31235j;
    }

    /* renamed from: e */
    public final List<C14753ue> mo65978e() {
        String str;
        q90 q90 = this.f31232g;
        int i = this.f31230e;
        if (i == 401) {
            str = HttpHeaders.WWW_AUTHENTICATE;
        } else if (i != 407) {
            return CollectionsKt.emptyList();
        } else {
            str = HttpHeaders.PROXY_AUTHENTICATE;
        }
        return yb0.m44240a(q90, str);
    }

    /* renamed from: f */
    public final int mo65979f() {
        return this.f31230e;
    }

    /* renamed from: g */
    public final d40 mo65980g() {
        return this.f31239n;
    }

    /* renamed from: h */
    public final m90 mo65981h() {
        return this.f31231f;
    }

    /* renamed from: i */
    public final q90 mo65982i() {
        return this.f31232g;
    }

    /* renamed from: j */
    public final String mo65983j() {
        return this.f31229d;
    }

    /* renamed from: k */
    public final b51 mo65984k() {
        return this.f31234i;
    }

    /* renamed from: l */
    public final b51 mo65985l() {
        return this.f31236k;
    }

    /* renamed from: m */
    public final w11 mo65986m() {
        return this.f31228c;
    }

    /* renamed from: n */
    public final long mo65987n() {
        return this.f31238m;
    }

    /* renamed from: o */
    public final m41 mo65988o() {
        return this.f31227b;
    }

    /* renamed from: p */
    public final long mo65989p() {
        return this.f31237l;
    }

    public String toString() {
        return "Response{protocol=" + this.f31228c + ", code=" + this.f31230e + ", message=" + this.f31229d + ", url=" + this.f31227b.mo68568g() + '}';
    }
}
