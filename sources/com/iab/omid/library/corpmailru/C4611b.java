package com.iab.omid.library.corpmailru;

import android.content.Context;
import com.iab.omid.library.corpmailru.p096b.C4613b;
import com.iab.omid.library.corpmailru.p096b.C4616d;
import com.iab.omid.library.corpmailru.p096b.C4619f;
import com.iab.omid.library.corpmailru.p098d.C4627b;
import com.iab.omid.library.corpmailru.p098d.C4631e;

/* renamed from: com.iab.omid.library.corpmailru.b */
public class C4611b {

    /* renamed from: a */
    private boolean f10393a;

    /* renamed from: b */
    private void m9740b(Context context) {
        C4631e.m9837a((Object) context, "Application Context cannot be null");
    }

    /* renamed from: a */
    public String mo38759a() {
        return "1.3.20-Corpmailru";
    }

    /* renamed from: a */
    public void mo38760a(Context context) {
        m9740b(context);
        if (!mo38762b()) {
            mo38761a(true);
            C4619f.m9785a().mo38805a(context);
            C4613b.m9752a().mo38769a(context);
            C4627b.m9817a(context);
            C4616d.m9765a().mo38786a(context);
        }
    }

    /* renamed from: a */
    public void mo38761a(boolean z) {
        this.f10393a = z;
    }

    /* renamed from: b */
    public boolean mo38762b() {
        return this.f10393a;
    }
}
