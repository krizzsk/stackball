package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.c4 */
public class C11101c4 {

    /* renamed from: a */
    private final String f26643a;

    /* renamed from: b */
    private final String f26644b;

    public C11101c4(String str, String str2) {
        this.f26643a = str;
        this.f26644b = str2;
    }

    /* renamed from: a */
    public String mo62715a() {
        return this.f26644b;
    }

    /* renamed from: b */
    public String mo62716b() {
        return this.f26643a;
    }

    /* renamed from: c */
    public String mo62717c() {
        return this.f26643a + "_" + C10796U2.m27878a(this.f26644b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C11101c4 c4Var = (C11101c4) obj;
        String str = this.f26643a;
        if (str == null ? c4Var.f26643a != null : !str.equals(c4Var.f26643a)) {
            return false;
        }
        String str2 = this.f26644b;
        String str3 = c4Var.f26644b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        if (str3 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f26643a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f26644b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f26643a + "_" + this.f26644b;
    }
}
