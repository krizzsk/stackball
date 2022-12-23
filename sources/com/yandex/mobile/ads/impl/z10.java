package com.yandex.mobile.ads.impl;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

final class z10 implements a20 {
    /* renamed from: a */
    public List<InetAddress> mo65654a(String str) {
        Intrinsics.checkNotNullParameter(str, "hostname");
        try {
            InetAddress[] allByName = InetAddress.getAllByName(str);
            Intrinsics.checkNotNullExpressionValue(allByName, "getAllByName(hostname)");
            return ArraysKt.toList((T[]) allByName);
        } catch (NullPointerException e) {
            UnknownHostException unknownHostException = new UnknownHostException(Intrinsics.stringPlus("Broken system behaviour for dns lookup of ", str));
            unknownHostException.initCause(e);
            throw unknownHostException;
        }
    }
}
