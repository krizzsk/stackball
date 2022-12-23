package com.yandex.metrica.impl.p265ob;

/* renamed from: com.yandex.metrica.impl.ob.Kn */
public class C10440Kn {

    /* renamed from: a */
    private final C10581Nn f25079a;

    /* renamed from: b */
    private final C10581Nn f25080b;

    /* renamed from: c */
    private final C10321Gn f25081c;

    /* renamed from: d */
    private final C10380Im f25082d;

    /* renamed from: e */
    private final String f25083e;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C10440Kn(int r7, int r8, int r9, java.lang.String r10, com.yandex.metrica.impl.p265ob.C10380Im r11) {
        /*
            r6 = this;
            com.yandex.metrica.impl.ob.Gn r1 = new com.yandex.metrica.impl.ob.Gn
            r1.<init>(r7)
            com.yandex.metrica.impl.ob.Nn r2 = new com.yandex.metrica.impl.ob.Nn
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r0 = "map key"
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r2.<init>(r8, r7, r11)
            com.yandex.metrica.impl.ob.Nn r3 = new com.yandex.metrica.impl.ob.Nn
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            java.lang.String r8 = "map value"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r3.<init>(r9, r7, r11)
            r0 = r6
            r4 = r10
            r5 = r11
            r0.<init>((com.yandex.metrica.impl.p265ob.C10321Gn) r1, (com.yandex.metrica.impl.p265ob.C10581Nn) r2, (com.yandex.metrica.impl.p265ob.C10581Nn) r3, (java.lang.String) r4, (com.yandex.metrica.impl.p265ob.C10380Im) r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10440Kn.<init>(int, int, int, java.lang.String, com.yandex.metrica.impl.ob.Im):void");
    }

    /* renamed from: a */
    public C10321Gn mo61692a() {
        return this.f25081c;
    }

    /* renamed from: b */
    public C10581Nn mo61694b() {
        return this.f25079a;
    }

    /* renamed from: c */
    public C10581Nn mo61695c() {
        return this.f25080b;
    }

    C10440Kn(C10321Gn gn, C10581Nn nn, C10581Nn nn2, String str, C10380Im im) {
        this.f25081c = gn;
        this.f25079a = nn;
        this.f25080b = nn2;
        this.f25083e = str;
        this.f25082d = im;
    }

    /* renamed from: a */
    public void mo61693a(String str) {
        if (this.f25082d.mo64227c()) {
            this.f25082d.mo64226c("The %s has reached the limit of %d items. Item with key %s will be ignored", this.f25083e, Integer.valueOf(this.f25081c.mo61410a()), str);
        }
    }
}
