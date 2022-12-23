package com.tapjoy.internal;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.db */
public final class C9148db {

    /* renamed from: a */
    private final boolean f22493a = false;

    /* renamed from: b */
    private final Float f22494b = null;

    /* renamed from: c */
    private final boolean f22495c = false;

    /* renamed from: d */
    private final C9147da f22496d;

    private C9148db(C9147da daVar) {
        this.f22496d = daVar;
    }

    /* renamed from: a */
    public static C9148db m24491a(C9147da daVar) {
        C9166do.m24543a((Object) daVar, "Position is null");
        return new C9148db(daVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo57934a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("skippable", this.f22493a);
            if (this.f22493a) {
                jSONObject.put("skipOffset", this.f22494b);
            }
            jSONObject.put("autoPlay", this.f22495c);
            jSONObject.put("position", this.f22496d);
        } catch (JSONException e) {
            C9165dn.m24541a("VastProperties: JSON error", e);
        }
        return jSONObject;
    }
}
