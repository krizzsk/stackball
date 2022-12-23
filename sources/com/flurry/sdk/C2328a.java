package com.flurry.sdk;

/* renamed from: com.flurry.sdk.a */
public class C2328a {

    /* renamed from: c */
    private static final String f5324c = C2328a.class.getSimpleName();

    /* renamed from: a */
    public final C2651h f5325a;

    /* renamed from: b */
    public C2657m f5326b;

    public C2328a(C2651h hVar, C2657m mVar) {
        this.f5325a = hVar;
        this.f5326b = mVar;
    }

    /* renamed from: a */
    public final String mo17561a(String str, String str2, C2653j jVar) {
        C2473c a = this.f5326b.mo17852a(str, jVar);
        if (a == null) {
            a = this.f5325a.mo17839a(str);
        }
        return a != null ? a.mo17664a() : str2;
    }

    /* renamed from: a */
    public final int mo17559a(String str, int i, C2653j jVar) {
        C2473c a = this.f5326b.mo17852a(str, jVar);
        if (a == null) {
            a = this.f5325a.mo17839a(str);
        }
        if (a != null) {
            try {
                return Integer.decode(a.mo17664a()).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    /* renamed from: a */
    public final float mo17558a(String str, float f, C2653j jVar) {
        C2473c a = this.f5326b.mo17852a(str, jVar);
        if (a == null) {
            a = this.f5325a.mo17839a(str);
        }
        if (a != null) {
            try {
                return Float.parseFloat(a.mo17664a());
            } catch (NumberFormatException unused) {
            }
        }
        return f;
    }

    /* renamed from: a */
    public final long mo17560a(String str, long j, C2653j jVar) {
        C2473c a = this.f5326b.mo17852a(str, jVar);
        if (a == null) {
            a = this.f5325a.mo17839a(str);
        }
        if (a != null) {
            try {
                return Long.decode(a.mo17664a()).longValue();
            } catch (NumberFormatException unused) {
            }
        }
        return j;
    }

    /* renamed from: a */
    public final double mo17557a(String str, double d, C2653j jVar) {
        C2473c a = this.f5326b.mo17852a(str, jVar);
        if (a == null) {
            a = this.f5325a.mo17839a(str);
        }
        if (a != null) {
            try {
                return Double.parseDouble(a.mo17664a());
            } catch (NumberFormatException unused) {
            }
        }
        return d;
    }
}
