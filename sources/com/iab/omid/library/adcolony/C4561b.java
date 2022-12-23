package com.iab.omid.library.adcolony;

import android.content.Context;
import com.iab.omid.library.adcolony.p090b.C4563b;
import com.iab.omid.library.adcolony.p090b.C4566d;
import com.iab.omid.library.adcolony.p090b.C4569f;
import com.iab.omid.library.adcolony.p092d.C4577b;
import com.iab.omid.library.adcolony.p092d.C4581e;

/* renamed from: com.iab.omid.library.adcolony.b */
public class C4561b {

    /* renamed from: a */
    private boolean f10279a;

    /* renamed from: b */
    private void m9519b(Context context) {
        C4581e.m9613a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo38573a() {
        return "1.3.11-Adcolony";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38574a(Context context) {
        m9519b(context);
        if (!mo38576b()) {
            mo38575a(true);
            C4569f.m9562a().mo38611a(context);
            C4563b.m9531a().mo38583a(context);
            C4577b.m9593a(context);
            C4566d.m9542a().mo38592a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38575a(boolean z) {
        this.f10279a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo38576b() {
        return this.f10279a;
    }
}
