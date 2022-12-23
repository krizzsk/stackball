package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.base.AdResponse;
import com.yandex.mobile.ads.base.model.AdUnitIdBiddingSettings;
import com.yandex.mobile.ads.base.model.BiddingSettings;
import com.yandex.mobile.ads.impl.nv0;
import org.json.JSONArray;

class g30 {

    /* renamed from: a */
    private final C14645t1 f33866a;

    /* renamed from: b */
    private final C13188gb f33867b = new C13188gb();

    /* renamed from: c */
    private final C12698c5 f33868c;

    /* renamed from: d */
    private final nv0 f33869d;

    /* renamed from: e */
    private final Handler f33870e;

    /* renamed from: com.yandex.mobile.ads.impl.g30$b */
    private final class C13169b implements nv0.C14137b {

        /* renamed from: a */
        private final C12581bc f33871a;

        /* renamed from: a */
        public void mo67179a(JSONArray jSONArray) {
            g30.this.m36456a(g30.m36453a(g30.this, jSONArray), this.f33871a);
        }

        private C13169b(C12581bc bcVar) {
            this.f33871a = bcVar;
        }
    }

    public g30(C14645t1 t1Var, BiddingSettings biddingSettings) {
        this.f33866a = t1Var;
        this.f33868c = new C12698c5(biddingSettings);
        this.f33869d = new nv0(new wm0(t1Var, (AdResponse) null));
        this.f33870e = new Handler(Looper.getMainLooper());
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static java.lang.String m36453a(com.yandex.mobile.ads.impl.g30 r3, org.json.JSONArray r4) {
        /*
            r3.getClass()
            r0 = 0
            if (r4 == 0) goto L_0x0029
            int r1 = r4.length()
            if (r1 <= 0) goto L_0x0029
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0029 }
            r1.<init>()     // Catch:{ JSONException -> 0x0029 }
            java.lang.String r2 = "networks"
            r1.put(r2, r4)     // Catch:{ JSONException -> 0x0029 }
            com.yandex.mobile.ads.impl.gb r3 = r3.f33867b     // Catch:{ JSONException -> 0x0029 }
            java.lang.String r4 = r1.toString()     // Catch:{ JSONException -> 0x0029 }
            r3.getClass()     // Catch:{ JSONException -> 0x0029 }
            byte[] r3 = r4.getBytes()     // Catch:{ JSONException -> 0x0029 }
            r4 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r4)     // Catch:{  }
            r0 = r3
        L_0x0029:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.g30.m36453a(com.yandex.mobile.ads.impl.g30, org.json.JSONArray):java.lang.String");
    }

    /* renamed from: a */
    public void mo67178a(Context context, C12581bc bcVar) {
        AdUnitIdBiddingSettings a = this.f33868c.mo66203a(this.f33866a.mo70096c());
        if (a != null) {
            this.f33869d.mo69081b(context, a.mo64531d(), new C13169b(bcVar));
            return;
        }
        bcVar.mo64408a((String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m36456a(String str, C12581bc bcVar) {
        this.f33870e.post(new Runnable(str) {
            public final /* synthetic */ String f$1;

            {
                this.f$1 = r2;
            }

            public final void run() {
                C12581bc.this.mo64408a(this.f$1);
            }
        });
    }
}
