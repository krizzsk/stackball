package com.yandex.mobile.ads.impl;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

public final class ae0 implements C14237oy {

    /* renamed from: a */
    private final Map<Pair<String, String>, String> f30522a = new LinkedHashMap();

    /* renamed from: b */
    private final Map<String, String> f30523b = new LinkedHashMap();

    /* renamed from: a */
    public void mo65739a(String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        Intrinsics.checkNotNullParameter(str2, "path");
        Intrinsics.checkNotNullParameter(str3, "state");
        this.f30522a.put(TuplesKt.m45515to(str, str2), str3);
    }

    /* renamed from: b */
    public String mo65740b(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        Intrinsics.checkNotNullParameter(str2, "path");
        return this.f30522a.get(TuplesKt.m45515to(str, str2));
    }

    /* renamed from: a */
    public void mo65738a(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        Intrinsics.checkNotNullParameter(str2, "state");
        this.f30523b.put(str, str2);
    }

    /* renamed from: a */
    public String mo65737a(String str) {
        Intrinsics.checkNotNullParameter(str, "cardId");
        return this.f30523b.get(str);
    }
}
