package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.C13325hj;

/* renamed from: com.yandex.mobile.ads.impl.ek */
public final class C12981ek implements C13325hj.C13326a {

    /* renamed from: a */
    private final Context f32994a;

    /* renamed from: b */
    private final af1 f32995b;

    /* renamed from: c */
    private final C13325hj.C13326a f32996c;

    public C12981ek(Context context, C13325hj.C13326a aVar) {
        this(context, (af1) null, aVar);
    }

    /* renamed from: a */
    public C13325hj mo66840a() {
        C12901dk dkVar = new C12901dk(this.f32994a, this.f32996c.mo66840a());
        af1 af1 = this.f32995b;
        if (af1 != null) {
            dkVar.mo65277a(af1);
        }
        return dkVar;
    }

    public C12981ek(Context context, af1 af1, C13325hj.C13326a aVar) {
        this.f32994a = context.getApplicationContext();
        this.f32995b = null;
        this.f32996c = aVar;
    }
}
