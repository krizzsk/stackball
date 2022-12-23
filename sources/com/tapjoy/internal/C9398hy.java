package com.tapjoy.internal;

import com.google.firebase.analytics.FirebaseAnalytics;

/* renamed from: com.tapjoy.internal.hy */
final class C9398hy extends C9378ho implements C9329gq {

    /* renamed from: a */
    public static final C9093bi f23300a = new C9093bi() {
        /* renamed from: a */
        public final /* synthetic */ Object mo57847a(C9101bn bnVar) {
            bnVar.mo57868h();
            String str = null;
            String str2 = null;
            String str3 = null;
            int i = 1;
            while (bnVar.mo57870j()) {
                String l = bnVar.mo57872l();
                if ("id".equals(l)) {
                    str = bnVar.mo57873m();
                } else if ("name".equals(l)) {
                    str2 = bnVar.mo57873m();
                } else if (FirebaseAnalytics.Param.QUANTITY.equals(l)) {
                    i = bnVar.mo57878r();
                } else if ("token".equals(l)) {
                    str3 = bnVar.mo57873m();
                } else {
                    bnVar.mo57879s();
                }
            }
            bnVar.mo57869i();
            return new C9398hy(str, str2, i, str3);
        }
    };

    /* renamed from: b */
    private final String f23301b;

    /* renamed from: c */
    private final String f23302c;

    /* renamed from: d */
    private final int f23303d;

    /* renamed from: e */
    private final String f23304e;

    C9398hy(String str, String str2, int i, String str3) {
        this.f23301b = str;
        this.f23302c = str2;
        this.f23303d = i;
        this.f23304e = str3;
    }

    /* renamed from: a */
    public final String mo58218a() {
        return this.f23301b;
    }

    /* renamed from: b */
    public final String mo58219b() {
        return this.f23302c;
    }

    /* renamed from: c */
    public final int mo58220c() {
        return this.f23303d;
    }

    /* renamed from: d */
    public final String mo58221d() {
        return this.f23304e;
    }
}
