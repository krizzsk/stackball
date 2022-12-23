package com.tapjoy.internal;

import android.view.View;

/* renamed from: com.tapjoy.internal.cs */
public abstract class C9138cs {
    /* renamed from: a */
    public abstract void mo57925a();

    /* renamed from: a */
    public abstract void mo57926a(View view);

    /* renamed from: b */
    public abstract void mo57927b();

    /* renamed from: a */
    public static C9138cs m24474a(C9139ct ctVar, C9140cu cuVar) {
        if (C9130ck.m24468b()) {
            C9166do.m24543a((Object) ctVar, "AdSessionConfiguration is null");
            C9166do.m24543a((Object) cuVar, "AdSessionContext is null");
            return new C9145cz(ctVar, cuVar);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
