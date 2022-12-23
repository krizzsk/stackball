package com.iab.omid.library.vungle;

import android.content.Context;
import com.iab.omid.library.vungle.p126b.C4860b;
import com.iab.omid.library.vungle.p126b.C4863d;
import com.iab.omid.library.vungle.p126b.C4866f;
import com.iab.omid.library.vungle.p128d.C4874b;
import com.iab.omid.library.vungle.p128d.C4878e;

/* renamed from: com.iab.omid.library.vungle.b */
public class C4858b {

    /* renamed from: a */
    private boolean f10942a;

    /* renamed from: b */
    private void m10828b(Context context) {
        C4878e.m10925a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo39681a() {
        return "1.3.21-Vungle";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39682a(Context context) {
        m10828b(context);
        if (!mo39684b()) {
            mo39683a(true);
            C4866f.m10873a().mo39727a(context);
            C4860b.m10840a().mo39691a(context);
            C4874b.m10905a(context);
            C4863d.m10853a().mo39708a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39683a(boolean z) {
        this.f10942a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo39684b() {
        return this.f10942a;
    }
}
