package com.yandex.mobile.ads.impl;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public abstract class w90 {

    /* renamed from: a */
    private final Lazy f41904a = LazyKt.lazy(C15037a.f41905b);

    /* renamed from: com.yandex.mobile.ads.impl.w90$a */
    static final class C15037a extends Lambda implements Function0<ConcurrentHashMap<String, Unit>> {

        /* renamed from: b */
        public static final C15037a f41905b = new C15037a();

        C15037a() {
            super(0);
        }

        public Object invoke() {
            return new ConcurrentHashMap();
        }
    }

    /* renamed from: a */
    public final boolean mo70666a(String str) {
        Intrinsics.checkNotNullParameter(str, "histogramName");
        if (!((ConcurrentHashMap) this.f41904a.getValue()).containsKey(str) && ((ConcurrentHashMap) this.f41904a.getValue()).putIfAbsent(str, Unit.INSTANCE) == null) {
            return true;
        }
        return false;
    }
}
