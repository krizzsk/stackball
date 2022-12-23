package com.yandex.metrica.impl.p265ob;

import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.Z2 */
public class C10977Z2 {

    /* renamed from: a */
    public final String f26380a;

    /* renamed from: b */
    public final String f26381b;

    /* renamed from: c */
    public final boolean f26382c;

    /* renamed from: d */
    public final int f26383d;

    /* renamed from: e */
    public final Long f26384e;

    public C10977Z2(String str, String str2, boolean z, int i, Long l) {
        this.f26380a = str;
        this.f26381b = str2;
        this.f26382c = z;
        this.f26383d = i;
        this.f26384e = l;
    }

    /* renamed from: a */
    public static JSONArray m28338a(Collection<C10977Z2> collection) {
        JSONArray jSONArray = new JSONArray();
        if (collection != null) {
            for (C10977Z2 next : collection) {
                next.getClass();
                JSONObject jSONObject = null;
                try {
                    jSONObject = new JSONObject().put("mac", next.f26380a).put("ssid", next.f26381b).put("signal_strength", next.f26383d).put("is_connected", next.f26382c).put("last_visible_offset_seconds", next.f26384e);
                } catch (Throwable unused) {
                }
                if (jSONObject != null) {
                    jSONArray.put(jSONObject);
                }
            }
        }
        return jSONArray;
    }
}
