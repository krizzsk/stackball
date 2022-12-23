package com.adcolony.sdk;

import com.adcolony.sdk.C0587b0;
import java.util.Date;

/* renamed from: com.adcolony.sdk.t */
class C0817t extends C0587b0 {

    /* renamed from: i */
    static final C0892x f1371i = new C0892x("adcolony_fatal_reports", "4.6.5", "Production");

    /* renamed from: j */
    static final String f1372j = "sourceFile";

    /* renamed from: k */
    static final String f1373k = "lineNumber";

    /* renamed from: l */
    static final String f1374l = "methodName";

    /* renamed from: m */
    static final String f1375m = "stackTrace";

    /* renamed from: n */
    static final String f1376n = "isAdActive";

    /* renamed from: o */
    static final String f1377o = "activeAdId";

    /* renamed from: p */
    static final String f1378p = "active_creative_ad_id";

    /* renamed from: q */
    static final String f1379q = "listOfCachedAds";

    /* renamed from: r */
    static final String f1380r = "listOfCreativeAdIds";

    /* renamed from: s */
    static final String f1381s = "adCacheSize";
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C0897z0 f1382h;

    /* renamed from: com.adcolony.sdk.t$a */
    private class C0818a extends C0587b0.C0588a {
        C0818a() {
            this.f220a = new C0817t();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0818a mo9880a(C0897z0 z0Var) {
            C0897z0 unused = ((C0817t) this.f220a).f1382h = z0Var;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C0587b0.C0588a mo9438a(Date date) {
            C0894y.m1148a(((C0817t) this.f220a).f1382h, "timestamp", C0587b0.f213e.format(date));
            return super.mo9438a(date);
        }
    }

    C0817t() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C0897z0 mo9879f() {
        return this.f1382h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0817t mo9878a(C0897z0 z0Var) {
        C0818a aVar = new C0818a();
        aVar.mo9880a(z0Var);
        aVar.mo9437a(C0894y.m1169h(z0Var, "message"));
        try {
            aVar.mo9438a(new Date(Long.parseLong(C0894y.m1169h(z0Var, "timestamp"))));
        } catch (NumberFormatException unused) {
        }
        aVar.mo9436a(f1371i);
        aVar.mo9435a(-1);
        return (C0817t) aVar.mo9439a();
    }
}
