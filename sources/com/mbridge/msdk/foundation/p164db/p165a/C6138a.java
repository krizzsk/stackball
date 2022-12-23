package com.mbridge.msdk.foundation.p164db.p165a;

import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.p164db.C6154l;
import com.mbridge.msdk.foundation.same.p166a.C6206b;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.db.a.a */
/* compiled from: ReplaceTempDaoMiddle */
public final class C6138a {

    /* renamed from: a */
    private C6154l f15182a;

    /* renamed from: b */
    private C6206b f15183b;

    /* renamed from: com.mbridge.msdk.foundation.db.a.a$a */
    /* compiled from: ReplaceTempDaoMiddle */
    private static class C6140a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C6138a f15184a = new C6138a();
    }

    private C6138a() {
        this.f15183b = new C6206b(1000);
        C6154l a = C6154l.m15452a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
        this.f15182a = a;
        mo42944a(a.mo43020a(), false);
    }

    /* renamed from: a */
    public static C6138a m15352a() {
        return C6140a.f15184a;
    }

    /* renamed from: a */
    public final JSONObject mo42943a(String str) {
        JSONObject a = this.f15183b.mo43764a(str);
        if (a != null) {
            return a;
        }
        JSONObject a2 = this.f15182a.mo43021a(str);
        if (a2 != null) {
            this.f15183b.mo43766a(str, a2);
        }
        return a2;
    }

    /* renamed from: a */
    public final void mo42944a(JSONObject jSONObject, boolean z) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                this.f15183b.mo43766a(next, optJSONObject);
                if (z) {
                    this.f15182a.mo43022a(next, optJSONObject);
                }
            }
        }
    }

    /* renamed from: b */
    public final JSONArray mo42945b() {
        return new JSONArray(this.f15183b.mo43770b());
    }
}
