package com.fyber.inneractive.sdk.p039dv;

import com.fyber.inneractive.sdk.config.C2808t;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.p039dv.p041b.C2869a;
import com.fyber.inneractive.sdk.p039dv.p042c.C2872b;
import com.fyber.inneractive.sdk.p051j.C3015b;
import com.fyber.inneractive.sdk.p051j.C3018e;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.d */
public final class C2877d extends C3015b {
    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo18251b() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo18252c() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo18250a(String str, C2808t tVar) {
        String str2;
        try {
            ((C2895f) this.f7385a).f6852a = new JSONObject(str).getString("adm");
        } catch (JSONException e) {
            if (tVar != null) {
                str2 = tVar.f6644b;
            } else {
                str2 = null;
            }
            C2872b.m6351a(str2, C2869a.Parse, (InneractiveAdRequest) null, (C3018e) null, e.getLocalizedMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C3018e mo18249a() {
        return new C2895f();
    }
}
