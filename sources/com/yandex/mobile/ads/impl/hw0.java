package com.yandex.mobile.ads.impl;

import android.support.p003v4.media.session.PlaybackStateCompat;
import com.yandex.mobile.ads.impl.C14587se;
import com.yandex.mobile.ads.impl.b40;
import com.yandex.mobile.ads.impl.lz0;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public class hw0 implements Cloneable {

    /* renamed from: A */
    public static final C13356b f34583A = new C13356b((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: B */
    public static final List<w11> f34584B = jh1.m37823a((T[]) new w11[]{w11.HTTP_2, w11.HTTP_1_1});
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final List<C13500jh> f34585C = jh1.m37823a((T[]) new C13500jh[]{C13500jh.f35295e, C13500jh.f35296f});

    /* renamed from: b */
    private final C14768ul f34586b;

    /* renamed from: c */
    private final C13322hh f34587c;

    /* renamed from: d */
    private final List<jh0> f34588d;

    /* renamed from: e */
    private final List<jh0> f34589e;

    /* renamed from: f */
    private final b40.C12569b f34590f;

    /* renamed from: g */
    private final boolean f34591g;

    /* renamed from: h */
    private final C14174oa f34592h;

    /* renamed from: i */
    private final boolean f34593i;

    /* renamed from: j */
    private final boolean f34594j;

    /* renamed from: k */
    private final C12979ei f34595k;

    /* renamed from: l */
    private final a20 f34596l;

    /* renamed from: m */
    private final ProxySelector f34597m;

    /* renamed from: n */
    private final C14174oa f34598n;

    /* renamed from: o */
    private final SocketFactory f34599o;

    /* renamed from: p */
    private final SSLSocketFactory f34600p;

    /* renamed from: q */
    private final X509TrustManager f34601q;

    /* renamed from: r */
    private final List<C13500jh> f34602r;

    /* renamed from: s */
    private final List<w11> f34603s;

    /* renamed from: t */
    private final HostnameVerifier f34604t;

    /* renamed from: u */
    private final C14669te f34605u;

    /* renamed from: v */
    private final C14587se f34606v;

    /* renamed from: w */
    private final int f34607w;

    /* renamed from: x */
    private final int f34608x;

    /* renamed from: y */
    private final int f34609y;

    /* renamed from: z */
    private final l61 f34610z;

    /* renamed from: com.yandex.mobile.ads.impl.hw0$a */
    public static final class C13355a {

        /* renamed from: a */
        private C14768ul f34611a = new C14768ul();

        /* renamed from: b */
        private C13322hh f34612b = new C13322hh();

        /* renamed from: c */
        private final List<jh0> f34613c = new ArrayList();

        /* renamed from: d */
        private final List<jh0> f34614d = new ArrayList();

        /* renamed from: e */
        private b40.C12569b f34615e = jh1.m37816a(b40.f31222a);

        /* renamed from: f */
        private boolean f34616f = true;

        /* renamed from: g */
        private C14174oa f34617g;

        /* renamed from: h */
        private boolean f34618h;

        /* renamed from: i */
        private boolean f34619i;

        /* renamed from: j */
        private C12979ei f34620j;

        /* renamed from: k */
        private a20 f34621k;

        /* renamed from: l */
        private C14174oa f34622l;

        /* renamed from: m */
        private SocketFactory f34623m;

        /* renamed from: n */
        private SSLSocketFactory f34624n;

        /* renamed from: o */
        private X509TrustManager f34625o;

        /* renamed from: p */
        private List<C13500jh> f34626p;

        /* renamed from: q */
        private List<? extends w11> f34627q;

        /* renamed from: r */
        private HostnameVerifier f34628r;

        /* renamed from: s */
        private C14669te f34629s;

        /* renamed from: t */
        private C14587se f34630t;

        /* renamed from: u */
        private int f34631u;

        /* renamed from: v */
        private int f34632v;

        /* renamed from: w */
        private int f34633w;

        /* renamed from: x */
        private long f34634x;

        /* renamed from: y */
        private l61 f34635y;

        public C13355a() {
            C14174oa oaVar = C14174oa.f38130a;
            this.f34617g = oaVar;
            this.f34618h = true;
            this.f34619i = true;
            this.f34620j = C12979ei.f32984a;
            this.f34621k = a20.f30412a;
            this.f34622l = oaVar;
            SocketFactory socketFactory = SocketFactory.getDefault();
            Intrinsics.checkNotNullExpressionValue(socketFactory, "getDefault()");
            this.f34623m = socketFactory;
            C13356b bVar = hw0.f34583A;
            this.f34626p = bVar.mo67696a();
            this.f34627q = bVar.mo67697b();
            this.f34628r = gw0.f34161a;
            this.f34629s = C14669te.f40291d;
            this.f34631u = 10000;
            this.f34632v = 10000;
            this.f34633w = 10000;
            this.f34634x = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
        }

        /* renamed from: a */
        public final C14174oa mo67671a() {
            return this.f34617g;
        }

        /* renamed from: b */
        public final C14587se mo67673b() {
            return this.f34630t;
        }

        /* renamed from: c */
        public final C14669te mo67674c() {
            return this.f34629s;
        }

        /* renamed from: d */
        public final int mo67675d() {
            return this.f34631u;
        }

        /* renamed from: e */
        public final C13322hh mo67676e() {
            return this.f34612b;
        }

        /* renamed from: f */
        public final List<C13500jh> mo67677f() {
            return this.f34626p;
        }

        /* renamed from: g */
        public final C12979ei mo67678g() {
            return this.f34620j;
        }

        /* renamed from: h */
        public final C14768ul mo67679h() {
            return this.f34611a;
        }

        /* renamed from: i */
        public final a20 mo67680i() {
            return this.f34621k;
        }

        /* renamed from: j */
        public final b40.C12569b mo67681j() {
            return this.f34615e;
        }

        /* renamed from: k */
        public final boolean mo67682k() {
            return this.f34618h;
        }

        /* renamed from: l */
        public final boolean mo67683l() {
            return this.f34619i;
        }

        /* renamed from: m */
        public final HostnameVerifier mo67684m() {
            return this.f34628r;
        }

        /* renamed from: n */
        public final List<jh0> mo67685n() {
            return this.f34613c;
        }

        /* renamed from: o */
        public final List<jh0> mo67686o() {
            return this.f34614d;
        }

        /* renamed from: p */
        public final List<w11> mo67687p() {
            return this.f34627q;
        }

        /* renamed from: q */
        public final C14174oa mo67688q() {
            return this.f34622l;
        }

        /* renamed from: r */
        public final int mo67689r() {
            return this.f34632v;
        }

        /* renamed from: s */
        public final boolean mo67690s() {
            return this.f34616f;
        }

        /* renamed from: t */
        public final l61 mo67691t() {
            return this.f34635y;
        }

        /* renamed from: u */
        public final SocketFactory mo67692u() {
            return this.f34623m;
        }

        /* renamed from: v */
        public final SSLSocketFactory mo67693v() {
            return this.f34624n;
        }

        /* renamed from: w */
        public final int mo67694w() {
            return this.f34633w;
        }

        /* renamed from: x */
        public final X509TrustManager mo67695x() {
            return this.f34625o;
        }

        /* renamed from: a */
        public final C13355a mo67670a(boolean z) {
            this.f34618h = z;
            return this;
        }

        /* renamed from: b */
        public final C13355a mo67672b(long j, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "unit");
            this.f34632v = jh1.m37811a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public final C13355a mo67669a(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
            Intrinsics.checkNotNullParameter(sSLSocketFactory, "sslSocketFactory");
            Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
            if (!Intrinsics.areEqual((Object) sSLSocketFactory, (Object) this.f34624n) || !Intrinsics.areEqual((Object) x509TrustManager, (Object) this.f34625o)) {
                this.f34635y = null;
            }
            this.f34624n = sSLSocketFactory;
            Intrinsics.checkNotNullParameter(x509TrustManager, "trustManager");
            lz0.C13944a aVar = lz0.f37135a;
            this.f34630t = lz0.f37136b.mo68532a(x509TrustManager);
            this.f34625o = x509TrustManager;
            return this;
        }

        /* renamed from: a */
        public final C13355a mo67668a(long j, TimeUnit timeUnit) {
            Intrinsics.checkNotNullParameter(timeUnit, "unit");
            this.f34631u = jh1.m37811a("timeout", j, timeUnit);
            return this;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hw0$b */
    public static final class C13356b {
        private C13356b() {
        }

        public /* synthetic */ C13356b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final List<C13500jh> mo67696a() {
            return hw0.f34585C;
        }

        /* renamed from: b */
        public final List<w11> mo67697b() {
            return hw0.f34584B;
        }
    }

    public hw0(C13355a aVar) {
        boolean z;
        Intrinsics.checkNotNullParameter(aVar, "builder");
        this.f34586b = aVar.mo67679h();
        this.f34587c = aVar.mo67676e();
        this.f34588d = jh1.m37835b(aVar.mo67685n());
        this.f34589e = jh1.m37835b(aVar.mo67686o());
        this.f34590f = aVar.mo67681j();
        this.f34591g = aVar.mo67690s();
        this.f34592h = aVar.mo67671a();
        this.f34593i = aVar.mo67682k();
        this.f34594j = aVar.mo67683l();
        this.f34595k = aVar.mo67678g();
        this.f34596l = aVar.mo67680i();
        ProxySelector proxySelector = ProxySelector.getDefault();
        this.f34597m = proxySelector == null ? vv0.f41665a : proxySelector;
        this.f34598n = aVar.mo67688q();
        this.f34599o = aVar.mo67692u();
        List<C13500jh> f = aVar.mo67677f();
        this.f34602r = f;
        this.f34603s = aVar.mo67687p();
        this.f34604t = aVar.mo67684m();
        this.f34607w = aVar.mo67675d();
        this.f34608x = aVar.mo67689r();
        this.f34609y = aVar.mo67694w();
        l61 t = aVar.mo67691t();
        this.f34610z = t == null ? new l61() : t;
        if (!(f instanceof Collection) || !f.isEmpty()) {
            Iterator<T> it = f.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((C13500jh) it.next()).mo67993b()) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z = true;
        if (z) {
            this.f34600p = null;
            this.f34606v = null;
            this.f34601q = null;
            this.f34605u = C14669te.f40291d;
        } else if (aVar.mo67693v() != null) {
            this.f34600p = aVar.mo67693v();
            C14587se b = aVar.mo67673b();
            Intrinsics.checkNotNull(b);
            this.f34606v = b;
            X509TrustManager x = aVar.mo67695x();
            Intrinsics.checkNotNull(x);
            this.f34601q = x;
            C14669te c = aVar.mo67674c();
            Intrinsics.checkNotNull(b);
            this.f34605u = c.mo70159a(b);
        } else {
            lz0.C13944a aVar2 = lz0.f37135a;
            X509TrustManager b2 = aVar2.mo68545a().mo68541b();
            this.f34601q = b2;
            lz0 a = aVar2.mo68545a();
            Intrinsics.checkNotNull(b2);
            this.f34600p = a.mo68543c(b2);
            C14587se.C14588a aVar3 = C14587se.f39939a;
            Intrinsics.checkNotNull(b2);
            C14587se a2 = aVar3.mo69958a(b2);
            this.f34606v = a2;
            C14669te c2 = aVar.mo67674c();
            Intrinsics.checkNotNull(a2);
            this.f34605u = c2.mo70159a(a2);
        }
        m37121y();
    }

    /* renamed from: y */
    private final void m37121y() {
        boolean z;
        boolean z2 = true;
        if (!(!this.f34588d.contains((Object) null))) {
            throw new IllegalStateException(Intrinsics.stringPlus("Null interceptor: ", this.f34588d).toString());
        } else if (!this.f34589e.contains((Object) null)) {
            List<C13500jh> list = this.f34602r;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((C13500jh) it.next()).mo67993b()) {
                            z = false;
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            z = true;
            if (z) {
                if (this.f34600p == null) {
                    if (this.f34606v == null) {
                        if (this.f34601q != null) {
                            z2 = false;
                        }
                        if (!z2) {
                            throw new IllegalStateException("Check failed.".toString());
                        } else if (!Intrinsics.areEqual((Object) this.f34605u, (Object) C14669te.f40291d)) {
                            throw new IllegalStateException("Check failed.".toString());
                        }
                    } else {
                        throw new IllegalStateException("Check failed.".toString());
                    }
                } else {
                    throw new IllegalStateException("Check failed.".toString());
                }
            } else if (this.f34600p == null) {
                throw new IllegalStateException("sslSocketFactory == null".toString());
            } else if (this.f34606v == null) {
                throw new IllegalStateException("certificateChainCleaner == null".toString());
            } else if (this.f34601q == null) {
                throw new IllegalStateException("x509TrustManager == null".toString());
            }
        } else {
            throw new IllegalStateException(Intrinsics.stringPlus("Null network interceptor: ", this.f34589e).toString());
        }
    }

    /* renamed from: c */
    public final C14174oa mo67644c() {
        return this.f34592h;
    }

    public Object clone() {
        return super.clone();
    }

    /* renamed from: d */
    public final C14669te mo67646d() {
        return this.f34605u;
    }

    /* renamed from: e */
    public final int mo67647e() {
        return this.f34607w;
    }

    /* renamed from: f */
    public final C13322hh mo67648f() {
        return this.f34587c;
    }

    /* renamed from: g */
    public final List<C13500jh> mo67649g() {
        return this.f34602r;
    }

    /* renamed from: h */
    public final C12979ei mo67650h() {
        return this.f34595k;
    }

    /* renamed from: i */
    public final C14768ul mo67651i() {
        return this.f34586b;
    }

    /* renamed from: j */
    public final a20 mo67652j() {
        return this.f34596l;
    }

    /* renamed from: k */
    public final b40.C12569b mo67653k() {
        return this.f34590f;
    }

    /* renamed from: l */
    public final boolean mo67654l() {
        return this.f34593i;
    }

    /* renamed from: m */
    public final boolean mo67655m() {
        return this.f34594j;
    }

    /* renamed from: n */
    public final l61 mo67656n() {
        return this.f34610z;
    }

    /* renamed from: o */
    public final HostnameVerifier mo67657o() {
        return this.f34604t;
    }

    /* renamed from: p */
    public final List<jh0> mo67658p() {
        return this.f34588d;
    }

    /* renamed from: q */
    public final List<jh0> mo67659q() {
        return this.f34589e;
    }

    /* renamed from: r */
    public final List<w11> mo67660r() {
        return this.f34603s;
    }

    /* renamed from: s */
    public final C14174oa mo67661s() {
        return this.f34598n;
    }

    /* renamed from: t */
    public final ProxySelector mo67662t() {
        return this.f34597m;
    }

    /* renamed from: u */
    public final int mo67663u() {
        return this.f34608x;
    }

    /* renamed from: v */
    public final boolean mo67664v() {
        return this.f34591g;
    }

    /* renamed from: w */
    public final SocketFactory mo67665w() {
        return this.f34599o;
    }

    /* renamed from: x */
    public final SSLSocketFactory mo67666x() {
        SSLSocketFactory sSLSocketFactory = this.f34600p;
        if (sSLSocketFactory != null) {
            return sSLSocketFactory;
        }
        throw new IllegalStateException("CLEARTEXT-only client");
    }

    /* renamed from: z */
    public final int mo67667z() {
        return this.f34609y;
    }

    public hw0() {
        this(new C13355a());
    }
}
