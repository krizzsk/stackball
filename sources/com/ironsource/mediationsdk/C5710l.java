package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.p135b.C5512a;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.C5724h;
import com.ironsource.mediationsdk.utils.C5790c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.l */
public class C5710l {

    /* renamed from: com.ironsource.mediationsdk.l$a */
    interface C5711a {
        /* renamed from: a */
        void mo41535a(Map<String, Object> map, List<String> list, StringBuilder sb);
    }

    /* renamed from: com.ironsource.mediationsdk.l$b */
    interface C5712b {
        /* renamed from: a */
        void mo41532a();

        /* renamed from: a */
        void mo41533a(String str);
    }

    /* renamed from: a */
    static void m14086a(IronSourceBannerLayout ironSourceBannerLayout, C5724h hVar, C5712b bVar) {
        String str;
        if (!m14091a(ironSourceBannerLayout)) {
            Object[] objArr = new Object[1];
            objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
            str = String.format("can't load banner - %s", objArr);
        } else {
            str = null;
        }
        if (hVar == null || TextUtils.isEmpty(hVar.getPlacementName())) {
            Object[] objArr2 = new Object[1];
            objArr2[0] = hVar == null ? "placement is null" : "placement name is empty";
            str = String.format("can't load banner - %s", objArr2);
        }
        if (!TextUtils.isEmpty(str)) {
            IronLog.INTERNAL.error(str);
            bVar.mo41533a(str);
            return;
        }
        bVar.mo41532a();
    }

    /* renamed from: a */
    public static void m14087a(String str, Object obj) {
        C5512a.C5515a.f12719a.mo41237a(str, obj);
    }

    /* renamed from: a */
    static void m14088a(String str, ConcurrentHashMap<String, C5587N> concurrentHashMap, C5711a aVar) {
        StringBuilder sb;
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        if (!C5790c.m14291b((Context) ContextProvider.getInstance().getCurrentActiveActivity(), str)) {
            for (C5587N next : concurrentHashMap.values()) {
                if (next.mo41603h()) {
                    Map<String, Object> c = next.mo41540c();
                    if (c != null) {
                        hashMap.put(next.mo41606k(), c);
                        sb = new StringBuilder("2");
                    }
                } else if (!next.mo41603h()) {
                    arrayList.add(next.mo41606k());
                    sb = new StringBuilder("1");
                }
                sb.append(next.mo41606k());
                sb.append(",");
                sb2.append(sb.toString());
            }
        }
        aVar.mo41535a(hashMap, arrayList, sb2);
    }

    /* renamed from: a */
    public static void m14089a(String str, JSONObject jSONObject) {
        C5512a aVar = C5512a.C5515a.f12719a;
        if (jSONObject != null) {
            try {
                Object obj = aVar.f12712a.get(str);
                if (!(obj instanceof JSONObject)) {
                    aVar.mo41237a(str, jSONObject);
                    return;
                }
                JSONObject jSONObject2 = (JSONObject) obj;
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.putOpt(next, jSONObject.opt(next));
                }
                aVar.mo41237a(str, jSONObject2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m14090a(Map<String, Object> map) {
        C5512a aVar = C5512a.C5515a.f12719a;
        if (map != null) {
            try {
                for (String next : map.keySet()) {
                    if (map.containsKey(next)) {
                        aVar.mo41237a(next, map.get(next));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    static boolean m14091a(IronSourceBannerLayout ironSourceBannerLayout) {
        return ironSourceBannerLayout != null && !ironSourceBannerLayout.isDestroyed();
    }
}
