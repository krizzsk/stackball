package com.yandex.metrica.impl.p265ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.x0 */
public class C11927x0 {

    /* renamed from: a */
    public final Map<String, String> f28687a;

    /* renamed from: b */
    public final String f28688b;

    /* renamed from: c */
    public final String f28689c;

    public C11927x0(String str, Map<String, String> map, String str2) {
        this.f28688b = str;
        this.f28687a = map;
        this.f28689c = str2;
    }

    public String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f28687a + ", mDeeplink='" + this.f28688b + '\'' + ", mUnparsedReferrer='" + this.f28689c + '\'' + '}';
    }
}
