package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.En */
public class C10233En implements C10265Fn {

    /* renamed from: a */
    public final int f24629a;

    public C10233En(int i) {
        this.f24629a = i;
    }

    /* renamed from: a */
    public int mo61250a() {
        return this.f24629a;
    }

    public String toString() {
        return "BytesTruncatedInfo{bytesTruncated=" + this.f24629a + '}';
    }

    /* renamed from: a */
    public static C10265Fn m26217a(C10265Fn... fnArr) {
        int i = 0;
        for (C10265Fn fn : fnArr) {
            if (fn != null) {
                i += fn.mo61250a();
            }
        }
        return new C10233En(i);
    }
}
