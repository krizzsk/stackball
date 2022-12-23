package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Xk */
public class C10937Xk {

    /* renamed from: a */
    public final int f26296a;

    /* renamed from: b */
    public final String f26297b;

    /* renamed from: c */
    private final int f26298c = m28226a();

    public C10937Xk(int i, String str) {
        this.f26296a = i;
        this.f26297b = str;
    }

    /* renamed from: a */
    private int m28226a() {
        return (this.f26296a * 31) + this.f26297b.length();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10937Xk.class != obj.getClass()) {
            return false;
        }
        C10937Xk xk = (C10937Xk) obj;
        if (this.f26296a != xk.f26296a) {
            return false;
        }
        return this.f26297b.equals(xk.f26297b);
    }

    public int hashCode() {
        return this.f26298c;
    }
}
