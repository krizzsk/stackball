package com.yandex.mobile.ads.impl;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.yandex.mobile.ads.impl.fc0;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.s5 */
public final class C14563s5 {

    /* renamed from: a */
    private final a20 f39846a;

    /* renamed from: b */
    private final SocketFactory f39847b;

    /* renamed from: c */
    private final SSLSocketFactory f39848c;

    /* renamed from: d */
    private final HostnameVerifier f39849d;

    /* renamed from: e */
    private final C14669te f39850e;

    /* renamed from: f */
    private final C14174oa f39851f;

    /* renamed from: g */
    private final Proxy f39852g = null;

    /* renamed from: h */
    private final ProxySelector f39853h;

    /* renamed from: i */
    private final fc0 f39854i;

    /* renamed from: j */
    private final List<w11> f39855j;

    /* renamed from: k */
    private final List<C13500jh> f39856k;

    public C14563s5(String str, int i, a20 a20, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C14669te teVar, C14174oa oaVar, Proxy proxy, List<? extends w11> list, List<C13500jh> list2, ProxySelector proxySelector) {
        Intrinsics.checkNotNullParameter(str, "uriHost");
        Intrinsics.checkNotNullParameter(a20, "dns");
        Intrinsics.checkNotNullParameter(socketFactory, "socketFactory");
        Intrinsics.checkNotNullParameter(oaVar, "proxyAuthenticator");
        Intrinsics.checkNotNullParameter(list, "protocols");
        Intrinsics.checkNotNullParameter(list2, "connectionSpecs");
        Intrinsics.checkNotNullParameter(proxySelector, "proxySelector");
        this.f39846a = a20;
        this.f39847b = socketFactory;
        this.f39848c = sSLSocketFactory;
        this.f39849d = hostnameVerifier;
        this.f39850e = teVar;
        this.f39851f = oaVar;
        this.f39853h = proxySelector;
        this.f39854i = new fc0.C13043a().mo66977d(sSLSocketFactory != null ? "https" : "http").mo66972b(str).mo66968a(i).mo66971a();
        this.f39855j = jh1.m37835b(list);
        this.f39856k = jh1.m37835b(list2);
    }

    /* renamed from: a */
    public final C14669te mo69872a() {
        return this.f39850e;
    }

    /* renamed from: b */
    public final List<C13500jh> mo69874b() {
        return this.f39856k;
    }

    /* renamed from: c */
    public final a20 mo69875c() {
        return this.f39846a;
    }

    /* renamed from: d */
    public final HostnameVerifier mo69876d() {
        return this.f39849d;
    }

    /* renamed from: e */
    public final List<w11> mo69877e() {
        return this.f39855j;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14563s5) {
            C14563s5 s5Var = (C14563s5) obj;
            return Intrinsics.areEqual((Object) this.f39854i, (Object) s5Var.f39854i) && mo69873a(s5Var);
        }
    }

    /* renamed from: f */
    public final Proxy mo69879f() {
        return this.f39852g;
    }

    /* renamed from: g */
    public final C14174oa mo69880g() {
        return this.f39851f;
    }

    /* renamed from: h */
    public final ProxySelector mo69881h() {
        return this.f39853h;
    }

    public int hashCode() {
        return ((((((((((((((((((this.f39854i.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f39846a.hashCode()) * 31) + this.f39851f.hashCode()) * 31) + this.f39855j.hashCode()) * 31) + this.f39856k.hashCode()) * 31) + this.f39853h.hashCode()) * 31) + Objects.hashCode(this.f39852g)) * 31) + Objects.hashCode(this.f39848c)) * 31) + Objects.hashCode(this.f39849d)) * 31) + Objects.hashCode(this.f39850e);
    }

    /* renamed from: i */
    public final SocketFactory mo69883i() {
        return this.f39847b;
    }

    /* renamed from: j */
    public final SSLSocketFactory mo69884j() {
        return this.f39848c;
    }

    /* renamed from: k */
    public final fc0 mo69885k() {
        return this.f39854i;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("Address{");
        sb.append(this.f39854i.mo66958g());
        sb.append(':');
        sb.append(this.f39854i.mo66961i());
        sb.append(", ");
        Object obj = this.f39852g;
        if (obj != null) {
            str = "proxy=";
        } else {
            obj = this.f39853h;
            str = "proxySelector=";
        }
        sb.append(Intrinsics.stringPlus(str, obj));
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo69873a(C14563s5 s5Var) {
        Intrinsics.checkNotNullParameter(s5Var, "that");
        return Intrinsics.areEqual((Object) this.f39846a, (Object) s5Var.f39846a) && Intrinsics.areEqual((Object) this.f39851f, (Object) s5Var.f39851f) && Intrinsics.areEqual((Object) this.f39855j, (Object) s5Var.f39855j) && Intrinsics.areEqual((Object) this.f39856k, (Object) s5Var.f39856k) && Intrinsics.areEqual((Object) this.f39853h, (Object) s5Var.f39853h) && Intrinsics.areEqual((Object) this.f39852g, (Object) s5Var.f39852g) && Intrinsics.areEqual((Object) this.f39848c, (Object) s5Var.f39848c) && Intrinsics.areEqual((Object) this.f39849d, (Object) s5Var.f39849d) && Intrinsics.areEqual((Object) this.f39850e, (Object) s5Var.f39850e) && this.f39854i.mo66961i() == s5Var.f39854i.mo66961i();
    }
}
