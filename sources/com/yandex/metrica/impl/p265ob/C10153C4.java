package com.yandex.metrica.impl.p265ob;

import com.yandex.metrica.CounterConfiguration;

/* renamed from: com.yandex.metrica.impl.ob.C4 */
public class C10153C4 {

    /* renamed from: a */
    private final String f24434a;

    /* renamed from: b */
    private final String f24435b;

    /* renamed from: c */
    private final Integer f24436c;

    /* renamed from: d */
    private final String f24437d;

    /* renamed from: e */
    private final CounterConfiguration.C10019b f24438e;

    public C10153C4(String str, String str2, Integer num, String str3, CounterConfiguration.C10019b bVar) {
        this.f24434a = str;
        this.f24435b = str2;
        this.f24436c = num;
        this.f24437d = str3;
        this.f24438e = bVar;
    }

    /* renamed from: a */
    public String mo61129a() {
        return this.f24434a;
    }

    /* renamed from: b */
    public String mo61130b() {
        return this.f24435b;
    }

    /* renamed from: c */
    public Integer mo61131c() {
        return this.f24436c;
    }

    /* renamed from: d */
    public String mo61132d() {
        return this.f24437d;
    }

    /* renamed from: e */
    public CounterConfiguration.C10019b mo61133e() {
        return this.f24438e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10153C4.class != obj.getClass()) {
            return false;
        }
        C10153C4 c4 = (C10153C4) obj;
        String str = this.f24434a;
        if (str == null ? c4.f24434a != null : !str.equals(c4.f24434a)) {
            return false;
        }
        if (!this.f24435b.equals(c4.f24435b)) {
            return false;
        }
        Integer num = this.f24436c;
        if (num == null ? c4.f24436c != null : !num.equals(c4.f24436c)) {
            return false;
        }
        String str2 = this.f24437d;
        if (str2 == null ? c4.f24437d != null : !str2.equals(c4.f24437d)) {
            return false;
        }
        if (this.f24438e == c4.f24438e) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24434a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + this.f24435b.hashCode()) * 31;
        Integer num = this.f24436c;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.f24437d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f24438e.hashCode();
    }

    public String toString() {
        return "ClientDescription{mApiKey='" + this.f24434a + '\'' + ", mPackageName='" + this.f24435b + '\'' + ", mProcessID=" + this.f24436c + ", mProcessSessionID='" + this.f24437d + '\'' + ", mReporterType=" + this.f24438e + '}';
    }

    /* renamed from: a */
    public static C10153C4 m26091a(C10770T3 t3) {
        return new C10153C4(t3.mo62272b().mo60794a(), t3.mo62271a().mo62340f(), t3.mo62271a().mo62341g(), t3.mo62271a().mo62342h(), t3.mo62272b().mo60812k());
    }
}
