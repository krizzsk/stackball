package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.w8 */
public class C15035w8 {

    /* renamed from: a */
    private final String f41890a;

    /* renamed from: b */
    private final String f41891b;

    /* renamed from: c */
    private final String f41892c;

    public C15035w8(String str, String str2, String str3) {
        this.f41890a = str;
        this.f41891b = str2;
        this.f41892c = str3;
    }

    /* renamed from: a */
    public String mo70659a() {
        return this.f41890a;
    }

    /* renamed from: b */
    public String mo70660b() {
        return this.f41891b;
    }

    /* renamed from: c */
    public String mo70661c() {
        return this.f41892c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15035w8.class != obj.getClass()) {
            return false;
        }
        C15035w8 w8Var = (C15035w8) obj;
        String str = this.f41890a;
        if (str == null ? w8Var.f41890a != null : !str.equals(w8Var.f41890a)) {
            return false;
        }
        String str2 = this.f41891b;
        if (str2 == null ? w8Var.f41891b != null : !str2.equals(w8Var.f41891b)) {
            return false;
        }
        String str3 = this.f41892c;
        String str4 = w8Var.f41892c;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f41890a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f41891b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f41892c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }
}
