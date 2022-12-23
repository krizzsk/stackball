package com.moat.analytics.mobile.inm;

import android.graphics.Rect;
import android.view.View;
import com.moat.analytics.mobile.inm.NativeDisplayTracker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.moat.analytics.mobile.inm.t */
class C7268t extends C7227b implements NativeDisplayTracker {

    /* renamed from: g */
    private final Map<String, String> f18237g;

    /* renamed from: h */
    private final Set<NativeDisplayTracker.MoatUserInteractionType> f18238h = new HashSet();

    C7268t(View view, Map<String, String> map) {
        super(view, true, false);
        C7252m mVar;
        C7261p.m18544a(3, "NativeDisplayTracker", (Object) this, "Initializing.");
        this.f18237g = map;
        if (view == null) {
            C7261p.m18545a("[ERROR] ", 3, "NativeDisplayTracker", this, "NativeDisplayTracker initialization not successful, ".concat("Target view is null"));
            mVar = new C7252m("Target view is null");
        } else if (map == null || map.isEmpty()) {
            C7261p.m18545a("[ERROR] ", 3, "NativeDisplayTracker", this, "NativeDisplayTracker initialization not successful, ".concat("AdIds is null or empty"));
            mVar = new C7252m("AdIds is null or empty");
        } else {
            C7233g gVar = ((C7250k) C7250k.getInstance()).f18190d;
            if (gVar == null) {
                C7261p.m18545a("[ERROR] ", 3, "NativeDisplayTracker", this, "NativeDisplayTracker initialization not successful, ".concat("prepareNativeDisplayTracking was not called successfully"));
                mVar = new C7252m("prepareNativeDisplayTracking was not called successfully");
            } else {
                super.mo49339a(gVar.f18128b);
                try {
                    super.mo49338a(gVar.f18127a);
                    m18569i();
                    C7261p.m18547a("[SUCCESS] ", mo49337a() + " created for " + mo49348g() + ", with adIds:" + map.toString());
                    return;
                } catch (C7252m e) {
                    this.f18102a = e;
                    return;
                }
            }
        }
        this.f18102a = mVar;
    }

    /* renamed from: a */
    private static String m18568a(Map<String, String> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < 8; i++) {
            String concat = "moatClientLevel".concat(String.valueOf(i));
            if (map.containsKey(concat)) {
                linkedHashMap.put(concat, map.get(concat));
            }
        }
        for (int i2 = 0; i2 < 8; i2++) {
            String concat2 = "moatClientSlicer".concat(String.valueOf(i2));
            if (map.containsKey(concat2)) {
                linkedHashMap.put(concat2, map.get(concat2));
            }
        }
        for (String next : map.keySet()) {
            if (!linkedHashMap.containsKey(next)) {
                linkedHashMap.put(next, map.get(next));
            }
        }
        return new JSONObject(linkedHashMap).toString();
    }

    /* renamed from: i */
    private void m18569i() {
        if (this.f18104c != null) {
            this.f18104c.mo49391a(m18570j());
        }
    }

    /* renamed from: j */
    private String m18570j() {
        try {
            String a = m18568a(this.f18237g);
            C7261p.m18544a(3, "NativeDisplayTracker", (Object) this, "Parsed ad ids = ".concat(String.valueOf(a)));
            return "{\"adIds\":" + a + ", \"adKey\":\"" + this.f18106e + "\", \"adSize\":" + m18571k() + "}";
        } catch (Exception e) {
            C7252m.m18508a(e);
            return "";
        }
    }

    /* renamed from: k */
    private String m18571k() {
        try {
            Rect a = C7291z.m18622a(super.mo49347f());
            int width = a.width();
            int height = a.height();
            HashMap hashMap = new HashMap();
            hashMap.put("width", Integer.toString(width));
            hashMap.put("height", Integer.toString(height));
            return new JSONObject(hashMap).toString();
        } catch (Exception e) {
            C7252m.m18508a(e);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo49337a() {
        return "NativeDisplayTracker";
    }

    public void reportUserInteractionEvent(NativeDisplayTracker.MoatUserInteractionType moatUserInteractionType) {
        try {
            C7261p.m18544a(3, "NativeDisplayTracker", (Object) this, "reportUserInteractionEvent:" + moatUserInteractionType.name());
            if (!this.f18238h.contains(moatUserInteractionType)) {
                this.f18238h.add(moatUserInteractionType);
                JSONObject jSONObject = new JSONObject();
                jSONObject.accumulate("adKey", this.f18106e);
                jSONObject.accumulate("event", moatUserInteractionType.name().toLowerCase());
                if (this.f18104c != null) {
                    this.f18104c.mo49395b(jSONObject.toString());
                }
            }
        } catch (JSONException e) {
            C7261p.m18548b(2, "NativeDisplayTracker", this, "Got JSON exception");
            C7252m.m18508a(e);
        } catch (Exception e2) {
            C7252m.m18508a(e2);
        }
    }
}
