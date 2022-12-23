package com.applovin.impl.mediation.p020b;

import com.applovin.impl.mediation.C1264i;

/* renamed from: com.applovin.impl.mediation.b.f */
public class C1228f {

    /* renamed from: a */
    private final C1230g f2368a;

    /* renamed from: b */
    private final String f2369b;

    /* renamed from: c */
    private final String f2370c;

    /* renamed from: d */
    private final String f2371d;

    /* renamed from: e */
    private final String f2372e;

    /* renamed from: com.applovin.impl.mediation.b.f$a */
    public interface C1229a {
        /* renamed from: a */
        void mo12371a(C1228f fVar);
    }

    private C1228f(C1230g gVar, C1264i iVar, String str, String str2) {
        this.f2368a = gVar;
        this.f2372e = str2;
        if (str != null) {
            this.f2371d = str.substring(0, Math.min(str.length(), gVar.mo12284a()));
        } else {
            this.f2371d = null;
        }
        if (iVar != null) {
            this.f2369b = iVar.mo12426e();
            this.f2370c = iVar.mo12427f();
            return;
        }
        this.f2369b = null;
        this.f2370c = null;
    }

    /* renamed from: a */
    public static C1228f m2121a(C1230g gVar, C1264i iVar, String str) {
        if (gVar == null) {
            throw new IllegalArgumentException("No spec specified");
        } else if (iVar != null) {
            return new C1228f(gVar, iVar, str, (String) null);
        } else {
            throw new IllegalArgumentException("No adapterWrapper specified");
        }
    }

    /* renamed from: a */
    public static C1228f m2122a(C1230g gVar, String str) {
        return m2123b(gVar, (C1264i) null, str);
    }

    /* renamed from: b */
    public static C1228f m2123b(C1230g gVar, C1264i iVar, String str) {
        if (gVar != null) {
            return new C1228f(gVar, iVar, (String) null, str);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    /* renamed from: a */
    public C1230g mo12365a() {
        return this.f2368a;
    }

    /* renamed from: b */
    public String mo12366b() {
        return this.f2369b;
    }

    /* renamed from: c */
    public String mo12367c() {
        return this.f2370c;
    }

    /* renamed from: d */
    public String mo12368d() {
        return this.f2371d;
    }

    /* renamed from: e */
    public String mo12369e() {
        return this.f2372e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f2368a);
        sb.append(", mSdkVersion='");
        sb.append(this.f2369b);
        sb.append('\'');
        sb.append(", mAdapterVersion='");
        sb.append(this.f2370c);
        sb.append('\'');
        sb.append(", mSignalDataLength='");
        String str = this.f2371d;
        sb.append(str != null ? str.length() : 0);
        sb.append('\'');
        sb.append(", mErrorMessage=");
        sb.append(this.f2372e);
        sb.append('}');
        return sb.toString();
    }
}
