package com.yandex.mobile.ads.impl;

import com.facebook.appevents.integrity.IntegrityManager;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.jvm.internal.Intrinsics;

public final class k61 {

    /* renamed from: a */
    private final C14563s5 f35977a;

    /* renamed from: b */
    private final Proxy f35978b;

    /* renamed from: c */
    private final InetSocketAddress f35979c;

    public k61(C14563s5 s5Var, Proxy proxy, InetSocketAddress inetSocketAddress) {
        Intrinsics.checkNotNullParameter(s5Var, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        Intrinsics.checkNotNullParameter(proxy, "proxy");
        Intrinsics.checkNotNullParameter(inetSocketAddress, "socketAddress");
        this.f35977a = s5Var;
        this.f35978b = proxy;
        this.f35979c = inetSocketAddress;
    }

    /* renamed from: a */
    public final C14563s5 mo68140a() {
        return this.f35977a;
    }

    /* renamed from: b */
    public final Proxy mo68141b() {
        return this.f35978b;
    }

    /* renamed from: c */
    public final boolean mo68142c() {
        return this.f35977a.mo69884j() != null && this.f35978b.type() == Proxy.Type.HTTP;
    }

    /* renamed from: d */
    public final InetSocketAddress mo68143d() {
        return this.f35979c;
    }

    public boolean equals(Object obj) {
        if (obj instanceof k61) {
            k61 k61 = (k61) obj;
            return Intrinsics.areEqual((Object) k61.f35977a, (Object) this.f35977a) && Intrinsics.areEqual((Object) k61.f35978b, (Object) this.f35978b) && Intrinsics.areEqual((Object) k61.f35979c, (Object) this.f35979c);
        }
    }

    public int hashCode() {
        return ((((this.f35977a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f35978b.hashCode()) * 31) + this.f35979c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f35979c + '}';
    }
}
