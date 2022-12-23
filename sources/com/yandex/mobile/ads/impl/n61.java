package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import com.facebook.appevents.integrity.IntegrityManager;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class n61 {

    /* renamed from: a */
    private final C14563s5 f37649a;

    /* renamed from: b */
    private final l61 f37650b;

    /* renamed from: c */
    private final C12380ae f37651c;

    /* renamed from: d */
    private final b40 f37652d;

    /* renamed from: e */
    private List<? extends Proxy> f37653e = CollectionsKt.emptyList();

    /* renamed from: f */
    private int f37654f;

    /* renamed from: g */
    private List<? extends InetSocketAddress> f37655g = CollectionsKt.emptyList();

    /* renamed from: h */
    private final List<k61> f37656h = new ArrayList();

    /* renamed from: com.yandex.mobile.ads.impl.n61$a */
    public static final class C14058a {

        /* renamed from: a */
        private final List<k61> f37657a;

        /* renamed from: b */
        private int f37658b;

        public C14058a(List<k61> list) {
            Intrinsics.checkNotNullParameter(list, "routes");
            this.f37657a = list;
        }

        /* renamed from: a */
        public final List<k61> mo68895a() {
            return this.f37657a;
        }

        /* renamed from: b */
        public final boolean mo68896b() {
            return this.f37658b < this.f37657a.size();
        }

        /* renamed from: c */
        public final k61 mo68897c() {
            if (mo68896b()) {
                List<k61> list = this.f37657a;
                int i = this.f37658b;
                this.f37658b = i + 1;
                return list.get(i);
            }
            throw new NoSuchElementException();
        }
    }

    public n61(C14563s5 s5Var, l61 l61, C12380ae aeVar, b40 b40) {
        Intrinsics.checkNotNullParameter(s5Var, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        Intrinsics.checkNotNullParameter(l61, "routeDatabase");
        Intrinsics.checkNotNullParameter(aeVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(b40, "eventListener");
        this.f37649a = s5Var;
        this.f37650b = l61;
        this.f37651c = aeVar;
        this.f37652d = b40;
        m39821a(s5Var.mo69885k(), s5Var.mo69879f());
    }

    /* renamed from: b */
    private final boolean m39822b() {
        return this.f37654f < this.f37653e.size();
    }

    /* renamed from: a */
    public final boolean mo68893a() {
        return m39822b() || (this.f37656h.isEmpty() ^ true);
    }

    /* renamed from: c */
    public final C14058a mo68894c() throws IOException {
        String str;
        int i;
        if (mo68893a()) {
            ArrayList arrayList = new ArrayList();
            while (m39822b()) {
                if (m39822b()) {
                    List<? extends Proxy> list = this.f37653e;
                    int i2 = this.f37654f;
                    this.f37654f = i2 + 1;
                    Proxy proxy = (Proxy) list.get(i2);
                    ArrayList arrayList2 = new ArrayList();
                    this.f37655g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        str = this.f37649a.mo69885k().mo66958g();
                        i = this.f37649a.mo69885k().mo66961i();
                    } else {
                        SocketAddress address = proxy.address();
                        if (address instanceof InetSocketAddress) {
                            Intrinsics.checkNotNullExpressionValue(address, "proxyAddress");
                            InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                            Intrinsics.checkNotNullParameter(inetSocketAddress, "<this>");
                            InetAddress address2 = inetSocketAddress.getAddress();
                            if (address2 == null) {
                                str = inetSocketAddress.getHostName();
                                Intrinsics.checkNotNullExpressionValue(str, "hostName");
                            } else {
                                str = address2.getHostAddress();
                                Intrinsics.checkNotNullExpressionValue(str, "address.hostAddress");
                            }
                            i = inetSocketAddress.getPort();
                        } else {
                            throw new IllegalArgumentException(Intrinsics.stringPlus("Proxy.address() is not an InetSocketAddress: ", address.getClass()).toString());
                        }
                    }
                    if (1 <= i && i <= 65535) {
                        if (proxy.type() == Proxy.Type.SOCKS) {
                            arrayList2.add(InetSocketAddress.createUnresolved(str, i));
                        } else {
                            b40 b40 = this.f37652d;
                            C12380ae aeVar = this.f37651c;
                            b40.getClass();
                            Intrinsics.checkNotNullParameter(aeVar, NotificationCompat.CATEGORY_CALL);
                            Intrinsics.checkNotNullParameter(str, "domainName");
                            List<InetAddress> a = this.f37649a.mo69875c().mo65654a(str);
                            if (!a.isEmpty()) {
                                b40 b402 = this.f37652d;
                                C12380ae aeVar2 = this.f37651c;
                                b402.getClass();
                                Intrinsics.checkNotNullParameter(aeVar2, NotificationCompat.CATEGORY_CALL);
                                Intrinsics.checkNotNullParameter(str, "domainName");
                                Intrinsics.checkNotNullParameter(a, "inetAddressList");
                                for (InetAddress inetSocketAddress2 : a) {
                                    arrayList2.add(new InetSocketAddress(inetSocketAddress2, i));
                                }
                            } else {
                                throw new UnknownHostException(this.f37649a.mo69875c() + " returned no addresses for " + str);
                            }
                        }
                        for (InetSocketAddress k61 : this.f37655g) {
                            k61 k612 = new k61(this.f37649a, proxy, k61);
                            if (this.f37650b.mo68361c(k612)) {
                                this.f37656h.add(k612);
                            } else {
                                arrayList.add(k612);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            break;
                        }
                    } else {
                        throw new SocketException("No route to " + str + ':' + i + "; port is out of range");
                    }
                } else {
                    throw new SocketException("No route to " + this.f37649a.mo69885k().mo66958g() + "; exhausted proxy configurations: " + this.f37653e);
                }
            }
            if (arrayList.isEmpty()) {
                CollectionsKt.addAll(arrayList, this.f37656h);
                this.f37656h.clear();
            }
            return new C14058a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private final void m39821a(fc0 fc0, Proxy proxy) {
        List<? extends Proxy> list;
        b40 b40 = this.f37652d;
        C12380ae aeVar = this.f37651c;
        b40.getClass();
        Intrinsics.checkNotNullParameter(aeVar, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(fc0, "url");
        if (proxy != null) {
            list = CollectionsKt.listOf(proxy);
        } else {
            URI m = fc0.mo66965m();
            if (m.getHost() == null) {
                list = jh1.m37823a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                List<Proxy> select = this.f37649a.mo69881h().select(m);
                if (select == null || select.isEmpty()) {
                    list = jh1.m37823a((T[]) new Proxy[]{Proxy.NO_PROXY});
                } else {
                    Intrinsics.checkNotNullExpressionValue(select, "proxiesOrNull");
                    list = jh1.m37835b(select);
                }
            }
        }
        this.f37653e = list;
        this.f37654f = 0;
        b40 b402 = this.f37652d;
        C12380ae aeVar2 = this.f37651c;
        b402.getClass();
        Intrinsics.checkNotNullParameter(aeVar2, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(fc0, "url");
        Intrinsics.checkNotNullParameter(list, "proxies");
    }
}
