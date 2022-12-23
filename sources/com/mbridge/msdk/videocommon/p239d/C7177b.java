package com.mbridge.msdk.videocommon.p239d;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.p162a.p163a.C6121a;
import com.mbridge.msdk.foundation.same.report.C6323d;
import com.mbridge.msdk.videocommon.download.C7191g;
import com.mbridge.msdk.videocommon.p237b.C7168a;
import com.mbridge.msdk.videocommon.p237b.C7169b;
import com.mbridge.msdk.videocommon.p237b.C7170c;
import com.mbridge.msdk.videocommon.p238c.C7171a;
import com.mbridge.msdk.videocommon.p238c.C7175c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.d.b */
/* compiled from: RewardSettingManager */
public final class C7177b {

    /* renamed from: a */
    public static C7176a f17907a = null;

    /* renamed from: c */
    private static Map<String, C7179c> f17908c = new HashMap();

    /* renamed from: d */
    private static C7177b f17909d;

    /* renamed from: b */
    private Object f17910b = new Object();

    private C7177b() {
    }

    /* renamed from: a */
    public static synchronized C7177b m18135a() {
        C7177b bVar;
        synchronized (C7177b.class) {
            if (f17909d == null) {
                f17909d = new C7177b();
            }
            bVar = f17909d;
        }
        return bVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0047 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0048  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.mbridge.msdk.videocommon.p239d.C7176a mo49112b() {
        /*
            r7 = this;
            com.mbridge.msdk.videocommon.d.a r0 = f17907a
            if (r0 != 0) goto L_0x0077
            com.mbridge.msdk.foundation.a.a.a r0 = com.mbridge.msdk.foundation.p162a.p163a.C6121a.m15293a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "reward_"
            r1.append(r2)
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r2 = r2.mo42896e()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = r0.mo42882b(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0060
            com.mbridge.msdk.videocommon.d.a r0 = com.mbridge.msdk.videocommon.p239d.C7176a.m18116a((java.lang.String) r0)
            if (r0 == 0) goto L_0x0044
            long r1 = r0.mo49093b()
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r0.mo49103g()
            long r5 = r5 + r1
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0044
            r1 = 0
            goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            if (r1 != 0) goto L_0x0048
            return r0
        L_0x0048:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r0 = r0.mo42896e()
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r1 = r1.mo42897f()
            r7.m18138b(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.mo49113c()
            return r0
        L_0x0060:
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r0 = r0.mo42896e()
            com.mbridge.msdk.foundation.controller.a r1 = com.mbridge.msdk.foundation.controller.C6122a.m15302b()
            java.lang.String r1 = r1.mo42897f()
            r7.m18138b(r0, r1)
            com.mbridge.msdk.videocommon.d.a r0 = r7.mo49113c()
        L_0x0077:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.p239d.C7177b.mo49112b():com.mbridge.msdk.videocommon.d.a");
    }

    /* renamed from: b */
    private void m18138b(String str, String str2) {
        new C7171a().mo49087a(C6122a.m15302b().mo42895d(), str, str2);
    }

    /* renamed from: a */
    public final void mo49111a(String str, String str2, String str3, C7175c cVar) {
        new C7171a().mo49088a(C6122a.m15302b().mo42895d(), str, str2, str3, cVar);
    }

    /* renamed from: a */
    public final C7179c mo49107a(String str, String str2) {
        synchronized (this.f17910b) {
            String str3 = "reward" + "_" + str + "_" + str2;
            if (f17908c.containsKey(str3)) {
                C7179c cVar = f17908c.get(str3);
                return cVar;
            }
            C7179c c = C7179c.m18151c(C6121a.m15293a().mo42882b(str3));
            if (m18137a(c)) {
                return null;
            }
            f17908c.put(str3, c);
            return c;
        }
    }

    /* renamed from: a */
    public final C7179c mo49108a(String str, String str2, boolean z) {
        synchronized (this.f17910b) {
            String str3 = "reward_" + str + "_" + str2;
            if (f17908c.containsKey(str3)) {
                C7179c cVar = f17908c.get(str3);
                return cVar;
            }
            C7179c c = C7179c.m18151c(C6121a.m15293a().mo42882b(str3));
            if (!m18137a(c)) {
                f17908c.put(str3, c);
                return c;
            } else if (c != null) {
                return c;
            } else {
                C7179c a = m18136a(z);
                return a;
            }
        }
    }

    /* renamed from: c */
    public final C7176a mo49113c() {
        C7176a aVar = new C7176a();
        HashMap hashMap = new HashMap(5);
        hashMap.put("1", 1000);
        hashMap.put("9", 1000);
        hashMap.put("8", 1000);
        HashMap hashMap2 = new HashMap(3);
        hashMap2.put("1", new C7170c("Virtual Item", 1));
        aVar.mo49092a((Map<String, Integer>) hashMap);
        aVar.mo49095b((Map<String, C7170c>) hashMap2);
        aVar.mo49091a(43200);
        aVar.mo49094b(5400);
        aVar.mo49097c(3600);
        aVar.mo49099d(3600);
        aVar.mo49101e(5);
        aVar.mo49090a(1);
        return aVar;
    }

    /* renamed from: a */
    private final boolean m18137a(C7179c cVar) {
        C7176a b = mo49112b();
        if (b == null || cVar == null) {
            return true;
        }
        return cVar.mo49164v() + b.mo49096c() <= System.currentTimeMillis();
    }

    /* renamed from: a */
    public final void mo49110a(String str, String str2, String str3) {
        synchronized (this.f17910b) {
            String str4 = "reward_" + str + "_" + str2;
            C6121a.m15293a().mo42880a(str4, str3);
            f17908c.put(str4, C7179c.m18151c(str3));
            if (!TextUtils.isEmpty(C7179c.f17915a)) {
                m18140c(C7179c.f17915a, str2);
            }
        }
    }

    /* renamed from: a */
    public final void mo49109a(String str) {
        if (!TextUtils.isEmpty(str)) {
            m18135a().mo49108a(C6122a.m15302b().mo42896e(), str, false);
            String str2 = C7179c.f17915a;
            if (!TextUtils.isEmpty(str2) && TextUtils.isEmpty(C7191g.m18286a().mo49220b(str2))) {
                m18140c(str2, str);
            }
        }
    }

    /* renamed from: c */
    private void m18140c(final String str, final String str2) {
        if (TextUtils.isEmpty(str)) {
            Context d = C6122a.m15302b().mo42895d();
            C6323d.m16037a(d, str, str2, 2, "alert url is exception ,url:" + str);
            return;
        }
        C7191g.m18286a().mo49221b(str, new C7191g.C7199d() {
            /* renamed from: a */
            public final void mo44018a(String str) {
                C6323d.m16037a(C6122a.m15302b().mo42895d(), str, str2, 1, "");
            }

            /* renamed from: a */
            public final void mo44019a(String str, String str2) {
                C6323d.m16037a(C6122a.m15302b().mo42895d(), str, str2, 2, str2);
            }
        });
    }

    /* renamed from: b */
    public static boolean m18139b(String str) {
        JSONArray optJSONArray;
        try {
            if (!TextUtils.isEmpty(str) && (optJSONArray = new JSONObject(str).optJSONArray("unitSetting")) != null) {
                String optString = optJSONArray.optJSONObject(0).optString("unitId");
                if (optJSONArray == null || optJSONArray.length() <= 0 || TextUtils.isEmpty(optString)) {
                    return false;
                }
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    private static C7179c m18136a(boolean z) {
        C7179c cVar = new C7179c();
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C7169b(1, 15, (C7168a) null));
            cVar.mo49122a((List<C7169b>) arrayList);
            cVar.mo49147m(1);
            cVar.mo49145l(1);
            cVar.mo49149n(1);
            cVar.mo49155q(1);
            cVar.mo49151o(1);
            cVar.mo49153p(1);
            cVar.mo49137h(3);
            cVar.mo49139i(80);
            cVar.mo49141j(100);
            cVar.mo49143k(0);
            cVar.mo49135g(2);
            cVar.mo49131e(-1);
            cVar.mo49165v(70);
            cVar.mo49129d(2);
            if (z) {
                cVar.mo49127c(5);
            } else {
                cVar.mo49127c(-1);
            }
            cVar.mo49124b(0);
            cVar.mo49119a(0);
            cVar.mo49133f(1);
            cVar.mo49157r(1);
            cVar.mo49161t(3);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(4);
            arrayList2.add(6);
            cVar.mo49121a((ArrayList<Integer>) arrayList2);
            cVar.mo49163u(1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cVar;
    }
}
