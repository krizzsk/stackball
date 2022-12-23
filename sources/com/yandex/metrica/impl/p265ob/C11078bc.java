package com.yandex.metrica.impl.p265ob;

import android.text.TextUtils;

/* renamed from: com.yandex.metrica.impl.ob.bc */
public class C11078bc {

    /* renamed from: a */
    public final C11037ac f26600a;

    /* renamed from: b */
    public final C11171e1 f26601b;

    /* renamed from: c */
    public final String f26602c;

    public C11078bc() {
        this((C11037ac) null, C11171e1.UNKNOWN, "identifier info has never been updated");
    }

    /* renamed from: a */
    public boolean mo62691a() {
        C11037ac acVar = this.f26600a;
        return acVar != null && !TextUtils.isEmpty(acVar.f26512b);
    }

    public String toString() {
        return "AdTrackingInfoResult{mAdTrackingInfo=" + this.f26600a + ", mStatus=" + this.f26601b + ", mErrorExplanation='" + this.f26602c + '\'' + '}';
    }

    public C11078bc(C11037ac acVar, C11171e1 e1Var, String str) {
        this.f26600a = acVar;
        this.f26601b = e1Var;
        this.f26602c = str;
    }
}
