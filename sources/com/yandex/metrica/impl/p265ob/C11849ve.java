package com.yandex.metrica.impl.p265ob;

import android.content.Context;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.ve */
public class C11849ve extends C11715re {

    /* renamed from: g */
    private static final C11984ye f28483g = new C11984ye("PREF_KEY_OFFSET", (String) null);

    /* renamed from: f */
    private C11984ye f28484f = new C11984ye(f28483g.mo64147b(), (String) null);

    public C11849ve(Context context, String str) {
        super(context, str);
    }

    /* renamed from: a */
    public long mo63841a(int i) {
        return this.f28085b.getLong(this.f28484f.mo64145a(), (long) i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public String mo63538d() {
        return "_servertimeoffset";
    }

    /* renamed from: f */
    public void mo63842f() {
        mo63597a(this.f28484f.mo64145a()).mo63599b();
    }
}
