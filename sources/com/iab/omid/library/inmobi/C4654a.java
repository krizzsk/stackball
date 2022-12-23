package com.iab.omid.library.inmobi;

import android.content.Context;
import com.iab.omid.library.inmobi.p102b.C4663b;
import com.iab.omid.library.inmobi.p102b.C4666c;
import com.iab.omid.library.inmobi.p102b.C4669e;
import com.iab.omid.library.inmobi.p104d.C4676b;
import com.iab.omid.library.inmobi.p104d.C4680e;

/* renamed from: com.iab.omid.library.inmobi.a */
public class C4654a {

    /* renamed from: a */
    private boolean f10485a;

    /* renamed from: b */
    private void m9937b(Context context) {
        C4680e.m10054a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo38882a() {
        return "1.2.19-Inmobi";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38883a(Context context) {
        m9937b(context);
        if (!mo38886b()) {
            mo38884a(true);
            C4669e.m10008a().mo38977a(context);
            C4663b.m9978a().mo38953a(context);
            C4676b.m10034a(context);
            C4666c.m9990a().mo38960a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo38884a(boolean z) {
        this.f10485a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo38885a(String str) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo38886b() {
        return this.f10485a;
    }
}
