package com.yandex.mobile.ads.video.models.p268ad;

import com.yandex.mobile.ads.impl.C13278h5;

/* renamed from: com.yandex.mobile.ads.video.models.ad.b */
public final class C15566b {

    /* renamed from: a */
    private final String f44137a;

    /* renamed from: b */
    private final String f44138b;

    /* renamed from: c */
    private final C15568b f44139c;

    /* renamed from: d */
    private final String f44140d;

    /* renamed from: e */
    private final String f44141e;

    /* renamed from: f */
    private final Float f44142f;

    /* renamed from: g */
    private final int f44143g;

    /* renamed from: h */
    private final int f44144h;

    /* renamed from: i */
    public int f44145i;

    /* renamed from: com.yandex.mobile.ads.video.models.ad.b$a */
    public static class C15567a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f44146a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public String f44147b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C15568b f44148c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public String f44149d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public String f44150e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public Float f44151f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f44152g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f44153h;

        /* renamed from: i */
        public int f44154i;

        /* renamed from: a */
        public C15567a mo71990a(String str) {
            this.f44150e = str;
            return this;
        }

        /* renamed from: b */
        public C15567a mo71992b(String str) {
            this.f44148c = C15568b.m45467a(str);
            return this;
        }

        /* renamed from: c */
        public C15567a mo71993c(String str) {
            try {
                this.f44152g = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
            }
            return this;
        }

        /* renamed from: d */
        public C15567a mo71994d(String str) {
            this.f44146a = str;
            return this;
        }

        /* renamed from: e */
        public C15567a mo71995e(String str) {
            this.f44149d = str;
            return this;
        }

        /* renamed from: f */
        public C15567a mo71996f(String str) {
            this.f44147b = str;
            return this;
        }

        /* renamed from: g */
        public C15567a mo71997g(String str) {
            Float f;
            int i = C13278h5.f34274b;
            try {
                f = Float.valueOf(Float.parseFloat(str));
            } catch (Exception unused) {
                f = null;
            }
            this.f44151f = f;
            return this;
        }

        /* renamed from: h */
        public C15567a mo71998h(String str) {
            try {
                this.f44153h = Integer.valueOf(str).intValue();
            } catch (Exception unused) {
            }
            return this;
        }

        /* renamed from: a */
        public C15566b mo71991a() {
            return new C15566b(this);
        }
    }

    /* renamed from: com.yandex.mobile.ads.video.models.ad.b$b */
    public enum C15568b {
        ;
        

        /* renamed from: b */
        private String f44156b;

        private C15568b(String str) {
            this.f44156b = str;
        }

        /* renamed from: a */
        public static C15568b m45467a(String str) {
            for (C15568b bVar : values()) {
                if (bVar.f44156b.equals(str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    C15566b(C15567a aVar) {
        this.f44137a = aVar.f44146a;
        this.f44138b = aVar.f44147b;
        this.f44139c = aVar.f44148c;
        this.f44143g = aVar.f44152g;
        this.f44145i = aVar.f44154i;
        this.f44144h = aVar.f44153h;
        this.f44140d = aVar.f44149d;
        this.f44141e = aVar.f44150e;
        this.f44142f = aVar.f44151f;
    }

    /* renamed from: a */
    public String mo71982a() {
        return this.f44141e;
    }

    /* renamed from: b */
    public int mo71983b() {
        return this.f44143g;
    }

    /* renamed from: c */
    public String mo71984c() {
        return this.f44140d;
    }

    /* renamed from: d */
    public String mo71985d() {
        return this.f44138b;
    }

    /* renamed from: e */
    public Float mo71986e() {
        return this.f44142f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C15566b.class != obj.getClass()) {
            return false;
        }
        C15566b bVar = (C15566b) obj;
        if (this.f44143g != bVar.f44143g || this.f44144h != bVar.f44144h || this.f44145i != bVar.f44145i || this.f44139c != bVar.f44139c) {
            return false;
        }
        String str = this.f44137a;
        if (str == null ? bVar.f44137a != null : !str.equals(bVar.f44137a)) {
            return false;
        }
        String str2 = this.f44140d;
        if (str2 == null ? bVar.f44140d != null : !str2.equals(bVar.f44140d)) {
            return false;
        }
        String str3 = this.f44138b;
        if (str3 == null ? bVar.f44138b != null : !str3.equals(bVar.f44138b)) {
            return false;
        }
        String str4 = this.f44141e;
        if (str4 == null ? bVar.f44141e != null : !str4.equals(bVar.f44141e)) {
            return false;
        }
        Float f = this.f44142f;
        Float f2 = bVar.f44142f;
        return f == null ? f2 == null : f.equals(f2);
    }

    /* renamed from: f */
    public int mo71988f() {
        return this.f44144h;
    }

    public int hashCode() {
        String str = this.f44137a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f44138b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        C15568b bVar = this.f44139c;
        int hashCode3 = (((((((hashCode2 + (bVar != null ? bVar.hashCode() : 0)) * 31) + this.f44143g) * 31) + this.f44144h) * 31) + this.f44145i) * 31;
        String str3 = this.f44140d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f44141e;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Float f = this.f44142f;
        if (f != null) {
            i = f.hashCode();
        }
        return hashCode5 + i;
    }
}
