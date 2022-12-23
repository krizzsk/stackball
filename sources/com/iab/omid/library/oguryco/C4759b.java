package com.iab.omid.library.oguryco;

import android.content.Context;
import com.iab.omid.library.oguryco.p114b.C4761b;
import com.iab.omid.library.oguryco.p114b.C4765d;
import com.iab.omid.library.oguryco.p114b.C4768f;
import com.iab.omid.library.oguryco.p116d.C4776b;
import com.iab.omid.library.oguryco.p116d.C4780e;

/* renamed from: com.iab.omid.library.oguryco.b */
public class C4759b {

    /* renamed from: a */
    private boolean f10727a;

    /* renamed from: b */
    private void m10396b(Context context) {
        C4780e.m10497a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo39330a() {
        return "1.3.1-Oguryco";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39331a(Context context) {
        m10396b(context);
        if (!mo39334b()) {
            mo39332a(true);
            C4768f.m10445a().mo39371a(context);
            C4761b.m10409a().mo39341a(context);
            C4776b.m10477a(context);
            C4765d.m10425a().mo39352a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39332a(boolean z) {
        this.f10727a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo39333a(String str) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo39334b() {
        return this.f10727a;
    }
}
