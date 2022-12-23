package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.ac */
public class C11037ac {

    /* renamed from: a */
    public final C11038a f26511a;

    /* renamed from: b */
    public final String f26512b;

    /* renamed from: c */
    public final Boolean f26513c;

    /* renamed from: com.yandex.metrica.impl.ob.ac$a */
    public enum C11038a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C11037ac(C11038a aVar, String str, Boolean bool) {
        this.f26511a = aVar;
        this.f26512b = str;
        this.f26513c = bool;
    }

    public String toString() {
        return "AdTrackingInfo{provider=" + this.f26511a + ", advId='" + this.f26512b + '\'' + ", limitedAdTracking=" + this.f26513c + '}';
    }
}
