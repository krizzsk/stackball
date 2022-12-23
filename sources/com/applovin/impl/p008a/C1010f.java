package com.applovin.impl.p008a;

import com.applovin.impl.sdk.C1469j;
import com.applovin.impl.sdk.utils.C1553o;
import com.applovin.impl.sdk.utils.C1560t;

/* renamed from: com.applovin.impl.a.f */
public class C1010f {

    /* renamed from: a */
    private String f1699a;

    /* renamed from: b */
    private String f1700b;

    private C1010f() {
    }

    /* renamed from: a */
    public static C1010f m1353a(C1560t tVar, C1010f fVar, C1469j jVar) {
        if (tVar == null) {
            throw new IllegalArgumentException("No node specified.");
        } else if (jVar != null) {
            if (fVar == null) {
                try {
                    fVar = new C1010f();
                } catch (Throwable th) {
                    jVar.mo13139v().mo13278b("VastSystemInfo", "Error occurred while initializing", th);
                    return null;
                }
            }
            if (!C1553o.m3554b(fVar.f1699a)) {
                String c = tVar.mo13361c();
                if (C1553o.m3554b(c)) {
                    fVar.f1699a = c;
                }
            }
            if (!C1553o.m3554b(fVar.f1700b)) {
                String str = tVar.mo13359b().get("version");
                if (C1553o.m3554b(str)) {
                    fVar.f1700b = str;
                }
            }
            return fVar;
        } else {
            throw new IllegalArgumentException("No sdk specified.");
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1010f)) {
            return false;
        }
        C1010f fVar = (C1010f) obj;
        String str = this.f1699a;
        if (str == null ? fVar.f1699a != null : !str.equals(fVar.f1699a)) {
            return false;
        }
        String str2 = this.f1700b;
        String str3 = fVar.f1700b;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public int hashCode() {
        String str = this.f1699a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f1700b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "VastSystemInfo{name='" + this.f1699a + '\'' + ", version='" + this.f1700b + '\'' + '}';
    }
}
