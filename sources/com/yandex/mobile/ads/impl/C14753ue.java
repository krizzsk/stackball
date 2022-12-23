package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.mobile.ads.impl.ue */
public final class C14753ue {

    /* renamed from: a */
    private final String f40635a;

    /* renamed from: b */
    private final Map<String, String> f40636b;

    public C14753ue(String str, Map<String, String> map) {
        String str2;
        Intrinsics.checkNotNullParameter(str, "scheme");
        Intrinsics.checkNotNullParameter(map, "authParams");
        this.f40635a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            String str3 = (String) next.getKey();
            String str4 = (String) next.getValue();
            if (str3 == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                Intrinsics.checkNotNullExpressionValue(locale, "US");
                str2 = str3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(str2, "(this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(str2, str4);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        Intrinsics.checkNotNullExpressionValue(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f40636b = unmodifiableMap;
    }

    /* renamed from: a */
    public final Charset mo70336a() {
        String str = this.f40636b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                Intrinsics.checkNotNullExpressionValue(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        Intrinsics.checkNotNullExpressionValue(charset, "ISO_8859_1");
        return charset;
    }

    /* renamed from: b */
    public final String mo70337b() {
        return this.f40636b.get("realm");
    }

    /* renamed from: c */
    public final String mo70338c() {
        return this.f40635a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C14753ue) {
            C14753ue ueVar = (C14753ue) obj;
            return Intrinsics.areEqual((Object) ueVar.f40635a, (Object) this.f40635a) && Intrinsics.areEqual((Object) ueVar.f40636b, (Object) this.f40636b);
        }
    }

    public int hashCode() {
        return ((this.f40635a.hashCode() + 899) * 31) + this.f40636b.hashCode();
    }

    public String toString() {
        return this.f40635a + " authParams=" + this.f40636b;
    }
}
