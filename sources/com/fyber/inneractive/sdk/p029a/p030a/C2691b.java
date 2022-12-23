package com.fyber.inneractive.sdk.p029a.p030a;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.a.a.b */
final class C2691b {

    /* renamed from: a */
    int f6352a;

    /* renamed from: b */
    int f6353b;

    /* renamed from: c */
    int f6354c;

    /* renamed from: d */
    long f6355d;

    C2691b() {
        this(0, 0, 0, System.currentTimeMillis());
    }

    private C2691b(int i, int i2, int i3, long j) {
        this.f6355d = j;
        this.f6352a = i;
        this.f6353b = i2;
        this.f6354c = i3;
    }

    /* renamed from: com.fyber.inneractive.sdk.a.a.b$1 */
    static /* synthetic */ class C26921 {

        /* renamed from: a */
        static final /* synthetic */ int[] f6356a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|8) */
        /* JADX WARNING: Code restructure failed: missing block: B:9:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        static {
            /*
                int[] r0 = com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a.m5852a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f6356a = r0
                r1 = 1
                int r2 = com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a.f6337b     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f6356a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a.f6338c     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f6356a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.fyber.inneractive.sdk.p029a.p030a.p031a.C2688a.f6336a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r1 = 3
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.p029a.p030a.C2691b.C26921.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final JSONObject mo17899a(boolean z, boolean z2) {
        JSONObject jSONObject = new JSONObject();
        if (z) {
            try {
                jSONObject.put("time", this.f6355d);
            } catch (JSONException unused) {
            }
        }
        jSONObject.put("imp", this.f6352a);
        if (z2) {
            jSONObject.put("com", this.f6354c);
        }
        jSONObject.put("cli", this.f6353b);
        return jSONObject;
    }

    /* renamed from: a */
    static C2691b m5854a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("time");
        int optInt = jSONObject.optInt("cli", -1);
        int optInt2 = jSONObject.optInt("imp", -1);
        int optInt3 = jSONObject.optInt("com", -1);
        if (optLong == 0 || optInt < 0 || optInt2 < 0 || optInt3 < 0) {
            return null;
        }
        return new C2691b(optInt2, optInt, optInt3, optLong);
    }
}
