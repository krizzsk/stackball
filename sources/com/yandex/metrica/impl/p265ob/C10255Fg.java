package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Fg */
public final class C10255Fg {

    /* renamed from: a */
    public final String f24687a;

    /* renamed from: b */
    public final long f24688b;

    /* renamed from: c */
    public final long f24689c;

    /* renamed from: d */
    public final C10256a f24690d;

    /* renamed from: com.yandex.metrica.impl.ob.Fg$a */
    public enum C10256a {
        UNKNOWN("unknown"),
        GP("gpl"),
        HMS("hms-content-provider");
        

        /* renamed from: a */
        public final String f24695a;

        private C10256a(String str) {
            this.f24695a = str;
        }
    }

    private C10255Fg(byte[] bArr) throws C11124d {
        C10961Yf a = C10961Yf.m28317a(bArr);
        this.f24687a = a.f26362b;
        this.f24688b = a.f26364d;
        this.f24689c = a.f26363c;
        this.f24690d = m26311a(a.f26365e);
    }

    /* renamed from: a */
    public static C10255Fg m26312a(byte[] bArr) throws C11124d {
        if (C10796U2.m27893a(bArr)) {
            return null;
        }
        return new C10255Fg(bArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C10255Fg.class != obj.getClass()) {
            return false;
        }
        C10255Fg fg = (C10255Fg) obj;
        if (this.f24688b == fg.f24688b && this.f24689c == fg.f24689c && this.f24687a.equals(fg.f24687a) && this.f24690d == fg.f24690d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f24688b;
        long j2 = this.f24689c;
        return (((((this.f24687a.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f24690d.hashCode();
    }

    public String toString() {
        return "ReferrerInfo{installReferrer='" + this.f24687a + '\'' + ", referrerClickTimestampSeconds=" + this.f24688b + ", installBeginTimestampSeconds=" + this.f24689c + ", source=" + this.f24690d + '}';
    }

    /* renamed from: a */
    public byte[] mo61326a() {
        C10961Yf yf = new C10961Yf();
        yf.f26362b = this.f24687a;
        yf.f26364d = this.f24688b;
        yf.f26363c = this.f24689c;
        int ordinal = this.f24690d.ordinal();
        int i = 2;
        if (ordinal == 1) {
            i = 1;
        } else if (ordinal != 2) {
            i = 0;
        }
        yf.f26365e = i;
        return C11169e.m28804a((C11169e) yf);
    }

    public C10255Fg(String str, long j, long j2, C10256a aVar) {
        this.f24687a = str;
        this.f24688b = j;
        this.f24689c = j2;
        this.f24690d = aVar;
    }

    /* renamed from: a */
    private C10256a m26311a(int i) {
        if (i == 1) {
            return C10256a.GP;
        }
        if (i != 2) {
            return C10256a.UNKNOWN;
        }
        return C10256a.HMS;
    }
}
