package com.yandex.metrica.impl.p265ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Yh */
class C10964Yh {

    /* renamed from: a */
    private final C11196ec f26367a;

    /* renamed from: b */
    private final Context f26368b;

    /* renamed from: c */
    private String f26369c;

    /* renamed from: d */
    private String f26370d;

    /* renamed from: e */
    private boolean f26371e;

    /* renamed from: f */
    private C10675Qi f26372f;

    C10964Yh(Context context, C10675Qi qi) {
        this(context, qi, C10619P0.m27164i().mo61892t());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r2 = r2.f26600a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo62549a() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r5.f26371e
            if (r1 != 0) goto L_0x003b
            com.yandex.metrica.impl.ob.ec r1 = r5.f26367a
            android.content.Context r2 = r5.f26368b
            com.yandex.metrica.impl.ob.gc r1 = r1.mo62815a((android.content.Context) r2)
            com.yandex.metrica.impl.ob.bc r2 = r1.mo62960a()
            boolean r3 = r2.mo62691a()
            r4 = 0
            if (r3 == 0) goto L_0x0023
            com.yandex.metrica.impl.ob.ac r2 = r2.f26600a
            if (r2 == 0) goto L_0x0023
            java.lang.String r2 = r2.f26512b
            goto L_0x0024
        L_0x0023:
            r2 = r4
        L_0x0024:
            r5.f26369c = r2
            com.yandex.metrica.impl.ob.bc r1 = r1.mo62961b()
            boolean r2 = r1.mo62691a()
            if (r2 == 0) goto L_0x0036
            com.yandex.metrica.impl.ob.ac r1 = r1.f26600a
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f26512b
        L_0x0036:
            r5.f26370d = r4
            r1 = 1
            r5.f26371e = r1
        L_0x003b:
            java.lang.String r1 = "uuid"
            com.yandex.metrica.impl.ob.Qi r2 = r5.f26372f     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.mo62007V()     // Catch:{ all -> 0x005f }
            r5.m28325a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "device_id"
            com.yandex.metrica.impl.ob.Qi r2 = r5.f26372f     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.mo62017i()     // Catch:{ all -> 0x005f }
            r5.m28325a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "google_aid"
            java.lang.String r2 = r5.f26369c     // Catch:{ all -> 0x005f }
            r5.m28325a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "huawei_aid"
            java.lang.String r2 = r5.f26370d     // Catch:{ all -> 0x005f }
            r5.m28325a(r0, r1, r2)     // Catch:{ all -> 0x005f }
        L_0x005f:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C10964Yh.mo62549a():java.lang.String");
    }

    C10964Yh(Context context, C10675Qi qi, C11196ec ecVar) {
        this.f26371e = false;
        this.f26368b = context;
        this.f26372f = qi;
        this.f26367a = ecVar;
    }

    /* renamed from: a */
    public void mo62550a(C10675Qi qi) {
        this.f26372f = qi;
    }

    /* renamed from: a */
    private void m28325a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }
}
