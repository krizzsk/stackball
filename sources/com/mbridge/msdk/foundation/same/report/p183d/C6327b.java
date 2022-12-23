package com.mbridge.msdk.foundation.same.report.p183d;

import com.mbridge.msdk.foundation.same.net.C6269f;
import com.mbridge.msdk.foundation.same.net.C6293k;
import com.mbridge.msdk.foundation.same.net.p172a.C6240a;
import com.mbridge.msdk.foundation.same.net.p178g.C6274a;

/* renamed from: com.mbridge.msdk.foundation.same.report.d.b */
/* compiled from: ReportResponseHandler */
public abstract class C6327b extends C6269f<String> {

    /* renamed from: a */
    private static final String f15698a = C6327b.class.getSimpleName();

    /* renamed from: a */
    public abstract void mo43811a(String str);

    /* renamed from: b */
    public abstract void mo43812b(String str);

    /* renamed from: a */
    public final void mo43799a(C6293k<String> kVar) {
        if (kVar != null) {
            mo43811a((String) kVar.f15627a);
        }
    }

    /* renamed from: a */
    public final void mo43798a(C6240a aVar) {
        mo43812b(C6274a.m15856a(aVar.f15490a));
    }
}
