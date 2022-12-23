package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.ye */
public class C11984ye {

    /* renamed from: a */
    private final String f28779a;

    /* renamed from: b */
    private final String f28780b;

    public C11984ye(String str) {
        this(str, (String) null);
    }

    /* renamed from: a */
    public String mo64145a() {
        return this.f28780b;
    }

    /* renamed from: b */
    public String mo64147b() {
        return this.f28779a;
    }

    public C11984ye(String str, String str2) {
        this.f28779a = str;
        this.f28780b = mo64146a(str2);
    }

    /* renamed from: a */
    public final String mo64146a(String str) {
        if (str == null) {
            return this.f28779a;
        }
        return this.f28779a + str;
    }
}
