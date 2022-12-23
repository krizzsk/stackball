package com.tapjoy.internal;

import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.aq */
public abstract class C9073aq implements C9069an {
    /* access modifiers changed from: protected */
    @Nullable
    /* renamed from: a */
    public abstract C9070ao mo57772a(Object obj, boolean z);

    /* renamed from: a */
    public final Object mo57770a(Object obj) {
        C9070ao a = mo57772a(obj, false);
        if (a != null) {
            return a.mo57768a();
        }
        return null;
    }

    /* renamed from: a */
    public void mo57771a(Object obj, Object obj2) {
        mo57772a(obj, true).mo57769a(obj2);
    }
}
