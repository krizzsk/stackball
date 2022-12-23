package com.mbridge.msdk.foundation.same.report.p180a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6197g;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6153k;
import com.mbridge.msdk.foundation.tools.C6349m;

/* renamed from: com.mbridge.msdk.foundation.same.report.a.a */
/* compiled from: CampaignRequestTimeUtil */
public final class C6304a {

    /* renamed from: a */
    private C6197g f15663a;

    /* renamed from: b */
    private C6148f f15664b = null;

    /* renamed from: c */
    private Context f15665c;

    public C6304a(C6197g gVar) {
        Context context;
        this.f15663a = gVar;
        Context d = C6122a.m15302b().mo42895d();
        this.f15665c = d;
        this.f15664b = C6148f.m15420a(d);
        if (this.f15663a != null && (context = this.f15665c) != null) {
            int n = C6349m.m16123n(context);
            this.f15663a.mo43650d(n);
            this.f15663a.mo43648c(C6349m.m16092a(this.f15665c, n));
        }
    }

    /* renamed from: a */
    public final void mo43917a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f15663a.mo43642a(str);
        }
    }

    /* renamed from: a */
    public final void mo43916a(int i) {
        C6197g gVar = this.f15663a;
        if (gVar != null) {
            gVar.mo43644b(i);
        }
    }

    /* renamed from: b */
    public final void mo43918b(int i) {
        C6197g gVar = this.f15663a;
        if (gVar != null) {
            gVar.mo43647c(i);
        }
    }

    /* renamed from: a */
    public final void mo43915a() {
        if (this.f15663a != null) {
            C6153k.m15448a((C6146e) this.f15664b).mo43019a(this.f15663a);
        }
    }

    /* renamed from: b */
    public final void mo43919b(String str) {
        C6197g gVar = this.f15663a;
        if (gVar != null) {
            gVar.mo43645b(str);
        }
    }

    /* renamed from: c */
    public final void mo43920c(int i) {
        C6197g gVar = this.f15663a;
        if (gVar != null) {
            gVar.mo43641a(i);
        }
    }
}
