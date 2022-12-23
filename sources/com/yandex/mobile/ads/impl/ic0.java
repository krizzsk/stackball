package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.hc0;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.Intrinsics;

public final class ic0 {
    /* renamed from: a */
    public final C14576sb mo67773a(Context context, hc0.C13311b bVar, SSLSocketFactory sSLSocketFactory) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(context, "context");
        d71 a = l71.m38631c().mo68362a(context);
        if (a == null) {
            bool = null;
        } else {
            bool = Boolean.valueOf(a.mo66446K());
        }
        if (Intrinsics.areEqual((Object) bool, (Object) Boolean.TRUE)) {
            return new jc0(bVar, sSLSocketFactory);
        }
        return new hc0(bVar, sSLSocketFactory);
    }
}
