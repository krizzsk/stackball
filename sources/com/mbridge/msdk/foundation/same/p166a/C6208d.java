package com.mbridge.msdk.foundation.same.p166a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C6122a;
import com.mbridge.msdk.foundation.entity.C6192b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p164db.C6143d;
import com.mbridge.msdk.foundation.p164db.C6146e;
import com.mbridge.msdk.foundation.p164db.C6148f;
import com.mbridge.msdk.foundation.same.p169d.C6224a;
import com.mbridge.msdk.foundation.tools.C6361q;
import com.mbridge.msdk.foundation.tools.C6369x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.a.d */
/* compiled from: StaticDataPoll */
public class C6208d {

    /* renamed from: a */
    public static Map<String, Long> f15418a = new HashMap();

    /* renamed from: b */
    public static Map<String, List<C6224a>> f15419b = new HashMap();

    /* renamed from: c */
    public static Map<String, List<C6224a>> f15420c = new HashMap();

    /* renamed from: d */
    public static Map<String, List<C6224a>> f15421d = new HashMap();

    /* renamed from: e */
    public static Map<String, List<C6224a>> f15422e = new HashMap();

    /* renamed from: f */
    public static Map<String, List<C6224a>> f15423f = new HashMap();

    /* renamed from: g */
    public static Map<String, List<C6224a>> f15424g = new HashMap();

    /* renamed from: h */
    public static Map<String, List<C6224a>> f15425h = new HashMap();

    /* renamed from: i */
    public static Map<String, List<C6224a>> f15426i = new HashMap();

    /* renamed from: j */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, C6192b>> f15427j;

    /* renamed from: k */
    private static final String f15428k = C6208d.class.getSimpleName();

    /* renamed from: a */
    public static void m15703a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<C6224a>> b = m15705b(str2);
        if (campaignEx != null && b != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getId())) {
                    C6224a aVar = new C6224a(campaignEx.getId(), campaignEx.getRequestId());
                    if (b.containsKey(str)) {
                        List list = b.get(str);
                        if (list != null) {
                            list.add(aVar);
                            return;
                        }
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    b.put(str, arrayList);
                }
            } catch (Throwable th) {
                C6361q.m16155a(f15428k, th.getMessage(), th);
            }
        }
    }

    /* renamed from: b */
    public static void m15706b(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<C6224a>> b = m15705b(str2);
        if (campaignEx != null && b != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getId())) {
                    C6224a aVar = new C6224a(campaignEx.getId(), campaignEx.getRequestId());
                    if (b.containsKey(str)) {
                        List list = b.get(str);
                        if (list != null && list.size() == 20) {
                            list.remove(0);
                        }
                        if (list != null) {
                            list.add(aVar);
                            return;
                        }
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    b.put(str, arrayList);
                }
            } catch (Throwable th) {
                C6361q.m16155a(f15428k, th.getMessage(), th);
            }
        }
    }

    /* renamed from: a */
    public static String m15701a(String str, String str2) {
        Map<String, List<C6224a>> map;
        List list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            map = null;
            if (f15420c.containsKey(str)) {
                map = f15420c;
            } else if (f15421d.containsKey(str)) {
                map = f15421d;
            } else if (f15422e.containsKey(str)) {
                map = f15422e;
            } else if (f15423f.containsKey(str)) {
                map = f15423f;
            } else if (f15424g.containsKey(str)) {
                map = f15424g;
            } else if (f15425h.containsKey(str)) {
                map = f15425h;
            } else if (f15426i.containsKey(str)) {
                map = f15426i;
            }
        } else {
            map = m15705b(str2);
        }
        if (map != null) {
            try {
                if (C6369x.m16236b(str) && map.containsKey(str) && (list = map.get(str)) != null && list.size() > 0) {
                    for (int i = 0; i < list.size(); i++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("2", ((C6224a) list.get(i)).mo43801a());
                        jSONObject.put("1", ((C6224a) list.get(i)).mo43802b());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public static void m15704a(String str, String str2, String str3, long j, long j2, long j3) {
        if (f15427j == null) {
            f15427j = new ConcurrentHashMap<>();
        }
        try {
            if (f15427j.containsKey(str)) {
                Map map = f15427j.get(str);
                if (map != null) {
                    C6192b bVar = (C6192b) map.get(str2);
                    if (bVar == null) {
                        C6192b bVar2 = new C6192b();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str3);
                        bVar2.mo43596a((List<String>) arrayList);
                        bVar2.mo43594a(j);
                        bVar2.mo43598b(j2);
                        bVar2.mo43600c(j3);
                        map.put(str2, bVar2);
                    } else if (bVar.mo43597b() != null) {
                        bVar.mo43594a(j);
                        bVar.mo43598b(j2);
                        bVar.mo43600c(j3);
                        bVar.mo43597b().add(str3);
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str3);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                C6192b bVar3 = new C6192b();
                bVar3.mo43596a((List<String>) arrayList2);
                bVar3.mo43594a(j);
                bVar3.mo43598b(j2);
                bVar3.mo43600c(j3);
                concurrentHashMap.put(str2, bVar3);
                f15427j.put(str, concurrentHashMap);
            }
        } catch (Throwable th) {
            C6361q.m16158d(f15428k, th.getMessage());
        }
    }

    /* renamed from: b */
    public static void m15707b(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, C6192b>> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f15427j) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f15427j.remove(str);
            return;
        }
        Map map = f15427j.get(str);
        if (map != null && map.containsKey(str2)) {
            map.remove(str2);
        }
    }

    /* renamed from: a */
    public static ConcurrentHashMap<String, C6192b> m15702a(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, C6192b>> concurrentHashMap = f15427j;
        if (concurrentHashMap == null) {
            C6143d a = C6143d.m15367a((C6146e) C6148f.m15420a(C6122a.m15302b().mo42895d()));
            if (a != null) {
                a.mo42991f(str, "");
                f15427j = new ConcurrentHashMap<>();
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f15427j.get(str);
        }
        return null;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.p169d.C6224a>> m15705b(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1396342996: goto L_0x0044;
                case -1052618729: goto L_0x003a;
                case -934326481: goto L_0x0030;
                case -895866265: goto L_0x0026;
                case 538816457: goto L_0x001c;
                case 604727084: goto L_0x0012;
                case 1844104930: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x004e
        L_0x0008:
            java.lang.String r0 = "interactive"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 2
            goto L_0x004f
        L_0x0012:
            java.lang.String r0 = "interstitial"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 3
            goto L_0x004f
        L_0x001c:
            java.lang.String r0 = "h5_native"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 6
            goto L_0x004f
        L_0x0026:
            java.lang.String r0 = "splash"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 5
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "reward"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r0 = "native"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 0
            goto L_0x004f
        L_0x0044:
            java.lang.String r0 = "banner"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 4
            goto L_0x004f
        L_0x004e:
            r1 = -1
        L_0x004f:
            switch(r1) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0063;
                case 2: goto L_0x0060;
                case 3: goto L_0x005d;
                case 4: goto L_0x005a;
                case 5: goto L_0x0057;
                case 6: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            r1 = 0
            goto L_0x0068
        L_0x0054:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f15426i
            goto L_0x0068
        L_0x0057:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f15425h
            goto L_0x0068
        L_0x005a:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f15424g
            goto L_0x0068
        L_0x005d:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f15423f
            goto L_0x0068
        L_0x0060:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f15422e
            goto L_0x0068
        L_0x0063:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f15421d
            goto L_0x0068
        L_0x0066:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f15420c
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p166a.C6208d.m15705b(java.lang.String):java.util.Map");
    }
}
