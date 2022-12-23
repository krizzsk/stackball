package com.iab.omid.library.smaato;

import android.content.Context;
import com.iab.omid.library.smaato.p120b.C4812b;
import com.iab.omid.library.smaato.p120b.C4815c;
import com.iab.omid.library.smaato.p120b.C4818e;
import com.iab.omid.library.smaato.p122d.C4825b;
import com.iab.omid.library.smaato.p122d.C4829e;

/* renamed from: com.iab.omid.library.smaato.a */
public class C4803a {

    /* renamed from: a */
    private boolean f10822a;

    /* renamed from: b */
    private void m10597b(Context context) {
        C4829e.m10712a((Object) context, "Application Context cannot be null");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo39448a() {
        return "1.2.13-Smaato";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39449a(Context context) {
        m10597b(context);
        if (!mo39452b()) {
            mo39450a(true);
            C4818e.m10668a().mo39543a(context);
            C4812b.m10638a().mo39519a(context);
            C4825b.m10693a(context);
            C4815c.m10650a().mo39526a(context);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo39450a(boolean z) {
        this.f10822a = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo39451a(String str) {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo39452b() {
        return this.f10822a;
    }
}
