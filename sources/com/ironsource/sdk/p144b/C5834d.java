package com.ironsource.sdk.p144b;

import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.b.d */
public final class C5834d {

    /* renamed from: a */
    HashMap<String, Boolean> f14204a = new HashMap<String, Boolean>() {
        {
            boolean z = true;
            put("isVisible", Boolean.valueOf(C5834d.this.f14205b == 0));
            put("isWindowVisible", Boolean.valueOf(C5834d.this.f14206c != 0 ? false : z));
            put("isShown", Boolean.FALSE);
            put("isViewVisible", Boolean.FALSE);
        }
    };

    /* renamed from: b */
    int f14205b = 4;

    /* renamed from: c */
    int f14206c = 4;

    C5834d() {
    }

    /* renamed from: a */
    public final JSONObject mo42176a() {
        return new JSONObject(this.f14204a);
    }
}
