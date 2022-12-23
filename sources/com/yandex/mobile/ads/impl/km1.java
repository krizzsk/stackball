package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public class km1 implements C12714ca<kj1> {

    /* renamed from: a */
    private final C13298hb f36169a = new C13298hb();

    /* renamed from: b */
    private final fk1<fu0> f36170b;

    /* renamed from: c */
    private final ti1 f36171c;

    public km1(Context context) {
        this.f36170b = new fk1<>(context, new gu0());
        this.f36171c = new ti1(context);
    }

    /* renamed from: a */
    public Object mo65715a(JSONObject jSONObject) throws JSONException, xr0 {
        xh1 xh1;
        try {
            xh1 = this.f36171c.mo70188a(this.f36169a.mo67507a(jSONObject, "vast"));
        } catch (Exception unused) {
            xh1 = null;
        }
        if (xh1 == null || xh1.mo70898b().isEmpty()) {
            throw new xr0("Invalid VAST in response");
        }
        List<ck1<fu0>> a = this.f36170b.mo67025a(xh1.mo70898b());
        if (!((ArrayList) a).isEmpty()) {
            return new kj1(a);
        }
        throw new xr0("Invalid VAST in response");
    }
}
