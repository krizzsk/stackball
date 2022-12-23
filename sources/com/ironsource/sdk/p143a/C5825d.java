package com.ironsource.sdk.p143a;

import android.util.Log;
import com.ironsource.p131a.C5485a;
import com.ironsource.p131a.C5487b;
import com.ironsource.sdk.p143a.C5827f;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.d */
public final class C5825d {

    /* renamed from: a */
    private static C5825d f14157a;

    /* renamed from: b */
    private C5487b f14158b;

    private C5825d() {
    }

    /* renamed from: a */
    private static C5825d m14391a() {
        if (f14157a == null) {
            f14157a = new C5825d();
        }
        return f14157a;
    }

    /* renamed from: a */
    public static void m14392a(C5485a aVar, C5822b bVar) {
        if (aVar != null) {
            try {
                m14391a().f14158b = new C5487b(aVar, bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m14393a(C5827f.C5828a aVar) {
        m14394a(aVar, (Map<String, Object>) new HashMap());
    }

    /* renamed from: a */
    public static void m14394a(C5827f.C5828a aVar, Map<String, Object> map) {
        C5487b bVar = m14391a().f14158b;
        if (bVar == null) {
            Log.d("sdk5Events", "logEvent failed eventsTracker doesn't exist");
            return;
        }
        if (map != null) {
            map.put("eventid", Integer.valueOf(aVar.f14183b));
        }
        bVar.mo41098a(aVar.f14182a, map);
    }
}
