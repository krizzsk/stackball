package com.yandex.metrica.impl.p265ob;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import com.yandex.metrica.impl.p265ob.C10953Yb;
import java.util.ArrayList;

/* renamed from: com.yandex.metrica.impl.ob.u5 */
public class C11807u5 extends C11737s5 {

    /* renamed from: b */
    private final C10898Wn f28367b;

    public C11807u5(C11229f4 f4Var) {
        this(f4Var, new C10898Wn());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|(5:6|7|(3:10|11|8)|24|12)|13|14|(1:16)(4:17|(2:20|18)|25|21)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x009a }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo61047a(com.yandex.metrica.impl.p265ob.C11411k0 r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.f4 r0 = r9.mo63623a()
            com.yandex.metrica.impl.ob.I8 r1 = r0.mo62889w()
            boolean r1 = r1.mo61498m()
            r2 = 0
            if (r1 == 0) goto L_0x009a
            boolean r1 = r0.mo62861B()
            if (r1 == 0) goto L_0x009a
            com.yandex.metrica.impl.ob.G9 r1 = r0.mo62873f()
            com.yandex.metrica.impl.ob.f4 r3 = r9.mo63623a()
            com.yandex.metrica.impl.ob.G9 r3 = r3.mo62873f()
            java.lang.String r3 = r3.mo61365f()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 == 0) goto L_0x002d
            goto L_0x004e
        L_0x002d:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ all -> 0x004e }
            r6.<init>(r3)     // Catch:{ all -> 0x004e }
            r3 = 0
        L_0x0038:
            int r7 = r6.length()     // Catch:{ all -> 0x004e }
            if (r3 >= r7) goto L_0x004d
            com.yandex.metrica.impl.ob.Zb r7 = new com.yandex.metrica.impl.ob.Zb     // Catch:{ all -> 0x004e }
            org.json.JSONObject r8 = r6.getJSONObject(r3)     // Catch:{ all -> 0x004e }
            r7.<init>(r8)     // Catch:{ all -> 0x004e }
            r4.add(r7)     // Catch:{ all -> 0x004e }
            int r3 = r3 + 1
            goto L_0x0038
        L_0x004d:
            r5 = r4
        L_0x004e:
            java.util.ArrayList r3 = r9.mo63769b()     // Catch:{ all -> 0x009a }
            boolean r4 = com.yandex.metrica.impl.p265ob.C11327i.m29173a((java.util.Collection<?>) r5, (java.util.Collection<?>) r3)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x005c
            r0.mo62890x()     // Catch:{ all -> 0x009a }
            goto L_0x009a
        L_0x005c:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x009a }
            r4.<init>()     // Catch:{ all -> 0x009a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x009a }
        L_0x0065:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x009a }
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x009a }
            com.yandex.metrica.impl.ob.Zb r5 = (com.yandex.metrica.impl.p265ob.C10988Zb) r5     // Catch:{ all -> 0x009a }
            org.json.JSONObject r5 = r5.mo62573a()     // Catch:{ all -> 0x009a }
            r4.put(r5)     // Catch:{ all -> 0x009a }
            goto L_0x0065
        L_0x0079:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x009a }
            r3.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r5 = "features"
            org.json.JSONObject r3 = r3.put(r5, r4)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009a }
            com.yandex.metrica.impl.ob.k0 r10 = com.yandex.metrica.impl.p265ob.C11411k0.m29411a((com.yandex.metrica.impl.p265ob.C11411k0) r10, (java.lang.String) r3)     // Catch:{ all -> 0x009a }
            com.yandex.metrica.impl.ob.u4 r0 = r0.mo62885r()     // Catch:{ all -> 0x009a }
            r0.mo63763c(r10)     // Catch:{ all -> 0x009a }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x009a }
            r1.mo61367g(r10)     // Catch:{ all -> 0x009a }
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p265ob.C11807u5.mo61047a(com.yandex.metrica.impl.ob.k0):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public ArrayList<C10988Zb> mo63769b() {
        C10953Yb yb;
        FeatureInfo[] featureInfoArr;
        try {
            C11229f4 a = mo63623a();
            PackageInfo b = this.f28367b.mo62462b(a.mo62874g(), a.mo62874g().getPackageName(), 16384);
            ArrayList<C10988Zb> arrayList = new ArrayList<>();
            if (C10796U2.m27890a(24)) {
                yb = new C10953Yb.C10954a();
            } else {
                yb = new C10953Yb.C10955b();
            }
            if (!(b == null || (featureInfoArr = b.reqFeatures) == null)) {
                for (FeatureInfo a2 : featureInfoArr) {
                    arrayList.add(yb.mo62532a(a2));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public C11807u5(C11229f4 f4Var, C10898Wn wn) {
        super(f4Var);
        this.f28367b = wn;
    }
}
