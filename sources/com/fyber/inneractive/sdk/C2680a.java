package com.fyber.inneractive.sdk;

import android.app.Activity;
import com.fyber.inneractive.sdk.config.C2809u;
import com.fyber.inneractive.sdk.config.p034a.C2767s;
import com.fyber.inneractive.sdk.p039dv.C2863a;
import com.fyber.inneractive.sdk.p039dv.C2895f;
import com.fyber.inneractive.sdk.p039dv.p043d.C2878a;
import com.fyber.inneractive.sdk.p049h.C2967m;
import com.fyber.inneractive.sdk.p049h.C2968n;
import com.fyber.inneractive.sdk.p051j.C3018e;

/* renamed from: com.fyber.inneractive.sdk.a */
public abstract class C2680a<T> extends C2863a<T> {

    /* renamed from: a */
    protected C2878a f6321a = null;

    /* renamed from: a */
    public abstract void mo17884a(C2878a aVar, Activity activity);

    public C2680a(C2809u uVar, C2767s sVar, C2895f fVar) {
        super(uVar, sVar, fVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17883a() {
        try {
            new C2968n.C2969a(C2967m.EVENT_READY_ON_CLIENT, this.f6742f, (C3018e) mo18227c()).mo18436b((String) null);
        } catch (Exception unused) {
        }
    }
}
