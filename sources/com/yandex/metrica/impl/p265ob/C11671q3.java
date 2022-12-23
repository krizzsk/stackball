package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.plugins.YandexMetricaPlugins;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.q3 */
public final class C11671q3 {

    /* renamed from: a */
    private static final YandexMetricaPlugins f28005a;

    static {
        C10941Y g = C10941Y.m28234g();
        Intrinsics.checkNotNullExpressionValue(g, "ClientServiceLocator.getInstance()");
        C11769sn c = g.mo62499c();
        Intrinsics.checkNotNullExpressionValue(c, "ClientServiceLocator.get…stance().apiProxyExecutor");
        f28005a = new C11619p3(new C11818ug(c));
    }

    /* renamed from: a */
    public static final YandexMetricaPlugins m30078a() {
        return f28005a;
    }
}
