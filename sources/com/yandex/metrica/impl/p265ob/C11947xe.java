package com.yandex.metrica.impl.p265ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.xe */
public class C11947xe extends C11715re {

    /* renamed from: f */
    private C11984ye f28719f = new C11984ye("LOCATION_TRACKING_ENABLED");

    public C11947xe(Context context, String str) {
        super(context, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo63538d() {
        return "_serviceproviderspreferences";
    }

    /* renamed from: f */
    public boolean mo64076f() {
        return this.f28085b.getBoolean(this.f28719f.mo64145a(), false);
    }

    /* renamed from: g */
    public void mo64077g() {
        mo63597a(this.f28719f.mo64145a()).mo63599b();
    }
}
