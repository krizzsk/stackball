package com.yandex.metrica.impl.p265ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.ue */
public class C11816ue extends C11715re {

    /* renamed from: h */
    private static final C11984ye f28382h = new C11984ye("SERVICE_API_LEVEL", (String) null);

    /* renamed from: i */
    private static final C11984ye f28383i = new C11984ye("CLIENT_API_LEVEL", (String) null);

    /* renamed from: f */
    private C11984ye f28384f = new C11984ye(f28382h.mo64147b());

    /* renamed from: g */
    private C11984ye f28385g = new C11984ye(f28383i.mo64147b());

    public C11816ue(Context context) {
        super(context, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo63538d() {
        return "_migrationpreferences";
    }

    /* renamed from: f */
    public int mo63789f() {
        return this.f28085b.getInt(this.f28384f.mo64145a(), -1);
    }

    /* renamed from: g */
    public C11816ue mo63790g() {
        mo63597a(this.f28385g.mo64145a());
        return this;
    }

    @Deprecated
    /* renamed from: h */
    public C11816ue mo63791h() {
        mo63597a(this.f28384f.mo64145a());
        return this;
    }
}
