package com.iab.omid.library.ironsrc;

import android.content.Context;
import com.iab.omid.library.ironsrc.p108b.C4711b;
import com.iab.omid.library.ironsrc.p108b.C4714d;
import com.iab.omid.library.ironsrc.p108b.C4717f;
import com.iab.omid.library.ironsrc.p110d.C4725b;
import com.iab.omid.library.ironsrc.p110d.C4729e;

/* renamed from: com.iab.omid.library.ironsrc.b */
public class C4709b {

    /* renamed from: a */
    private boolean f10608a;

    /* renamed from: b */
    private void m10174b(Context context) {
        C4729e.m10268a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo39119a() {
        return "1.3.12-Ironsrc";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39120a(Context context) {
        m10174b(context);
        if (!mo39122b()) {
            mo39121a(true);
            C4717f.m10217a().mo39157a(context);
            C4711b.m10186a().mo39129a(context);
            C4725b.m10248a(context);
            C4714d.m10197a().mo39138a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39121a(boolean z) {
        this.f10608a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo39122b() {
        return this.f10608a;
    }
}
